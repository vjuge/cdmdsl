package com.github.vjuge.cdmdsl

import cdm.legalagreement.contract.Contract
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DslTest {

    @Test
    fun testDsl(){
        val contract = Contract.builder().apply {
            contractIdentifier {
                assignedIdentifier {
                    identifier {
                        value = "myId"
                    }
                }
            }
        }.build()
        assertEquals("myId", contract!!.contractIdentifier[0]!!.assignedIdentifier[0]!!.identifier!!.value)
    }
}