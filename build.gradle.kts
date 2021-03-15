import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.71"
    idea
    `maven-publish`
    id("org.jetbrains.dokka") version "1.4.20"
    signing
}

val cdm_version = "2.85.0"
val patch_version = "2"

group = "com.github.vjuge"
val artifactId = "cdmdsl"
version = "${cdm_version}.${patch_version}"


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
}

dependencies {
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
    implementation("com.isda:cdm:${cdm_version}")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

java {
    withJavadocJar()
    withSourcesJar()
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


publishing {
    publications {
        create<MavenPublication>("mavenPublish") {
            groupId = "${group}"
            artifactId = "${artifactId}"
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