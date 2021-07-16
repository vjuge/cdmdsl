package com.github.vjuge.cdmdsl

import cdm.event.common.Trade
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DslTest {

    @Test
    fun testDsl(){
        val contract = Trade.builder().apply {
            tradeIdentifier {
                assignedIdentifier {
                    identifier {
                        value = "myId"
                    }
                }
            }
        }.build()
        assertEquals("myId", contract!!.tradeIdentifier[0]!!.assignedIdentifier[0]!!.identifier!!.value)
    }
}