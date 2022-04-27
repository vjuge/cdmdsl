/*
 * *
 *  Copyright 2022 github.com/vjuge
 *
 *  Use of this source code is governed by an MIT-style
 *  license that can be found in the LICENSE file or at
 *  https://opensource.org/licenses/MIT.
 * /
 */

import cdm.base.staticdata.identifier.AssignedIdentifier;
import cdm.base.staticdata.identifier.Identifier;
import cdm.base.staticdata.party.metafields.ReferenceWithMetaParty;
import cdm.event.common.Trade;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.regnosys.rosetta.common.serialisation.RosettaObjectMapper;
import com.rosetta.model.lib.records.Date;
import com.rosetta.model.metafields.FieldWithMetaDate;
import com.rosetta.model.metafields.FieldWithMetaString;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * A sample of writing a simple trade using java code
 */
public class CdmJavaTest {

    @Test
    void test() throws JsonProcessingException {
        Trade trade = Trade.builder()
                .setTradableProduct(null)
                .setTradeDate(FieldWithMetaDate.builder()
                        .setValue(Date.of(2001,1,1)))
                .addTradeIdentifier(Identifier.builder()
                        .setAssignedIdentifier(
                                Arrays.asList(AssignedIdentifier.builder()
                                        .setIdentifier(FieldWithMetaString.builder()
                                                .setValue("6234"))))
                        .setIssuerReference(ReferenceWithMetaParty.builder()
                                .setExternalReference("party1"))
                )
                .addTradeIdentifier(Identifier.builder()
                        .setAssignedIdentifier(
                                Arrays.asList(AssignedIdentifier.builder()
                                        .setIdentifier(FieldWithMetaString.builder()
                                                .setValue("6569"))))
                        .setIssuerReference(ReferenceWithMetaParty.builder()
                                .setExternalReference("party2"))
                )
                .build();

        System.out.println(RosettaObjectMapper.getNewRosettaObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(trade));
    }
}
