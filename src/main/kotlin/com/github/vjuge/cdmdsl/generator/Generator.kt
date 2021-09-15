package com.github.vjuge.cdmdsl.generator

import com.squareup.kotlinpoet.FileSpec

interface Generator {

    fun generate(): FileSpec

}