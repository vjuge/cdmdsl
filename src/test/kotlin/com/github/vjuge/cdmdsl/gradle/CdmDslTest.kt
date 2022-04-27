/*
 * *
 *  Copyright 2022 github.com/vjuge
 *
 *  Use of this source code is governed by an MIT-style
 *  license that can be found in the LICENSE file or at
 *  https://opensource.org/licenses/MIT.
 * /
 */
package com.github.vjuge.cdmdsl.gradle

import cdm.event.common.EventIntentEnum
import cdm.event.common.Trade
import cdm.event.workflow.EventTimestampQualificationEnum
import cdm.event.workflow.WorkflowStep
import com.fasterxml.jackson.databind.ObjectMapper
import com.github.vjuge.cdmdsl.*
import com.regnosys.rosetta.common.serialisation.RosettaObjectMapper
import com.rosetta.model.lib.records.Date
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.ZonedDateTime
import kotlin.test.assertNull

/**
 * These tests should just compile (according to cdm 2.161.0)
 */
class CdmDslTest {

    companion object {
        @JvmStatic
        val rosettaObjectMapper: ObjectMapper = RosettaObjectMapper.getNewRosettaObjectMapper()
    }

    @Test
    fun someTest() {
        val wfs = WorkflowStep.builder().apply {
            businessEvent {
                intent = EventIntentEnum.CONTRACT_FORMATION
                eventQualifier = "contract_formation"
                eventDate = Date.of(2022, 2, 22)
                instruction {
                    primitiveInstruction {
                        contractFormation {
                            legalAgreement { }
                        }
                    }
                    before { }
                }
            }
            eventIdentifier { }
            timestamp {
                dateTime = ZonedDateTime.now()
                qualification = EventTimestampQualificationEnum.EVENT_CREATION_DATE_TIME
            }
        }.build()

        assertEquals(1, wfs.eventIdentifier.size)
        assertNull(wfs.eventIdentifier[0].assignedIdentifier)
        assertNull(wfs.eventIdentifier[0].issuerReference)
        assertNull(wfs.eventIdentifier[0].meta)
    }

    @Test
    fun sampleCode() {
        val trade = Trade.builder().apply {
            tradeDate {
                value = Date.of( 2001, 1, 1)
            }
            //    will add a trade identifier in the list
            tradeIdentifier {
                assignedIdentifier {
                    identifier {
                        value = "6234"
                    }
                }
                issuerReference {
                    externalReference = "party1"
                }
            }
            //    will add a trade identifier in the list in the second position
            tradeIdentifier(1) {
                assignedIdentifier {
                    identifier {
                        value = "6569"
                    }
                }
                issuerReference {
                    externalReference = "party2"
                }
            }
            tradableProduct {
                //...
            }
        }.build()

        assertEquals(2, trade.tradeIdentifier.size)

//        assert resulting json content
        val resultJson = rosettaObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(trade)
        assertEquals(
            """
                {
                  "tradableProduct" : { },
                  "tradeDate" : {
                    "value" : "2001-01-01"
                  },
                  "tradeIdentifier" : [ {
                    "assignedIdentifier" : [ {
                      "identifier" : {
                        "value" : "6234"
                      }
                    } ],
                    "issuerReference" : {
                      "externalReference" : "party1"
                    }
                  }, {
                    "assignedIdentifier" : [ {
                      "identifier" : {
                        "value" : "6569"
                      }
                    } ],
                    "issuerReference" : {
                      "externalReference" : "party2"
                    }
                  } ]
                }
            """.trimIndent(),
            resultJson
        )
        println(resultJson)
    }

}