mapOf(
    "appCompatVersion" to "1.1.0",
    "cdm_version" to "2.161.0",
    "group" to "com.github.vjuge",
    "artifactId" to "cdmdsl",
    "classGraph" to "4.8.116",
    "patch_version" to "0",
    "junit_version" to "5.6.0",
    "kotlinpoet_version" to "1.6.0"
).forEach { (name : String, version: String) ->
    project.extra.set(name, version)
}