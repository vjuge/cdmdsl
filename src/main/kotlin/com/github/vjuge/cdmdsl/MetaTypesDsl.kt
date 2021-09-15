package com.github.vjuge.cdmdsl

import cdm.base.datetime.AdjustableOrRelativeDates
import cdm.base.datetime.BusinessCenters
import cdm.base.datetime.BusinessDayAdjustments
import cdm.base.datetime.metafields.FieldWithMetaBusinessCenterEnum
import cdm.base.datetime.metafields.ReferenceWithMetaAdjustableOrRelativeDates
import cdm.base.datetime.metafields.ReferenceWithMetaBusinessCenters
import cdm.base.datetime.metafields.ReferenceWithMetaBusinessDayAdjustments
import cdm.base.math.Quantity
import cdm.base.math.metafields.FieldWithMetaQuantity
import cdm.base.math.metafields.ReferenceWithMetaQuantity
import cdm.base.staticdata.asset.common.Commodity
import cdm.base.staticdata.asset.common.ProductIdentifier
import cdm.base.staticdata.asset.common.metafields.FieldWithMetaAssetClassEnum
import cdm.base.staticdata.asset.common.metafields.FieldWithMetaCommodity
import cdm.base.staticdata.asset.common.metafields.FieldWithMetaProductIdentifier
import cdm.base.staticdata.asset.common.metafields.ReferenceWithMetaCommodity
import cdm.base.staticdata.asset.common.metafields.ReferenceWithMetaProductIdentifier
import cdm.base.staticdata.asset.rates.metafields.FieldWithMetaFloatingRateIndexEnum
import cdm.base.staticdata.identifier.Identifier
import cdm.base.staticdata.identifier.metafields.FieldWithMetaIdentifier
import cdm.base.staticdata.party.Account
import cdm.base.staticdata.party.LegalEntity
import cdm.base.staticdata.party.NaturalPerson
import cdm.base.staticdata.party.Party
import cdm.base.staticdata.party.metafields.FieldWithMetaAccountTypeEnum
import cdm.base.staticdata.party.metafields.FieldWithMetaCategoryEnum
import cdm.base.staticdata.party.metafields.FieldWithMetaEntityTypeEnum
import cdm.base.staticdata.party.metafields.FieldWithMetaNaturalPersonRoleEnum
import cdm.base.staticdata.party.metafields.ReferenceWithMetaAccount
import cdm.base.staticdata.party.metafields.ReferenceWithMetaLegalEntity
import cdm.base.staticdata.party.metafields.ReferenceWithMetaNaturalPerson
import cdm.base.staticdata.party.metafields.ReferenceWithMetaParty
import cdm.event.common.Trade
import cdm.event.common.TradeState
import cdm.event.common.TransferPrimitive
import cdm.event.common.metafields.ReferenceWithMetaTrade
import cdm.event.common.metafields.ReferenceWithMetaTradeState
import cdm.event.common.metafields.ReferenceWithMetaTransferPrimitive
import cdm.event.position.PortfolioState
import cdm.event.position.metafields.ReferenceWithMetaPortfolioState
import cdm.event.workflow.WorkflowStep
import cdm.event.workflow.metafields.FieldWithMetaCreditLimitTypeEnum
import cdm.event.workflow.metafields.FieldWithMetaLimitLevelEnum
import cdm.event.workflow.metafields.ReferenceWithMetaWorkflowStep
import cdm.legalagreement.common.LegalAgreement
import cdm.legalagreement.common.metafields.FieldWithMetaContractualDefinitionsEnum
import cdm.legalagreement.common.metafields.FieldWithMetaContractualSupplementEnum
import cdm.legalagreement.common.metafields.FieldWithMetaGoverningLawEnum
import cdm.legalagreement.common.metafields.FieldWithMetaMatrixTermEnum
import cdm.legalagreement.common.metafields.FieldWithMetaMatrixTypeEnum
import cdm.legalagreement.common.metafields.FieldWithMetaResourceTypeEnum
import cdm.legalagreement.common.metafields.ReferenceWithMetaLegalAgreement
import cdm.legalagreement.contract.metafields.FieldWithMetaBrokerConfirmationTypeEnum
import cdm.legalagreement.csa.metafields.FieldWithMetaCreditSupportAgreementTypeEnum
import cdm.legalagreement.master.metafields.FieldWithMetaMasterAgreementTypeEnum
import cdm.legalagreement.master.metafields.FieldWithMetaMasterConfirmationAnnexTypeEnum
import cdm.legalagreement.master.metafields.FieldWithMetaMasterConfirmationTypeEnum
import cdm.observable.asset.CreditNotation
import cdm.observable.asset.FixedRateSpecification
import cdm.observable.asset.FloatingRateOption
import cdm.observable.asset.Money
import cdm.observable.asset.Price
import cdm.observable.asset.QuotedCurrencyPair
import cdm.observable.asset.RateObservation
import cdm.observable.asset.metafields.FieldWithMetaCommodityReferencePriceEnum
import cdm.observable.asset.metafields.FieldWithMetaCreditNotation
import cdm.observable.asset.metafields.FieldWithMetaFloatingRateOption
import cdm.observable.asset.metafields.FieldWithMetaInformationProviderEnum
import cdm.observable.asset.metafields.FieldWithMetaInterpolationMethodEnum
import cdm.observable.asset.metafields.FieldWithMetaPrice
import cdm.observable.asset.metafields.FieldWithMetaQuotedCurrencyPair
import cdm.observable.asset.metafields.FieldWithMetaSettlementRateOptionEnum
import cdm.observable.asset.metafields.ReferenceWithMetaFixedRateSpecification
import cdm.observable.asset.metafields.ReferenceWithMetaFloatingRateOption
import cdm.observable.asset.metafields.ReferenceWithMetaMoney
import cdm.observable.asset.metafields.ReferenceWithMetaPrice
import cdm.observable.asset.metafields.ReferenceWithMetaQuotedCurrencyPair
import cdm.observable.asset.metafields.ReferenceWithMetaRateObservation
import cdm.observable.event.CreditEvents
import cdm.observable.event.Observation
import cdm.observable.event.metafields.FieldWithMetaMarketDisruptionEnum
import cdm.observable.event.metafields.FieldWithMetaRestructuringEnum
import cdm.observable.event.metafields.ReferenceWithMetaCreditEvents
import cdm.observable.event.metafields.ReferenceWithMetaObservation
import cdm.product.asset.CreditDefaultPayout
import cdm.product.asset.InterestRatePayout
import cdm.product.asset.ProtectionTerms
import cdm.product.asset.metafields.FieldWithMetaDayCountFractionEnum
import cdm.product.asset.metafields.FieldWithMetaIndexAnnexSourceEnum
import cdm.product.asset.metafields.FieldWithMetaSettledEntityMatrixSourceEnum
import cdm.product.asset.metafields.FieldWithMetaSpreadScheduleTypeEnum
import cdm.product.asset.metafields.ReferenceWithMetaCreditDefaultPayout
import cdm.product.asset.metafields.ReferenceWithMetaInterestRatePayout
import cdm.product.asset.metafields.ReferenceWithMetaProtectionTerms
import cdm.product.common.schedule.CalculationPeriodDates
import cdm.product.common.schedule.PaymentDates
import cdm.product.common.schedule.metafields.ReferenceWithMetaCalculationPeriodDates
import cdm.product.common.schedule.metafields.ReferenceWithMetaPaymentDates
import cdm.product.common.settlement.CashSettlementTerms
import cdm.product.common.settlement.Cashflow
import cdm.product.common.settlement.PhysicalSettlementTerms
import cdm.product.common.settlement.ResolvablePayoutQuantity
import cdm.product.common.settlement.SettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaCashSettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaCashflow
import cdm.product.common.settlement.metafields.ReferenceWithMetaPhysicalSettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaResolvablePayoutQuantity
import cdm.product.common.settlement.metafields.ReferenceWithMetaSettlementTerms
import cdm.product.template.EquityPayout
import cdm.product.template.OptionPayout
import cdm.product.template.Payout
import cdm.product.template.SecurityFinancePayout
import cdm.product.template.SecurityPayout
import cdm.product.template.metafields.ReferenceWithMetaEquityPayout
import cdm.product.template.metafields.ReferenceWithMetaOptionPayout
import cdm.product.template.metafields.ReferenceWithMetaPayout
import cdm.product.template.metafields.ReferenceWithMetaSecurityFinancePayout
import cdm.product.template.metafields.ReferenceWithMetaSecurityPayout
import com.rosetta.model.lib.meta.Key
import com.rosetta.model.lib.meta.Reference
import com.rosetta.model.metafields.BasicReferenceWithMetaDate
import com.rosetta.model.metafields.BasicReferenceWithMetaString
import com.rosetta.model.metafields.FieldWithMetaDate
import com.rosetta.model.metafields.FieldWithMetaString
import com.rosetta.model.metafields.MetaAndTemplateFields
import com.rosetta.model.metafields.MetaFields
import kotlin.Int
import kotlin.Unit

fun FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun ReferenceWithMetaAdjustableOrRelativeDates.ReferenceWithMetaAdjustableOrRelativeDatesBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaAdjustableOrRelativeDates.ReferenceWithMetaAdjustableOrRelativeDatesBuilder.value(f: AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.value(f: BusinessCenters.BusinessCentersBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaBusinessDayAdjustments.ReferenceWithMetaBusinessDayAdjustmentsBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaBusinessDayAdjustments.ReferenceWithMetaBusinessDayAdjustmentsBuilder.value(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaQuantity.FieldWithMetaQuantityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaQuantity.FieldWithMetaQuantityBuilder.value(f: Quantity.QuantityBuilder.() -> Unit)
    = orCreateValue.apply(f)

fun ReferenceWithMetaQuantity.ReferenceWithMetaQuantityBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaQuantity.ReferenceWithMetaQuantityBuilder.value(f: Quantity.QuantityBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaCommodity.FieldWithMetaCommodityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaCommodity.FieldWithMetaCommodityBuilder.value(f: Commodity.CommodityBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaProductIdentifier.FieldWithMetaProductIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaProductIdentifier.FieldWithMetaProductIdentifierBuilder.value(f: ProductIdentifier.ProductIdentifierBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaCommodity.ReferenceWithMetaCommodityBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaCommodity.ReferenceWithMetaCommodityBuilder.value(f: Commodity.CommodityBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.value(f: ProductIdentifier.ProductIdentifierBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.value(f: Identifier.IdentifierBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaAccountTypeEnum.FieldWithMetaAccountTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaCategoryEnum.FieldWithMetaCategoryEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaEntityTypeEnum.FieldWithMetaEntityTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaNaturalPersonRoleEnum.FieldWithMetaNaturalPersonRoleEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.value(f: Account.AccountBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaLegalEntity.ReferenceWithMetaLegalEntityBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaLegalEntity.ReferenceWithMetaLegalEntityBuilder.value(f: LegalEntity.LegalEntityBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaNaturalPerson.ReferenceWithMetaNaturalPersonBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaNaturalPerson.ReferenceWithMetaNaturalPersonBuilder.value(f: NaturalPerson.NaturalPersonBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.value(f: Party.PartyBuilder.() -> Unit) =
    orCreateValue.apply(f)

fun ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.value(f: Trade.TradeBuilder.() -> Unit) =
    orCreateValue.apply(f)

fun ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.value(f: TradeState.TradeStateBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.value(f: TransferPrimitive.TransferPrimitiveBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder.value(f: PortfolioState.PortfolioStateBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaCreditLimitTypeEnum.FieldWithMetaCreditLimitTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaLimitLevelEnum.FieldWithMetaLimitLevelEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.value(f: WorkflowStep.WorkflowStepBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaContractualSupplementEnum.FieldWithMetaContractualSupplementEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaGoverningLawEnum.FieldWithMetaGoverningLawEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaMatrixTermEnum.FieldWithMetaMatrixTermEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaMatrixTypeEnum.FieldWithMetaMatrixTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaResourceTypeEnum.FieldWithMetaResourceTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder.value(f: LegalAgreement.LegalAgreementBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaBrokerConfirmationTypeEnum.FieldWithMetaBrokerConfirmationTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaCreditSupportAgreementTypeEnum.FieldWithMetaCreditSupportAgreementTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaMasterAgreementTypeEnum.FieldWithMetaMasterAgreementTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaMasterConfirmationAnnexTypeEnum.FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaMasterConfirmationTypeEnum.FieldWithMetaMasterConfirmationTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaCommodityReferencePriceEnum.FieldWithMetaCommodityReferencePriceEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder.value(f: CreditNotation.CreditNotationBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaFloatingRateOption.FieldWithMetaFloatingRateOptionBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaFloatingRateOption.FieldWithMetaFloatingRateOptionBuilder.value(f: FloatingRateOption.FloatingRateOptionBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaInformationProviderEnum.FieldWithMetaInformationProviderEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaInterpolationMethodEnum.FieldWithMetaInterpolationMethodEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaPrice.FieldWithMetaPriceBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit):
    MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaPrice.FieldWithMetaPriceBuilder.value(f: Price.PriceBuilder.() -> Unit) =
    orCreateValue.apply(f)

fun FieldWithMetaQuotedCurrencyPair.FieldWithMetaQuotedCurrencyPairBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaQuotedCurrencyPair.FieldWithMetaQuotedCurrencyPairBuilder.value(f: QuotedCurrencyPair.QuotedCurrencyPairBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun ReferenceWithMetaFixedRateSpecification.ReferenceWithMetaFixedRateSpecificationBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaFixedRateSpecification.ReferenceWithMetaFixedRateSpecificationBuilder.value(f: FixedRateSpecification.FixedRateSpecificationBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaFloatingRateOption.ReferenceWithMetaFloatingRateOptionBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaFloatingRateOption.ReferenceWithMetaFloatingRateOptionBuilder.value(f: FloatingRateOption.FloatingRateOptionBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.value(f: Money.MoneyBuilder.() -> Unit) =
    orCreateValue.apply(f)

fun ReferenceWithMetaPrice.ReferenceWithMetaPriceBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaPrice.ReferenceWithMetaPriceBuilder.value(f: Price.PriceBuilder.() -> Unit) =
    orCreateValue.apply(f)

fun ReferenceWithMetaQuotedCurrencyPair.ReferenceWithMetaQuotedCurrencyPairBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaQuotedCurrencyPair.ReferenceWithMetaQuotedCurrencyPairBuilder.value(f: QuotedCurrencyPair.QuotedCurrencyPairBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaRateObservation.ReferenceWithMetaRateObservationBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaRateObservation.ReferenceWithMetaRateObservationBuilder.value(f: RateObservation.RateObservationBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaMarketDisruptionEnum.FieldWithMetaMarketDisruptionEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaRestructuringEnum.FieldWithMetaRestructuringEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun ReferenceWithMetaCreditEvents.ReferenceWithMetaCreditEventsBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaCreditEvents.ReferenceWithMetaCreditEventsBuilder.value(f: CreditEvents.CreditEventsBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaObservation.ReferenceWithMetaObservationBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaObservation.ReferenceWithMetaObservationBuilder.value(f: Observation.ObservationBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaIndexAnnexSourceEnum.FieldWithMetaIndexAnnexSourceEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaSettledEntityMatrixSourceEnum.FieldWithMetaSettledEntityMatrixSourceEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaSpreadScheduleTypeEnum.FieldWithMetaSpreadScheduleTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() ->
    Unit): MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder.value(f: CreditDefaultPayout.CreditDefaultPayoutBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.value(f: InterestRatePayout.InterestRatePayoutBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaProtectionTerms.ReferenceWithMetaProtectionTermsBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaProtectionTerms.ReferenceWithMetaProtectionTermsBuilder.value(f: ProtectionTerms.ProtectionTermsBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.value(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder.value(f: PaymentDates.PaymentDatesBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaCashSettlementTerms.ReferenceWithMetaCashSettlementTermsBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaCashSettlementTerms.ReferenceWithMetaCashSettlementTermsBuilder.value(f: CashSettlementTerms.CashSettlementTermsBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.value(f: Cashflow.CashflowBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaPhysicalSettlementTerms.ReferenceWithMetaPhysicalSettlementTermsBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaPhysicalSettlementTerms.ReferenceWithMetaPhysicalSettlementTermsBuilder.value(f: PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaResolvablePayoutQuantity.ReferenceWithMetaResolvablePayoutQuantityBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaResolvablePayoutQuantity.ReferenceWithMetaResolvablePayoutQuantityBuilder.value(f: ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaSettlementTerms.ReferenceWithMetaSettlementTermsBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaSettlementTerms.ReferenceWithMetaSettlementTermsBuilder.value(f: SettlementTerms.SettlementTermsBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.value(f: EquityPayout.EquityPayoutBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder.value(f: OptionPayout.OptionPayoutBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaPayout.ReferenceWithMetaPayoutBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaPayout.ReferenceWithMetaPayoutBuilder.value(f: Payout.PayoutBuilder.() -> Unit)
    = orCreateValue.apply(f)

fun ReferenceWithMetaSecurityFinancePayout.ReferenceWithMetaSecurityFinancePayoutBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaSecurityFinancePayout.ReferenceWithMetaSecurityFinancePayoutBuilder.value(f: SecurityFinancePayout.SecurityFinancePayoutBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun ReferenceWithMetaSecurityPayout.ReferenceWithMetaSecurityPayoutBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun ReferenceWithMetaSecurityPayout.ReferenceWithMetaSecurityPayoutBuilder.value(f: SecurityPayout.SecurityPayoutBuilder.() ->
    Unit) = orCreateValue.apply(f)

fun BasicReferenceWithMetaDate.BasicReferenceWithMetaDateBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun BasicReferenceWithMetaString.BasicReferenceWithMetaStringBuilder.reference(f: Reference.ReferenceBuilder.() ->
    Unit): Reference.ReferenceBuilder = orCreateReference.apply(f)

fun FieldWithMetaDate.FieldWithMetaDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit):
    MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun FieldWithMetaString.FieldWithMetaStringBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit):
    MetaFields.MetaFieldsBuilder = orCreateMeta.apply(f)

fun MetaAndTemplateFields.MetaAndTemplateFieldsBuilder.key(f: Key.KeyBuilder.() -> Unit) =
    addKey(Key.builder().apply(f).build())

fun MetaAndTemplateFields.MetaAndTemplateFieldsBuilder.key(index: Int, f: Key.KeyBuilder.() -> Unit)
    = getOrCreateKey(index).apply(f)

fun MetaFields.MetaFieldsBuilder.key(f: Key.KeyBuilder.() -> Unit) =
    addKey(Key.builder().apply(f).build())

fun MetaFields.MetaFieldsBuilder.key(index: Int, f: Key.KeyBuilder.() -> Unit) =
    getOrCreateKey(index).apply(f)