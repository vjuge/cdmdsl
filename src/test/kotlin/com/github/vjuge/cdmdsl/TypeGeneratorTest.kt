package com.github.vjuge.cdmdsl

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import java.io.File
import java.nio.file.Paths

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class TypeGeneratorTest {

    companion object {

        val sourceDest: File = Paths.get(
            "src",
            "test",
            "resources",
            "types"
        ).toFile()
    }

    @BeforeAll
    fun setup(){
        sourceDest.deleteRecursively()
    }


}