package com.github.vjuge.cdmdsl.generator

import com.squareup.kotlinpoet.FileSpec
import io.github.classgraph.ClassGraph
import io.github.classgraph.ScanResult

class TypeGenerator : Generator() {

    override val PACKAGE = "com.github.vjuge.cdmdsl.type"
    override val CLASS = "TypesDsl"
    override val CDM_PKG: Array<String> = arrayOf("cdm.*", "com.rosetta.*")

    override fun generate(): FileSpec {
        TODO("Not yet implemented")
    }
}