package com.github.vjuge.cdmdsl.gradle

import com.github.vjuge.cdmdsl.generator.TypeGenerator
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File


open class CdmDslTask : DefaultTask() {

    companion object{
        @JvmStatic
        val TASK_NAME: String = CdmDslTask::class.java.`package`.name

        const val GENERATED_SOURCE_DIRECTORY = "resources/main"
    }

    @get:Input
    lateinit var sourceDestFolder: String

    @TaskAction
    fun generateClasses() {
        println("Generating sources into : $sourceDestFolder")
        TypeGenerator().generate().writeTo(File(sourceDestFolder))
    }
}
