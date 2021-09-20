package com.github.vjuge.cdmdsl.gradle

import com.github.vjuge.cdmdsl.gradle.generator.MetaGenerator
import com.rosetta.model.lib.meta.FieldWithMeta
import com.rosetta.model.lib.meta.MetaDataFields
import com.rosetta.model.lib.meta.ReferenceWithMeta
import com.squareup.kotlinpoet.FileSpec
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.io.File
import java.nio.file.Paths


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MetaGeneratorTest {

    companion object {

        val sourceDest: File = Paths.get(
            "src",
            "test",
            "resources"
        ).toFile()

        val generator = MetaGenerator()
    }

    @BeforeAll
    fun setup() {
        sourceDest.deleteRecursively()
    }

    @Test
    @Disabled
    fun test() {
        generator.generate().writeTo(sourceDest)
    }

    @Test
    @Disabled
    fun `test Meta Field`() {
        val fileSpec = FileSpec.builder("com.github.vjuge.cdmdsl", "MetaTypesDslMetaOnly")
        generator.scanResult
            .allInterfaces.filter {
                !it.name.endsWith(".DateBuilder") && !it.name.endsWith(".StringBuilder")
            }.filter {
                it.implementsInterface(FieldWithMeta.FieldWithMetaBuilder::class.java)
            }.forEach { classInfo ->
                println("Meta : " + classInfo.name)
                MetaGenerator.addMetaFunctions(fileSpec, classInfo)
            }

        fileSpec.build().writeTo(sourceDest)
    }

    @Test
    @Disabled
    fun `test Meta Data Fields`() {
        val fileSpec = FileSpec.builder("com.github.vjuge.cdmdsl", "MetaTypesDslMetaDataFields")
        generator.scanResult
            .allInterfaces.filter {
                !it.name.endsWith(".DateBuilder") && !it.name.endsWith(".StringBuilder")
            }.filter {
                it.implementsInterface(MetaDataFields.MetaDataFieldsBuilder::class.java)
            }.forEach { classInfo ->
                println("Meta Data : " + classInfo.name)
                MetaGenerator.addMetaDataFunctions(fileSpec, classInfo)
            }

        fileSpec.build().writeTo(sourceDest)
    }

    @Test
    @Disabled
    fun `test Reference Field`() {
        val fileSpec = FileSpec.builder("com.github.vjuge.cdmdsl", "MetaTypesDslRefOnly")
        generator.scanResult
            .allInterfaces.filter {
                !it.name.endsWith(".DateBuilder") && !it.name.endsWith(".StringBuilder")
            }.filter {
                it.implementsInterface(ReferenceWithMeta.ReferenceWithMetaBuilder::class.java)
            }.forEach { classInfo ->
                println("Ref : " + classInfo.packageInfo + " " + classInfo.simpleName)
                MetaGenerator.addReferenceFunctions(fileSpec, classInfo)
            }

        fileSpec.build().writeTo(sourceDest)
    }
}



