package com.github.vjuge.cdmdsl.gradle.generator

import com.rosetta.model.lib.RosettaModelObjectBuilder
import com.rosetta.model.lib.meta.FieldWithMeta
import com.squareup.kotlinpoet.*
import io.github.classgraph.*

class TypeGenerator : Generator() {

    override var PACKAGE: String = "com.github.vjuge.cdmdsl"
    override var CLASS = "TypesDsl"
    override var CDM_PKG: Array<String> = arrayOf("cdm", "com.rosetta")

    override fun generate(): FileSpec {
        val fileSpec = FileSpec.builder(PACKAGE, CLASS)
        val classInfoList: ClassInfoList = scanResult
            .allInterfaces
            .filter {
                it.implementsInterface(RosettaModelObjectBuilder::class.java)
            }.filter {
                it.name.endsWith("Builder")
            }

        classInfoList.forEach { classInfo: ClassInfo ->
            println("Type : " + classInfo.name)
            val methodInfoList: MethodInfoList = classInfo.declaredMethodInfo
                /*.filter {
//                    remove methods which returns the same object type
                    !it.typeDescriptor.resultType.toStringWithSimpleNames().equals(classInfo.simpleName)
                }*/.filter {
                    it.name.startsWith("getOrCreate")
                }

            methodInfoList.forEach { methodInfo: MethodInfo ->
//                println(methodInfo)
                if (!methodInfo.parameterInfo.isEmpty()
                    && (methodInfo.parameterInfo
                        .first().typeDescriptor as BaseTypeSignature).typeSignatureChar.equals('I')
                ) {
                    //"list type attribute
                    val name = methodInfo.name.substringAfter("getOrCreate").decapitalize()
                    val receiver = methodInfo.className
                    val lambdaReceiver = methodInfo.loadClassAndGetMethod().returnType
                    fileSpec.addFunction(
                        generatePropertyListIndexFunSpec(methodInfo, lambdaReceiver)
                    )
                    fileSpec.addFunction(
                        generatePropertyListFunSpec(methodInfo, lambdaReceiver)
                    )
                } else {
                    //"simple" attribute
                    val name = methodInfo.name.substringAfter("getOrCreate").decapitalize()
                    if (!methodInfo.typeDescriptor.resultType.toStringWithSimpleNames().contains("GlobalKey")) {
                        //removes inherited (duplicate) method getMeta from GlobalKeyBuilder interface
                        val receiver = methodInfo.className
                        val lambdaReceiver = methodInfo.loadClassAndGetMethod().returnType
                        fileSpec.addFunction(
                            generatePropertyFunSpec(methodInfo, lambdaReceiver)
                        )
                    }
                }
            }
        }
        return fileSpec.build()
    }

    companion object {

        /**
         * Generates a function like
         * `fun AdjustableDates.AdjustableDatesBuilder.dateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustments.apply(f)`
         */
        fun generatePropertyFunSpec(methodInfo: MethodInfo, lamdbaReceiver: Class<*>): FunSpec {
            return FunSpec.builder(methodInfo.name.substringAfter("getOrCreate").decapitalize())
                .receiver(methodInfo.classInfo.loadClass())
                .addParameter(
                    ParameterSpec.builder(
                        name = "f",
                        type = LambdaTypeName.get(
                            receiver = methodInfo.loadClassAndGetMethod().returnType.asTypeName(),
                            parameters = *arrayOf(TypeVariableName("")),
                            returnType = Unit::class.asTypeName()
                        )
                    ).build()
                )
                .addStatement("return ${methodInfo.name.substringAfter("get").decapitalize()}.apply(f)")
                .build()
        }

        /**
         * Generates a function like
         * `fun AdjustableDates.AdjustableDatesBuilder.adjustedDate(index: Int, f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = getOrCreateAdjustedDate(index).apply(f)`
         */
        fun generatePropertyListIndexFunSpec(methodInfo: MethodInfo, lamdbaReceiver: Class<*>): FunSpec {
            return FunSpec.builder(methodInfo.name.substringAfter("getOrCreate").decapitalize())
                .receiver(methodInfo.classInfo.loadClass())
                .addParameter("index", Int::class)
                .addParameter(
                    ParameterSpec.builder(
                        name = "f",
                        type = LambdaTypeName.get(
                            receiver = methodInfo.loadClassAndGetMethod().returnType.asTypeName(),
                            parameters = *arrayOf(TypeVariableName("")),
                            returnType = Unit::class.asTypeName()
                        )
                    ).build()
                )
                .addStatement("return ${methodInfo.name}(index).apply(f)")
                .build()
        }

        /**
         * Generates a function like
         * `fun AdjustableDates.AdjustableDatesBuilder.adjustedDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = addAdjustedDate(FieldWithMetaDate.FieldWithMetaDateBuilderImpl().apply(f).build())`
         */
        fun generatePropertyListFunSpec(methodInfo: MethodInfo, lamdbaReceiver: Class<*>): FunSpec {
            return FunSpec.builder(methodInfo.name.substringAfter("getOrCreate").decapitalize())
                .receiver(methodInfo.classInfo.loadClass())
                .addParameter(
                    ParameterSpec.builder(
                        name = "f",
                        type = LambdaTypeName.get(
                            receiver = methodInfo.loadClassAndGetMethod().returnType.asTypeName(),
                            parameters = *arrayOf(TypeVariableName("")),
                            returnType = Unit::class.asTypeName()
                        )
                    ).build()
                )
                .addStatement(
                    """
                    return add${methodInfo.name.substringAfter("getOrCreate")}(${methodInfo.loadClassAndGetMethod().returnType.asClassName()}Impl().apply(f).build())
                """.trimIndent()
                )
                .build()
        }

    }
}