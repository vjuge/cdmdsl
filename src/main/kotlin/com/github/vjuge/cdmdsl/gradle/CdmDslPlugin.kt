package com.github.vjuge.cdmdsl.gradle

import com.github.vjuge.cdmdsl.generator.TypeGenerator
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.compile.JavaCompile
import java.io.File

class CdmDslPlugin : Plugin<Project> {

    companion object{
        @JvmStatic
        val PLUGIN_NAME: String = CdmDslPlugin::class.java.`package`.name
        const val GENERATED_SOURCE_DIRECTORY = "resources/main"
    }

    @get:Input
    lateinit var sourceDestFolder: String

    @get:Input
    lateinit var cdmVersion: String

    override fun apply(target: Project) {

        createExtension(target)
        configureTask(target)

        target.task("genCdmDsl").doLast {
            println("Generating sources into : $sourceDestFolder")
            TypeGenerator().generate().writeTo(File(sourceDestFolder))
            println("finished")
        }
    }

    private fun createExtension(project: Project) {
        project.extensions.create(
            CdmDslPLuginExtension.EXTENSION_NAME,
            CdmDslPLuginExtension::class.java)
    }

    private fun configureTask(project: Project) {
        val cdmDslTask = project.tasks.create(
            CdmDslTask.TASK_NAME,
            CdmDslTask::class.java)
        project.tasks.withType(JavaCompile::class.java) { it.dependsOn(cdmDslTask) }
    }

}

/**
 * Gradle plugin extension for [CdmDslPlugin], allows configuration
 * using a closure. For example:
 *
 * ```
 * cdmDslConfig{
 *    patchFilesBaseDir = "src/main/testcases"
 * }
 * ```
 */
open class CdmDslPLuginExtension {
    companion object{
        /** Gradle config section name */
        @JvmStatic
        val EXTENSION_NAME = "cdmDslConfig"
    }


    lateinit var cdmVersion: String

}