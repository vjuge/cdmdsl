package com.github.vjuge.cdmdsl.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.nio.file.Paths


open class CdmDslTask : DefaultTask() {

    @get:Input
    var pipoVar: String = ""

    @TaskAction
    fun generateClasses() {
        println("Hello : $pipoVar")
//        val sourceDest: File = Paths.get("src", "main","kotlin").toFile()
//        com.github.vjuge.cdmdsl.gradle.generator.generate().writeTo(sourceDest)
    }
}
/*

class CdmDslPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        val extension = target.extensions.create(
            CdmDslPluginExtension.EXTENSION_NAME,
            CdmDslPluginExtension::class.java
        )

        target.task("pipoPlugin") {
            println("Hello : ${extension.message}")
        }
    }
}

open class CdmDslPluginExtension {
    companion object {
        */
/** Gradle config section name *//*

        @JvmStatic
        val EXTENSION_NAME = "cdmDslPluginExtensionConfig"
    }

    var message = ""
}*/
