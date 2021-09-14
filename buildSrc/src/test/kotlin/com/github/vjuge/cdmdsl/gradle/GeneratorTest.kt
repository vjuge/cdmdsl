package com.github.vjuge.cdmdsl.gradle

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Test


class GeneratorTest {

    @Test
    fun test(){
        println("PIPO test")
    }
}


class GreetingPluginTest {
    @Test
    fun greeterPluginAddsGreetingTaskToProject() {
       /* val project: Project = ProjectBuilder.builder().build()
        project.getPluginManager().apply("com.github.vjuge.cdmdsl.gradle")
        assert(project.getTasks().getByName("pipo") is CdmDslTask)*/
        println("test plugin")
    }
}