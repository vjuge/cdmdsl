package com.github.vjuge.cdmdsl

import cdm.base.math.metafields.ReferenceWithMetaQuantity
import cdm.event.common.Trade
import cdm.observable.asset.metafields.ReferenceWithMetaFloatingRateOption
import cdm.observable.asset.metafields.ReferenceWithMetaPrice
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

    /**
     * This test must compile
     */
    @Test
    fun referenceWithMetaTypes(){
        ReferenceWithMetaQuantity.builder().apply {
            reference {
                reference = "testRef"
            }
        }
        ReferenceWithMetaPrice.builder().apply {
            reference {
                reference = "testRef"
            }
        }
        ReferenceWithMetaFloatingRateOption.builder().apply {
            reference {
                reference = "testRef"
            }
        }
    }
}