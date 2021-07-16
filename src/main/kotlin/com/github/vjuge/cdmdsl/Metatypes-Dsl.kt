/**
 * This file is auto-generated from the ISDA Common Domain Model, do not edit.
 * Version: 2.111.0
 */

package com.github.vjuge.cdmdsl

import cdm.base.datetime.AdjustableOrRelativeDates
import cdm.base.datetime.BusinessCenters
import cdm.base.datetime.BusinessDayAdjustments
import cdm.base.datetime.metafields.FieldWithMetaBusinessCenterEnum
import cdm.base.datetime.metafields.ReferenceWithMetaAdjustableOrRelativeDates
import cdm.base.datetime.metafields.ReferenceWithMetaBusinessCenters
import cdm.base.datetime.metafields.ReferenceWithMetaBusinessDayAdjustments
import cdm.base.math.metafields.FieldWithMetaQuantity
import cdm.base.staticdata.asset.common.ProductIdentifier
import cdm.base.staticdata.asset.common.metafields.FieldWithMetaAssetClassEnum
import cdm.base.staticdata.asset.common.metafields.FieldWithMetaCommodity
import cdm.base.staticdata.asset.common.metafields.FieldWithMetaProductIdentifier
import cdm.base.staticdata.asset.common.metafields.ReferenceWithMetaProductIdentifier
import cdm.base.staticdata.asset.rates.metafields.FieldWithMetaFloatingRateIndexEnum
import cdm.base.staticdata.identifier.metafields.FieldWithMetaIdentifier
import cdm.base.staticdata.party.Account
import cdm.base.staticdata.party.LegalEntity
import cdm.base.staticdata.party.NaturalPerson
import cdm.base.staticdata.party.Party
import cdm.base.staticdata.party.metafields.*
import cdm.event.common.*
import cdm.event.common.metafields.*
import cdm.event.position.PortfolioState
import cdm.event.position.metafields.ReferenceWithMetaPortfolioState
import cdm.event.workflow.WorkflowStep
import cdm.event.workflow.metafields.FieldWithMetaCreditLimitTypeEnum
import cdm.event.workflow.metafields.FieldWithMetaLimitLevelEnum
import cdm.event.workflow.metafields.ReferenceWithMetaWorkflowStep
import cdm.legalagreement.common.LegalAgreement
import cdm.legalagreement.common.metafields.*
import cdm.legalagreement.contract.metafields.FieldWithMetaBrokerConfirmationTypeEnum
import cdm.legalagreement.csa.metafields.FieldWithMetaCreditSupportAgreementTypeEnum
import cdm.legalagreement.master.metafields.FieldWithMetaMasterAgreementTypeEnum
import cdm.legalagreement.master.metafields.FieldWithMetaMasterConfirmationAnnexTypeEnum
import cdm.legalagreement.master.metafields.FieldWithMetaMasterConfirmationTypeEnum
import cdm.observable.asset.FixedRateSpecification
import cdm.observable.asset.Money
import cdm.observable.asset.PriceQuantity
import cdm.observable.asset.RateObservation
import cdm.observable.asset.metafields.*
import cdm.observable.event.CreditEvents
import cdm.observable.event.Observation
import cdm.observable.event.metafields.FieldWithMetaMarketDisruptionEnum
import cdm.observable.event.metafields.FieldWithMetaRestructuringEnum
import cdm.observable.event.metafields.ReferenceWithMetaCreditEvents
import cdm.observable.event.metafields.ReferenceWithMetaObservation
import cdm.product.asset.CreditDefaultPayout
import cdm.product.asset.InterestRatePayout
import cdm.product.asset.ProtectionTerms
import cdm.product.asset.metafields.*
import cdm.product.common.schedule.CalculationPeriodDates
import cdm.product.common.schedule.PaymentDates
import cdm.product.common.schedule.metafields.ReferenceWithMetaCalculationPeriodDates
import cdm.product.common.schedule.metafields.ReferenceWithMetaPaymentDates
import cdm.product.common.settlement.*
import cdm.product.common.settlement.metafields.*
import cdm.product.template.EquityPayout
import cdm.product.template.OptionPayout
import cdm.product.template.Payout
import cdm.product.template.SecurityPayout
import cdm.product.template.metafields.ReferenceWithMetaEquityPayout
import cdm.product.template.metafields.ReferenceWithMetaOptionPayout
import cdm.product.template.metafields.ReferenceWithMetaPayout
import cdm.product.template.metafields.ReferenceWithMetaSecurityPayout
import com.rosetta.model.metafields.FieldWithMetaDate
import com.rosetta.model.metafields.FieldWithMetaString
import com.rosetta.model.metafields.MetaFields


fun ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.value(f: Party.PartyBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaBusinessDayAdjustments.ReferenceWithMetaBusinessDayAdjustmentsBuilder.value(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.value(f: Trade.TradeBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.value(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.value(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.value(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder.value(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.value(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.value(f: TransferPrimitive.TransferPrimitiveBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.value(f: Money.MoneyBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaAdjustableOrRelativeDates.ReferenceWithMetaAdjustableOrRelativeDatesBuilder.value(f: AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.value(f: InterestRatePayout.InterestRatePayoutBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.value(f: Cashflow.CashflowBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder.value(f: CreditDefaultPayout.CreditDefaultPayoutBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.value(f: EquityPayout.EquityPayoutBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.value(f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder.value(f: LegalAgreement.LegalAgreementBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder.value(f: OptionPayout.OptionPayoutBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder.value(f: PortfolioState.PortfolioStateBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaNaturalPerson.ReferenceWithMetaNaturalPersonBuilder.value(f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaFixedRateSpecification.ReferenceWithMetaFixedRateSpecificationBuilder.value(f: FixedRateSpecification.FixedRateSpecificationBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.value(f: Account.AccountBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaRateObservation.ReferenceWithMetaRateObservationBuilder.value(f: RateObservation.RateObservationBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaLegalEntity.ReferenceWithMetaLegalEntityBuilder.value(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaCashSettlementTerms.ReferenceWithMetaCashSettlementTermsBuilder.value(f: CashSettlementTerms.CashSettlementTermsBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaPhysicalSettlementTerms.ReferenceWithMetaPhysicalSettlementTermsBuilder.value(f: PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaProtectionTerms.ReferenceWithMetaProtectionTermsBuilder.value(f: ProtectionTerms.ProtectionTermsBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaObservation.ReferenceWithMetaObservationBuilder.value(f: Observation.ObservationBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaPayout.ReferenceWithMetaPayoutBuilder.value(f: Payout.PayoutBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaResolvablePayoutQuantity.ReferenceWithMetaResolvablePayoutQuantityBuilder.value(f: ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaOptionSettlement.ReferenceWithMetaOptionSettlementBuilder.value(f: OptionSettlement.OptionSettlementBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaSecurityPayout.ReferenceWithMetaSecurityPayoutBuilder.value(f: SecurityPayout.SecurityPayoutBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaSettlementTerms.ReferenceWithMetaSettlementTermsBuilder.value(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaPriceQuantity.ReferenceWithMetaPriceQuantityBuilder.value(f: PriceQuantity.PriceQuantityBuilder.() -> Unit) = orCreateValue.apply(f)
fun ReferenceWithMetaCreditEvents.ReferenceWithMetaCreditEventsBuilder.value(f: CreditEvents.CreditEventsBuilder.() -> Unit) = orCreateValue.apply(f)
fun FieldWithMetaString.FieldWithMetaStringBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaAccountTypeEnum.FieldWithMetaAccountTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaDate.FieldWithMetaDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaMarketDisruptionEnum.FieldWithMetaMarketDisruptionEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaBrokerConfirmationTypeEnum.FieldWithMetaBrokerConfirmationTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaGoverningLawEnum.FieldWithMetaGoverningLawEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaMatrixTermEnum.FieldWithMetaMatrixTermEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaMatrixTypeEnum.FieldWithMetaMatrixTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaContractualSupplementEnum.FieldWithMetaContractualSupplementEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaCreditSupportAgreementTypeEnum.FieldWithMetaCreditSupportAgreementTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaCommodityReferencePriceEnum.FieldWithMetaCommodityReferencePriceEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaPrice.FieldWithMetaPriceBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaFloatingRateOption.FieldWithMetaFloatingRateOptionBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaQuantity.FieldWithMetaQuantityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaQuotedCurrencyPair.FieldWithMetaQuotedCurrencyPairBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaIndexAnnexSourceEnum.FieldWithMetaIndexAnnexSourceEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaInterpolationMethodEnum.FieldWithMetaInterpolationMethodEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaInformationProviderEnum.FieldWithMetaInformationProviderEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaCreditLimitTypeEnum.FieldWithMetaCreditLimitTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaLimitLevelEnum.FieldWithMetaLimitLevelEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaMasterAgreementTypeEnum.FieldWithMetaMasterAgreementTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaMasterConfirmationAnnexTypeEnum.FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaMasterConfirmationTypeEnum.FieldWithMetaMasterConfirmationTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaNaturalPersonRoleEnum.FieldWithMetaNaturalPersonRoleEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaCommodity.FieldWithMetaCommodityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaProductIdentifier.FieldWithMetaProductIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaCategoryEnum.FieldWithMetaCategoryEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaEntityTypeEnum.FieldWithMetaEntityTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaResourceTypeEnum.FieldWithMetaResourceTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaRestructuringEnum.FieldWithMetaRestructuringEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaSettledEntityMatrixSourceEnum.FieldWithMetaSettledEntityMatrixSourceEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FieldWithMetaSpreadScheduleTypeEnum.FieldWithMetaSpreadScheduleTypeEnumBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
