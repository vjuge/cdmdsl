/*
 * *
 *  Copyright 2022 github.com/vjuge
 *
 *  Use of this source code is governed by an MIT-style
 *  license that can be found in the LICENSE file or at
 *  https://opensource.org/licenses/MIT.
 * /
 */


package com.github.vjuge.cdmdsl.gradle.generator

import com.squareup.kotlinpoet.FileSpec
import io.github.classgraph.ClassGraph
import io.github.classgraph.ScanResult

abstract class Generator {
    abstract var PACKAGE : String
    abstract var CLASS : String
    abstract var CDM_PKG : Array<String>

    val scanResult : ScanResult by lazy {
        ClassGraph()
            .enableAllInfo()
            .acceptPackages(*CDM_PKG)
            .scan()
    }

    abstract fun generate(): FileSpec
}