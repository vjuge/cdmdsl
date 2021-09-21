import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


plugins {
    kotlin("jvm") version "1.3.71"
    idea
    `maven-publish`
    id("org.jetbrains.dokka") version "1.4.20"
    signing
}
/*
class GreetingPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension: GreetingPluginExtension =
            project.extensions.create("greeting", GreetingPluginExtension::class.java)
        project.task("hello").doLast {
            println("Hello, " + extension.greeter)
            println("I have a message for You: " + extension.message)
        }
    }
}*/

/*class GreetingPluginExtension {
    var greeter = "Baeldung"
    var message = "Message from Plugin!"
}*/

open class GreetingPluginExtension {
    var message: String? = null
    var greeter: String? = null
}

class GreetingPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val extension = project.extensions.create<GreetingPluginExtension>("greeting")
        project.task("hello") {
            doLast {
                println("${extension.message} from ${extension.greeter}")
            }
        }
    }
}

apply<GreetingPlugin>()

// Configure the extension using a DSL block
configure<GreetingPluginExtension> {
    message = "Hello"
    greeter = "Vincent"
}


open class GreetingToFileTask : DefaultTask() {

    var destination: Any? = null

    @OutputFile
    fun getDestination(): File {
        return project.file(destination!!)
    }

    @TaskAction
    fun greet() {
        val file = getDestination()
        file.parentFile.mkdirs()
        file.writeText("Hello!")
    }
}

tasks.register<GreetingToFileTask>("greet") {
    destination = { project.extra["greetingFile"]!! }
}

tasks.register("sayGreeting") {
    dependsOn("greet")
    doLast {
        println(file(project.extra["greetingFile"]!!).readText())
    }
}

//extra["greetingFile"] = "$buildDir/hello.txt"

//extra.apply{
//    set("greetingFile", "$buildDir/hello.txt")
//}

ext{
    set("greetingFile", "$buildDir/hello.txt")
}


repositories {
    mavenCentral()
    jcenter()
    maven {
        // Restrict to CDM dependencies
        content {
            includeGroupByRegex("com\\.isda.*")
            includeGroupByRegex("com\\.regnosys.*")
        }
        setUrl("https://regnosys.jfrog.io/artifactory/libs-snapshot")
        credentials {
            username = project.properties["isdaLogin"] as String?
            password = project.properties["isdaPwd"] as String?
        }
    }
}

dependencies {
    implementation(gradleApi())

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:${property("junit_version")}")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:${property("junit_version")}")
    implementation("com.isda:cdm:${property("cdm_version")}")
    implementation("io.github.classgraph:classgraph:${property("classGraph")}")
    implementation("com.squareup:kotlinpoet:${property("kotlinpoet_version")}")
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.jvmTarget = "1.8"
//    setDependsOn(listOf("genSources"))
}

java {
    withJavadocJar()
    withSourcesJar()
}

val generatedSrcDir = File(buildDir, "/generated/src/main/kotlin/").toString()

sourceSets {
    main {
        java {
            srcDirs(generatedSrcDir)
        }
    }
}

tasks.test {
    useJUnitPlatform()
    filter {
        includeTestsMatching("*Test")
    }
}

val cdm_version = "${property("cdm_version")}"
val patch_version = "${property("patch_version")}"
version = "${cdm_version}.${patch_version}"

publishing {
    publications {
        create<MavenPublication>("mavenPublish") {
            groupId = "${property("group")}"
            artifactId = "${property("artifactId")}"
            version = "${version}"

            from(components["java"])
            pom {
                name.set("cdmdsl")
                description.set("a kotlin dsl for isda cdm")
                packaging = "jar"
                url.set("https://github.com/vjuge/cdmdsl")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("vjuge")
                        name.set("Vincent Jugé")
                        email.set("vincent.juge@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:https://github.com/vjuge/cdmdsl")
                    url.set("https://github.com/vjuge/cdmdsl")
                }
            }
        }
        repositories {
            maven {
                setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
                credentials {
                    username = "${property("iossrhUsername")}"
                    password = "${property("ossrhPassword")}"
                }
            }
        }
    }
}

signing {
    sign(publishing.publications["mavenPublish"])
}