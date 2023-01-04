import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.vjuge.cdmdsl.gradle.CdmDslTask

plugins {
    kotlin("jvm") version "1.6.21"
    idea
    `maven-publish`
    id("org.jetbrains.dokka") version "1.4.20"
    signing
}

apply(from = "versions.gradle.kts")
val cdm_version: String by extra
val patch_version: String by extra
val junit_version: String by extra

project.properties.forEach {
    println("cdmdsl -> " + it.key + " : " + it.value)
}

extra.properties.forEach {
    println("cdmdsl extra -> " + it.key + " : " + it.value)
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
    implementation("com.isda:cdm:${cdm_version}")

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit_version")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junit_version")

}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.jvmTarget = "11"
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

version = "${cdm_version}.${patch_version}"

publishing {
    publications {
        create<MavenPublication>("mavenPublish") {
            groupId = extra.properties["group"] as String?
            artifactId = extra.properties["artifactId"] as String?
            version = version

            from(components["java"])
            pom {
                name.set("cdmdsl")
                description.set("a kotlin dsl for isda cdm")
                packaging = "jar"
                url.set("https://github.com/vjuge/cdmdsl")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
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