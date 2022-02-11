repositories {
    mavenLocal()
    mavenCentral()
    // CDM
    maven {
        // Restrict to CDM dependencies
        content {
            includeGroupByRegex("com\\.isda.*")
            includeGroupByRegex("com\\.regnosys.*")
        }
        url = uri("https://regnosys.jfrog.io/artifactory/libs-snapshot")
        credentials {
            username = project.properties["isdaLogin"] as String?
            username = project.properties["isdaPwd"] as String?
        }
    }
}