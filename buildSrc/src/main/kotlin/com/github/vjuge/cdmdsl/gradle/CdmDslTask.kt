/*
 * *
 *  Copyright 2022 github.com/vjuge
 *
 *  Use of this source code is governed by an MIT-style
 *  license that can be found in the LICENSE file or at
 *  https://opensource.org/licenses/MIT.
 * /
 */


package com.github.vjuge.cdmdsl.gradle

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File
import com.github.vjuge.cdmdsl.gradle.generator.TypeGenerator


open class CdmDslTask : DefaultTask() {

    @get:Input
    lateinit var sourceDestFolder: String

    @TaskAction
    fun generateClasses() {
        println("Generating sources into : $sourceDestFolder")
        TypeGenerator().generate().writeTo(File(sourceDestFolder))
    }
}
