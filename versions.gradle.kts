mapOf(
    "appCompatVersion" to "1.1.0",
    "cdm_version" to "2.118.4",
    "group" to "com.github.vjuge",
    "artifactId" to "cdmdsl",
    "classGraph" to "4.8.116",
    "patch_version" to "2",
    "junit_version" to "5.6.0",
    "kotlinpoet_version" to "1.6.0"
).forEach { (name : String, version: String) ->
    project.extra.set(name, version)
}