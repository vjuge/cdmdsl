package com.github.vjuge.cdmdsl.gradle

import com.github.vjuge.cdmdsl.gradle.generator.TypeGenerator
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.io.File
import java.nio.file.Paths

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TypeGeneratorTest {

    companion object {

        val sourceDest: File = Paths.get(
            "src",
            "test",
            "resources").toFile()
    }

    @BeforeAll
    fun setup(){
        sourceDest.deleteRecursively()
    }

    @Test
    @Disabled
    fun test(){
        TypeGenerator().apply {
            CDM_PKG = arrayOf("cdm.")
        }.generate().writeTo(sourceDest)
    }


}
