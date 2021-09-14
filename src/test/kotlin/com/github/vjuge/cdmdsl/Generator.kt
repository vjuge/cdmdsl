package com.github.vjuge.cdmdsl

import com.rosetta.model.lib.GlobalKey
import com.rosetta.model.lib.meta.FieldWithMeta
import com.rosetta.model.lib.meta.Reference
import com.rosetta.model.lib.meta.ReferenceWithMeta
import com.rosetta.model.metafields.MetaFields
import com.squareup.kotlinpoet.*
import io.github.classgraph.ClassGraph
import io.github.classgraph.ClassInfo
import io.github.classgraph.TypeArgument
import org.junit.jupiter.api.Test
import java.nio.file.Paths


class Generator {

    @Test
    fun test() {
        ClassGraph()
//            .verbose() // Log to stderr
            .enableAllInfo() // Scan classes, methods, fields, annotations
            .acceptPackages("cdm.*", "com.rosetta.*") // Scan com.xyz and subpackages (omit to scan all packages)
            .scan().use { scanResult ->                // Start the scan
                val sourceDest = Paths.get("src", "main", "resources").toFile()
                val fileSpec = FileSpec.builder("com.github.vjuge.cdmdsl", "MetaTypesDsl")

//                References
                scanResult.allInterfaces.filter {
                    it.implementsInterface(ReferenceWithMeta.ReferenceWithMetaBuilder::class.java)
                }.forEach { classInfo ->
                    println("Ref : " + classInfo.name)
                    fileSpec.addFunction(generateMetaReferenceDsl(classInfo))
                }

//                Values
//                scanResult.getClassesImplementing(ReferenceWithMeta.ReferenceWithMetaBuilder::class.java)
                scanResult.allInterfaces.filter {
                    it.implementsInterface(ReferenceWithMeta.ReferenceWithMetaBuilder::class.java)
                }.filter {
                    !it.name.contains("Date") && !it.name.contains("String")
                }.forEach { classInfo ->
                    println("Ref : " + classInfo.name)
                    fileSpec.addFunction(
                        generateMetaValueDsl(
                            classInfo,
                            classInfo?.typeSignature?.superinterfaceSignatures?.filter {
                                it.suffixes.contains("ReferenceWithMetaBuilder")
                            }?.first()?.suffixTypeArguments?.first()?.first()!!
                        )
                    )
                }

//                Meta
                scanResult.allInterfaces.filter {
                    it.implementsInterface(FieldWithMeta.FieldWithMetaBuilder::class.java)
                }.forEach { classInfo ->
                    println("Ref : " + classInfo.name)
                    fileSpec.addFunction(
                        generateMetaDsl(classInfo)
                    )
                }
                fileSpec.build().writeTo(sourceDest)
            }
    }


    fun generateMetaReferenceDsl(classInfo: ClassInfo): FunSpec {
        return FunSpec.builder("reference")
            .receiver(classInfo.loadClass())
            .addParameter(
                ParameterSpec.builder(
                    name = "f",
                    type = LambdaTypeName.get(
                        receiver = ClassName(
                            Reference.ReferenceBuilder::class.java.`package`.name,
                            "Reference",
                            "ReferenceBuilder"
                        ),
                        parameters = *arrayOf(TypeVariableName("")),
                        returnType = Unit::class.asTypeName()
                    )
                ).build()
            )
            .addStatement("return orCreateReference.apply(f)")
            .build()
    }

    fun generateMetaValueDsl(classInfo: ClassInfo, generic: TypeArgument): FunSpec {
        return FunSpec.builder("value")
            .receiver(classInfo.loadClass())
            .addParameter(
                ParameterSpec.builder(
                    name = "f",
                    type = LambdaTypeName.get(
                        receiver = ClassName(
                            generic.typeSignature.toString().substringBeforeLast('.'),
                            generic.typeSignature.toString().substringAfterLast('.'),
                            generic.typeSignature.toString().substringAfterLast('.') + "Builder"
                        ),
                        parameters = *arrayOf(TypeVariableName("")),
                        returnType = Unit::class.asTypeName()
                    )
                ).build()
            )
            .addStatement("return orCreateValue.apply(f)")
            .build()
    }

    fun generateMetaDsl(classInfo: ClassInfo): FunSpec {
        return FunSpec.builder("meta")
            .receiver(classInfo.loadClass())
            .addParameter(
                ParameterSpec.builder(
                    name = "f",
                    type = LambdaTypeName.get(
                        receiver = ClassName(
                            MetaFields.MetaFieldsBuilder::class.java.`package`.name,
                            "MetaFields",
                            "MetaFieldsBuilder"
                        ),
                        parameters = *arrayOf(TypeVariableName("")),
                        returnType = Unit::class.asTypeName()
                    )
                ).build()
            )
            .addStatement("return orCreateMeta.apply(f)")
            .build()
    }

    fun generateTypeClass(type: String): TypeSpec {
        return TypeSpec.anonymousClassBuilder().apply {

        }.build()

        TypeSpec.companionObjectBuilder("MetaTypeDsl")
            .addFunction(
                funSpec = FunSpec.builder(type.substringAfterLast('.')).build()
            )
            .build()


    }

}



