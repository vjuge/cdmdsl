package com.github.vjuge.cdmdsl.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.nio.file.Paths
import com.github.vjuge.cdmdsl.gradle.generator.MetaGenerator
import com.github.vjuge.cdmdsl.gradle.generator.TypeGenerator


open class CdmDslTask : DefaultTask() {

    @get:Input
    lateinit var sourceDestFolder: String

    @TaskAction
    fun generateClasses() {
        println("Generating sources into : $sourceDestFolder")
//        MetaGenerator().generate().writeTo(File(sourceDestFolder))
        TypeGenerator().generate().writeTo(File(sourceDestFolder))
    }
}
