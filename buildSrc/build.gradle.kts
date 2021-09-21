plugins {
    kotlin("jvm") version "1.3.71"
    idea
    maven
}

project.properties.forEach {
    println("buildSrc -> " + it.key + " : " + it.value)
}

apply(from = "../versions.gradle.kts")

extra.properties.forEach {
    println("buildSrc extra -> " + it.key + " : " + it.value)
}


val cdm_version: String by extra
val classGraph: String by extra
val kotlinpoet_version: String by extra
val junit_version: String by extra

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
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit_version")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junit_version")
    implementation("com.isda:cdm:$cdm_version")
    implementation("io.github.classgraph:classgraph:$classGraph")
    implementation("com.squareup:kotlinpoet:$kotlinpoet_version")
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