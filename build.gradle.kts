import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.vjuge.cdmdsl.gradle.CdmDslTask

plugins {
    kotlin("jvm") version "1.3.71"
    idea
    `maven-publish`
    id("org.jetbrains.dokka") version "1.4.20"
    signing
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
    maven {
        setUrl("https://s01.oss.sonatype.org")
        credentials {
            username = project.properties["iossrhUsername"] as String?
            password = project.properties["ossrhPassword"] as String?
        }
    }
    maven {
        setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
        credentials {
            username = project.properties["iossrhUsername"] as String?
            password = project.properties["ossrhPassword"] as String?
        }
    }
}

dependencies {
    implementation("com.isda:cdm:${property("cdm_version")}")
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.jvmTarget = "1.8"
    setDependsOn(listOf("genSources"))
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

tasks.register("genSources", CdmDslTask::class.java){
    sourceDestFolder = generatedSrcDir
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
                    username = project.properties["iossrhUsername"] as String?
                    password = project.properties["ossrhPassword"] as String?
                }
            }
        }
    }
}

signing {
    sign(publishing.publications["mavenPublish"])
}