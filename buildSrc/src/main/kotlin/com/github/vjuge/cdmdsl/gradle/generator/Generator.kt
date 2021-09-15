/*
package com.github.vjuge.cdmdsl.gradle.generator

import com.rosetta.model.lib.meta.*
import com.rosetta.model.metafields.MetaFields
import com.squareup.kotlinpoet.*
import io.github.classgraph.ClassGraph
import io.github.classgraph.ClassInfo
import io.github.classgraph.ScanResult
import io.github.classgraph.TypeArgument

fun generate(): FileSpec {
    val fileSpec = FileSpec.builder("com.github.vjuge.cdmdsl", "MetaTypesDsl")
    scan("cdm.*", "com.rosetta.*")
        .allInterfaces
        .forEach { classInfo ->
            if (classInfo.implementsInterface(ReferenceWithMeta.ReferenceWithMetaBuilder::class.java)) {
                println("Ref : " + classInfo.name)
                addReferenceFunctions(fileSpec, classInfo)
            }
            if (classInfo.implementsInterface(FieldWithMeta.FieldWithMetaBuilder::class.java)) {
                println("Meta : " + classInfo.name)
                addMetaFunctions(fileSpec, classInfo)
            }
            if (classInfo.implementsInterface(MetaDataFields.MetaDataFieldsBuilder::class.java)) {
                println("Meta : " + classInfo.name)
                addMetaDataFunctions(fileSpec, classInfo)
            }
        }
    return fileSpec.build()
}

fun scan(vararg packages: String): ScanResult {
    return ClassGraph()
        .enableAllInfo()
        .acceptPackages(*packages)
        .scan()
}

*/
/**
 * [ReferenceWithMetaBuilder]<T>
 *//*

fun generateReferenceFunSpec(classInfo: ClassInfo): FunSpec {
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
        .returns(Reference.ReferenceBuilder::class)
        .addStatement("return orCreateReference.apply(f)")
        .build()
}

fun addReferenceFunctions(fileSpec: FileSpec.Builder, classInfo: ClassInfo) {
    fileSpec.addFunction(generateReferenceFunSpec(classInfo))
    if (classInfo.hasDeclaredMethod("getOrCreateValue")) {
        fileSpec.addFunction(
            generateValueFunSpec(
                classInfo,
                classInfo.typeSignature?.superinterfaceSignatures?.filter {
                    it.suffixes.contains("ReferenceWithMetaBuilder")
                }?.first()?.suffixTypeArguments?.first()?.first()!!
            )
        )
    }
}

*/
/**
 * [ReferenceWithMetaBuilder]<T>
 *//*

fun generateValueFunSpec(classInfo: ClassInfo, T: TypeArgument): FunSpec {
    return FunSpec.builder("value")
        .receiver(classInfo.loadClass())
        .addParameter(
            ParameterSpec.builder(
                name = "f",
                type = LambdaTypeName.get(
                    receiver = ClassName(
                        T.typeSignature.toString().substringBeforeLast('.'),
                        T.typeSignature.toString().substringAfterLast('.'),
                        T.typeSignature.toString().substringAfterLast('.') + "Builder"
                    ),
                    parameters = *arrayOf(TypeVariableName("")),
                    returnType = Unit::class.asTypeName()
                )
            ).build()
        )
        .addStatement("return orCreateValue.apply(f)")
        .build()
}

*/
/**
 * [FieldWithMetaBuilder]<T>
 *//*

fun generateMetaFunSpec(classInfo: ClassInfo): FunSpec {
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
        .returns(MetaFields.MetaFieldsBuilder::class)
        .addStatement("return orCreateMeta.apply(f)")
        .build()
}

fun addMetaFunctions(fileSpec: FileSpec.Builder, classInfo: ClassInfo) {
    fileSpec.addFunction(
        generateMetaFunSpec(classInfo)
    )
    if (classInfo.hasDeclaredMethod("getOrCreateValue")) {
        fileSpec.addFunction(
            generateValueFunSpec(
                classInfo,
                classInfo?.typeSignature?.superinterfaceSignatures?.filter {
                    it.suffixes.contains("FieldWithMetaBuilder")
                }?.first()?.suffixTypeArguments?.first()?.first()!!
            )
        )
    }
}


fun generateMetaDataFunSpec(classInfo: ClassInfo): FunSpec {
    return FunSpec.builder("key")
        .receiver(classInfo.loadClass())
        .addParameter(
            ParameterSpec.builder(
                name = "f",
                type = LambdaTypeName.get(
                    receiver = ClassName(
                        Key.KeyBuilder::class.java.`package`.name,
                        "Key",
                        "KeyBuilder"
                    ),
                    parameters = *arrayOf(TypeVariableName("")),
                    returnType = Unit::class.asTypeName()
                )
            ).build()
        )
        .addStatement("return addKey(Key.builder().apply(f).build())")
        .build()
}

fun generateMetaDataIndexedFunSpec(classInfo: ClassInfo): FunSpec {
    return FunSpec.builder("key")
        .receiver(classInfo.loadClass())
        .addParameter(
            ParameterSpec.builder(
                name = "index",
                type = Int::class.java
            ).build()
        )
        .addParameter(
            ParameterSpec.builder(
                name = "f",
                type = LambdaTypeName.get(
                    receiver = ClassName(
                        Key.KeyBuilder::class.java.`package`.name,
                        "Key",
                        "KeyBuilder"
                    ),
                    parameters = *arrayOf(TypeVariableName("")),
                    returnType = Unit::class.asTypeName()
                )
            ).build()
        )
        .addStatement("return getOrCreateKey(index).apply(f)")
        .build()
}

fun addMetaDataFunctions(fileSpec: FileSpec.Builder, classInfo: ClassInfo) {
    fileSpec.addFunction(
        generateMetaDataFunSpec(classInfo)
    )
    fileSpec.addFunction(
        generateMetaDataIndexedFunSpec(classInfo)
    )
}

*/
