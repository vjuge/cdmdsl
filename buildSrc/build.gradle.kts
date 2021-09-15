plugins {
    kotlin("jvm") version "1.3.71"
    id ("java-gradle-plugin")
    idea
    maven
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

dependencies{
    implementation(gradleApi())

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
    implementation("com.isda:cdm:${property("cdm_version")}")
    implementation("io.github.classgraph:classgraph:${property("classGraph")}")
    implementation("com.squareup:kotlinpoet:${property("kotlinpoet_version")}")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.test {
    useJUnitPlatform()
    filter {
        includeTestsMatching("*Test")
    }
}