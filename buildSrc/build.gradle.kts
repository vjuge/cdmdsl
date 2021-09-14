plugins {
    kotlin("jvm") version "1.3.71"
    id ("java-gradle-plugin")
    idea
    maven
}

repositories {
    mavenCentral()
    jcenter()
}

dependencies{
    implementation(gradleApi())

    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")

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