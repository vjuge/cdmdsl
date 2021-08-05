/**
 * This file is auto-generated from the ISDA Common Domain Model, do not edit.
 * Version: 2.118.4
 */

package com.github.vjuge.cdmdsl

import cdm.base.*
import cdm.base.datetime.*
import cdm.base.datetime.metafields.*
import cdm.base.math.*
import cdm.base.math.metafields.FieldWithMetaQuantity
import cdm.base.staticdata.*
import cdm.base.staticdata.asset.*
import cdm.base.staticdata.asset.common.*
import cdm.base.staticdata.asset.common.metafields.*
import cdm.base.staticdata.asset.credit.*
import cdm.base.staticdata.asset.rates.*
import cdm.base.staticdata.asset.rates.metafields.FieldWithMetaFloatingRateIndexEnum
import cdm.base.staticdata.identifier.*
import cdm.base.staticdata.identifier.metafields.*
import cdm.base.staticdata.party.*
import cdm.base.staticdata.party.metafields.*
import cdm.event.common.*
import cdm.event.common.metafields.*
import cdm.event.position.*
import cdm.event.position.metafields.*
import cdm.event.workflow.*
import cdm.event.workflow.metafields.*
import cdm.legalagreement.common.*
import cdm.legalagreement.common.metafields.*
import cdm.legalagreement.contract.*
import cdm.legalagreement.contract.metafields.*
import cdm.legalagreement.csa.*
import cdm.legalagreement.csa.metafields.*
import cdm.legalagreement.master.*
import cdm.legalagreement.master.metafields.*
import cdm.observable.*
import cdm.observable.asset.*
import cdm.observable.asset.metafields.*
import cdm.observable.common.*
import cdm.observable.event.*
import cdm.observable.event.metafields.*
import cdm.product.*
import cdm.product.asset.*
import cdm.product.asset.metafields.*
import cdm.product.common.*
import cdm.product.common.schedule.*
import cdm.product.common.schedule.metafields.ReferenceWithMetaCalculationPeriodDates
import cdm.product.common.schedule.metafields.ReferenceWithMetaPaymentDates
import cdm.product.common.settlement.*
import cdm.product.common.settlement.metafields.ReferenceWithMetaCashSettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaCashflow
import cdm.base.math.metafields.ReferenceWithMetaQuantity
import cdm.product.common.settlement.metafields.ReferenceWithMetaSettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaPhysicalSettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaResolvablePayoutQuantity
import cdm.product.template.*
import cdm.product.template.metafields.*
import cdm.regulation.*
import com.rosetta.model.metafields.*
import org.isda.cdm.*
import java.util.ArrayList

fun AccessConditions.AccessConditionsBuilder.additionalTerminationEvent(f: AdditionalTerminationEvent.AdditionalTerminationEventBuilder.() -> Unit) = addAdditionalTerminationEvent(AdditionalTerminationEvent.AdditionalTerminationEventBuilderImpl().apply(f).build())
fun AccessConditions.AccessConditionsBuilder.additionalTerminationEvent(index: Int, f: AdditionalTerminationEvent.AdditionalTerminationEventBuilder.() -> Unit) = getOrCreateAdditionalTerminationEvent(index).apply(f)
fun AccessConditions.AccessConditionsBuilder.partyElection(f: AccessConditionsElections.AccessConditionsElectionsBuilder.() -> Unit) = addPartyElection(AccessConditionsElections.AccessConditionsElectionsBuilderImpl().apply(f).build())
fun AccessConditions.AccessConditionsBuilder.partyElection(index: Int, f: AccessConditionsElections.AccessConditionsElectionsBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)


fun Account.AccountBuilder.accountBeneficiary(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateAccountBeneficiary.apply(f)
fun Account.AccountBuilder.accountName(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateAccountName.apply(f)
fun Account.AccountBuilder.accountNumber(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateAccountNumber.apply(f)
fun Account.AccountBuilder.accountType(f: FieldWithMetaAccountTypeEnum.FieldWithMetaAccountTypeEnumBuilder.() -> Unit) = orCreateAccountType.apply(f)
fun Account.AccountBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Account.AccountBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)
fun Account.AccountBuilder.servicingParty(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateServicingParty.apply(f)

fun AcctOwnr.AcctOwnrBuilder.id(f: Id.IdBuilder.() -> Unit) = orCreateId.apply(f)




fun AdditionalRepresentation.AdditionalRepresentationBuilder.partyElection(f: AdditionalRepresentationElection.AdditionalRepresentationElectionBuilder.() -> Unit) = addPartyElection(AdditionalRepresentationElection.AdditionalRepresentationElectionBuilderImpl().apply(f).build())
fun AdditionalRepresentation.AdditionalRepresentationBuilder.partyElection(index: Int, f: AdditionalRepresentationElection.AdditionalRepresentationElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)


fun AdditionalRepresentations.AdditionalRepresentationsBuilder.additionalRepresentation(f: AdditionalRepresentation.AdditionalRepresentationBuilder.() -> Unit) = orCreateAdditionalRepresentation.apply(f)




fun Address.AddressBuilder.country(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCountry.apply(f)

fun AddressForNotices.AddressForNoticesBuilder.additionalNotices(f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = addAdditionalNotices(PartyContactInformation.PartyContactInformationBuilderImpl().apply(f).build())
fun AddressForNotices.AddressForNoticesBuilder.additionalNotices(index: Int, f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = getOrCreateAdditionalNotices(index).apply(f)
fun AddressForNotices.AddressForNoticesBuilder.primaryNotices(f: ContactElection.ContactElectionBuilder.() -> Unit) = orCreatePrimaryNotices.apply(f)


fun AdjustableDate.AdjustableDateBuilder.adjustedDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateAdjustedDate.apply(f)
fun AdjustableDate.AdjustableDateBuilder.dateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustments.apply(f)
fun AdjustableDate.AdjustableDateBuilder.dateAdjustmentsReference(f: ReferenceWithMetaBusinessDayAdjustments.ReferenceWithMetaBusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustmentsReference.apply(f)
fun AdjustableDate.AdjustableDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun AdjustableDates.AdjustableDatesBuilder.adjustedDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = addAdjustedDate(FieldWithMetaDate.FieldWithMetaDateBuilderImpl().apply(f).build())
fun AdjustableDates.AdjustableDatesBuilder.adjustedDate(index: Int, f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = getOrCreateAdjustedDate(index).apply(f)
fun AdjustableDates.AdjustableDatesBuilder.dateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustments.apply(f)
fun AdjustableDates.AdjustableDatesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun AdjustableOrAdjustedDate.AdjustableOrAdjustedDateBuilder.adjustedDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateAdjustedDate.apply(f)
fun AdjustableOrAdjustedDate.AdjustableOrAdjustedDateBuilder.dateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustments.apply(f)
fun AdjustableOrAdjustedDate.AdjustableOrAdjustedDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun AdjustableOrAdjustedOrRelativeDate.AdjustableOrAdjustedOrRelativeDateBuilder.adjustedDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateAdjustedDate.apply(f)
fun AdjustableOrAdjustedOrRelativeDate.AdjustableOrAdjustedOrRelativeDateBuilder.dateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustments.apply(f)
fun AdjustableOrAdjustedOrRelativeDate.AdjustableOrAdjustedOrRelativeDateBuilder.relativeDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateRelativeDate.apply(f)

fun AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.adjustableDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateAdjustableDate.apply(f)
fun AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.relativeDate(f: AdjustedRelativeDateOffset.AdjustedRelativeDateOffsetBuilder.() -> Unit) = orCreateRelativeDate.apply(f)

fun AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.adjustableDates(f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = orCreateAdjustableDates.apply(f)
fun AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.relativeDates(f: RelativeDates.RelativeDatesBuilder.() -> Unit) = orCreateRelativeDates.apply(f)

fun AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.adjustableDates(f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = orCreateAdjustableDates.apply(f)
fun AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.periodicDates(f: PeriodicDates.PeriodicDatesBuilder.() -> Unit) = orCreatePeriodicDates.apply(f)
fun AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.relativeDates(f: RelativeDates.RelativeDatesBuilder.() -> Unit) = orCreateRelativeDates.apply(f)

fun AdjustedRelativeDateOffset.AdjustedRelativeDateOffsetBuilder.relativeDateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateRelativeDateAdjustments.apply(f)

fun Affirmation.AffirmationBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = addIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun Affirmation.AffirmationBuilder.identifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply(f)
fun Affirmation.AffirmationBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun Affirmation.AffirmationBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilderImpl().apply(f).build())
fun Affirmation.AffirmationBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply(f)
fun Affirmation.AffirmationBuilder.partyRole(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRole(PartyRole.PartyRoleBuilderImpl().apply(f).build())
fun Affirmation.AffirmationBuilder.partyRole(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRole(index).apply(f)

fun AgencyRatingCriteria.AgencyRatingCriteriaBuilder.creditNotation(f: CreditNotation.CreditNotationBuilder.() -> Unit) = addCreditNotation(CreditNotation.CreditNotationBuilderImpl().apply(f).build())
fun AgencyRatingCriteria.AgencyRatingCriteriaBuilder.creditNotation(index: Int, f: CreditNotation.CreditNotationBuilder.() -> Unit) = getOrCreateCreditNotation(index).apply(f)


fun AggregationParameters.AggregationParametersBuilder.party(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addParty(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilderImpl().apply(f).build())
fun AggregationParameters.AggregationParametersBuilder.party(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreateParty(index).apply(f)
fun AggregationParameters.AggregationParametersBuilder.product(f: Product.ProductBuilder.() -> Unit) = addProduct(Product.ProductBuilderImpl().apply(f).build())
fun AggregationParameters.AggregationParametersBuilder.product(index: Int, f: Product.ProductBuilder.() -> Unit) = getOrCreateProduct(index).apply(f)
fun AggregationParameters.AggregationParametersBuilder.tradeReference(f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = addTradeReference(ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilderImpl().apply(f).build())
fun AggregationParameters.AggregationParametersBuilder.tradeReference(index: Int, f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = getOrCreateTradeReference(index).apply(f)

fun Agreement.AgreementBuilder.collateralTransferAgreementElections(f: CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.() -> Unit) = orCreateCollateralTransferAgreementElections.apply(f)
fun Agreement.AgreementBuilder.creditSupportAgreementElections(f: CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.() -> Unit) = orCreateCreditSupportAgreementElections.apply(f)
fun Agreement.AgreementBuilder.masterAgreementSchedule(f: MasterAgreementSchedule.MasterAgreementScheduleBuilder.() -> Unit) = orCreateMasterAgreementSchedule.apply(f)
fun Agreement.AgreementBuilder.securityAgreementElections(f: SecurityAgreementElections.SecurityAgreementElectionsBuilder.() -> Unit) = orCreateSecurityAgreementElections.apply(f)

fun AgreementTerms.AgreementTermsBuilder.agreement(f: Agreement.AgreementBuilder.() -> Unit) = orCreateAgreement.apply(f)
fun AgreementTerms.AgreementTermsBuilder.counterparty(f: Counterparty.CounterpartyBuilder.() -> Unit) = addCounterparty(Counterparty.CounterpartyBuilderImpl().apply(f).build())
fun AgreementTerms.AgreementTermsBuilder.counterparty(index: Int, f: Counterparty.CounterpartyBuilder.() -> Unit) = getOrCreateCounterparty(index).apply(f)

fun AllocationBreakdown.AllocationBreakdownBuilder.account(f: Account.AccountBuilder.() -> Unit) = orCreateAccount.apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.allocationTradeId(f: Identifier.IdentifierBuilder.() -> Unit) = addAllocationTradeId(Identifier.IdentifierBuilderImpl().apply(f).build())
fun AllocationBreakdown.AllocationBreakdownBuilder.allocationTradeId(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateAllocationTradeId(index).apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.ancillaryParty(f: PartyRole.PartyRoleBuilder.() -> Unit) = orCreateAncillaryParty.apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.collateral(f: Collateral.CollateralBuilder.() -> Unit) = orCreateCollateral.apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.counterparty(f: Counterparty.CounterpartyBuilder.() -> Unit) = orCreateCounterparty.apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = addQuantity(Quantity.QuantityBuilderImpl().apply(f).build())
fun AllocationBreakdown.AllocationBreakdownBuilder.quantity(index: Int, f: Quantity.QuantityBuilder.() -> Unit) = getOrCreateQuantity(index).apply(f)

fun AllocationInstruction.AllocationInstructionBuilder.breakdowns(f: AllocationBreakdown.AllocationBreakdownBuilder.() -> Unit) = addBreakdowns(AllocationBreakdown.AllocationBreakdownBuilderImpl().apply(f).build())
fun AllocationInstruction.AllocationInstructionBuilder.breakdowns(index: Int, f: AllocationBreakdown.AllocationBreakdownBuilder.() -> Unit) = getOrCreateBreakdowns(index).apply(f)


fun AmericanExercise.AmericanExerciseBuilder.commencementDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateCommencementDate.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.earliestExerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateEarliestExerciseTime.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.exerciseFeeSchedule(f: ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.() -> Unit) = orCreateExerciseFeeSchedule.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.expirationDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateExpirationDate.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.expirationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateExpirationTime.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.latestExerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateLatestExerciseTime.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.multipleExercise(f: MultipleExercise.MultipleExerciseBuilder.() -> Unit) = orCreateMultipleExercise.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.relevantUnderlyingDate(f: AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateRelevantUnderlyingDate.apply(f)

fun AmountSchedule.AmountScheduleBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addCurrency(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun AmountSchedule.AmountScheduleBuilder.currency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateCurrency(index).apply(f)

fun AncillaryEntity.AncillaryEntityBuilder.legalEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateLegalEntity.apply(f)

fun AncillaryParty.AncillaryPartyBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addPartyReference(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilderImpl().apply(f).build())
fun AncillaryParty.AncillaryPartyBuilder.partyReference(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreatePartyReference(index).apply(f)

fun ApplicableRegime.ApplicableRegimeBuilder.regimeTerms(f: RegimeTerms.RegimeTermsBuilder.() -> Unit) = addRegimeTerms(RegimeTerms.RegimeTermsBuilderImpl().apply(f).build())
fun ApplicableRegime.ApplicableRegimeBuilder.regimeTerms(index: Int, f: RegimeTerms.RegimeTermsBuilder.() -> Unit) = getOrCreateRegimeTerms(index).apply(f)


fun Asian.AsianBuilder.averagingPeriodIn(f: AveragingPeriod.AveragingPeriodBuilder.() -> Unit) = orCreateAveragingPeriodIn.apply(f)
fun Asian.AsianBuilder.averagingPeriodOut(f: AveragingPeriod.AveragingPeriodBuilder.() -> Unit) = orCreateAveragingPeriodOut.apply(f)

fun AssetCriteria.AssetCriteriaBuilder.agencyRating(f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = addAgencyRating(AgencyRatingCriteria.AgencyRatingCriteriaBuilderImpl().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.agencyRating(index: Int, f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = getOrCreateAgencyRating(index).apply(f)
fun AssetCriteria.AssetCriteriaBuilder.assetCountryOfOrigin(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addAssetCountryOfOrigin(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.assetCountryOfOrigin(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateAssetCountryOfOrigin(index).apply(f)
fun AssetCriteria.AssetCriteriaBuilder.collateralAssetType(f: AssetType.AssetTypeBuilder.() -> Unit) = addCollateralAssetType(AssetType.AssetTypeBuilderImpl().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.collateralAssetType(index: Int, f: AssetType.AssetTypeBuilder.() -> Unit) = getOrCreateCollateralAssetType(index).apply(f)
fun AssetCriteria.AssetCriteriaBuilder.collateralTaxonomy(f: CollateralTaxonomy.CollateralTaxonomyBuilder.() -> Unit) = addCollateralTaxonomy(CollateralTaxonomy.CollateralTaxonomyBuilderImpl().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.collateralTaxonomy(index: Int, f: CollateralTaxonomy.CollateralTaxonomyBuilder.() -> Unit) = getOrCreateCollateralTaxonomy(index).apply(f)
fun AssetCriteria.AssetCriteriaBuilder.denominatedCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addDenominatedCurrency(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.denominatedCurrency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateDenominatedCurrency(index).apply(f)
fun AssetCriteria.AssetCriteriaBuilder.listing(f: ListingType.ListingTypeBuilder.() -> Unit) = orCreateListing.apply(f)
fun AssetCriteria.AssetCriteriaBuilder.maturityRange(f: PeriodRange.PeriodRangeBuilder.() -> Unit) = orCreateMaturityRange.apply(f)
fun AssetCriteria.AssetCriteriaBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ProductIdentifier.ProductIdentifierBuilderImpl().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.productIdentifier(index: Int, f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply(f)


fun AssetType.AssetTypeBuilder.debtType(f: DebtType.DebtTypeBuilder.() -> Unit) = orCreateDebtType.apply(f)

fun AssignedIdentifier.AssignedIdentifierBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)

fun AutomaticEarlyTermination.AutomaticEarlyTerminationBuilder.partyElection(f: AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder.() -> Unit) = addPartyElection(AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilderImpl().apply(f).build())
fun AutomaticEarlyTermination.AutomaticEarlyTerminationBuilder.partyElection(index: Int, f: AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder.party(f: Party.PartyBuilder.() -> Unit) = orCreateParty.apply(f)


fun AveragingObservation.AveragingObservationBuilder.fxRateObservable(f: FxRateObservable.FxRateObservableBuilder.() -> Unit) = orCreateFxRateObservable.apply(f)
fun AveragingObservation.AveragingObservationBuilder.observationDates(f: ObservationDates.ObservationDatesBuilder.() -> Unit) = orCreateObservationDates.apply(f)
fun AveragingObservation.AveragingObservationBuilder.observationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateObservationTime.apply(f)
fun AveragingObservation.AveragingObservationBuilder.precision(f: Rounding.RoundingBuilder.() -> Unit) = orCreatePrecision.apply(f)

fun AveragingObservationList.AveragingObservationListBuilder.averagingObservation(f: WeightedAveragingObservation.WeightedAveragingObservationBuilder.() -> Unit) = addAveragingObservation(WeightedAveragingObservation.WeightedAveragingObservationBuilderImpl().apply(f).build())
fun AveragingObservationList.AveragingObservationListBuilder.averagingObservation(index: Int, f: WeightedAveragingObservation.WeightedAveragingObservationBuilder.() -> Unit) = getOrCreateAveragingObservation(index).apply(f)

fun AveragingPeriod.AveragingPeriodBuilder.averagingDateTimes(f: DateTimeList.DateTimeListBuilder.() -> Unit) = orCreateAveragingDateTimes.apply(f)
fun AveragingPeriod.AveragingPeriodBuilder.averagingObservations(f: AveragingObservationList.AveragingObservationListBuilder.() -> Unit) = orCreateAveragingObservations.apply(f)
fun AveragingPeriod.AveragingPeriodBuilder.marketDisruption(f: FieldWithMetaMarketDisruptionEnum.FieldWithMetaMarketDisruptionEnumBuilder.() -> Unit) = orCreateMarketDisruption.apply(f)
fun AveragingPeriod.AveragingPeriodBuilder.schedule(f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = addSchedule(AveragingSchedule.AveragingScheduleBuilderImpl().apply(f).build())
fun AveragingPeriod.AveragingPeriodBuilder.schedule(index: Int, f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = getOrCreateSchedule(index).apply(f)

fun AveragingSchedule.AveragingScheduleBuilder.averagingPeriodFrequency(f: CalculationPeriodFrequency.CalculationPeriodFrequencyBuilder.() -> Unit) = orCreateAveragingPeriodFrequency.apply(f)

fun Barrier.BarrierBuilder.barrierCap(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateBarrierCap.apply(f)
fun Barrier.BarrierBuilder.barrierFloor(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateBarrierFloor.apply(f)

fun BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.baseCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateBaseCurrency.apply(f)
fun BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.eligibleCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addEligibleCurrency(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.eligibleCurrency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateEligibleCurrency(index).apply(f)

fun BasketReferenceInformation.BasketReferenceInformationBuilder.basketId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addBasketId(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun BasketReferenceInformation.BasketReferenceInformationBuilder.basketId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateBasketId(index).apply(f)
fun BasketReferenceInformation.BasketReferenceInformationBuilder.basketName(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateBasketName.apply(f)
fun BasketReferenceInformation.BasketReferenceInformationBuilder.referencePool(f: ReferencePool.ReferencePoolBuilder.() -> Unit) = orCreateReferencePool.apply(f)
fun BasketReferenceInformation.BasketReferenceInformationBuilder.tranche(f: Tranche.TrancheBuilder.() -> Unit) = orCreateTranche.apply(f)

fun BermudaExercise.BermudaExerciseBuilder.bermudaExerciseDates(f: AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateBermudaExerciseDates.apply(f)
fun BermudaExercise.BermudaExerciseBuilder.earliestExerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateEarliestExerciseTime.apply(f)
fun BermudaExercise.BermudaExerciseBuilder.exerciseFeeSchedule(f: ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.() -> Unit) = orCreateExerciseFeeSchedule.apply(f)
fun BermudaExercise.BermudaExerciseBuilder.expirationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateExpirationTime.apply(f)
fun BermudaExercise.BermudaExerciseBuilder.latestExerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateLatestExerciseTime.apply(f)
fun BermudaExercise.BermudaExerciseBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun BermudaExercise.BermudaExerciseBuilder.multipleExercise(f: MultipleExercise.MultipleExerciseBuilder.() -> Unit) = orCreateMultipleExercise.apply(f)
fun BermudaExercise.BermudaExerciseBuilder.relevantUnderlyingDate(f: AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateRelevantUnderlyingDate.apply(f)




fun BillingInstruction.BillingInstructionBuilder.billingRecordInstruction(f: BillingRecordInstruction.BillingRecordInstructionBuilder.() -> Unit) = addBillingRecordInstruction(BillingRecordInstruction.BillingRecordInstructionBuilderImpl().apply(f).build())
fun BillingInstruction.BillingInstructionBuilder.billingRecordInstruction(index: Int, f: BillingRecordInstruction.BillingRecordInstructionBuilder.() -> Unit) = getOrCreateBillingRecordInstruction(index).apply(f)
fun BillingInstruction.BillingInstructionBuilder.billingSummary(f: BillingSummaryInstruction.BillingSummaryInstructionBuilder.() -> Unit) = addBillingSummary(BillingSummaryInstruction.BillingSummaryInstructionBuilderImpl().apply(f).build())
fun BillingInstruction.BillingInstructionBuilder.billingSummary(index: Int, f: BillingSummaryInstruction.BillingSummaryInstructionBuilder.() -> Unit) = getOrCreateBillingSummary(index).apply(f)
fun BillingInstruction.BillingInstructionBuilder.receivingParty(f: Party.PartyBuilder.() -> Unit) = orCreateReceivingParty.apply(f)
fun BillingInstruction.BillingInstructionBuilder.sendingParty(f: Party.PartyBuilder.() -> Unit) = orCreateSendingParty.apply(f)

fun BillingRecord.BillingRecordBuilder.minimumFee(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumFee.apply(f)
fun BillingRecord.BillingRecordBuilder.recordTransfer(f: Transfer.TransferBuilder.() -> Unit) = orCreateRecordTransfer.apply(f)
fun BillingRecord.BillingRecordBuilder.tradeState(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateTradeState.apply(f)

fun BillingRecordInstruction.BillingRecordInstructionBuilder.observation(f: Observation.ObservationBuilder.() -> Unit) = addObservation(Observation.ObservationBuilderImpl().apply(f).build())
fun BillingRecordInstruction.BillingRecordInstructionBuilder.observation(index: Int, f: Observation.ObservationBuilder.() -> Unit) = getOrCreateObservation(index).apply(f)
fun BillingRecordInstruction.BillingRecordInstructionBuilder.tradeState(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateTradeState.apply(f)

fun BillingSummary.BillingSummaryBuilder.summaryTransfer(f: Transfer.TransferBuilder.() -> Unit) = orCreateSummaryTransfer.apply(f)



fun BondChoiceModel.BondChoiceModelBuilder.bond(f: Bond.BondBuilder.() -> Unit) = orCreateBond.apply(f)
fun BondChoiceModel.BondChoiceModelBuilder.convertibleBond(f: ConvertibleBond.ConvertibleBondBuilder.() -> Unit) = orCreateConvertibleBond.apply(f)

fun BondEquityModel.BondEquityModelBuilder.bondchoiceModel(f: BondChoiceModel.BondChoiceModelBuilder.() -> Unit) = orCreateBondchoiceModel.apply(f)
fun BondEquityModel.BondEquityModelBuilder.equity(f: Equity.EquityBuilder.() -> Unit) = orCreateEquity.apply(f)

fun BondPriceAndYieldModel.BondPriceAndYieldModelBuilder.cleanOrDirtyPrice(f: CleanOrDirtyPrice.CleanOrDirtyPriceBuilder.() -> Unit) = orCreateCleanOrDirtyPrice.apply(f)
fun BondPriceAndYieldModel.BondPriceAndYieldModelBuilder.relativePrice(f: RelativePrice.RelativePriceBuilder.() -> Unit) = orCreateRelativePrice.apply(f)

fun BondReference.BondReferenceBuilder.bond(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = orCreateBond.apply(f)

fun BondValuationModel.BondValuationModelBuilder.accrualsAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateAccrualsAmount.apply(f)
fun BondValuationModel.BondValuationModelBuilder.bondPriceAndYieldModel(f: BondPriceAndYieldModel.BondPriceAndYieldModelBuilder.() -> Unit) = orCreateBondPriceAndYieldModel.apply(f)
fun BondValuationModel.BondValuationModelBuilder.nominalAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateNominalAmount.apply(f)

fun BrokerConfirmation.BrokerConfirmationBuilder.brokerConfirmationType(f: FieldWithMetaBrokerConfirmationTypeEnum.FieldWithMetaBrokerConfirmationTypeEnumBuilder.() -> Unit) = orCreateBrokerConfirmationType.apply(f)

fun BusinessCenterTime.BusinessCenterTimeBuilder.businessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = orCreateBusinessCenter.apply(f)

fun BusinessCenters.BusinessCentersBuilder.businessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = addBusinessCenter(FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilderImpl().apply(f).build())
fun BusinessCenters.BusinessCentersBuilder.businessCenter(index: Int, f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = getOrCreateBusinessCenter(index).apply(f)
fun BusinessCenters.BusinessCentersBuilder.businessCentersReference(f: ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.() -> Unit) = orCreateBusinessCentersReference.apply(f)
fun BusinessCenters.BusinessCentersBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun BusinessDateRange.BusinessDateRangeBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)

fun BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)
fun BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun BusinessEvent.BusinessEventBuilder.eventEffect(f: EventEffect.EventEffectBuilder.() -> Unit) = orCreateEventEffect.apply(f)
fun BusinessEvent.BusinessEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun BusinessEvent.BusinessEventBuilder.primitives(f: PrimitiveEvent.PrimitiveEventBuilder.() -> Unit) = addPrimitives(PrimitiveEvent.PrimitiveEventBuilderImpl().apply(f).build())
fun BusinessEvent.BusinessEventBuilder.primitives(index: Int, f: PrimitiveEvent.PrimitiveEventBuilder.() -> Unit) = getOrCreatePrimitives(index).apply(f)
fun BusinessEvent.BusinessEventBuilder.tradeWarehouseWorkflow(f: TradeWarehouseWorkflow.TradeWarehouseWorkflowBuilder.() -> Unit) = orCreateTradeWarehouseWorkflow.apply(f)
fun BusinessEvent.BusinessEventBuilder.workflowEventState(f: WorkflowStepState.WorkflowStepStateBuilder.() -> Unit) = orCreateWorkflowEventState.apply(f)

fun BusinessUnit.BusinessUnitBuilder.contactInformation(f: ContactInformation.ContactInformationBuilder.() -> Unit) = orCreateContactInformation.apply(f)
fun BusinessUnit.BusinessUnitBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun BusinessUnit.BusinessUnitBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun Buyr.BuyrBuilder.acctOwnr(f: AcctOwnr.AcctOwnrBuilder.() -> Unit) = orCreateAcctOwnr.apply(f)

fun CalculationAgent.CalculationAgentBuilder.calculationAgentBusinessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = orCreateCalculationAgentBusinessCenter.apply(f)

fun CalculationAgentModel.CalculationAgentModelBuilder.calculationAgent(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgent.apply(f)


fun CalculationAndTiming.CalculationAndTimingBuilder.bespokeCalculationDate(f: BespokeCalculationDate.BespokeCalculationDateBuilder.() -> Unit) = orCreateBespokeCalculationDate.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.bespokeCalculationTime(f: BespokeCalculationTime.BespokeCalculationTimeBuilder.() -> Unit) = orCreateBespokeCalculationTime.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.calculationAgentTerms(f: CalculationAgentTerms.CalculationAgentTermsBuilder.() -> Unit) = orCreateCalculationAgentTerms.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.calculationDateLocation(f: CalculationDateLocation.CalculationDateLocationBuilder.() -> Unit) = orCreateCalculationDateLocation.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.collateralValuationAgent(f: CollateralValuationAgent.CollateralValuationAgentBuilder.() -> Unit) = orCreateCollateralValuationAgent.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.notificationTime(f: NotificationTime.NotificationTimeBuilder.() -> Unit) = orCreateNotificationTime.apply(f)

fun CalculationCurrencyElection.CalculationCurrencyElectionBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun CalculationDateLocation.CalculationDateLocationBuilder.partyElection(f: CalculationDateLocationElection.CalculationDateLocationElectionBuilder.() -> Unit) = addPartyElection(CalculationDateLocationElection.CalculationDateLocationElectionBuilderImpl().apply(f).build())
fun CalculationDateLocation.CalculationDateLocationBuilder.partyElection(index: Int, f: CalculationDateLocationElection.CalculationDateLocationElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun CalculationDateLocationElection.CalculationDateLocationElectionBuilder.businessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = orCreateBusinessCenter.apply(f)

fun CalculationPeriod.CalculationPeriodBuilder.floatingRateDefinition(f: FloatingRateDefinition.FloatingRateDefinitionBuilder.() -> Unit) = orCreateFloatingRateDefinition.apply(f)
fun CalculationPeriod.CalculationPeriodBuilder.forecastAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateForecastAmount.apply(f)
fun CalculationPeriod.CalculationPeriodBuilder.fxLinkedNotionalAmount(f: FxLinkedNotionalAmount.FxLinkedNotionalAmountBuilder.() -> Unit) = orCreateFxLinkedNotionalAmount.apply(f)

fun CalculationPeriodBase.CalculationPeriodBaseBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun CalculationPeriodDates.CalculationPeriodDatesBuilder.calculationPeriodDatesAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateCalculationPeriodDatesAdjustments.apply(f)
fun CalculationPeriodDates.CalculationPeriodDatesBuilder.calculationPeriodFrequency(f: CalculationPeriodFrequency.CalculationPeriodFrequencyBuilder.() -> Unit) = orCreateCalculationPeriodFrequency.apply(f)
fun CalculationPeriodDates.CalculationPeriodDatesBuilder.effectiveDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateEffectiveDate.apply(f)
fun CalculationPeriodDates.CalculationPeriodDatesBuilder.firstPeriodStartDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateFirstPeriodStartDate.apply(f)
fun CalculationPeriodDates.CalculationPeriodDatesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun CalculationPeriodDates.CalculationPeriodDatesBuilder.terminationDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateTerminationDate.apply(f)


fun CalendarSpread.CalendarSpreadBuilder.expirationDateTwo(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateExpirationDateTwo.apply(f)

fun CancelableProvision.CancelableProvisionBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun CancelableProvision.CancelableProvisionBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun CancelableProvision.CancelableProvisionBuilder.cancelableProvisionAdjustedDates(f: CancelableProvisionAdjustedDates.CancelableProvisionAdjustedDatesBuilder.() -> Unit) = orCreateCancelableProvisionAdjustedDates.apply(f)
fun CancelableProvision.CancelableProvisionBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)
fun CancelableProvision.CancelableProvisionBuilder.exerciseNotice(f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = orCreateExerciseNotice.apply(f)
fun CancelableProvision.CancelableProvisionBuilder.finalCalculationPeriodDateAdjustment(f: FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.() -> Unit) = addFinalCalculationPeriodDateAdjustment(FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilderImpl().apply(f).build())
fun CancelableProvision.CancelableProvisionBuilder.finalCalculationPeriodDateAdjustment(index: Int, f: FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.() -> Unit) = getOrCreateFinalCalculationPeriodDateAdjustment(index).apply(f)
fun CancelableProvision.CancelableProvisionBuilder.initialFee(f: SimplePayment.SimplePaymentBuilder.() -> Unit) = orCreateInitialFee.apply(f)

fun CancelableProvisionAdjustedDates.CancelableProvisionAdjustedDatesBuilder.cancellationEvent(f: CancellationEvent.CancellationEventBuilder.() -> Unit) = addCancellationEvent(CancellationEvent.CancellationEventBuilderImpl().apply(f).build())
fun CancelableProvisionAdjustedDates.CancelableProvisionAdjustedDatesBuilder.cancellationEvent(index: Int, f: CancellationEvent.CancellationEventBuilder.() -> Unit) = getOrCreateCancellationEvent(index).apply(f)

fun CancellationEvent.CancellationEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun CashCollateralValuationMethod.CashCollateralValuationMethodBuilder.agreedDiscountRate(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateAgreedDiscountRate.apply(f)
fun CashCollateralValuationMethod.CashCollateralValuationMethodBuilder.cashCollateralInterestRate(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCashCollateralInterestRate.apply(f)

fun CashSettlementTerms.CashSettlementTermsBuilder.cashSettlementAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateCashSettlementAmount.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.valuationDate(f: ValuationDate.ValuationDateBuilder.() -> Unit) = orCreateValuationDate.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.valuationMethod(f: ValuationMethod.ValuationMethodBuilder.() -> Unit) = orCreateValuationMethod.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.valuationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateValuationTime.apply(f)

fun CashTransferBreakdown.CashTransferBreakdownBuilder.amount(f: Money.MoneyBuilder.() -> Unit) = orCreateAmount.apply(f)
fun CashTransferBreakdown.CashTransferBreakdownBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)

fun CashTransferComponent.CashTransferComponentBuilder.amount(f: Money.MoneyBuilder.() -> Unit) = orCreateAmount.apply(f)
fun CashTransferComponent.CashTransferComponentBuilder.breakdown(f: CashTransferBreakdown.CashTransferBreakdownBuilder.() -> Unit) = addBreakdown(CashTransferBreakdown.CashTransferBreakdownBuilderImpl().apply(f).build())
fun CashTransferComponent.CashTransferComponentBuilder.breakdown(index: Int, f: CashTransferBreakdown.CashTransferBreakdownBuilder.() -> Unit) = getOrCreateBreakdown(index).apply(f)
fun CashTransferComponent.CashTransferComponentBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)

fun Cashflow.CashflowBuilder.cashflowAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateCashflowAmount.apply(f)
fun Cashflow.CashflowBuilder.cashflowDate(f: AdjustableOrAdjustedOrRelativeDate.AdjustableOrAdjustedOrRelativeDateBuilder.() -> Unit) = orCreateCashflowDate.apply(f)
fun Cashflow.CashflowBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Cashflow.CashflowBuilder.paymentDiscounting(f: PaymentDiscounting.PaymentDiscountingBuilder.() -> Unit) = orCreatePaymentDiscounting.apply(f)
fun Cashflow.CashflowBuilder.premiumExpression(f: PremiumExpression.PremiumExpressionBuilder.() -> Unit) = orCreatePremiumExpression.apply(f)
fun Cashflow.CashflowBuilder.presentValueAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePresentValueAmount.apply(f)

fun CashflowRepresentation.CashflowRepresentationBuilder.paymentCalculationPeriod(f: PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.() -> Unit) = addPaymentCalculationPeriod(PaymentCalculationPeriod.PaymentCalculationPeriodBuilderImpl().apply(f).build())
fun CashflowRepresentation.CashflowRepresentationBuilder.paymentCalculationPeriod(index: Int, f: PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.() -> Unit) = getOrCreatePaymentCalculationPeriod(index).apply(f)
fun CashflowRepresentation.CashflowRepresentationBuilder.principalExchange(f: PrincipalExchange.PrincipalExchangeBuilder.() -> Unit) = addPrincipalExchange(PrincipalExchange.PrincipalExchangeBuilderImpl().apply(f).build())
fun CashflowRepresentation.CashflowRepresentationBuilder.principalExchange(index: Int, f: PrincipalExchange.PrincipalExchangeBuilder.() -> Unit) = getOrCreatePrincipalExchange(index).apply(f)

fun CleanOrDirtyPrice.CleanOrDirtyPriceBuilder.cleanPrice(f: CleanPrice.CleanPriceBuilder.() -> Unit) = orCreateCleanPrice.apply(f)


fun ClearingInstruction.ClearingInstructionBuilder.alphaContract(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateAlphaContract.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.clearerParty1(f: Party.PartyBuilder.() -> Unit) = orCreateClearerParty1.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.clearerParty2(f: Party.PartyBuilder.() -> Unit) = orCreateClearerParty2.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.clearingParty(f: Party.PartyBuilder.() -> Unit) = orCreateClearingParty.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.party1(f: Party.PartyBuilder.() -> Unit) = orCreateParty1.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.party2(f: Party.PartyBuilder.() -> Unit) = orCreateParty2.apply(f)


fun Collateral.CollateralBuilder.independentAmount(f: IndependentAmount.IndependentAmountBuilder.() -> Unit) = orCreateIndependentAmount.apply(f)


fun CollateralIssuerType.CollateralIssuerTypeBuilder.quasiGovernmentType(f: QuasiGovernmentIssuerType.QuasiGovernmentIssuerTypeBuilder.() -> Unit) = orCreateQuasiGovernmentType.apply(f)
fun CollateralIssuerType.CollateralIssuerTypeBuilder.regionalGovernmentType(f: RegionalGovernmentIssuerType.RegionalGovernmentIssuerTypeBuilder.() -> Unit) = orCreateRegionalGovernmentType.apply(f)
fun CollateralIssuerType.CollateralIssuerTypeBuilder.specialPurposeVehicleType(f: SpecialPurposeVehicleIssuerType.SpecialPurposeVehicleIssuerTypeBuilder.() -> Unit) = orCreateSpecialPurposeVehicleType.apply(f)

fun CollateralManagementAgreement.CollateralManagementAgreementBuilder.partyElection(f: CollateralManagementAgreementElection.CollateralManagementAgreementElectionBuilder.() -> Unit) = addPartyElection(CollateralManagementAgreementElection.CollateralManagementAgreementElectionBuilderImpl().apply(f).build())
fun CollateralManagementAgreement.CollateralManagementAgreementBuilder.partyElection(index: Int, f: CollateralManagementAgreementElection.CollateralManagementAgreementElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)


fun CollateralProvisions.CollateralProvisionsBuilder.eligibleCollateral(f: EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.() -> Unit) = addEligibleCollateral(EligibleCollateralSchedule.EligibleCollateralScheduleBuilderImpl().apply(f).build())
fun CollateralProvisions.CollateralProvisionsBuilder.eligibleCollateral(index: Int, f: EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.() -> Unit) = getOrCreateEligibleCollateral(index).apply(f)
fun CollateralProvisions.CollateralProvisionsBuilder.marginPercentage(f: CollateralValuationTreatment.CollateralValuationTreatmentBuilder.() -> Unit) = orCreateMarginPercentage.apply(f)


fun CollateralTaxonomy.CollateralTaxonomyBuilder.taxonomyValue(f: CollateralTaxonomyValue.CollateralTaxonomyValueBuilder.() -> Unit) = orCreateTaxonomyValue.apply(f)

fun CollateralTaxonomyValue.CollateralTaxonomyValueBuilder.nonEnumeratedTaxonomyValue(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addNonEnumeratedTaxonomyValue(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun CollateralTaxonomyValue.CollateralTaxonomyValueBuilder.nonEnumeratedTaxonomyValue(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateNonEnumeratedTaxonomyValue(index).apply(f)

fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.additionalRepresentations(f: AdditionalRepresentations.AdditionalRepresentationsBuilder.() -> Unit) = orCreateAdditionalRepresentations.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.addressesForTransfer(f: ContactElection.ContactElectionBuilder.() -> Unit) = orCreateAddressesForTransfer.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.baseAndEligibleCurrency(f: BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.() -> Unit) = orCreateBaseAndEligibleCurrency.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.calculationAndTiming(f: CalculationAndTiming.CalculationAndTimingBuilder.() -> Unit) = orCreateCalculationAndTiming.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.conditionsPrecedent(f: ConditionsPrecedent.ConditionsPrecedentBuilder.() -> Unit) = orCreateConditionsPrecedent.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.creditSupportObligations(f: CreditSupportObligations.CreditSupportObligationsBuilder.() -> Unit) = orCreateCreditSupportObligations.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.custodyArrangements(f: CustodyArrangements.CustodyArrangementsBuilder.() -> Unit) = orCreateCustodyArrangements.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.demandsAndNotices(f: ContactElection.ContactElectionBuilder.() -> Unit) = orCreateDemandsAndNotices.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.disputeResolution(f: DisputeResolution.DisputeResolutionBuilder.() -> Unit) = orCreateDisputeResolution.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.fxHaircutCurrency(f: FxHaircutCurrency.FxHaircutCurrencyBuilder.() -> Unit) = orCreateFxHaircutCurrency.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.generalSimmElections(f: GeneralSimmElections.GeneralSimmElectionsBuilder.() -> Unit) = orCreateGeneralSimmElections.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.jurisdictionRelatedTerms(f: JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.() -> Unit) = orCreateJurisdictionRelatedTerms.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.minimumTransferAmountAmendment(f: MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.() -> Unit) = orCreateMinimumTransferAmountAmendment.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.oneWayProvisions(f: OneWayProvisions.OneWayProvisionsBuilder.() -> Unit) = orCreateOneWayProvisions.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.postingObligations(f: PostingObligations.PostingObligationsBuilder.() -> Unit) = orCreatePostingObligations.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.processAgent(f: ProcessAgent.ProcessAgentBuilder.() -> Unit) = orCreateProcessAgent.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.regime(f: Regime.RegimeBuilder.() -> Unit) = orCreateRegime.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.rightsEvents(f: RightsEvents.RightsEventsBuilder.() -> Unit) = orCreateRightsEvents.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.sensitivityMethodologies(f: SensitivityMethodologies.SensitivityMethodologiesBuilder.() -> Unit) = orCreateSensitivityMethodologies.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.substitutedRegime(f: SubstitutedRegime.SubstitutedRegimeBuilder.() -> Unit) = addSubstitutedRegime(SubstitutedRegime.SubstitutedRegimeBuilderImpl().apply(f).build())
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.substitutedRegime(index: Int, f: SubstitutedRegime.SubstitutedRegimeBuilder.() -> Unit) = getOrCreateSubstitutedRegime(index).apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.substitution(f: Substitution.SubstitutionBuilder.() -> Unit) = orCreateSubstitution.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.terminationCurrencyAmendment(f: TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.() -> Unit) = orCreateTerminationCurrencyAmendment.apply(f)

fun CollateralTreatment.CollateralTreatmentBuilder.concentrationLimit(f: ConcentrationLimit.ConcentrationLimitBuilder.() -> Unit) = addConcentrationLimit(ConcentrationLimit.ConcentrationLimitBuilderImpl().apply(f).build())
fun CollateralTreatment.CollateralTreatmentBuilder.concentrationLimit(index: Int, f: ConcentrationLimit.ConcentrationLimitBuilder.() -> Unit) = getOrCreateConcentrationLimit(index).apply(f)
fun CollateralTreatment.CollateralTreatmentBuilder.valuationTreatment(f: CollateralValuationTreatment.CollateralValuationTreatmentBuilder.() -> Unit) = orCreateValuationTreatment.apply(f)

fun CollateralValuationAgent.CollateralValuationAgentBuilder.partyElection(f: CollateralValuationAgentElection.CollateralValuationAgentElectionBuilder.() -> Unit) = addPartyElection(CollateralValuationAgentElection.CollateralValuationAgentElectionBuilderImpl().apply(f).build())
fun CollateralValuationAgent.CollateralValuationAgentBuilder.partyElection(index: Int, f: CollateralValuationAgentElection.CollateralValuationAgentElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)



fun Commodity.CommodityBuilder.commodityProductDefinition(f: CommodityProductDefinition.CommodityProductDefinitionBuilder.() -> Unit) = orCreateCommodityProductDefinition.apply(f)
fun Commodity.CommodityBuilder.deliveryDateReference(f: DeliveryDateParameters.DeliveryDateParametersBuilder.() -> Unit) = orCreateDeliveryDateReference.apply(f)

fun CommodityPayout.CommodityPayoutBuilder.commodityPriceReturnTerms(f: CommodityPriceReturnTerms.CommodityPriceReturnTermsBuilder.() -> Unit) = orCreateCommodityPriceReturnTerms.apply(f)
fun CommodityPayout.CommodityPayoutBuilder.pricingDates(f: PricingDates.PricingDatesBuilder.() -> Unit) = orCreatePricingDates.apply(f)

fun CommodityPriceReturnTerms.CommodityPriceReturnTermsBuilder.rollFeature(f: RollFeature.RollFeatureBuilder.() -> Unit) = orCreateRollFeature.apply(f)
fun CommodityPriceReturnTerms.CommodityPriceReturnTermsBuilder.rounding(f: Rounding.RoundingBuilder.() -> Unit) = orCreateRounding.apply(f)
fun CommodityPriceReturnTerms.CommodityPriceReturnTermsBuilder.spread(f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = orCreateSpread.apply(f)

fun CommodityProductDefinition.CommodityProductDefinitionBuilder.exchangeId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateExchangeId.apply(f)
fun CommodityProductDefinition.CommodityProductDefinitionBuilder.priceSource(f: PriceSource.PriceSourceBuilder.() -> Unit) = orCreatePriceSource.apply(f)
fun CommodityProductDefinition.CommodityProductDefinitionBuilder.referenceFramework(f: CommodityReferenceFramework.CommodityReferenceFrameworkBuilder.() -> Unit) = orCreateReferenceFramework.apply(f)

fun CommodityReferenceFramework.CommodityReferenceFrameworkBuilder.commodityBase(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCommodityBase.apply(f)
fun CommodityReferenceFramework.CommodityReferenceFrameworkBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun CommodityReferenceFramework.CommodityReferenceFrameworkBuilder.subCommodity(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSubCommodity.apply(f)

fun CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.commodity(f: Commodity.CommodityBuilder.() -> Unit) = orCreateCommodity.apply(f)
fun CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.transferorTransferee(f: TransferorTransferee.TransferorTransfereeBuilder.() -> Unit) = orCreateTransferorTransferee.apply(f)

fun CommodityTransferComponent.CommodityTransferComponentBuilder.breakdown(f: CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.() -> Unit) = addBreakdown(CommodityTransferBreakdown.CommodityTransferBreakdownBuilderImpl().apply(f).build())
fun CommodityTransferComponent.CommodityTransferComponentBuilder.breakdown(index: Int, f: CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.() -> Unit) = getOrCreateBreakdown(index).apply(f)
fun CommodityTransferComponent.CommodityTransferComponentBuilder.commodity(f: Commodity.CommodityBuilder.() -> Unit) = orCreateCommodity.apply(f)
fun CommodityTransferComponent.CommodityTransferComponentBuilder.transferorTransferee(f: TransferorTransferee.TransferorTransfereeBuilder.() -> Unit) = orCreateTransferorTransferee.apply(f)

fun Composite.CompositeBuilder.fixingTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateFixingTime.apply(f)
fun Composite.CompositeBuilder.fxSpotRateSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateFxSpotRateSource.apply(f)
fun Composite.CompositeBuilder.relativeDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateRelativeDate.apply(f)

fun ComputedAmount.ComputedAmountBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun ConcentrationLimit.ConcentrationLimitBuilder.concentrationLimitCriteria(f: ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.() -> Unit) = addConcentrationLimitCriteria(ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilderImpl().apply(f).build())
fun ConcentrationLimit.ConcentrationLimitBuilder.concentrationLimitCriteria(index: Int, f: ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.() -> Unit) = getOrCreateConcentrationLimitCriteria(index).apply(f)
fun ConcentrationLimit.ConcentrationLimitBuilder.valueCap(f: Money.MoneyBuilder.() -> Unit) = orCreateValueCap.apply(f)

fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.asset(f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = addAsset(AssetCriteria.AssetCriteriaBuilderImpl().apply(f).build())
fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.asset(index: Int, f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = getOrCreateAsset(index).apply(f)
fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.issuer(f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = addIssuer(IssuerCriteria.IssuerCriteriaBuilderImpl().apply(f).build())
fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.issuer(index: Int, f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = getOrCreateIssuer(index).apply(f)

fun ConditionsPrecedent.ConditionsPrecedentBuilder.accessConditions(f: AccessConditions.AccessConditionsBuilder.() -> Unit) = orCreateAccessConditions.apply(f)

fun Confirmation.ConfirmationBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = addIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun Confirmation.ConfirmationBuilder.identifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply(f)
fun Confirmation.ConfirmationBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun Confirmation.ConfirmationBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilderImpl().apply(f).build())
fun Confirmation.ConfirmationBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply(f)
fun Confirmation.ConfirmationBuilder.partyRole(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRole(PartyRole.PartyRoleBuilderImpl().apply(f).build())
fun Confirmation.ConfirmationBuilder.partyRole(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRole(index).apply(f)


fun ContactElection.ContactElectionBuilder.partyElection(f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = addPartyElection(PartyContactInformation.PartyContactInformationBuilderImpl().apply(f).build())
fun ContactElection.ContactElectionBuilder.partyElection(index: Int, f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun ContactInformation.ContactInformationBuilder.address(f: Address.AddressBuilder.() -> Unit) = addAddress(Address.AddressBuilderImpl().apply(f).build())
fun ContactInformation.ContactInformationBuilder.address(index: Int, f: Address.AddressBuilder.() -> Unit) = getOrCreateAddress(index).apply(f)
fun ContactInformation.ContactInformationBuilder.telephone(f: TelephoneNumber.TelephoneNumberBuilder.() -> Unit) = addTelephone(TelephoneNumber.TelephoneNumberBuilderImpl().apply(f).build())
fun ContactInformation.ContactInformationBuilder.telephone(index: Int, f: TelephoneNumber.TelephoneNumberBuilder.() -> Unit) = getOrCreateTelephone(index).apply(f)

fun ContractDetails.ContractDetailsBuilder.documentation(f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = addDocumentation(RelatedAgreement.RelatedAgreementBuilderImpl().apply(f).build())
fun ContractDetails.ContractDetailsBuilder.documentation(index: Int, f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = getOrCreateDocumentation(index).apply(f)
fun ContractDetails.ContractDetailsBuilder.governingLaw(f: FieldWithMetaGoverningLawEnum.FieldWithMetaGoverningLawEnumBuilder.() -> Unit) = orCreateGoverningLaw.apply(f)
fun ContractDetails.ContractDetailsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ContractDetails.ContractDetailsBuilder.partyContractInformation(f: PartyContractInformation.PartyContractInformationBuilder.() -> Unit) = addPartyContractInformation(PartyContractInformation.PartyContractInformationBuilderImpl().apply(f).build())
fun ContractDetails.ContractDetailsBuilder.partyContractInformation(index: Int, f: PartyContractInformation.PartyContractInformationBuilder.() -> Unit) = getOrCreatePartyContractInformation(index).apply(f)

fun ContractFormationInstruction.ContractFormationInstructionBuilder.execution(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateExecution.apply(f)
fun ContractFormationInstruction.ContractFormationInstructionBuilder.legalAgreement(f: LegalAgreement.LegalAgreementBuilder.() -> Unit) = addLegalAgreement(LegalAgreement.LegalAgreementBuilderImpl().apply(f).build())
fun ContractFormationInstruction.ContractFormationInstructionBuilder.legalAgreement(index: Int, f: LegalAgreement.LegalAgreementBuilder.() -> Unit) = getOrCreateLegalAgreement(index).apply(f)

fun ContractFormationPrimitive.ContractFormationPrimitiveBuilder.after(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun ContractFormationPrimitive.ContractFormationPrimitiveBuilder.before(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateBefore.apply(f)

fun ContractState.ContractStateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ContractState.ContractStateBuilder.trade(f: Trade.TradeBuilder.() -> Unit) = orCreateTrade.apply(f)
fun ContractState.ContractStateBuilder.updatedTrade(f: Trade.TradeBuilder.() -> Unit) = orCreateUpdatedTrade.apply(f)

fun ContractualMatrix.ContractualMatrixBuilder.matrixTerm(f: FieldWithMetaMatrixTermEnum.FieldWithMetaMatrixTermEnumBuilder.() -> Unit) = orCreateMatrixTerm.apply(f)
fun ContractualMatrix.ContractualMatrixBuilder.matrixType(f: FieldWithMetaMatrixTypeEnum.FieldWithMetaMatrixTypeEnumBuilder.() -> Unit) = orCreateMatrixType.apply(f)

fun ContractualProduct.ContractualProductBuilder.economicTerms(f: EconomicTerms.EconomicTermsBuilder.() -> Unit) = orCreateEconomicTerms.apply(f)
fun ContractualProduct.ContractualProductBuilder.meta(f: MetaAndTemplateFields.MetaAndTemplateFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ContractualProduct.ContractualProductBuilder.productIdentification(f: ProductIdentification.ProductIdentificationBuilder.() -> Unit) = orCreateProductIdentification.apply(f)
fun ContractualProduct.ContractualProductBuilder.productTaxonomy(f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = addProductTaxonomy(ProductTaxonomy.ProductTaxonomyBuilderImpl().apply(f).build())
fun ContractualProduct.ContractualProductBuilder.productTaxonomy(index: Int, f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = getOrCreateProductTaxonomy(index).apply(f)

fun ContractualTermsSupplement.ContractualTermsSupplementBuilder.contractualTermsSupplementType(f: FieldWithMetaContractualSupplementEnum.FieldWithMetaContractualSupplementEnumBuilder.() -> Unit) = orCreateContractualTermsSupplementType.apply(f)

fun ControlAgreement.ControlAgreementBuilder.partyElection(f: ControlAgreementElections.ControlAgreementElectionsBuilder.() -> Unit) = addPartyElection(ControlAgreementElections.ControlAgreementElectionsBuilderImpl().apply(f).build())
fun ControlAgreement.ControlAgreementBuilder.partyElection(index: Int, f: ControlAgreementElections.ControlAgreementElectionsBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)


fun ControlAgreementNecEvent.ControlAgreementNecEventBuilder.controlAgreementNecEventElection(f: ControlAgreementNecEventElection.ControlAgreementNecEventElectionBuilder.() -> Unit) = addControlAgreementNecEventElection(ControlAgreementNecEventElection.ControlAgreementNecEventElectionBuilderImpl().apply(f).build())
fun ControlAgreementNecEvent.ControlAgreementNecEventBuilder.controlAgreementNecEventElection(index: Int, f: ControlAgreementNecEventElection.ControlAgreementNecEventElectionBuilder.() -> Unit) = getOrCreateControlAgreementNecEventElection(index).apply(f)



fun Counterparty.CounterpartyBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)

fun CoveredTransactions.CoveredTransactionsBuilder.additionalObligations(f: AdditionalObligations.AdditionalObligationsBuilder.() -> Unit) = addAdditionalObligations(AdditionalObligations.AdditionalObligationsBuilderImpl().apply(f).build())
fun CoveredTransactions.CoveredTransactionsBuilder.additionalObligations(index: Int, f: AdditionalObligations.AdditionalObligationsBuilder.() -> Unit) = getOrCreateAdditionalObligations(index).apply(f)
fun CoveredTransactions.CoveredTransactionsBuilder.coveredTransactions(f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = addCoveredTransactions(ProductTaxonomy.ProductTaxonomyBuilderImpl().apply(f).build())
fun CoveredTransactions.CoveredTransactionsBuilder.coveredTransactions(index: Int, f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = getOrCreateCoveredTransactions(index).apply(f)

fun CreditDefaultPayout.CreditDefaultPayoutBuilder.generalTerms(f: GeneralTerms.GeneralTermsBuilder.() -> Unit) = orCreateGeneralTerms.apply(f)
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.protectionTerms(f: ProtectionTerms.ProtectionTermsBuilder.() -> Unit) = addProtectionTerms(ProtectionTerms.ProtectionTermsBuilderImpl().apply(f).build())
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.protectionTerms(index: Int, f: ProtectionTerms.ProtectionTermsBuilder.() -> Unit) = getOrCreateProtectionTerms(index).apply(f)
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.transactedPrice(f: TransactedPrice.TransactedPriceBuilder.() -> Unit) = orCreateTransactedPrice.apply(f)

fun CreditEventNotice.CreditEventNoticeBuilder.publiclyAvailableInformation(f: PubliclyAvailableInformation.PubliclyAvailableInformationBuilder.() -> Unit) = orCreatePubliclyAvailableInformation.apply(f)

fun CreditEvents.CreditEventsBuilder.creditEventNotice(f: CreditEventNotice.CreditEventNoticeBuilder.() -> Unit) = orCreateCreditEventNotice.apply(f)
fun CreditEvents.CreditEventsBuilder.defaultRequirement(f: Money.MoneyBuilder.() -> Unit) = orCreateDefaultRequirement.apply(f)
fun CreditEvents.CreditEventsBuilder.failureToPay(f: FailureToPay.FailureToPayBuilder.() -> Unit) = orCreateFailureToPay.apply(f)
fun CreditEvents.CreditEventsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun CreditEvents.CreditEventsBuilder.restructuring(f: Restructuring.RestructuringBuilder.() -> Unit) = orCreateRestructuring.apply(f)

fun CreditLimitInformation.CreditLimitInformationBuilder.limitApplicable(f: LimitApplicableExtended.LimitApplicableExtendedBuilder.() -> Unit) = addLimitApplicable(LimitApplicableExtended.LimitApplicableExtendedBuilderImpl().apply(f).build())
fun CreditLimitInformation.CreditLimitInformationBuilder.limitApplicable(index: Int, f: LimitApplicableExtended.LimitApplicableExtendedBuilder.() -> Unit) = getOrCreateLimitApplicable(index).apply(f)

fun CreditLimitUtilisation.CreditLimitUtilisationBuilder.executed(f: CreditLimitUtilisationPosition.CreditLimitUtilisationPositionBuilder.() -> Unit) = orCreateExecuted.apply(f)
fun CreditLimitUtilisation.CreditLimitUtilisationBuilder.pending(f: CreditLimitUtilisationPosition.CreditLimitUtilisationPositionBuilder.() -> Unit) = orCreatePending.apply(f)


fun CreditNotation.CreditNotationBuilder.debt(f: CreditRatingDebt.CreditRatingDebtBuilder.() -> Unit) = orCreateDebt.apply(f)
fun CreditNotation.CreditNotationBuilder.notation(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateNotation.apply(f)
fun CreditNotation.CreditNotationBuilder.scale(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateScale.apply(f)

fun CreditNotations.CreditNotationsBuilder.creditNotation(f: CreditNotation.CreditNotationBuilder.() -> Unit) = orCreateCreditNotation.apply(f)
fun CreditNotations.CreditNotationsBuilder.creditNotations(f: MultipleCreditNotations.MultipleCreditNotationsBuilder.() -> Unit) = orCreateCreditNotations.apply(f)

fun CreditRatingDebt.CreditRatingDebtBuilder.debtType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateDebtType.apply(f)
fun CreditRatingDebt.CreditRatingDebtBuilder.debtTypes(f: MultipleDebtTypes.MultipleDebtTypesBuilder.() -> Unit) = orCreateDebtTypes.apply(f)

fun CreditSupportAgreement.CreditSupportAgreementBuilder.creditSupportAgreementType(f: FieldWithMetaCreditSupportAgreementTypeEnum.FieldWithMetaCreditSupportAgreementTypeEnumBuilder.() -> Unit) = orCreateCreditSupportAgreementType.apply(f)

fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.additionalRepresentations(f: AdditionalRepresentations.AdditionalRepresentationsBuilder.() -> Unit) = orCreateAdditionalRepresentations.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.addressesForTransfer(f: ContactElection.ContactElectionBuilder.() -> Unit) = orCreateAddressesForTransfer.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.appropriatedCollateralValuation(f: AppropriatedCollateralValuation.AppropriatedCollateralValuationBuilder.() -> Unit) = orCreateAppropriatedCollateralValuation.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.baseAndEligibleCurrency(f: BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.() -> Unit) = orCreateBaseAndEligibleCurrency.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.calculationAndTiming(f: CalculationAndTiming.CalculationAndTimingBuilder.() -> Unit) = orCreateCalculationAndTiming.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.conditionsPrecedent(f: ConditionsPrecedent.ConditionsPrecedentBuilder.() -> Unit) = orCreateConditionsPrecedent.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.coveredTransactions(f: CoveredTransactions.CoveredTransactionsBuilder.() -> Unit) = orCreateCoveredTransactions.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.creditSupportObligations(f: CreditSupportObligations.CreditSupportObligationsBuilder.() -> Unit) = orCreateCreditSupportObligations.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.custodyArrangements(f: CustodyArrangements.CustodyArrangementsBuilder.() -> Unit) = orCreateCustodyArrangements.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.demandsAndNotices(f: ContactElection.ContactElectionBuilder.() -> Unit) = orCreateDemandsAndNotices.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.disputeResolution(f: DisputeResolution.DisputeResolutionBuilder.() -> Unit) = orCreateDisputeResolution.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.distributionAndInterestPayment(f: DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.() -> Unit) = orCreateDistributionAndInterestPayment.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.fxHaircutCurrency(f: FxHaircutCurrency.FxHaircutCurrencyBuilder.() -> Unit) = orCreateFxHaircutCurrency.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.generalSimmElections(f: GeneralSimmElections.GeneralSimmElectionsBuilder.() -> Unit) = orCreateGeneralSimmElections.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.holdingAndUsingPostedCollateral(f: HoldingAndUsingPostedCollateral.HoldingAndUsingPostedCollateralBuilder.() -> Unit) = orCreateHoldingAndUsingPostedCollateral.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.jurisdictionRelatedTerms(f: JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.() -> Unit) = orCreateJurisdictionRelatedTerms.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.minimumTransferAmountAmendment(f: MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.() -> Unit) = orCreateMinimumTransferAmountAmendment.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.oneWayProvisions(f: OneWayProvisions.OneWayProvisionsBuilder.() -> Unit) = orCreateOneWayProvisions.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.otherAgreements(f: OtherAgreements.OtherAgreementsBuilder.() -> Unit) = orCreateOtherAgreements.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.otherEligibleAndPostedSupport(f: OtherEligibleAndPostedSupport.OtherEligibleAndPostedSupportBuilder.() -> Unit) = orCreateOtherEligibleAndPostedSupport.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.postingObligations(f: PostingObligations.PostingObligationsBuilder.() -> Unit) = orCreatePostingObligations.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.processAgent(f: ProcessAgent.ProcessAgentBuilder.() -> Unit) = orCreateProcessAgent.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.regime(f: Regime.RegimeBuilder.() -> Unit) = orCreateRegime.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.rightsEvents(f: RightsEvents.RightsEventsBuilder.() -> Unit) = orCreateRightsEvents.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.sensitivityMethodologies(f: SensitivityMethodologies.SensitivityMethodologiesBuilder.() -> Unit) = orCreateSensitivityMethodologies.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.substitutedRegime(f: SubstitutedRegime.SubstitutedRegimeBuilder.() -> Unit) = addSubstitutedRegime(SubstitutedRegime.SubstitutedRegimeBuilderImpl().apply(f).build())
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.substitutedRegime(index: Int, f: SubstitutedRegime.SubstitutedRegimeBuilder.() -> Unit) = getOrCreateSubstitutedRegime(index).apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.substitution(f: Substitution.SubstitutionBuilder.() -> Unit) = orCreateSubstitution.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.terminationCurrencyAmendment(f: TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.() -> Unit) = orCreateTerminationCurrencyAmendment.apply(f)

fun CreditSupportDocument.CreditSupportDocumentBuilder.creditSupportDocumentElection(f: CreditSupportDocumentElection.CreditSupportDocumentElectionBuilder.() -> Unit) = addCreditSupportDocumentElection(CreditSupportDocumentElection.CreditSupportDocumentElectionBuilderImpl().apply(f).build())
fun CreditSupportDocument.CreditSupportDocumentBuilder.creditSupportDocumentElection(index: Int, f: CreditSupportDocumentElection.CreditSupportDocumentElectionBuilder.() -> Unit) = getOrCreateCreditSupportDocumentElection(index).apply(f)

fun CreditSupportDocumentElection.CreditSupportDocumentElectionBuilder.creditSupportDocument(f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = addCreditSupportDocument(RelatedAgreement.RelatedAgreementBuilderImpl().apply(f).build())
fun CreditSupportDocumentElection.CreditSupportDocumentElectionBuilder.creditSupportDocument(index: Int, f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = getOrCreateCreditSupportDocument(index).apply(f)
fun CreditSupportDocumentElection.CreditSupportDocumentElectionBuilder.party(f: Party.PartyBuilder.() -> Unit) = orCreateParty.apply(f)

fun CreditSupportObligations.CreditSupportObligationsBuilder.bespokeTransferTiming(f: BespokeTransferTiming.BespokeTransferTimingBuilder.() -> Unit) = orCreateBespokeTransferTiming.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.creditSupportObligationsVariationMargin(f: CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.() -> Unit) = orCreateCreditSupportObligationsVariationMargin.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.marginApproach(f: MarginApproach.MarginApproachBuilder.() -> Unit) = orCreateMarginApproach.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.minimumTransferAmount(f: MinimumTransferAmount.MinimumTransferAmountBuilder.() -> Unit) = orCreateMinimumTransferAmount.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.rounding(f: CollateralRounding.CollateralRoundingBuilder.() -> Unit) = orCreateRounding.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.threshold(f: Threshold.ThresholdBuilder.() -> Unit) = orCreateThreshold.apply(f)

fun CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.ineligibleCreditSupport(f: IneligibleCreditSupport.IneligibleCreditSupportBuilder.() -> Unit) = orCreateIneligibleCreditSupport.apply(f)
fun CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.majorCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addMajorCurrency(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.majorCurrency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateMajorCurrency(index).apply(f)

fun CreditSupportProvider.CreditSupportProviderBuilder.creditSupportProviderElection(f: CreditSupportProviderElection.CreditSupportProviderElectionBuilder.() -> Unit) = addCreditSupportProviderElection(CreditSupportProviderElection.CreditSupportProviderElectionBuilderImpl().apply(f).build())
fun CreditSupportProvider.CreditSupportProviderBuilder.creditSupportProviderElection(index: Int, f: CreditSupportProviderElection.CreditSupportProviderElectionBuilder.() -> Unit) = getOrCreateCreditSupportProviderElection(index).apply(f)

fun CreditSupportProviderElection.CreditSupportProviderElectionBuilder.creditSupportProvider(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addCreditSupportProvider(LegalEntity.LegalEntityBuilderImpl().apply(f).build())
fun CreditSupportProviderElection.CreditSupportProviderElectionBuilder.creditSupportProvider(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateCreditSupportProvider(index).apply(f)
fun CreditSupportProviderElection.CreditSupportProviderElectionBuilder.party(f: Party.PartyBuilder.() -> Unit) = orCreateParty.apply(f)


fun Curve.CurveBuilder.commodityCurve(f: FieldWithMetaCommodityReferencePriceEnum.FieldWithMetaCommodityReferencePriceEnumBuilder.() -> Unit) = orCreateCommodityCurve.apply(f)
fun Curve.CurveBuilder.interestRateCurve(f: InterestRateCurve.InterestRateCurveBuilder.() -> Unit) = orCreateInterestRateCurve.apply(f)

fun Custodian.CustodianBuilder.partyElection(f: CustodianElection.CustodianElectionBuilder.() -> Unit) = addPartyElection(CustodianElection.CustodianElectionBuilderImpl().apply(f).build())
fun Custodian.CustodianBuilder.partyElection(index: Int, f: CustodianElection.CustodianElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun CustodianElection.CustodianElectionBuilder.custodian(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateCustodian.apply(f)
fun CustodianElection.CustodianElectionBuilder.segregatedCashAccount(f: Account.AccountBuilder.() -> Unit) = orCreateSegregatedCashAccount.apply(f)
fun CustodianElection.CustodianElectionBuilder.segregatedSecurityAccount(f: Account.AccountBuilder.() -> Unit) = orCreateSegregatedSecurityAccount.apply(f)

fun CustodianEvent.CustodianEventBuilder.endDate(f: CustodianEventEndDate.CustodianEventEndDateBuilder.() -> Unit) = orCreateEndDate.apply(f)

fun CustodianEventEndDate.CustodianEventEndDateBuilder.dateOfTimelyStatement(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateDateOfTimelyStatement.apply(f)
fun CustodianEventEndDate.CustodianEventEndDateBuilder.daysAfterCustodianEvent(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateDaysAfterCustodianEvent.apply(f)
fun CustodianEventEndDate.CustodianEventEndDateBuilder.releaseDate(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateReleaseDate.apply(f)
fun CustodianEventEndDate.CustodianEventEndDateBuilder.safekeepingPeriodExpiry(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateSafekeepingPeriodExpiry.apply(f)

fun CustodianRisk.CustodianRiskBuilder.partyElection(f: CustodianRiskElection.CustodianRiskElectionBuilder.() -> Unit) = addPartyElection(CustodianRiskElection.CustodianRiskElectionBuilderImpl().apply(f).build())
fun CustodianRisk.CustodianRiskBuilder.partyElection(index: Int, f: CustodianRiskElection.CustodianRiskElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)


fun CustodianTerms.CustodianTermsBuilder.initialDesignation(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateInitialDesignation.apply(f)
fun CustodianTerms.CustodianTermsBuilder.minimumAssets(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumAssets.apply(f)
fun CustodianTerms.CustodianTermsBuilder.minimumRating(f: CreditNotation.CreditNotationBuilder.() -> Unit) = orCreateMinimumRating.apply(f)

fun CustodyArrangements.CustodyArrangementsBuilder.collateralAccessBreach(f: CollateralAccessBreach.CollateralAccessBreachBuilder.() -> Unit) = orCreateCollateralAccessBreach.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.collateralManagementAgreeement(f: CollateralManagementAgreement.CollateralManagementAgreementBuilder.() -> Unit) = orCreateCollateralManagementAgreeement.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.controlAgreement(f: ControlAgreement.ControlAgreementBuilder.() -> Unit) = orCreateControlAgreement.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.custodian(f: Custodian.CustodianBuilder.() -> Unit) = orCreateCustodian.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.custodianEvent(f: CustodianEvent.CustodianEventBuilder.() -> Unit) = orCreateCustodianEvent.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.custodianRisk(f: CustodianRisk.CustodianRiskBuilder.() -> Unit) = orCreateCustodianRisk.apply(f)

fun CustomisableOffset.CustomisableOffsetBuilder.offset(f: Offset.OffsetBuilder.() -> Unit) = orCreateOffset.apply(f)





fun DateRelativeToCalculationPeriodDates.DateRelativeToCalculationPeriodDatesBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = addCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilderImpl().apply(f).build())
fun DateRelativeToCalculationPeriodDates.DateRelativeToCalculationPeriodDatesBuilder.calculationPeriodDatesReference(index: Int, f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = getOrCreateCalculationPeriodDatesReference(index).apply(f)

fun DateRelativeToPaymentDates.DateRelativeToPaymentDatesBuilder.paymentDatesReference(f: ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder.() -> Unit) = addPaymentDatesReference(ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilderImpl().apply(f).build())
fun DateRelativeToPaymentDates.DateRelativeToPaymentDatesBuilder.paymentDatesReference(index: Int, f: ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder.() -> Unit) = getOrCreatePaymentDatesReference(index).apply(f)



fun DebtType.DebtTypeBuilder.debtEconomics(f: DebtEconomics.DebtEconomicsBuilder.() -> Unit) = addDebtEconomics(DebtEconomics.DebtEconomicsBuilderImpl().apply(f).build())
fun DebtType.DebtTypeBuilder.debtEconomics(index: Int, f: DebtEconomics.DebtEconomicsBuilder.() -> Unit) = getOrCreateDebtEconomics(index).apply(f)

fun DecreaseInstruction.DecreaseInstructionBuilder.fee(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateFee.apply(f)
fun DecreaseInstruction.DecreaseInstructionBuilder.tradeLot(f: TradeLot.TradeLotBuilder.() -> Unit) = addTradeLot(TradeLot.TradeLotBuilderImpl().apply(f).build())
fun DecreaseInstruction.DecreaseInstructionBuilder.tradeLot(index: Int, f: TradeLot.TradeLotBuilder.() -> Unit) = getOrCreateTradeLot(index).apply(f)
fun DecreaseInstruction.DecreaseInstructionBuilder.tradeState(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateTradeState.apply(f)

fun DecreasedTrade.DecreasedTradeBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = addQuantity(Quantity.QuantityBuilderImpl().apply(f).build())
fun DecreasedTrade.DecreasedTradeBuilder.quantity(index: Int, f: Quantity.QuantityBuilder.() -> Unit) = getOrCreateQuantity(index).apply(f)
fun DecreasedTrade.DecreasedTradeBuilder.tradeState(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateTradeState.apply(f)

fun DeliverableObligations.DeliverableObligationsBuilder.assignableLoan(f: PCDeliverableObligationCharac.PCDeliverableObligationCharacBuilder.() -> Unit) = orCreateAssignableLoan.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.consentRequiredLoan(f: PCDeliverableObligationCharac.PCDeliverableObligationCharacBuilder.() -> Unit) = orCreateConsentRequiredLoan.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.directLoanParticipation(f: LoanParticipation.LoanParticipationBuilder.() -> Unit) = orCreateDirectLoanParticipation.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.indirectLoanParticipation(f: LoanParticipation.LoanParticipationBuilder.() -> Unit) = orCreateIndirectLoanParticipation.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.maximumMaturity(f: Period.PeriodBuilder.() -> Unit) = orCreateMaximumMaturity.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.notDomesticCurrency(f: NotDomesticCurrency.NotDomesticCurrencyBuilder.() -> Unit) = orCreateNotDomesticCurrency.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.specifiedCurrency(f: SpecifiedCurrency.SpecifiedCurrencyBuilder.() -> Unit) = orCreateSpecifiedCurrency.apply(f)


fun DeliveryDateParameters.DeliveryDateParametersBuilder.deliveryDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateDeliveryDate.apply(f)
fun DeliveryDateParameters.DeliveryDateParametersBuilder.deliveryDateExpirationConvention(f: Offset.OffsetBuilder.() -> Unit) = orCreateDeliveryDateExpirationConvention.apply(f)
fun DeliveryDateParameters.DeliveryDateParametersBuilder.deliveryDateRollConvention(f: Offset.OffsetBuilder.() -> Unit) = orCreateDeliveryDateRollConvention.apply(f)
fun DeliveryDateParameters.DeliveryDateParametersBuilder.deliveryNearby(f: Offset.OffsetBuilder.() -> Unit) = orCreateDeliveryNearby.apply(f)

fun DerivInstrmAttrbts.DerivInstrmAttrbtsBuilder.undrlygInstrm(f: UndrlygInstrm.UndrlygInstrmBuilder.() -> Unit) = orCreateUndrlygInstrm.apply(f)


fun DiscountingMethod.DiscountingMethodBuilder.discountRateDayCountFraction(f: FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.() -> Unit) = orCreateDiscountRateDayCountFraction.apply(f)

fun DisputeResolution.DisputeResolutionBuilder.recalculationOfValue(f: RecalculationOfValue.RecalculationOfValueBuilder.() -> Unit) = orCreateRecalculationOfValue.apply(f)
fun DisputeResolution.DisputeResolutionBuilder.resolutionTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateResolutionTime.apply(f)

fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestAdjustment(f: InterestAdjustment.InterestAdjustmentBuilder.() -> Unit) = orCreateInterestAdjustment.apply(f)
fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestAmount(f: InterestAmount.InterestAmountBuilder.() -> Unit) = orCreateInterestAmount.apply(f)
fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestRate(f: EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.() -> Unit) = addInterestRate(EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilderImpl().apply(f).build())
fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestRate(index: Int, f: EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.() -> Unit) = getOrCreateInterestRate(index).apply(f)

fun DividendCurrency.DividendCurrencyBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun DividendCurrency.DividendCurrencyBuilder.currencyReference(f: BasicReferenceWithMetaString.BasicReferenceWithMetaStringBuilder.() -> Unit) = orCreateCurrencyReference.apply(f)

fun DividendDateReference.DividendDateReferenceBuilder.paymentDateOffset(f: Offset.OffsetBuilder.() -> Unit) = orCreatePaymentDateOffset.apply(f)

fun DividendPaymentDate.DividendPaymentDateBuilder.adjustableDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateAdjustableDate.apply(f)
fun DividendPaymentDate.DividendPaymentDateBuilder.dividendDateReference(f: DividendDateReference.DividendDateReferenceBuilder.() -> Unit) = orCreateDividendDateReference.apply(f)


fun DividendReturnTerms.DividendReturnTermsBuilder.dividendCurrency(f: DividendCurrency.DividendCurrencyBuilder.() -> Unit) = orCreateDividendCurrency.apply(f)
fun DividendReturnTerms.DividendReturnTermsBuilder.dividendPaymentDate(f: DividendPaymentDate.DividendPaymentDateBuilder.() -> Unit) = orCreateDividendPaymentDate.apply(f)
fun DividendReturnTerms.DividendReturnTermsBuilder.dividendPayout(f: DividendPayout.DividendPayoutBuilder.() -> Unit) = orCreateDividendPayout.apply(f)
fun DividendReturnTerms.DividendReturnTermsBuilder.dividendPeriodEffectiveDate(f: BasicReferenceWithMetaDate.BasicReferenceWithMetaDateBuilder.() -> Unit) = orCreateDividendPeriodEffectiveDate.apply(f)
fun DividendReturnTerms.DividendReturnTermsBuilder.dividendPeriodEndDate(f: BasicReferenceWithMetaDate.BasicReferenceWithMetaDateBuilder.() -> Unit) = orCreateDividendPeriodEndDate.apply(f)

fun DividendTerms.DividendTermsBuilder.manufacturedIncomeRequirement(f: DividendPayout.DividendPayoutBuilder.() -> Unit) = orCreateManufacturedIncomeRequirement.apply(f)
fun DividendTerms.DividendTermsBuilder.minimumBillingAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumBillingAmount.apply(f)

fun Document.DocumentBuilder.finInstrmRptgTxRpt(f: FinInstrmRptgTxRpt.FinInstrmRptgTxRptBuilder.() -> Unit) = orCreateFinInstrmRptgTxRpt.apply(f)

fun DocumentationIdentification.DocumentationIdentificationBuilder.attachment(f: Resource.ResourceBuilder.() -> Unit) = addAttachment(Resource.ResourceBuilderImpl().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.attachment(index: Int, f: Resource.ResourceBuilder.() -> Unit) = getOrCreateAttachment(index).apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.brokerConfirmation(f: BrokerConfirmation.BrokerConfirmationBuilder.() -> Unit) = orCreateBrokerConfirmation.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualDefinitions(f: FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder.() -> Unit) = addContractualDefinitions(FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilderImpl().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualDefinitions(index: Int, f: FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder.() -> Unit) = getOrCreateContractualDefinitions(index).apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualMatrix(f: ContractualMatrix.ContractualMatrixBuilder.() -> Unit) = addContractualMatrix(ContractualMatrix.ContractualMatrixBuilderImpl().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualMatrix(index: Int, f: ContractualMatrix.ContractualMatrixBuilder.() -> Unit) = getOrCreateContractualMatrix(index).apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualTermsSupplement(f: ContractualTermsSupplement.ContractualTermsSupplementBuilder.() -> Unit) = addContractualTermsSupplement(ContractualTermsSupplement.ContractualTermsSupplementBuilderImpl().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualTermsSupplement(index: Int, f: ContractualTermsSupplement.ContractualTermsSupplementBuilder.() -> Unit) = getOrCreateContractualTermsSupplement(index).apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.creditSupportAgreement(f: CreditSupportAgreement.CreditSupportAgreementBuilder.() -> Unit) = orCreateCreditSupportAgreement.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.masterAgreement(f: MasterAgreement.MasterAgreementBuilder.() -> Unit) = orCreateMasterAgreement.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.masterConfirmation(f: MasterConfirmation.MasterConfirmationBuilder.() -> Unit) = orCreateMasterConfirmation.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.otherAgreement(f: OtherAgreement.OtherAgreementBuilder.() -> Unit) = addOtherAgreement(OtherAgreement.OtherAgreementBuilderImpl().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.otherAgreement(index: Int, f: OtherAgreement.OtherAgreementBuilder.() -> Unit) = getOrCreateOtherAgreement(index).apply(f)

fun Duration.DurationBuilder.evergreenProvision(f: EvergreenProvision.EvergreenProvisionBuilder.() -> Unit) = orCreateEvergreenProvision.apply(f)

fun EarlyTerminationEvent.EarlyTerminationEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun EarlyTerminationProvision.EarlyTerminationProvisionBuilder.mandatoryEarlyTermination(f: MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.() -> Unit) = orCreateMandatoryEarlyTermination.apply(f)
fun EarlyTerminationProvision.EarlyTerminationProvisionBuilder.mandatoryEarlyTerminationDateTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateMandatoryEarlyTerminationDateTenor.apply(f)
fun EarlyTerminationProvision.EarlyTerminationProvisionBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun EarlyTerminationProvision.EarlyTerminationProvisionBuilder.optionalEarlyTermination(f: OptionalEarlyTermination.OptionalEarlyTerminationBuilder.() -> Unit) = orCreateOptionalEarlyTermination.apply(f)
fun EarlyTerminationProvision.EarlyTerminationProvisionBuilder.optionalEarlyTerminationParameters(f: ExercisePeriod.ExercisePeriodBuilder.() -> Unit) = orCreateOptionalEarlyTerminationParameters.apply(f)

fun EconomicTerms.EconomicTermsBuilder.calculationAgent(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgent.apply(f)
fun EconomicTerms.EconomicTermsBuilder.dateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustments.apply(f)
fun EconomicTerms.EconomicTermsBuilder.earlyTerminationProvision(f: EarlyTerminationProvision.EarlyTerminationProvisionBuilder.() -> Unit) = orCreateEarlyTerminationProvision.apply(f)
fun EconomicTerms.EconomicTermsBuilder.effectiveDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateEffectiveDate.apply(f)
fun EconomicTerms.EconomicTermsBuilder.extraordinaryEvents(f: ExtraordinaryEvents.ExtraordinaryEventsBuilder.() -> Unit) = orCreateExtraordinaryEvents.apply(f)
fun EconomicTerms.EconomicTermsBuilder.optionProvision(f: OptionProvision.OptionProvisionBuilder.() -> Unit) = orCreateOptionProvision.apply(f)
fun EconomicTerms.EconomicTermsBuilder.payout(f: Payout.PayoutBuilder.() -> Unit) = orCreatePayout.apply(f)
fun EconomicTerms.EconomicTermsBuilder.terminationDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateTerminationDate.apply(f)

fun ElectiveAmountElection.ElectiveAmountElectionBuilder.amount(f: Money.MoneyBuilder.() -> Unit) = orCreateAmount.apply(f)

fun EligibilityToHoldCollateral.EligibilityToHoldCollateralBuilder.custodianTerms(f: CustodianTerms.CustodianTermsBuilder.() -> Unit) = orCreateCustodianTerms.apply(f)
fun EligibilityToHoldCollateral.EligibilityToHoldCollateralBuilder.eligibleCountry(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addEligibleCountry(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun EligibilityToHoldCollateral.EligibilityToHoldCollateralBuilder.eligibleCountry(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateEligibleCountry(index).apply(f)

fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.asset(f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = addAsset(AssetCriteria.AssetCriteriaBuilderImpl().apply(f).build())
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.asset(index: Int, f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = getOrCreateAsset(index).apply(f)
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.issuer(f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = addIssuer(IssuerCriteria.IssuerCriteriaBuilderImpl().apply(f).build())
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.issuer(index: Int, f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = getOrCreateIssuer(index).apply(f)
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.treatment(f: CollateralTreatment.CollateralTreatmentBuilder.() -> Unit) = orCreateTreatment.apply(f)

fun EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.criteria(f: EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.() -> Unit) = addCriteria(EligibleCollateralCriteria.EligibleCollateralCriteriaBuilderImpl().apply(f).build())
fun EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.criteria(index: Int, f: EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.() -> Unit) = getOrCreateCriteria(index).apply(f)
fun EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.scheduleIdentifier(f: Identifier.IdentifierBuilder.() -> Unit) = addScheduleIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.scheduleIdentifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateScheduleIdentifier(index).apply(f)

fun EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.actual365Currency(f: FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.() -> Unit) = orCreateActual365Currency.apply(f)
fun EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)





fun EquityPayout.EquityPayoutBuilder.calculationPeriodDates(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDates.apply(f)
fun EquityPayout.EquityPayoutBuilder.dividendReturnTerms(f: DividendReturnTerms.DividendReturnTermsBuilder.() -> Unit) = orCreateDividendReturnTerms.apply(f)
fun EquityPayout.EquityPayoutBuilder.fxFeature(f: FxFeature.FxFeatureBuilder.() -> Unit) = orCreateFxFeature.apply(f)
fun EquityPayout.EquityPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun EquityPayout.EquityPayoutBuilder.paymentDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreatePaymentDates.apply(f)
fun EquityPayout.EquityPayoutBuilder.priceReturnTerms(f: PriceReturnTerms.PriceReturnTermsBuilder.() -> Unit) = orCreatePriceReturnTerms.apply(f)
fun EquityPayout.EquityPayoutBuilder.underlier(f: Product.ProductBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.equityCalculationPeriod(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = orCreateEquityCalculationPeriod.apply(f)
fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.equityCashSettlementDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreateEquityCashSettlementDates.apply(f)
fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.pricingMethodElection(f: PriceReturnTerms.PriceReturnTermsBuilder.() -> Unit) = orCreatePricingMethodElection.apply(f)
fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.settlementTerms(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateSettlementTerms.apply(f)

fun EquityValuation.EquityValuationBuilder.price(f: Price.PriceBuilder.() -> Unit) = orCreatePrice.apply(f)
fun EquityValuation.EquityValuationBuilder.valuationDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateValuationDate.apply(f)
fun EquityValuation.EquityValuationBuilder.valuationDates(f: AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.() -> Unit) = orCreateValuationDates.apply(f)
fun EquityValuation.EquityValuationBuilder.valuationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateValuationTime.apply(f)

fun EuropeanExercise.EuropeanExerciseBuilder.earliestExerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateEarliestExerciseTime.apply(f)
fun EuropeanExercise.EuropeanExerciseBuilder.exerciseFee(f: ExerciseFee.ExerciseFeeBuilder.() -> Unit) = orCreateExerciseFee.apply(f)
fun EuropeanExercise.EuropeanExerciseBuilder.expirationDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateExpirationDate.apply(f)
fun EuropeanExercise.EuropeanExerciseBuilder.expirationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateExpirationTime.apply(f)
fun EuropeanExercise.EuropeanExerciseBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun EuropeanExercise.EuropeanExerciseBuilder.partialExercise(f: PartialExercise.PartialExerciseBuilder.() -> Unit) = orCreatePartialExercise.apply(f)
fun EuropeanExercise.EuropeanExerciseBuilder.relevantUnderlyingDate(f: AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateRelevantUnderlyingDate.apply(f)

fun EventEffect.EventEffectBuilder.effectedTrade(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = addEffectedTrade(ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilderImpl().apply(f).build())
fun EventEffect.EventEffectBuilder.effectedTrade(index: Int, f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = getOrCreateEffectedTrade(index).apply(f)
fun EventEffect.EventEffectBuilder.productIdentifier(f: ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilderImpl().apply(f).build())
fun EventEffect.EventEffectBuilder.productIdentifier(index: Int, f: ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply(f)
fun EventEffect.EventEffectBuilder.trade(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = addTrade(ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilderImpl().apply(f).build())
fun EventEffect.EventEffectBuilder.trade(index: Int, f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = getOrCreateTrade(index).apply(f)
fun EventEffect.EventEffectBuilder.transfer(f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = addTransfer(ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilderImpl().apply(f).build())
fun EventEffect.EventEffectBuilder.transfer(index: Int, f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = getOrCreateTransfer(index).apply(f)

fun EventTestBundle.EventTestBundleBuilder.computedAmount(f: ComputedAmount.ComputedAmountBuilder.() -> Unit) = addComputedAmount(ComputedAmount.ComputedAmountBuilderImpl().apply(f).build())
fun EventTestBundle.EventTestBundleBuilder.computedAmount(index: Int, f: ComputedAmount.ComputedAmountBuilder.() -> Unit) = getOrCreateComputedAmount(index).apply(f)
fun EventTestBundle.EventTestBundleBuilder.event(f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = addEvent(WorkflowStep.WorkflowStepBuilderImpl().apply(f).build())
fun EventTestBundle.EventTestBundleBuilder.event(index: Int, f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = getOrCreateEvent(index).apply(f)


fun EvergreenProvision.EvergreenProvisionBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun EvergreenProvision.EvergreenProvisionBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun EvergreenProvision.EvergreenProvisionBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)
fun EvergreenProvision.EvergreenProvisionBuilder.evergreenExtensionPeriod(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateEvergreenExtensionPeriod.apply(f)
fun EvergreenProvision.EvergreenProvisionBuilder.evergreenRollFrequency(f: CalculationPeriodFrequency.CalculationPeriodFrequencyBuilder.() -> Unit) = orCreateEvergreenRollFrequency.apply(f)

fun ExchangeRate.ExchangeRateBuilder.crossRate(f: CrossRate.CrossRateBuilder.() -> Unit) = addCrossRate(CrossRate.CrossRateBuilderImpl().apply(f).build())
fun ExchangeRate.ExchangeRateBuilder.crossRate(index: Int, f: CrossRate.CrossRateBuilder.() -> Unit) = getOrCreateCrossRate(index).apply(f)

fun ExctgPrsn.ExctgPrsnBuilder.prsn(f: Prsn.PrsnBuilder.() -> Unit) = orCreatePrsn.apply(f)

fun ExecutionDetails.ExecutionDetailsBuilder.executionVenue(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateExecutionVenue.apply(f)
fun ExecutionDetails.ExecutionDetailsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExecutionInstruction.ExecutionInstructionBuilder.ancillaryParty(f: AncillaryParty.AncillaryPartyBuilder.() -> Unit) = addAncillaryParty(AncillaryParty.AncillaryPartyBuilderImpl().apply(f).build())
fun ExecutionInstruction.ExecutionInstructionBuilder.ancillaryParty(index: Int, f: AncillaryParty.AncillaryPartyBuilder.() -> Unit) = getOrCreateAncillaryParty(index).apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.counterparty(f: Counterparty.CounterpartyBuilder.() -> Unit) = addCounterparty(Counterparty.CounterpartyBuilderImpl().apply(f).build())
fun ExecutionInstruction.ExecutionInstructionBuilder.counterparty(index: Int, f: Counterparty.CounterpartyBuilder.() -> Unit) = getOrCreateCounterparty(index).apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.executionDetails(f: ExecutionDetails.ExecutionDetailsBuilder.() -> Unit) = orCreateExecutionDetails.apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.parties(f: Party.PartyBuilder.() -> Unit) = addParties(Party.PartyBuilderImpl().apply(f).build())
fun ExecutionInstruction.ExecutionInstructionBuilder.parties(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParties(index).apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.partyRoles(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRoles(PartyRole.PartyRoleBuilderImpl().apply(f).build())
fun ExecutionInstruction.ExecutionInstructionBuilder.partyRoles(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRoles(index).apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.priceQuantity(f: PriceQuantity.PriceQuantityBuilder.() -> Unit) = addPriceQuantity(PriceQuantity.PriceQuantityBuilderImpl().apply(f).build())
fun ExecutionInstruction.ExecutionInstructionBuilder.priceQuantity(index: Int, f: PriceQuantity.PriceQuantityBuilder.() -> Unit) = getOrCreatePriceQuantity(index).apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.product(f: Product.ProductBuilder.() -> Unit) = orCreateProduct.apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.settlementInstructions(f: SettlementInstructions.SettlementInstructionsBuilder.() -> Unit) = addSettlementInstructions(SettlementInstructions.SettlementInstructionsBuilderImpl().apply(f).build())
fun ExecutionInstruction.ExecutionInstructionBuilder.settlementInstructions(index: Int, f: SettlementInstructions.SettlementInstructionsBuilder.() -> Unit) = getOrCreateSettlementInstructions(index).apply(f)
fun ExecutionInstruction.ExecutionInstructionBuilder.tradeIdentifier(f: Identifier.IdentifierBuilder.() -> Unit) = addTradeIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun ExecutionInstruction.ExecutionInstructionBuilder.tradeIdentifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateTradeIdentifier(index).apply(f)



fun ExecutionPrimitive.ExecutionPrimitiveBuilder.after(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun ExecutionPrimitive.ExecutionPrimitiveBuilder.before(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = addBefore(ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilderImpl().apply(f).build())
fun ExecutionPrimitive.ExecutionPrimitiveBuilder.before(index: Int, f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = getOrCreateBefore(index).apply(f)

fun ExecutionTerms.ExecutionTermsBuilder.executionLanguage(f: ExecutionLanguage.ExecutionLanguageBuilder.() -> Unit) = orCreateExecutionLanguage.apply(f)
fun ExecutionTerms.ExecutionTermsBuilder.executionLocation(f: ExecutionLocation.ExecutionLocationBuilder.() -> Unit) = orCreateExecutionLocation.apply(f)

fun ExerciseEvent.ExerciseEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExerciseFee.ExerciseFeeBuilder.feePaymentDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateFeePaymentDate.apply(f)
fun ExerciseFee.ExerciseFeeBuilder.notionalReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionalReference.apply(f)

fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.feeAmountSchedule(f: AmountSchedule.AmountScheduleBuilder.() -> Unit) = orCreateFeeAmountSchedule.apply(f)
fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.feePaymentDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateFeePaymentDate.apply(f)
fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.feeRateSchedule(f: Schedule.ScheduleBuilder.() -> Unit) = orCreateFeeRateSchedule.apply(f)
fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.notionalReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionalReference.apply(f)

fun ExerciseInstruction.ExerciseInstructionBuilder.exerciseDate(f: AdjustableOrAdjustedDate.AdjustableOrAdjustedDateBuilder.() -> Unit) = orCreateExerciseDate.apply(f)
fun ExerciseInstruction.ExerciseInstructionBuilder.exerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateExerciseTime.apply(f)

fun ExerciseNotice.ExerciseNoticeBuilder.businessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = orCreateBusinessCenter.apply(f)

fun ExercisePeriod.ExercisePeriodBuilder.earliestExerciseDateTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateEarliestExerciseDateTenor.apply(f)
fun ExercisePeriod.ExercisePeriodBuilder.exerciseFrequency(f: Period.PeriodBuilder.() -> Unit) = orCreateExerciseFrequency.apply(f)
fun ExercisePeriod.ExercisePeriodBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExerciseProcedure.ExerciseProcedureBuilder.automaticExercise(f: AutomaticExercise.AutomaticExerciseBuilder.() -> Unit) = orCreateAutomaticExercise.apply(f)
fun ExerciseProcedure.ExerciseProcedureBuilder.manualExercise(f: ManualExercise.ManualExerciseBuilder.() -> Unit) = orCreateManualExercise.apply(f)

fun ExtendibleProvision.ExtendibleProvisionBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.exerciseNotice(f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = orCreateExerciseNotice.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.extendibleProvisionAdjustedDates(f: ExtendibleProvisionAdjustedDates.ExtendibleProvisionAdjustedDatesBuilder.() -> Unit) = orCreateExtendibleProvisionAdjustedDates.apply(f)

fun ExtendibleProvisionAdjustedDates.ExtendibleProvisionAdjustedDatesBuilder.extensionEvent(f: ExtensionEvent.ExtensionEventBuilder.() -> Unit) = addExtensionEvent(ExtensionEvent.ExtensionEventBuilderImpl().apply(f).build())
fun ExtendibleProvisionAdjustedDates.ExtendibleProvisionAdjustedDatesBuilder.extensionEvent(index: Int, f: ExtensionEvent.ExtensionEventBuilder.() -> Unit) = getOrCreateExtensionEvent(index).apply(f)

fun ExtensionEvent.ExtensionEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExternalProductType.ExternalProductTypeBuilder.value(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateValue.apply(f)

fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.additionalDisruptionEvents(f: AdditionalDisruptionEvents.AdditionalDisruptionEventsBuilder.() -> Unit) = orCreateAdditionalDisruptionEvents.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.indexAdjustmentEvents(f: IndexAdjustmentEvents.IndexAdjustmentEventsBuilder.() -> Unit) = orCreateIndexAdjustmentEvents.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.mergerEvents(f: EquityCorporateEvents.EquityCorporateEventsBuilder.() -> Unit) = orCreateMergerEvents.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.representations(f: Representations.RepresentationsBuilder.() -> Unit) = orCreateRepresentations.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.tenderOfferEvents(f: EquityCorporateEvents.EquityCorporateEventsBuilder.() -> Unit) = orCreateTenderOfferEvents.apply(f)

fun FailureToPay.FailureToPayBuilder.gracePeriodExtension(f: GracePeriodExtension.GracePeriodExtensionBuilder.() -> Unit) = orCreateGracePeriodExtension.apply(f)
fun FailureToPay.FailureToPayBuilder.paymentRequirement(f: Money.MoneyBuilder.() -> Unit) = orCreatePaymentRequirement.apply(f)

fun FallbackRateParameters.FallbackRateParametersBuilder.calculationParameters(f: FloatingRateCalculationParameters.FloatingRateCalculationParametersBuilder.() -> Unit) = orCreateCalculationParameters.apply(f)

fun FallbackReferencePrice.FallbackReferencePriceBuilder.calculationAgentDetermination(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgentDetermination.apply(f)
fun FallbackReferencePrice.FallbackReferencePriceBuilder.fallBackSettlementRateOption(f: FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.() -> Unit) = addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilderImpl().apply(f).build())
fun FallbackReferencePrice.FallbackReferencePriceBuilder.fallBackSettlementRateOption(index: Int, f: FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.() -> Unit) = getOrCreateFallBackSettlementRateOption(index).apply(f)
fun FallbackReferencePrice.FallbackReferencePriceBuilder.valuationPostponement(f: ValuationPostponement.ValuationPostponementBuilder.() -> Unit) = orCreateValuationPostponement.apply(f)

fun FeaturePayment.FeaturePaymentBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun FeaturePayment.FeaturePaymentBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FeaturePayment.FeaturePaymentBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun FeaturePayment.FeaturePaymentBuilder.paymentDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreatePaymentDate.apply(f)

fun FinInstrm.FinInstrmBuilder.othr(f: Othr.OthrBuilder.() -> Unit) = orCreateOthr.apply(f)


fun FinInstrmRptgTxRpt.FinInstrmRptgTxRptBuilder.tx(f: Tx.TxBuilder.() -> Unit) = orCreateTx.apply(f)

fun FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.relevantUnderlyingDateReference(f: ReferenceWithMetaAdjustableOrRelativeDates.ReferenceWithMetaAdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateRelevantUnderlyingDateReference.apply(f)
fun FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.swapStreamReference(f: ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.() -> Unit) = orCreateSwapStreamReference.apply(f)

fun FixedForwardPayout.FixedForwardPayoutBuilder.fixedPrice(f: ReferenceWithMetaPrice.ReferenceWithMetaPriceBuilder.() -> Unit) = orCreateFixedPrice.apply(f)
fun FixedForwardPayout.FixedForwardPayoutBuilder.paymentDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreatePaymentDates.apply(f)

fun FixedRateSpecification.FixedRateSpecificationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FixedRateSpecification.FixedRateSpecificationBuilder.rateSchedule(f: RateSchedule.RateScheduleBuilder.() -> Unit) = orCreateRateSchedule.apply(f)

fun FloatingAmountEvents.FloatingAmountEventsBuilder.additionalFixedPayments(f: AdditionalFixedPayments.AdditionalFixedPaymentsBuilder.() -> Unit) = orCreateAdditionalFixedPayments.apply(f)
fun FloatingAmountEvents.FloatingAmountEventsBuilder.floatingAmountProvisions(f: FloatingAmountProvisions.FloatingAmountProvisionsBuilder.() -> Unit) = orCreateFloatingAmountProvisions.apply(f)
fun FloatingAmountEvents.FloatingAmountEventsBuilder.interestShortfall(f: InterestShortFall.InterestShortFallBuilder.() -> Unit) = orCreateInterestShortfall.apply(f)


fun FloatingRate.FloatingRateBuilder.calculationParameters(f: FloatingRateCalculationParameters.FloatingRateCalculationParametersBuilder.() -> Unit) = orCreateCalculationParameters.apply(f)
fun FloatingRate.FloatingRateBuilder.capRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addCapRateSchedule(StrikeSchedule.StrikeScheduleBuilderImpl().apply(f).build())
fun FloatingRate.FloatingRateBuilder.capRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateCapRateSchedule(index).apply(f)
fun FloatingRate.FloatingRateBuilder.fallbackRate(f: FallbackRateParameters.FallbackRateParametersBuilder.() -> Unit) = orCreateFallbackRate.apply(f)
fun FloatingRate.FloatingRateBuilder.floatingRateMultiplierSchedule(f: RateSchedule.RateScheduleBuilder.() -> Unit) = orCreateFloatingRateMultiplierSchedule.apply(f)
fun FloatingRate.FloatingRateBuilder.floorRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addFloorRateSchedule(StrikeSchedule.StrikeScheduleBuilderImpl().apply(f).build())
fun FloatingRate.FloatingRateBuilder.floorRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateFloorRateSchedule(index).apply(f)
fun FloatingRate.FloatingRateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FloatingRate.FloatingRateBuilder.rateOption(f: ReferenceWithMetaFloatingRateOption.ReferenceWithMetaFloatingRateOptionBuilder.() -> Unit) = orCreateRateOption.apply(f)
fun FloatingRate.FloatingRateBuilder.spreadSchedule(f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = addSpreadSchedule(SpreadSchedule.SpreadScheduleBuilderImpl().apply(f).build())
fun FloatingRate.FloatingRateBuilder.spreadSchedule(index: Int, f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = getOrCreateSpreadSchedule(index).apply(f)

fun FloatingRateCalculationParameters.FloatingRateCalculationParametersBuilder.applicableBusinessDays(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateApplicableBusinessDays.apply(f)
fun FloatingRateCalculationParameters.FloatingRateCalculationParametersBuilder.lockoutCalculation(f: OffsetCalculation.OffsetCalculationBuilder.() -> Unit) = orCreateLockoutCalculation.apply(f)
fun FloatingRateCalculationParameters.FloatingRateCalculationParametersBuilder.lookbackCalculation(f: OffsetCalculation.OffsetCalculationBuilder.() -> Unit) = orCreateLookbackCalculation.apply(f)
fun FloatingRateCalculationParameters.FloatingRateCalculationParametersBuilder.observationParameters(f: ObservationParameters.ObservationParametersBuilder.() -> Unit) = orCreateObservationParameters.apply(f)
fun FloatingRateCalculationParameters.FloatingRateCalculationParametersBuilder.observationShiftCalculation(f: ObservationShiftCalculation.ObservationShiftCalculationBuilder.() -> Unit) = orCreateObservationShiftCalculation.apply(f)

fun FloatingRateDefinition.FloatingRateDefinitionBuilder.capRate(f: Strike.StrikeBuilder.() -> Unit) = addCapRate(Strike.StrikeBuilderImpl().apply(f).build())
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.capRate(index: Int, f: Strike.StrikeBuilder.() -> Unit) = getOrCreateCapRate(index).apply(f)
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.floorRate(f: Strike.StrikeBuilder.() -> Unit) = addFloorRate(Strike.StrikeBuilderImpl().apply(f).build())
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.floorRate(index: Int, f: Strike.StrikeBuilder.() -> Unit) = getOrCreateFloorRate(index).apply(f)
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.rateObservation(f: RateObservation.RateObservationBuilder.() -> Unit) = addRateObservation(RateObservation.RateObservationBuilderImpl().apply(f).build())
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.rateObservation(index: Int, f: RateObservation.RateObservationBuilder.() -> Unit) = getOrCreateRateObservation(index).apply(f)

fun FloatingRateOption.FloatingRateOptionBuilder.floatingRateIndex(f: FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.() -> Unit) = orCreateFloatingRateIndex.apply(f)
fun FloatingRateOption.FloatingRateOptionBuilder.indexTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateIndexTenor.apply(f)

fun FloatingRateSpecification.FloatingRateSpecificationBuilder.finalRateRounding(f: Rounding.RoundingBuilder.() -> Unit) = orCreateFinalRateRounding.apply(f)
fun FloatingRateSpecification.FloatingRateSpecificationBuilder.initialRate(f: Price.PriceBuilder.() -> Unit) = orCreateInitialRate.apply(f)

fun ForeignExchange.ForeignExchangeBuilder.exchangeRate(f: ExchangeRate.ExchangeRateBuilder.() -> Unit) = orCreateExchangeRate.apply(f)
fun ForeignExchange.ForeignExchangeBuilder.exchangedCurrency1(f: Cashflow.CashflowBuilder.() -> Unit) = orCreateExchangedCurrency1.apply(f)
fun ForeignExchange.ForeignExchangeBuilder.exchangedCurrency2(f: Cashflow.CashflowBuilder.() -> Unit) = orCreateExchangedCurrency2.apply(f)
fun ForeignExchange.ForeignExchangeBuilder.tenorPeriod(f: Period.PeriodBuilder.() -> Unit) = orCreateTenorPeriod.apply(f)

fun ForwardPayout.ForwardPayoutBuilder.settlementTerms(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateSettlementTerms.apply(f)
fun ForwardPayout.ForwardPayoutBuilder.underlier(f: Product.ProductBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun FrenchLawAddendum.FrenchLawAddendumBuilder.partyElection(f: FrenchLawAddendumElection.FrenchLawAddendumElectionBuilder.() -> Unit) = addPartyElection(FrenchLawAddendumElection.FrenchLawAddendumElectionBuilderImpl().apply(f).build())
fun FrenchLawAddendum.FrenchLawAddendumBuilder.partyElection(index: Int, f: FrenchLawAddendumElection.FrenchLawAddendumElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)


fun Frequency.FrequencyBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun FutureValueAmount.FutureValueAmountBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun FutureValueAmount.FutureValueAmountBuilder.quantity(f: ReferenceWithMetaQuantity.ReferenceWithMetaQuantityBuilder.() -> Unit) = orCreateQuantity.apply(f)

fun FxFeature.FxFeatureBuilder.composite(f: Composite.CompositeBuilder.() -> Unit) = orCreateComposite.apply(f)
fun FxFeature.FxFeatureBuilder.crossCurrency(f: Composite.CompositeBuilder.() -> Unit) = orCreateCrossCurrency.apply(f)
fun FxFeature.FxFeatureBuilder.quanto(f: Quanto.QuantoBuilder.() -> Unit) = orCreateQuanto.apply(f)
fun FxFeature.FxFeatureBuilder.referenceCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateReferenceCurrency.apply(f)

fun FxFixingDate.FxFixingDateBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)
fun FxFixingDate.FxFixingDateBuilder.businessCentersReference(f: ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.() -> Unit) = orCreateBusinessCentersReference.apply(f)
fun FxFixingDate.FxFixingDateBuilder.dateRelativeToCalculationPeriodDates(f: DateRelativeToCalculationPeriodDates.DateRelativeToCalculationPeriodDatesBuilder.() -> Unit) = orCreateDateRelativeToCalculationPeriodDates.apply(f)
fun FxFixingDate.FxFixingDateBuilder.dateRelativeToPaymentDates(f: DateRelativeToPaymentDates.DateRelativeToPaymentDatesBuilder.() -> Unit) = orCreateDateRelativeToPaymentDates.apply(f)
fun FxFixingDate.FxFixingDateBuilder.fxFixingDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateFxFixingDate.apply(f)

fun FxHaircutCurrency.FxHaircutCurrencyBuilder.fxDesignatedCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateFxDesignatedCurrency.apply(f)

fun FxInformationSource.FxInformationSourceBuilder.fixingTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateFixingTime.apply(f)


fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.fixingTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateFixingTime.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.fxSpotRateSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateFxSpotRateSource.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.initialValue(f: ReferenceWithMetaQuantity.ReferenceWithMetaQuantityBuilder.() -> Unit) = orCreateInitialValue.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.varyingNotionalCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateVaryingNotionalCurrency.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.varyingNotionalFixingDates(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateVaryingNotionalFixingDates.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.varyingNotionalInterimExchangePaymentDates(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateVaryingNotionalInterimExchangePaymentDates.apply(f)

fun FxRate.FxRateBuilder.quotedCurrencyPair(f: QuotedCurrencyPair.QuotedCurrencyPairBuilder.() -> Unit) = orCreateQuotedCurrencyPair.apply(f)

fun FxRateObservable.FxRateObservableBuilder.primaryFxSpotRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreatePrimaryFxSpotRateSource.apply(f)
fun FxRateObservable.FxRateObservableBuilder.quotedCurrencyPair(f: ReferenceWithMetaQuotedCurrencyPair.ReferenceWithMetaQuotedCurrencyPairBuilder.() -> Unit) = orCreateQuotedCurrencyPair.apply(f)
fun FxRateObservable.FxRateObservableBuilder.secondaryFxSpotRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateSecondaryFxSpotRateSource.apply(f)

fun FxRateSourceFixing.FxRateSourceFixingBuilder.fixingDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateFixingDate.apply(f)
fun FxRateSourceFixing.FxRateSourceFixingBuilder.settlementRateSource(f: FxSettlementRateSource.FxSettlementRateSourceBuilder.() -> Unit) = orCreateSettlementRateSource.apply(f)

fun FxSettlementRateSource.FxSettlementRateSourceBuilder.nonstandardSettlementRate(f: FxInformationSource.FxInformationSourceBuilder.() -> Unit) = orCreateNonstandardSettlementRate.apply(f)
fun FxSettlementRateSource.FxSettlementRateSourceBuilder.settlementRateOption(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSettlementRateOption.apply(f)

fun FxSpotRateSource.FxSpotRateSourceBuilder.primaryRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreatePrimaryRateSource.apply(f)
fun FxSpotRateSource.FxSpotRateSourceBuilder.secondaryRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateSecondaryRateSource.apply(f)

fun GeneralSimmElections.GeneralSimmElectionsBuilder.simmCalculationCurrency(f: SimmCalculationCurrency.SimmCalculationCurrencyBuilder.() -> Unit) = orCreateSimmCalculationCurrency.apply(f)
fun GeneralSimmElections.GeneralSimmElectionsBuilder.simmVersion(f: SimmVersion.SimmVersionBuilder.() -> Unit) = orCreateSimmVersion.apply(f)

fun GeneralTerms.GeneralTermsBuilder.additionalTerm(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addAdditionalTerm(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun GeneralTerms.GeneralTermsBuilder.additionalTerm(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateAdditionalTerm(index).apply(f)
fun GeneralTerms.GeneralTermsBuilder.basketReferenceInformation(f: BasketReferenceInformation.BasketReferenceInformationBuilder.() -> Unit) = orCreateBasketReferenceInformation.apply(f)
fun GeneralTerms.GeneralTermsBuilder.indexReferenceInformation(f: IndexReferenceInformation.IndexReferenceInformationBuilder.() -> Unit) = orCreateIndexReferenceInformation.apply(f)
fun GeneralTerms.GeneralTermsBuilder.referenceInformation(f: ReferenceInformation.ReferenceInformationBuilder.() -> Unit) = orCreateReferenceInformation.apply(f)

fun GracePeriodExtension.GracePeriodExtensionBuilder.gracePeriod(f: Offset.OffsetBuilder.() -> Unit) = orCreateGracePeriod.apply(f)

fun HoldingAndUsingPostedCollateral.HoldingAndUsingPostedCollateralBuilder.partyElection(f: HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder.() -> Unit) = addPartyElection(HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilderImpl().apply(f).build())
fun HoldingAndUsingPostedCollateral.HoldingAndUsingPostedCollateralBuilder.partyElection(index: Int, f: HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder.eligibilityToHoldCollateral(f: EligibilityToHoldCollateral.EligibilityToHoldCollateralBuilder.() -> Unit) = orCreateEligibilityToHoldCollateral.apply(f)


fun IdentifiedProduct.IdentifiedProductBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = orCreateProductIdentifier.apply(f)

fun Identifier.IdentifierBuilder.assignedIdentifier(f: AssignedIdentifier.AssignedIdentifierBuilder.() -> Unit) = addAssignedIdentifier(AssignedIdentifier.AssignedIdentifierBuilderImpl().apply(f).build())
fun Identifier.IdentifierBuilder.assignedIdentifier(index: Int, f: AssignedIdentifier.AssignedIdentifierBuilder.() -> Unit) = getOrCreateAssignedIdentifier(index).apply(f)
fun Identifier.IdentifierBuilder.issuer(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIssuer.apply(f)
fun Identifier.IdentifierBuilder.issuerReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateIssuerReference.apply(f)
fun Identifier.IdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun IncreaseInstruction.IncreaseInstructionBuilder.fee(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateFee.apply(f)
fun IncreaseInstruction.IncreaseInstructionBuilder.tradeLot(f: TradeLot.TradeLotBuilder.() -> Unit) = orCreateTradeLot.apply(f)
fun IncreaseInstruction.IncreaseInstructionBuilder.tradeState(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateTradeState.apply(f)

fun IncreasedTrade.IncreasedTradeBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = addQuantity(Quantity.QuantityBuilderImpl().apply(f).build())
fun IncreasedTrade.IncreasedTradeBuilder.quantity(index: Int, f: Quantity.QuantityBuilder.() -> Unit) = getOrCreateQuantity(index).apply(f)
fun IncreasedTrade.IncreasedTradeBuilder.tradeState(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateTradeState.apply(f)

fun IndependentAmount.IndependentAmountBuilder.paymentDetail(f: PaymentDetail.PaymentDetailBuilder.() -> Unit) = addPaymentDetail(PaymentDetail.PaymentDetailBuilderImpl().apply(f).build())
fun IndependentAmount.IndependentAmountBuilder.paymentDetail(index: Int, f: PaymentDetail.PaymentDetailBuilder.() -> Unit) = getOrCreatePaymentDetail(index).apply(f)



fun IndexReferenceInformation.IndexReferenceInformationBuilder.excludedReferenceEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addExcludedReferenceEntity(LegalEntity.LegalEntityBuilderImpl().apply(f).build())
fun IndexReferenceInformation.IndexReferenceInformationBuilder.excludedReferenceEntity(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateExcludedReferenceEntity(index).apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexAnnexSource(f: FieldWithMetaIndexAnnexSourceEnum.FieldWithMetaIndexAnnexSourceEnumBuilder.() -> Unit) = orCreateIndexAnnexSource.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addIndexId(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateIndexId(index).apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexName(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIndexName.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.settledEntityMatrix(f: SettledEntityMatrix.SettledEntityMatrixBuilder.() -> Unit) = orCreateSettledEntityMatrix.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.tranche(f: Tranche.TrancheBuilder.() -> Unit) = orCreateTranche.apply(f)

fun IndexTransitionInstruction.IndexTransitionInstructionBuilder.cashTransfer(f: Transfer.TransferBuilder.() -> Unit) = orCreateCashTransfer.apply(f)
fun IndexTransitionInstruction.IndexTransitionInstructionBuilder.priceQuantity(f: PriceQuantity.PriceQuantityBuilder.() -> Unit) = addPriceQuantity(PriceQuantity.PriceQuantityBuilderImpl().apply(f).build())
fun IndexTransitionInstruction.IndexTransitionInstructionBuilder.priceQuantity(index: Int, f: PriceQuantity.PriceQuantityBuilder.() -> Unit) = getOrCreatePriceQuantity(index).apply(f)

fun Indx.IndxBuilder.nm(f: Nm.NmBuilder.() -> Unit) = orCreateNm.apply(f)

fun IneligibleCreditSupport.IneligibleCreditSupportBuilder.specifiedParty(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addSpecifiedParty(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilderImpl().apply(f).build())
fun IneligibleCreditSupport.IneligibleCreditSupportBuilder.specifiedParty(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreateSpecifiedParty(index).apply(f)

fun InflationRateSpecification.InflationRateSpecificationBuilder.indexSource(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIndexSource.apply(f)
fun InflationRateSpecification.InflationRateSpecificationBuilder.inflationLag(f: Offset.OffsetBuilder.() -> Unit) = orCreateInflationLag.apply(f)
fun InflationRateSpecification.InflationRateSpecificationBuilder.interpolationMethod(f: FieldWithMetaInterpolationMethodEnum.FieldWithMetaInterpolationMethodEnumBuilder.() -> Unit) = orCreateInterpolationMethod.apply(f)
fun InflationRateSpecification.InflationRateSpecificationBuilder.mainPublication(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMainPublication.apply(f)

fun InformationSource.InformationSourceBuilder.sourcePage(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSourcePage.apply(f)
fun InformationSource.InformationSourceBuilder.sourceProvider(f: FieldWithMetaInformationProviderEnum.FieldWithMetaInformationProviderEnumBuilder.() -> Unit) = orCreateSourceProvider.apply(f)

fun InitialFixingDate.InitialFixingDateBuilder.relativeDateOffset(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateRelativeDateOffset.apply(f)

fun InitialMargin.InitialMarginBuilder.margin(f: InitialMarginCalculation.InitialMarginCalculationBuilder.() -> Unit) = addMargin(InitialMarginCalculation.InitialMarginCalculationBuilderImpl().apply(f).build())
fun InitialMargin.InitialMarginBuilder.margin(index: Int, f: InitialMarginCalculation.InitialMarginCalculationBuilder.() -> Unit) = getOrCreateMargin(index).apply(f)
fun InitialMargin.InitialMarginBuilder.marginThreshold(f: Money.MoneyBuilder.() -> Unit) = orCreateMarginThreshold.apply(f)
fun InitialMargin.InitialMarginBuilder.minimumTransferAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumTransferAmount.apply(f)


fun Instruction.InstructionBuilder.allocation(f: AllocationInstruction.AllocationInstructionBuilder.() -> Unit) = orCreateAllocation.apply(f)
fun Instruction.InstructionBuilder.clearing(f: ClearingInstruction.ClearingInstructionBuilder.() -> Unit) = orCreateClearing.apply(f)
fun Instruction.InstructionBuilder.contractFormation(f: ContractFormationInstruction.ContractFormationInstructionBuilder.() -> Unit) = orCreateContractFormation.apply(f)
fun Instruction.InstructionBuilder.decrease(f: DecreaseInstruction.DecreaseInstructionBuilder.() -> Unit) = orCreateDecrease.apply(f)
fun Instruction.InstructionBuilder.execution(f: ExecutionInstruction.ExecutionInstructionBuilder.() -> Unit) = orCreateExecution.apply(f)
fun Instruction.InstructionBuilder.exercise(f: ExerciseInstruction.ExerciseInstructionBuilder.() -> Unit) = orCreateExercise.apply(f)
fun Instruction.InstructionBuilder.increase(f: IncreaseInstruction.IncreaseInstructionBuilder.() -> Unit) = orCreateIncrease.apply(f)
fun Instruction.InstructionBuilder.indexTransition(f: IndexTransitionInstruction.IndexTransitionInstructionBuilder.() -> Unit) = orCreateIndexTransition.apply(f)
fun Instruction.InstructionBuilder.reset(f: ResetInstruction.ResetInstructionBuilder.() -> Unit) = orCreateReset.apply(f)
fun Instruction.InstructionBuilder.transfer(f: TransferInstruction.TransferInstructionBuilder.() -> Unit) = orCreateTransfer.apply(f)

fun InterestAdjustment.InterestAdjustmentBuilder.periodicity(f: InterestAdjustmentPeriodicity.InterestAdjustmentPeriodicityBuilder.() -> Unit) = orCreatePeriodicity.apply(f)


fun InterestAmount.InterestAmountBuilder.deliveryAmount(f: DeliveryAmount.DeliveryAmountBuilder.() -> Unit) = orCreateDeliveryAmount.apply(f)
fun InterestAmount.InterestAmountBuilder.returnAmount(f: ReturnAmount.ReturnAmountBuilder.() -> Unit) = orCreateReturnAmount.apply(f)

fun InterestRateCurve.InterestRateCurveBuilder.floatingRateIndex(f: FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.() -> Unit) = orCreateFloatingRateIndex.apply(f)
fun InterestRateCurve.InterestRateCurveBuilder.tenor(f: Period.PeriodBuilder.() -> Unit) = orCreateTenor.apply(f)

fun InterestRatePayout.InterestRatePayoutBuilder.bondReference(f: BondReference.BondReferenceBuilder.() -> Unit) = orCreateBondReference.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.calculationPeriodDates(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDates.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.cashflowRepresentation(f: CashflowRepresentation.CashflowRepresentationBuilder.() -> Unit) = orCreateCashflowRepresentation.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.dayCountFraction(f: FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.() -> Unit) = orCreateDayCountFraction.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.discountingMethod(f: DiscountingMethod.DiscountingMethodBuilder.() -> Unit) = orCreateDiscountingMethod.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.paymentDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreatePaymentDate.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.paymentDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreatePaymentDates.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.principalExchanges(f: PrincipalExchanges.PrincipalExchangesBuilder.() -> Unit) = orCreatePrincipalExchanges.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.rateSpecification(f: RateSpecification.RateSpecificationBuilder.() -> Unit) = orCreateRateSpecification.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.resetDates(f: ResetDates.ResetDatesBuilder.() -> Unit) = orCreateResetDates.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.stubPeriod(f: StubPeriod.StubPeriodBuilder.() -> Unit) = orCreateStubPeriod.apply(f)

fun InterestShortFall.InterestShortFallBuilder.rateSource(f: FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.() -> Unit) = orCreateRateSource.apply(f)

fun InvstmtDcsnPrsn.InvstmtDcsnPrsnBuilder.prsn(f: Prsn.PrsnBuilder.() -> Unit) = orCreatePrsn.apply(f)

fun IssuerCriteria.IssuerCriteriaBuilder.issuerAgencyRating(f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = addIssuerAgencyRating(AgencyRatingCriteria.AgencyRatingCriteriaBuilderImpl().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerAgencyRating(index: Int, f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = getOrCreateIssuerAgencyRating(index).apply(f)
fun IssuerCriteria.IssuerCriteriaBuilder.issuerCountryOfOrigin(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addIssuerCountryOfOrigin(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerCountryOfOrigin(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateIssuerCountryOfOrigin(index).apply(f)
fun IssuerCriteria.IssuerCriteriaBuilder.issuerName(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addIssuerName(LegalEntity.LegalEntityBuilderImpl().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerName(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateIssuerName(index).apply(f)
fun IssuerCriteria.IssuerCriteriaBuilder.issuerType(f: CollateralIssuerType.CollateralIssuerTypeBuilder.() -> Unit) = addIssuerType(CollateralIssuerType.CollateralIssuerTypeBuilderImpl().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerType(index: Int, f: CollateralIssuerType.CollateralIssuerTypeBuilder.() -> Unit) = getOrCreateIssuerType(index).apply(f)
fun IssuerCriteria.IssuerCriteriaBuilder.sovereignAgencyRating(f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = addSovereignAgencyRating(AgencyRatingCriteria.AgencyRatingCriteriaBuilderImpl().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.sovereignAgencyRating(index: Int, f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = getOrCreateSovereignAgencyRating(index).apply(f)

fun IssuerTradeId.IssuerTradeIdBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun IssuerTradeId.IssuerTradeIdBuilder.issuer(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIssuer.apply(f)


fun JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.frenchLawAddendum(f: FrenchLawAddendum.FrenchLawAddendumBuilder.() -> Unit) = orCreateFrenchLawAddendum.apply(f)
fun JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.japaneseSecuritiesProvisions(f: JapaneseSecuritiesProvisions.JapaneseSecuritiesProvisionsBuilder.() -> Unit) = orCreateJapaneseSecuritiesProvisions.apply(f)

fun Knock.KnockBuilder.knockIn(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateKnockIn.apply(f)
fun Knock.KnockBuilder.knockOut(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateKnockOut.apply(f)

fun Lag.LagBuilder.firstObservationDateOffset(f: Offset.OffsetBuilder.() -> Unit) = orCreateFirstObservationDateOffset.apply(f)
fun Lag.LagBuilder.lagDuration(f: Offset.OffsetBuilder.() -> Unit) = orCreateLagDuration.apply(f)

fun LegalAgreement.LegalAgreementBuilder.agreementTerms(f: AgreementTerms.AgreementTermsBuilder.() -> Unit) = orCreateAgreementTerms.apply(f)
fun LegalAgreement.LegalAgreementBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun LegalAgreement.LegalAgreementBuilder.relatedAgreements(f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = addRelatedAgreements(RelatedAgreement.RelatedAgreementBuilderImpl().apply(f).build())
fun LegalAgreement.LegalAgreementBuilder.relatedAgreements(index: Int, f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = getOrCreateRelatedAgreements(index).apply(f)
fun LegalAgreement.LegalAgreementBuilder.umbrellaAgreement(f: UmbrellaAgreement.UmbrellaAgreementBuilder.() -> Unit) = orCreateUmbrellaAgreement.apply(f)

fun LegalAgreementBase.LegalAgreementBaseBuilder.agreementType(f: LegalAgreementType.LegalAgreementTypeBuilder.() -> Unit) = orCreateAgreementType.apply(f)
fun LegalAgreementBase.LegalAgreementBaseBuilder.contractualParty(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addContractualParty(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilderImpl().apply(f).build())
fun LegalAgreementBase.LegalAgreementBaseBuilder.contractualParty(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreateContractualParty(index).apply(f)
fun LegalAgreementBase.LegalAgreementBaseBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = addIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun LegalAgreementBase.LegalAgreementBaseBuilder.identifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply(f)
fun LegalAgreementBase.LegalAgreementBaseBuilder.otherParty(f: PartyRole.PartyRoleBuilder.() -> Unit) = addOtherParty(PartyRole.PartyRoleBuilderImpl().apply(f).build())
fun LegalAgreementBase.LegalAgreementBaseBuilder.otherParty(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreateOtherParty(index).apply(f)


fun LegalEntity.LegalEntityBuilder.entityId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addEntityId(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun LegalEntity.LegalEntityBuilder.entityId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateEntityId(index).apply(f)
fun LegalEntity.LegalEntityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun LegalEntity.LegalEntityBuilder.name(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateName.apply(f)

fun LimitApplicable.LimitApplicableBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun LimitApplicable.LimitApplicableBuilder.limitType(f: FieldWithMetaCreditLimitTypeEnum.FieldWithMetaCreditLimitTypeEnumBuilder.() -> Unit) = orCreateLimitType.apply(f)
fun LimitApplicable.LimitApplicableBuilder.utilization(f: CreditLimitUtilisation.CreditLimitUtilisationBuilder.() -> Unit) = orCreateUtilization.apply(f)
fun LimitApplicable.LimitApplicableBuilder.velocity(f: Velocity.VelocityBuilder.() -> Unit) = orCreateVelocity.apply(f)

fun LimitApplicableExtended.LimitApplicableExtendedBuilder.limitLevel(f: FieldWithMetaLimitLevelEnum.FieldWithMetaLimitLevelEnumBuilder.() -> Unit) = orCreateLimitLevel.apply(f)

fun Lineage.LineageBuilder.cashflowReference(f: ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.() -> Unit) = addCashflowReference(ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.cashflowReference(index: Int, f: ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.() -> Unit) = getOrCreateCashflowReference(index).apply(f)
fun Lineage.LineageBuilder.creditDefaultPayoutReference(f: ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder.() -> Unit) = addCreditDefaultPayoutReference(ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.creditDefaultPayoutReference(index: Int, f: ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder.() -> Unit) = getOrCreateCreditDefaultPayoutReference(index).apply(f)
fun Lineage.LineageBuilder.equityPayoutReference(f: ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.() -> Unit) = addEquityPayoutReference(ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.equityPayoutReference(index: Int, f: ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.() -> Unit) = getOrCreateEquityPayoutReference(index).apply(f)
fun Lineage.LineageBuilder.eventReference(f: ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.() -> Unit) = addEventReference(ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.eventReference(index: Int, f: ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.() -> Unit) = getOrCreateEventReference(index).apply(f)
fun Lineage.LineageBuilder.interestRatePayoutReference(f: ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.() -> Unit) = addInterestRatePayoutReference(ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.interestRatePayoutReference(index: Int, f: ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.() -> Unit) = getOrCreateInterestRatePayoutReference(index).apply(f)
fun Lineage.LineageBuilder.legalAgreement(f: ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder.() -> Unit) = addLegalAgreement(ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.legalAgreement(index: Int, f: ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder.() -> Unit) = getOrCreateLegalAgreement(index).apply(f)
fun Lineage.LineageBuilder.optionPayoutReference(f: ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder.() -> Unit) = addOptionPayoutReference(ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.optionPayoutReference(index: Int, f: ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder.() -> Unit) = getOrCreateOptionPayoutReference(index).apply(f)
fun Lineage.LineageBuilder.portfolioStateReference(f: ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder.() -> Unit) = addPortfolioStateReference(ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.portfolioStateReference(index: Int, f: ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder.() -> Unit) = getOrCreatePortfolioStateReference(index).apply(f)
fun Lineage.LineageBuilder.tradeReference(f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = addTradeReference(ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.tradeReference(index: Int, f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = getOrCreateTradeReference(index).apply(f)
fun Lineage.LineageBuilder.transferReference(f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = addTransferReference(ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilderImpl().apply(f).build())
fun Lineage.LineageBuilder.transferReference(index: Int, f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = getOrCreateTransferReference(index).apply(f)

fun ListingType.ListingTypeBuilder.exchange(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateExchange.apply(f)
fun ListingType.ListingTypeBuilder.index(f: Index.IndexBuilder.() -> Unit) = orCreateIndex.apply(f)
fun ListingType.ListingTypeBuilder.sector(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSector.apply(f)

fun Loan.LoanBuilder.borrower(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addBorrower(LegalEntity.LegalEntityBuilderImpl().apply(f).build())
fun Loan.LoanBuilder.borrower(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateBorrower(index).apply(f)
fun Loan.LoanBuilder.facilityType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateFacilityType.apply(f)
fun Loan.LoanBuilder.lien(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateLien.apply(f)
fun Loan.LoanBuilder.tranche(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateTranche.apply(f)


fun MakeWholeAmount.MakeWholeAmountBuilder.earlyCallDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateEarlyCallDate.apply(f)

fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.calculationAgent(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgent.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.cashSettlement(f: CashSettlementTerms.CashSettlementTermsBuilder.() -> Unit) = orCreateCashSettlement.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.mandatoryEarlyTerminationAdjustedDates(f: MandatoryEarlyTerminationAdjustedDates.MandatoryEarlyTerminationAdjustedDatesBuilder.() -> Unit) = orCreateMandatoryEarlyTerminationAdjustedDates.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.mandatoryEarlyTerminationDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateMandatoryEarlyTerminationDate.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun ManualExercise.ManualExerciseBuilder.exerciseNotice(f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = orCreateExerciseNotice.apply(f)


fun MasterAgreement.MasterAgreementBuilder.masterAgreementId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMasterAgreementId.apply(f)
fun MasterAgreement.MasterAgreementBuilder.masterAgreementType(f: FieldWithMetaMasterAgreementTypeEnum.FieldWithMetaMasterAgreementTypeEnumBuilder.() -> Unit) = orCreateMasterAgreementType.apply(f)
fun MasterAgreement.MasterAgreementBuilder.masterAgreementVersion(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMasterAgreementVersion.apply(f)

fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.addressForNotices(f: AddressForNotices.AddressForNoticesBuilder.() -> Unit) = orCreateAddressForNotices.apply(f)
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.automaticEarlyTermination(f: AutomaticEarlyTermination.AutomaticEarlyTerminationBuilder.() -> Unit) = orCreateAutomaticEarlyTermination.apply(f)
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.creditSupportDocument(f: CreditSupportDocument.CreditSupportDocumentBuilder.() -> Unit) = orCreateCreditSupportDocument.apply(f)
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.creditSupportProvider(f: CreditSupportProvider.CreditSupportProviderBuilder.() -> Unit) = orCreateCreditSupportProvider.apply(f)
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.specifiedEntities(f: SpecifiedEntities.SpecifiedEntitiesBuilder.() -> Unit) = addSpecifiedEntities(SpecifiedEntities.SpecifiedEntitiesBuilderImpl().apply(f).build())
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.specifiedEntities(index: Int, f: SpecifiedEntities.SpecifiedEntitiesBuilder.() -> Unit) = getOrCreateSpecifiedEntities(index).apply(f)
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.terminationCurrency(f: TerminationCurrency.TerminationCurrencyBuilder.() -> Unit) = orCreateTerminationCurrency.apply(f)

fun MasterConfirmation.MasterConfirmationBuilder.masterConfirmationAnnexType(f: FieldWithMetaMasterConfirmationAnnexTypeEnum.FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder.() -> Unit) = orCreateMasterConfirmationAnnexType.apply(f)
fun MasterConfirmation.MasterConfirmationBuilder.masterConfirmationType(f: FieldWithMetaMasterConfirmationTypeEnum.FieldWithMetaMasterConfirmationTypeEnumBuilder.() -> Unit) = orCreateMasterConfirmationType.apply(f)


fun MeasureBase.MeasureBaseBuilder.unitOfAmount(f: UnitType.UnitTypeBuilder.() -> Unit) = orCreateUnitOfAmount.apply(f)

fun MessageInformation.MessageInformationBuilder.copyTo(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addCopyTo(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun MessageInformation.MessageInformationBuilder.copyTo(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateCopyTo(index).apply(f)
fun MessageInformation.MessageInformationBuilder.messageId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMessageId.apply(f)
fun MessageInformation.MessageInformationBuilder.sentBy(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSentBy.apply(f)
fun MessageInformation.MessageInformationBuilder.sentTo(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addSentTo(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun MessageInformation.MessageInformationBuilder.sentTo(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateSentTo(index).apply(f)

fun MinimumTransferAmount.MinimumTransferAmountBuilder.partyElection(f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = addPartyElection(ElectiveAmountElection.ElectiveAmountElectionBuilderImpl().apply(f).build())
fun MinimumTransferAmount.MinimumTransferAmountBuilder.partyElection(index: Int, f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.effectiveDate(f: AmendmentEffectiveDate.AmendmentEffectiveDateBuilder.() -> Unit) = orCreateEffectiveDate.apply(f)
fun MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.partyElections(f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = addPartyElections(ElectiveAmountElection.ElectiveAmountElectionBuilderImpl().apply(f).build())
fun MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.partyElections(index: Int, f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = getOrCreatePartyElections(index).apply(f)

fun Money.MoneyBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun MultipleCreditNotations.MultipleCreditNotationsBuilder.creditNotation(f: FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder.() -> Unit) = addCreditNotation(FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilderImpl().apply(f).build())
fun MultipleCreditNotations.MultipleCreditNotationsBuilder.creditNotation(index: Int, f: FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder.() -> Unit) = getOrCreateCreditNotation(index).apply(f)

fun MultipleDebtTypes.MultipleDebtTypesBuilder.debtType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addDebtType(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun MultipleDebtTypes.MultipleDebtTypesBuilder.debtType(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateDebtType(index).apply(f)



fun NaturalPerson.NaturalPersonBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun NaturalPersonRole.NaturalPersonRoleBuilder.personReference(f: ReferenceWithMetaNaturalPerson.ReferenceWithMetaNaturalPersonBuilder.() -> Unit) = orCreatePersonReference.apply(f)
fun NaturalPersonRole.NaturalPersonRoleBuilder.role(f: FieldWithMetaNaturalPersonRoleEnum.FieldWithMetaNaturalPersonRoleEnumBuilder.() -> Unit) = orCreateRole.apply(f)

fun New.NewBuilder.addtlAttrbts(f: AddtlAttrbts.AddtlAttrbtsBuilder.() -> Unit) = orCreateAddtlAttrbts.apply(f)
fun New.NewBuilder.buyr(f: Buyr.BuyrBuilder.() -> Unit) = orCreateBuyr.apply(f)
fun New.NewBuilder.exctgPrsn(f: ExctgPrsn.ExctgPrsnBuilder.() -> Unit) = orCreateExctgPrsn.apply(f)
fun New.NewBuilder.finInstrm(f: FinInstrm.FinInstrmBuilder.() -> Unit) = orCreateFinInstrm.apply(f)
fun New.NewBuilder.invstmtDcsnPrsn(f: InvstmtDcsnPrsn.InvstmtDcsnPrsnBuilder.() -> Unit) = orCreateInvstmtDcsnPrsn.apply(f)
fun New.NewBuilder.ordrTrnsmssn(f: OrdrTrnsmssn.OrdrTrnsmssnBuilder.() -> Unit) = orCreateOrdrTrnsmssn.apply(f)
fun New.NewBuilder.sellr(f: Sellr.SellrBuilder.() -> Unit) = orCreateSellr.apply(f)
fun New.NewBuilder.tx(f: Tx.TxBuilder.() -> Unit) = orCreateTx.apply(f)

fun Nm.NmBuilder.refRate(f: RefRate.RefRateBuilder.() -> Unit) = orCreateRefRate.apply(f)
fun Nm.NmBuilder.term(f: Term.TermBuilder.() -> Unit) = orCreateTerm.apply(f)


fun NonNegativeQuantitySchedule.NonNegativeQuantityScheduleBuilder.initialQuantity(f: ReferenceWithMetaQuantity.ReferenceWithMetaQuantityBuilder.() -> Unit) = orCreateInitialQuantity.apply(f)
fun NonNegativeQuantitySchedule.NonNegativeQuantityScheduleBuilder.stepSchedule(f: NonNegativeStepSchedule.NonNegativeStepScheduleBuilder.() -> Unit) = orCreateStepSchedule.apply(f)

fun NonNegativeStep.NonNegativeStepBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun NonNegativeStepSchedule.NonNegativeStepScheduleBuilder.step(f: NonNegativeStep.NonNegativeStepBuilder.() -> Unit) = addStep(NonNegativeStep.NonNegativeStepBuilderImpl().apply(f).build())
fun NonNegativeStepSchedule.NonNegativeStepScheduleBuilder.step(index: Int, f: NonNegativeStep.NonNegativeStepBuilder.() -> Unit) = getOrCreateStep(index).apply(f)

fun NotDomesticCurrency.NotDomesticCurrencyBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun NotificationTime.NotificationTimeBuilder.partyElections(f: NotificationTimeElection.NotificationTimeElectionBuilder.() -> Unit) = addPartyElections(NotificationTimeElection.NotificationTimeElectionBuilderImpl().apply(f).build())
fun NotificationTime.NotificationTimeBuilder.partyElections(index: Int, f: NotificationTimeElection.NotificationTimeElectionBuilder.() -> Unit) = getOrCreatePartyElections(index).apply(f)

fun NotificationTimeElection.NotificationTimeElectionBuilder.notificationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateNotificationTime.apply(f)

fun Obligations.ObligationsBuilder.designatedPriority(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateDesignatedPriority.apply(f)
fun Obligations.ObligationsBuilder.notDomesticCurrency(f: NotDomesticCurrency.NotDomesticCurrencyBuilder.() -> Unit) = orCreateNotDomesticCurrency.apply(f)
fun Obligations.ObligationsBuilder.specifiedCurrency(f: SpecifiedCurrency.SpecifiedCurrencyBuilder.() -> Unit) = orCreateSpecifiedCurrency.apply(f)

fun Observable.ObservableBuilder.commodity(f: FieldWithMetaCommodity.FieldWithMetaCommodityBuilder.() -> Unit) = orCreateCommodity.apply(f)
fun Observable.ObservableBuilder.currencyPair(f: FieldWithMetaQuotedCurrencyPair.FieldWithMetaQuotedCurrencyPairBuilder.() -> Unit) = orCreateCurrencyPair.apply(f)
fun Observable.ObservableBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Observable.ObservableBuilder.productIdentifier(f: FieldWithMetaProductIdentifier.FieldWithMetaProductIdentifierBuilder.() -> Unit) = addProductIdentifier(FieldWithMetaProductIdentifier.FieldWithMetaProductIdentifierBuilderImpl().apply(f).build())
fun Observable.ObservableBuilder.productIdentifier(index: Int, f: FieldWithMetaProductIdentifier.FieldWithMetaProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply(f)
fun Observable.ObservableBuilder.rateOption(f: FieldWithMetaFloatingRateOption.FieldWithMetaFloatingRateOptionBuilder.() -> Unit) = orCreateRateOption.apply(f)

fun Observation.ObservationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Observation.ObservationBuilder.observationIdentifier(f: ObservationIdentifier.ObservationIdentifierBuilder.() -> Unit) = orCreateObservationIdentifier.apply(f)
fun Observation.ObservationBuilder.observedValue(f: Price.PriceBuilder.() -> Unit) = orCreateObservedValue.apply(f)

fun ObservationDates.ObservationDatesBuilder.observationSchedule(f: ObservationSchedule.ObservationScheduleBuilder.() -> Unit) = addObservationSchedule(ObservationSchedule.ObservationScheduleBuilderImpl().apply(f).build())
fun ObservationDates.ObservationDatesBuilder.observationSchedule(index: Int, f: ObservationSchedule.ObservationScheduleBuilder.() -> Unit) = getOrCreateObservationSchedule(index).apply(f)
fun ObservationDates.ObservationDatesBuilder.parametricSchedule(f: PeriodicDates.PeriodicDatesBuilder.() -> Unit) = orCreateParametricSchedule.apply(f)

fun ObservationIdentifier.ObservationIdentifierBuilder.determinationMethodology(f: DeterminationMethodology.DeterminationMethodologyBuilder.() -> Unit) = orCreateDeterminationMethodology.apply(f)
fun ObservationIdentifier.ObservationIdentifierBuilder.informationSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateInformationSource.apply(f)
fun ObservationIdentifier.ObservationIdentifierBuilder.observable(f: Observable.ObservableBuilder.() -> Unit) = orCreateObservable.apply(f)
fun ObservationIdentifier.ObservationIdentifierBuilder.observationTime(f: TimeZone.TimeZoneBuilder.() -> Unit) = orCreateObservationTime.apply(f)


fun ObservationPayout.ObservationPayoutBuilder.calculationPeriodDates(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = addCalculationPeriodDates(CalculationPeriodDates.CalculationPeriodDatesBuilderImpl().apply(f).build())
fun ObservationPayout.ObservationPayoutBuilder.calculationPeriodDates(index: Int, f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = getOrCreateCalculationPeriodDates(index).apply(f)
fun ObservationPayout.ObservationPayoutBuilder.fxFeature(f: FxFeature.FxFeatureBuilder.() -> Unit) = orCreateFxFeature.apply(f)
fun ObservationPayout.ObservationPayoutBuilder.paymentDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreatePaymentDates.apply(f)
fun ObservationPayout.ObservationPayoutBuilder.underlier(f: Product.ProductBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun ObservationSchedule.ObservationScheduleBuilder.date(f: AdjustableOrAdjustedDate.AdjustableOrAdjustedDateBuilder.() -> Unit) = orCreateDate.apply(f)

fun ObservationShiftCalculation.ObservationShiftCalculationBuilder.additionalBusinessDays(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateAdditionalBusinessDays.apply(f)

fun ObservationSource.ObservationSourceBuilder.curve(f: Curve.CurveBuilder.() -> Unit) = orCreateCurve.apply(f)
fun ObservationSource.ObservationSourceBuilder.informationSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateInformationSource.apply(f)




fun OptionExercise.OptionExerciseBuilder.exerciseProcedure(f: ExerciseProcedure.ExerciseProcedureBuilder.() -> Unit) = orCreateExerciseProcedure.apply(f)
fun OptionExercise.OptionExerciseBuilder.optionStyle(f: OptionStyle.OptionStyleBuilder.() -> Unit) = orCreateOptionStyle.apply(f)
fun OptionExercise.OptionExerciseBuilder.strike(f: OptionStrike.OptionStrikeBuilder.() -> Unit) = orCreateStrike.apply(f)

fun OptionFeature.OptionFeatureBuilder.averagingRateFeature(f: AveragingObservation.AveragingObservationBuilder.() -> Unit) = orCreateAveragingRateFeature.apply(f)
fun OptionFeature.OptionFeatureBuilder.barrier(f: Barrier.BarrierBuilder.() -> Unit) = orCreateBarrier.apply(f)
fun OptionFeature.OptionFeatureBuilder.fxFeature(f: FxFeature.FxFeatureBuilder.() -> Unit) = orCreateFxFeature.apply(f)
fun OptionFeature.OptionFeatureBuilder.knock(f: Knock.KnockBuilder.() -> Unit) = orCreateKnock.apply(f)
fun OptionFeature.OptionFeatureBuilder.passThrough(f: PassThrough.PassThroughBuilder.() -> Unit) = orCreatePassThrough.apply(f)
fun OptionFeature.OptionFeatureBuilder.strategyFeature(f: StrategyFeature.StrategyFeatureBuilder.() -> Unit) = orCreateStrategyFeature.apply(f)

fun OptionPayout.OptionPayoutBuilder.buyerSeller(f: BuyerSeller.BuyerSellerBuilder.() -> Unit) = orCreateBuyerSeller.apply(f)
fun OptionPayout.OptionPayoutBuilder.exerciseTerms(f: OptionExercise.OptionExerciseBuilder.() -> Unit) = orCreateExerciseTerms.apply(f)
fun OptionPayout.OptionPayoutBuilder.feature(f: OptionFeature.OptionFeatureBuilder.() -> Unit) = orCreateFeature.apply(f)
fun OptionPayout.OptionPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun OptionPayout.OptionPayoutBuilder.underlier(f: Product.ProductBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun OptionProvision.OptionProvisionBuilder.cancelableProvision(f: CancelableProvision.CancelableProvisionBuilder.() -> Unit) = orCreateCancelableProvision.apply(f)
fun OptionProvision.OptionProvisionBuilder.extendibleProvision(f: ExtendibleProvision.ExtendibleProvisionBuilder.() -> Unit) = orCreateExtendibleProvision.apply(f)

fun OptionStrike.OptionStrikeBuilder.averagingStrikeFeature(f: AveragingObservation.AveragingObservationBuilder.() -> Unit) = orCreateAveragingStrikeFeature.apply(f)
fun OptionStrike.OptionStrikeBuilder.referenceSwapCurve(f: ReferenceSwapCurve.ReferenceSwapCurveBuilder.() -> Unit) = orCreateReferenceSwapCurve.apply(f)
fun OptionStrike.OptionStrikeBuilder.strikePrice(f: Price.PriceBuilder.() -> Unit) = orCreateStrikePrice.apply(f)
fun OptionStrike.OptionStrikeBuilder.strikeReference(f: ReferenceWithMetaFixedRateSpecification.ReferenceWithMetaFixedRateSpecificationBuilder.() -> Unit) = orCreateStrikeReference.apply(f)

fun OptionStyle.OptionStyleBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun OptionStyle.OptionStyleBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun OptionStyle.OptionStyleBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)

fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.calculationAgent(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgent.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.cashSettlement(f: CashSettlementTerms.CashSettlementTermsBuilder.() -> Unit) = orCreateCashSettlement.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.exerciseNotice(f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = addExerciseNotice(ExerciseNotice.ExerciseNoticeBuilderImpl().apply(f).build())
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.exerciseNotice(index: Int, f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = getOrCreateExerciseNotice(index).apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.optionalEarlyTerminationAdjustedDates(f: OptionalEarlyTerminationAdjustedDates.OptionalEarlyTerminationAdjustedDatesBuilder.() -> Unit) = orCreateOptionalEarlyTerminationAdjustedDates.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.singlePartyOption(f: BuyerSeller.BuyerSellerBuilder.() -> Unit) = orCreateSinglePartyOption.apply(f)

fun OptionalEarlyTerminationAdjustedDates.OptionalEarlyTerminationAdjustedDatesBuilder.earlyTerminationEvent(f: EarlyTerminationEvent.EarlyTerminationEventBuilder.() -> Unit) = addEarlyTerminationEvent(EarlyTerminationEvent.EarlyTerminationEventBuilderImpl().apply(f).build())
fun OptionalEarlyTerminationAdjustedDates.OptionalEarlyTerminationAdjustedDatesBuilder.earlyTerminationEvent(index: Int, f: EarlyTerminationEvent.EarlyTerminationEventBuilder.() -> Unit) = getOrCreateEarlyTerminationEvent(index).apply(f)


fun OtherAgreement.OtherAgreementBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun OtherAgreement.OtherAgreementBuilder.otherAgreementType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateOtherAgreementType.apply(f)
fun OtherAgreement.OtherAgreementBuilder.version(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateVersion.apply(f)


fun OtherAgreements.OtherAgreementsBuilder.japaneseLawCsa(f: OtherAgreementTerms.OtherAgreementTermsBuilder.() -> Unit) = orCreateJapaneseLawCsa.apply(f)
fun OtherAgreements.OtherAgreementsBuilder.otherCsa(f: OtherAgreementTerms.OtherAgreementTermsBuilder.() -> Unit) = orCreateOtherCsa.apply(f)


fun Othr.OthrBuilder.derivInstrmAttrbts(f: DerivInstrmAttrbts.DerivInstrmAttrbtsBuilder.() -> Unit) = orCreateDerivInstrmAttrbts.apply(f)
fun Othr.OthrBuilder.finInstrmGnlAttrbts(f: FinInstrmGnlAttrbts.FinInstrmGnlAttrbtsBuilder.() -> Unit) = orCreateFinInstrmGnlAttrbts.apply(f)
fun Othr.OthrBuilder.schmeNm(f: SchmeNm.SchmeNmBuilder.() -> Unit) = orCreateSchmeNm.apply(f)


fun PackageInformation.PackageInformationBuilder.relatedParty(f: RelatedParty.RelatedPartyBuilder.() -> Unit) = addRelatedParty(RelatedParty.RelatedPartyBuilderImpl().apply(f).build())
fun PackageInformation.PackageInformationBuilder.relatedParty(index: Int, f: RelatedParty.RelatedPartyBuilder.() -> Unit) = getOrCreateRelatedParty(index).apply(f)

fun ParametricDates.ParametricDatesBuilder.lag(f: Lag.LagBuilder.() -> Unit) = orCreateLag.apply(f)

fun PartialExercise.PartialExerciseBuilder.notionaReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionaReference.apply(f)

fun Party.PartyBuilder.account(f: Account.AccountBuilder.() -> Unit) = orCreateAccount.apply(f)
fun Party.PartyBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Party.PartyBuilder.name(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateName.apply(f)
fun Party.PartyBuilder.partyId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addPartyId(FieldWithMetaString.FieldWithMetaStringBuilderImpl().apply(f).build())
fun Party.PartyBuilder.partyId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreatePartyId(index).apply(f)
fun Party.PartyBuilder.person(f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = addPerson(NaturalPerson.NaturalPersonBuilderImpl().apply(f).build())
fun Party.PartyBuilder.person(index: Int, f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = getOrCreatePerson(index).apply(f)

fun PartyAgreementIdentifier.PartyAgreementIdentifierBuilder.documentIdentifier(f: FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.() -> Unit) = addDocumentIdentifier(FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilderImpl().apply(f).build())
fun PartyAgreementIdentifier.PartyAgreementIdentifierBuilder.documentIdentifier(index: Int, f: FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.() -> Unit) = getOrCreateDocumentIdentifier(index).apply(f)
fun PartyAgreementIdentifier.PartyAgreementIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PartyAgreementIdentifier.PartyAgreementIdentifierBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)

fun PartyContactInformation.PartyContactInformationBuilder.businessUnit(f: BusinessUnit.BusinessUnitBuilder.() -> Unit) = addBusinessUnit(BusinessUnit.BusinessUnitBuilderImpl().apply(f).build())
fun PartyContactInformation.PartyContactInformationBuilder.businessUnit(index: Int, f: BusinessUnit.BusinessUnitBuilder.() -> Unit) = getOrCreateBusinessUnit(index).apply(f)
fun PartyContactInformation.PartyContactInformationBuilder.contactInformation(f: ContactInformation.ContactInformationBuilder.() -> Unit) = orCreateContactInformation.apply(f)
fun PartyContactInformation.PartyContactInformationBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)
fun PartyContactInformation.PartyContactInformationBuilder.person(f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = addPerson(NaturalPerson.NaturalPersonBuilderImpl().apply(f).build())
fun PartyContactInformation.PartyContactInformationBuilder.person(index: Int, f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = getOrCreatePerson(index).apply(f)

fun PartyContractInformation.PartyContractInformationBuilder.accountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateAccountReference.apply(f)
fun PartyContractInformation.PartyContractInformationBuilder.category(f: FieldWithMetaCategoryEnum.FieldWithMetaCategoryEnumBuilder.() -> Unit) = orCreateCategory.apply(f)
fun PartyContractInformation.PartyContractInformationBuilder.naturalPersonRole(f: NaturalPersonRole.NaturalPersonRoleBuilder.() -> Unit) = addNaturalPersonRole(NaturalPersonRole.NaturalPersonRoleBuilderImpl().apply(f).build())
fun PartyContractInformation.PartyContractInformationBuilder.naturalPersonRole(index: Int, f: NaturalPersonRole.NaturalPersonRoleBuilder.() -> Unit) = getOrCreateNaturalPersonRole(index).apply(f)
fun PartyContractInformation.PartyContractInformationBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)
fun PartyContractInformation.PartyContractInformationBuilder.relatedParty(f: RelatedParty.RelatedPartyBuilder.() -> Unit) = orCreateRelatedParty.apply(f)

fun PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.customisedWorkflow(f: CustomisedWorkflow.CustomisedWorkflowBuilder.() -> Unit) = addCustomisedWorkflow(CustomisedWorkflow.CustomisedWorkflowBuilderImpl().apply(f).build())
fun PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.customisedWorkflow(index: Int, f: CustomisedWorkflow.CustomisedWorkflowBuilder.() -> Unit) = getOrCreateCustomisedWorkflow(index).apply(f)
fun PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)


fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.payerAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreatePayerAccountReference.apply(f)
fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.payerPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePayerPartyReference.apply(f)
fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.receiverAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateReceiverAccountReference.apply(f)
fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.receiverPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateReceiverPartyReference.apply(f)

fun PartyRole.PartyRoleBuilder.ownershipPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateOwnershipPartyReference.apply(f)
fun PartyRole.PartyRoleBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)

fun PartyTerminationCurrencySelection.PartyTerminationCurrencySelectionBuilder.party(f: Party.PartyBuilder.() -> Unit) = orCreateParty.apply(f)

fun PassThrough.PassThroughBuilder.passThroughItem(f: PassThroughItem.PassThroughItemBuilder.() -> Unit) = addPassThroughItem(PassThroughItem.PassThroughItemBuilderImpl().apply(f).build())
fun PassThrough.PassThroughBuilder.passThroughItem(index: Int, f: PassThroughItem.PassThroughItemBuilder.() -> Unit) = getOrCreatePassThroughItem(index).apply(f)

fun PassThroughItem.PassThroughItemBuilder.payerReceiver(f: PayerReceiver.PayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)

fun PayerReceiver.PayerReceiverBuilder.payerPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePayerPartyReference.apply(f)
fun PayerReceiver.PayerReceiverBuilder.receiverPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateReceiverPartyReference.apply(f)

fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.calculationPeriod(f: CalculationPeriod.CalculationPeriodBuilder.() -> Unit) = addCalculationPeriod(CalculationPeriod.CalculationPeriodBuilderImpl().apply(f).build())
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.calculationPeriod(index: Int, f: CalculationPeriod.CalculationPeriodBuilder.() -> Unit) = getOrCreateCalculationPeriod(index).apply(f)
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.forecastPaymentAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateForecastPaymentAmount.apply(f)
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.presentValueAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePresentValueAmount.apply(f)

fun PaymentDateSchedule.PaymentDateScheduleBuilder.finalPaymentDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateFinalPaymentDate.apply(f)
fun PaymentDateSchedule.PaymentDateScheduleBuilder.interimPaymentDates(f: AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.() -> Unit) = addInterimPaymentDates(AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilderImpl().apply(f).build())
fun PaymentDateSchedule.PaymentDateScheduleBuilder.interimPaymentDates(index: Int, f: AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.() -> Unit) = getOrCreateInterimPaymentDates(index).apply(f)

fun PaymentDates.PaymentDatesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PaymentDates.PaymentDatesBuilder.paymentDateSchedule(f: PaymentDateSchedule.PaymentDateScheduleBuilder.() -> Unit) = orCreatePaymentDateSchedule.apply(f)
fun PaymentDates.PaymentDatesBuilder.paymentDatesAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreatePaymentDatesAdjustments.apply(f)
fun PaymentDates.PaymentDatesBuilder.paymentDaysOffset(f: Offset.OffsetBuilder.() -> Unit) = orCreatePaymentDaysOffset.apply(f)
fun PaymentDates.PaymentDatesBuilder.paymentFrequency(f: Frequency.FrequencyBuilder.() -> Unit) = orCreatePaymentFrequency.apply(f)

fun PaymentDetail.PaymentDetailBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PaymentDetail.PaymentDetailBuilder.paymentAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePaymentAmount.apply(f)
fun PaymentDetail.PaymentDetailBuilder.paymentDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreatePaymentDate.apply(f)
fun PaymentDetail.PaymentDetailBuilder.paymentRule(f: PaymentRule.PaymentRuleBuilder.() -> Unit) = orCreatePaymentRule.apply(f)

fun PaymentDiscounting.PaymentDiscountingBuilder.presentValueAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePresentValueAmount.apply(f)

fun PaymentRule.PaymentRuleBuilder.percentageRule(f: PercentageRule.PercentageRuleBuilder.() -> Unit) = orCreatePercentageRule.apply(f)

fun Payout.PayoutBuilder.cashflow(f: Cashflow.CashflowBuilder.() -> Unit) = addCashflow(Cashflow.CashflowBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.cashflow(index: Int, f: Cashflow.CashflowBuilder.() -> Unit) = getOrCreateCashflow(index).apply(f)
fun Payout.PayoutBuilder.commodityPayout(f: CommodityPayout.CommodityPayoutBuilder.() -> Unit) = addCommodityPayout(CommodityPayout.CommodityPayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.commodityPayout(index: Int, f: CommodityPayout.CommodityPayoutBuilder.() -> Unit) = getOrCreateCommodityPayout(index).apply(f)
fun Payout.PayoutBuilder.creditDefaultPayout(f: CreditDefaultPayout.CreditDefaultPayoutBuilder.() -> Unit) = orCreateCreditDefaultPayout.apply(f)
fun Payout.PayoutBuilder.equityPayout(f: EquityPayout.EquityPayoutBuilder.() -> Unit) = addEquityPayout(EquityPayout.EquityPayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.equityPayout(index: Int, f: EquityPayout.EquityPayoutBuilder.() -> Unit) = getOrCreateEquityPayout(index).apply(f)
fun Payout.PayoutBuilder.fixedForwardPayout(f: FixedForwardPayout.FixedForwardPayoutBuilder.() -> Unit) = addFixedForwardPayout(FixedForwardPayout.FixedForwardPayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.fixedForwardPayout(index: Int, f: FixedForwardPayout.FixedForwardPayoutBuilder.() -> Unit) = getOrCreateFixedForwardPayout(index).apply(f)
fun Payout.PayoutBuilder.forwardPayout(f: ForwardPayout.ForwardPayoutBuilder.() -> Unit) = addForwardPayout(ForwardPayout.ForwardPayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.forwardPayout(index: Int, f: ForwardPayout.ForwardPayoutBuilder.() -> Unit) = getOrCreateForwardPayout(index).apply(f)
fun Payout.PayoutBuilder.interestRatePayout(f: InterestRatePayout.InterestRatePayoutBuilder.() -> Unit) = addInterestRatePayout(InterestRatePayout.InterestRatePayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.interestRatePayout(index: Int, f: InterestRatePayout.InterestRatePayoutBuilder.() -> Unit) = getOrCreateInterestRatePayout(index).apply(f)
fun Payout.PayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Payout.PayoutBuilder.optionPayout(f: OptionPayout.OptionPayoutBuilder.() -> Unit) = addOptionPayout(OptionPayout.OptionPayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.optionPayout(index: Int, f: OptionPayout.OptionPayoutBuilder.() -> Unit) = getOrCreateOptionPayout(index).apply(f)
fun Payout.PayoutBuilder.securityFinancePayout(f: SecurityFinancePayout.SecurityFinancePayoutBuilder.() -> Unit) = addSecurityFinancePayout(SecurityFinancePayout.SecurityFinancePayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.securityFinancePayout(index: Int, f: SecurityFinancePayout.SecurityFinancePayoutBuilder.() -> Unit) = getOrCreateSecurityFinancePayout(index).apply(f)
fun Payout.PayoutBuilder.securityPayout(f: SecurityPayout.SecurityPayoutBuilder.() -> Unit) = addSecurityPayout(SecurityPayout.SecurityPayoutBuilderImpl().apply(f).build())
fun Payout.PayoutBuilder.securityPayout(index: Int, f: SecurityPayout.SecurityPayoutBuilder.() -> Unit) = getOrCreateSecurityPayout(index).apply(f)

fun PayoutBase.PayoutBaseBuilder.payerReceiver(f: PayerReceiver.PayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun PayoutBase.PayoutBaseBuilder.payoutQuantity(f: ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.() -> Unit) = orCreatePayoutQuantity.apply(f)
fun PayoutBase.PayoutBaseBuilder.settlementTerms(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateSettlementTerms.apply(f)

fun PercentageRule.PercentageRuleBuilder.notionalAmountReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionalAmountReference.apply(f)

fun Period.PeriodBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun PeriodBound.PeriodBoundBuilder.period(f: Period.PeriodBuilder.() -> Unit) = orCreatePeriod.apply(f)

fun PeriodRange.PeriodRangeBuilder.lowerBound(f: PeriodBound.PeriodBoundBuilder.() -> Unit) = orCreateLowerBound.apply(f)
fun PeriodRange.PeriodRangeBuilder.upperBound(f: PeriodBound.PeriodBoundBuilder.() -> Unit) = orCreateUpperBound.apply(f)

fun PeriodicDates.PeriodicDatesBuilder.endDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateEndDate.apply(f)
fun PeriodicDates.PeriodicDatesBuilder.periodDatesAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreatePeriodDatesAdjustments.apply(f)
fun PeriodicDates.PeriodicDatesBuilder.periodFrequency(f: CalculationPeriodFrequency.CalculationPeriodFrequencyBuilder.() -> Unit) = orCreatePeriodFrequency.apply(f)
fun PeriodicDates.PeriodicDatesBuilder.startDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateStartDate.apply(f)


fun PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.deliverableObligations(f: DeliverableObligations.DeliverableObligationsBuilder.() -> Unit) = orCreateDeliverableObligations.apply(f)
fun PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.physicalSettlementPeriod(f: PhysicalSettlementPeriod.PhysicalSettlementPeriodBuilder.() -> Unit) = orCreatePhysicalSettlementPeriod.apply(f)

fun Portfolio.PortfolioBuilder.aggregationParameters(f: AggregationParameters.AggregationParametersBuilder.() -> Unit) = orCreateAggregationParameters.apply(f)
fun Portfolio.PortfolioBuilder.portfolioState(f: PortfolioState.PortfolioStateBuilder.() -> Unit) = orCreatePortfolioState.apply(f)

fun PortfolioState.PortfolioStateBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun PortfolioState.PortfolioStateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PortfolioState.PortfolioStateBuilder.positions(f: Position.PositionBuilder.() -> Unit) = addPositions(Position.PositionBuilderImpl().apply(f).build())
fun PortfolioState.PortfolioStateBuilder.positions(index: Int, f: Position.PositionBuilder.() -> Unit) = getOrCreatePositions(index).apply(f)

fun Position.PositionBuilder.cashBalance(f: Money.MoneyBuilder.() -> Unit) = orCreateCashBalance.apply(f)
fun Position.PositionBuilder.product(f: Product.ProductBuilder.() -> Unit) = orCreateProduct.apply(f)
fun Position.PositionBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = orCreateQuantity.apply(f)
fun Position.PositionBuilder.tradeReference(f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = orCreateTradeReference.apply(f)

fun PostContractFormationState.PostContractFormationStateBuilder.creditLimitInformation(f: CreditLimitInformation.CreditLimitInformationBuilder.() -> Unit) = orCreateCreditLimitInformation.apply(f)
fun PostContractFormationState.PostContractFormationStateBuilder.tradeWarehouseWorkflow(f: TradeWarehouseWorkflow.TradeWarehouseWorkflowBuilder.() -> Unit) = orCreateTradeWarehouseWorkflow.apply(f)

fun PostedCreditSupportItem.PostedCreditSupportItemBuilder.cashOrSecurityValue(f: Money.MoneyBuilder.() -> Unit) = orCreateCashOrSecurityValue.apply(f)
fun PostedCreditSupportItem.PostedCreditSupportItemBuilder.disputedCashOrSecurityValue(f: Money.MoneyBuilder.() -> Unit) = orCreateDisputedCashOrSecurityValue.apply(f)

fun PostingObligations.PostingObligationsBuilder.partyElection(f: PostingObligationsElection.PostingObligationsElectionBuilder.() -> Unit) = addPartyElection(PostingObligationsElection.PostingObligationsElectionBuilderImpl().apply(f).build())
fun PostingObligations.PostingObligationsBuilder.partyElection(index: Int, f: PostingObligationsElection.PostingObligationsElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun PostingObligationsElection.PostingObligationsElectionBuilder.eligibleCollateral(f: EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.() -> Unit) = addEligibleCollateral(EligibleCollateralSchedule.EligibleCollateralScheduleBuilderImpl().apply(f).build())
fun PostingObligationsElection.PostingObligationsElectionBuilder.eligibleCollateral(index: Int, f: EligibleCollateralSchedule.EligibleCollateralScheduleBuilder.() -> Unit) = getOrCreateEligibleCollateral(index).apply(f)

fun PremiumExpression.PremiumExpressionBuilder.pricePerOption(f: Money.MoneyBuilder.() -> Unit) = orCreatePricePerOption.apply(f)

fun Pric.PricBuilder.pric(f: Pric.PricBuilder.() -> Unit) = orCreatePric.apply(f)

fun Price.PriceBuilder.perUnitOfAmount(f: UnitType.UnitTypeBuilder.() -> Unit) = orCreatePerUnitOfAmount.apply(f)

fun PriceQuantity.PriceQuantityBuilder.effectiveDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateEffectiveDate.apply(f)
fun PriceQuantity.PriceQuantityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PriceQuantity.PriceQuantityBuilder.observable(f: Observable.ObservableBuilder.() -> Unit) = orCreateObservable.apply(f)
fun PriceQuantity.PriceQuantityBuilder.price(f: FieldWithMetaPrice.FieldWithMetaPriceBuilder.() -> Unit) = addPrice(FieldWithMetaPrice.FieldWithMetaPriceBuilderImpl().apply(f).build())
fun PriceQuantity.PriceQuantityBuilder.price(index: Int, f: FieldWithMetaPrice.FieldWithMetaPriceBuilder.() -> Unit) = getOrCreatePrice(index).apply(f)
fun PriceQuantity.PriceQuantityBuilder.quantity(f: FieldWithMetaQuantity.FieldWithMetaQuantityBuilder.() -> Unit) = addQuantity(FieldWithMetaQuantity.FieldWithMetaQuantityBuilderImpl().apply(f).build())
fun PriceQuantity.PriceQuantityBuilder.quantity(index: Int, f: FieldWithMetaQuantity.FieldWithMetaQuantityBuilder.() -> Unit) = getOrCreateQuantity(index).apply(f)

fun PriceReturnTerms.PriceReturnTermsBuilder.valuationPriceFinal(f: EquityValuation.EquityValuationBuilder.() -> Unit) = orCreateValuationPriceFinal.apply(f)
fun PriceReturnTerms.PriceReturnTermsBuilder.valuationPriceInterim(f: EquityValuation.EquityValuationBuilder.() -> Unit) = orCreateValuationPriceInterim.apply(f)

fun PriceSource.PriceSourceBuilder.pricePublisher(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreatePricePublisher.apply(f)

fun PriceSourceDisruption.PriceSourceDisruptionBuilder.fallbackReferencePrice(f: FallbackReferencePrice.FallbackReferencePriceBuilder.() -> Unit) = orCreateFallbackReferencePrice.apply(f)

fun PricingDates.PricingDatesBuilder.parametricDates(f: ParametricDates.ParametricDatesBuilder.() -> Unit) = orCreateParametricDates.apply(f)
fun PricingDates.PricingDatesBuilder.specifiedDates(f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = addSpecifiedDates(AdjustableDates.AdjustableDatesBuilderImpl().apply(f).build())
fun PricingDates.PricingDatesBuilder.specifiedDates(index: Int, f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = getOrCreateSpecifiedDates(index).apply(f)

fun PrimitiveEvent.PrimitiveEventBuilder.contractFormation(f: ContractFormationPrimitive.ContractFormationPrimitiveBuilder.() -> Unit) = orCreateContractFormation.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.execution(f: ExecutionPrimitive.ExecutionPrimitiveBuilder.() -> Unit) = orCreateExecution.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.quantityChange(f: QuantityChangePrimitive.QuantityChangePrimitiveBuilder.() -> Unit) = orCreateQuantityChange.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.reset(f: ResetPrimitive.ResetPrimitiveBuilder.() -> Unit) = orCreateReset.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.split(f: SplitPrimitive.SplitPrimitiveBuilder.() -> Unit) = orCreateSplit.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.termsChange(f: TermsChangePrimitive.TermsChangePrimitiveBuilder.() -> Unit) = orCreateTermsChange.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.transfer(f: TransferPrimitive.TransferPrimitiveBuilder.() -> Unit) = orCreateTransfer.apply(f)

fun PrincipalExchange.PrincipalExchangeBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PrincipalExchange.PrincipalExchangeBuilder.presentValuePrincipalExchangeAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePresentValuePrincipalExchangeAmount.apply(f)

fun PrincipalExchanges.PrincipalExchangesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ProcessAgent.ProcessAgentBuilder.partyElection(f: ProcessAgentElection.ProcessAgentElectionBuilder.() -> Unit) = addPartyElection(ProcessAgentElection.ProcessAgentElectionBuilderImpl().apply(f).build())
fun ProcessAgent.ProcessAgentBuilder.partyElection(index: Int, f: ProcessAgentElection.ProcessAgentElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun ProcessAgentElection.ProcessAgentElectionBuilder.processAgent(f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = orCreateProcessAgent.apply(f)

fun Product.ProductBuilder.commodity(f: ReferenceWithMetaCommodity.ReferenceWithMetaCommodityBuilder.() -> Unit) = orCreateCommodity.apply(f)
fun Product.ProductBuilder.contractualProduct(f: ContractualProduct.ContractualProductBuilder.() -> Unit) = orCreateContractualProduct.apply(f)
fun Product.ProductBuilder.foreignExchange(f: ForeignExchange.ForeignExchangeBuilder.() -> Unit) = orCreateForeignExchange.apply(f)
fun Product.ProductBuilder.index(f: Index.IndexBuilder.() -> Unit) = orCreateIndex.apply(f)
fun Product.ProductBuilder.loan(f: Loan.LoanBuilder.() -> Unit) = orCreateLoan.apply(f)
fun Product.ProductBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Product.ProductBuilder.security(f: Security.SecurityBuilder.() -> Unit) = orCreateSecurity.apply(f)

fun ProductBase.ProductBaseBuilder.productIdentifier(f: ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilderImpl().apply(f).build())
fun ProductBase.ProductBaseBuilder.productIdentifier(index: Int, f: ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply(f)

fun ProductIdentification.ProductIdentificationBuilder.externalProductType(f: ExternalProductType.ExternalProductTypeBuilder.() -> Unit) = addExternalProductType(ExternalProductType.ExternalProductTypeBuilderImpl().apply(f).build())
fun ProductIdentification.ProductIdentificationBuilder.externalProductType(index: Int, f: ExternalProductType.ExternalProductTypeBuilder.() -> Unit) = getOrCreateExternalProductType(index).apply(f)
fun ProductIdentification.ProductIdentificationBuilder.primaryAssetData(f: FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.() -> Unit) = orCreatePrimaryAssetData.apply(f)
fun ProductIdentification.ProductIdentificationBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ProductIdentifier.ProductIdentifierBuilderImpl().apply(f).build())
fun ProductIdentification.ProductIdentificationBuilder.productIdentifier(index: Int, f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply(f)
fun ProductIdentification.ProductIdentificationBuilder.secondaryAssetData(f: FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.() -> Unit) = addSecondaryAssetData(FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilderImpl().apply(f).build())
fun ProductIdentification.ProductIdentificationBuilder.secondaryAssetData(index: Int, f: FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.() -> Unit) = getOrCreateSecondaryAssetData(index).apply(f)

fun ProductIdentifier.ProductIdentifierBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun ProductIdentifier.ProductIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun ProtectionTerms.ProtectionTermsBuilder.creditEvents(f: CreditEvents.CreditEventsBuilder.() -> Unit) = orCreateCreditEvents.apply(f)
fun ProtectionTerms.ProtectionTermsBuilder.floatingAmountEvents(f: FloatingAmountEvents.FloatingAmountEventsBuilder.() -> Unit) = orCreateFloatingAmountEvents.apply(f)
fun ProtectionTerms.ProtectionTermsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ProtectionTerms.ProtectionTermsBuilder.obligations(f: Obligations.ObligationsBuilder.() -> Unit) = orCreateObligations.apply(f)

fun Prsn.PrsnBuilder.othr(f: Othr.OthrBuilder.() -> Unit) = orCreateOthr.apply(f)



fun Quantity.QuantityBuilder.multiplierUnit(f: UnitType.UnitTypeBuilder.() -> Unit) = orCreateMultiplierUnit.apply(f)

fun QuantityChangePrimitive.QuantityChangePrimitiveBuilder.after(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun QuantityChangePrimitive.QuantityChangePrimitiveBuilder.before(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateBefore.apply(f)


fun QuantityGroups.QuantityGroupsBuilder.quantityGroups(f: QuantityGroup.QuantityGroupBuilder.() -> Unit) = addQuantityGroups(QuantityGroup.QuantityGroupBuilderImpl().apply(f).build())
fun QuantityGroups.QuantityGroupsBuilder.quantityGroups(index: Int, f: QuantityGroup.QuantityGroupBuilder.() -> Unit) = getOrCreateQuantityGroups(index).apply(f)

fun QuantityMultiplier.QuantityMultiplierBuilder.fxLinkedNotionalSchedule(f: FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.() -> Unit) = orCreateFxLinkedNotionalSchedule.apply(f)

fun Quanto.QuantoBuilder.fixingTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateFixingTime.apply(f)
fun Quanto.QuantoBuilder.fxRate(f: FxRate.FxRateBuilder.() -> Unit) = addFxRate(FxRate.FxRateBuilderImpl().apply(f).build())
fun Quanto.QuantoBuilder.fxRate(index: Int, f: FxRate.FxRateBuilder.() -> Unit) = getOrCreateFxRate(index).apply(f)
fun Quanto.QuantoBuilder.fxSpotRateSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateFxSpotRateSource.apply(f)


fun QuotedCurrencyPair.QuotedCurrencyPairBuilder.currency1(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency1.apply(f)
fun QuotedCurrencyPair.QuotedCurrencyPairBuilder.currency2(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency2.apply(f)

fun RateObservation.RateObservationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun RateObservation.RateObservationBuilder.rateReference(f: ReferenceWithMetaRateObservation.ReferenceWithMetaRateObservationBuilder.() -> Unit) = orCreateRateReference.apply(f)

fun RateSchedule.RateScheduleBuilder.initialValue(f: ReferenceWithMetaPrice.ReferenceWithMetaPriceBuilder.() -> Unit) = orCreateInitialValue.apply(f)
fun RateSchedule.RateScheduleBuilder.step(f: Step.StepBuilder.() -> Unit) = addStep(Step.StepBuilderImpl().apply(f).build())
fun RateSchedule.RateScheduleBuilder.step(index: Int, f: Step.StepBuilder.() -> Unit) = getOrCreateStep(index).apply(f)

fun RateSpecification.RateSpecificationBuilder.fixedRate(f: FixedRateSpecification.FixedRateSpecificationBuilder.() -> Unit) = orCreateFixedRate.apply(f)
fun RateSpecification.RateSpecificationBuilder.floatingRate(f: FloatingRateSpecification.FloatingRateSpecificationBuilder.() -> Unit) = orCreateFloatingRate.apply(f)
fun RateSpecification.RateSpecificationBuilder.inflationRate(f: InflationRateSpecification.InflationRateSpecificationBuilder.() -> Unit) = orCreateInflationRate.apply(f)

fun ReallocationInstruction.ReallocationInstructionBuilder.breakdowns(f: AllocationBreakdown.AllocationBreakdownBuilder.() -> Unit) = addBreakdowns(AllocationBreakdown.AllocationBreakdownBuilderImpl().apply(f).build())
fun ReallocationInstruction.ReallocationInstructionBuilder.breakdowns(index: Int, f: AllocationBreakdown.AllocationBreakdownBuilder.() -> Unit) = getOrCreateBreakdowns(index).apply(f)
fun ReallocationInstruction.ReallocationInstructionBuilder.decrease(f: DecreasedTrade.DecreasedTradeBuilder.() -> Unit) = addDecrease(DecreasedTrade.DecreasedTradeBuilderImpl().apply(f).build())
fun ReallocationInstruction.ReallocationInstructionBuilder.decrease(index: Int, f: DecreasedTrade.DecreasedTradeBuilder.() -> Unit) = getOrCreateDecrease(index).apply(f)
fun ReallocationInstruction.ReallocationInstructionBuilder.increase(f: IncreasedTrade.IncreasedTradeBuilder.() -> Unit) = addIncrease(IncreasedTrade.IncreasedTradeBuilderImpl().apply(f).build())
fun ReallocationInstruction.ReallocationInstructionBuilder.increase(index: Int, f: IncreasedTrade.IncreasedTradeBuilder.() -> Unit) = getOrCreateIncrease(index).apply(f)

fun RecalculationOfValue.RecalculationOfValueBuilder.partyElection(f: RecalculationOfValueElection.RecalculationOfValueElectionBuilder.() -> Unit) = addPartyElection(RecalculationOfValueElection.RecalculationOfValueElectionBuilderImpl().apply(f).build())
fun RecalculationOfValue.RecalculationOfValueBuilder.partyElection(index: Int, f: RecalculationOfValueElection.RecalculationOfValueElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)



fun ReferenceBank.ReferenceBankBuilder.referenceBankId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateReferenceBankId.apply(f)

fun ReferenceBanks.ReferenceBanksBuilder.referenceBank(f: ReferenceBank.ReferenceBankBuilder.() -> Unit) = addReferenceBank(ReferenceBank.ReferenceBankBuilderImpl().apply(f).build())
fun ReferenceBanks.ReferenceBanksBuilder.referenceBank(index: Int, f: ReferenceBank.ReferenceBankBuilder.() -> Unit) = getOrCreateReferenceBank(index).apply(f)

fun ReferenceInformation.ReferenceInformationBuilder.referenceEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateReferenceEntity.apply(f)
fun ReferenceInformation.ReferenceInformationBuilder.referenceObligation(f: ReferenceObligation.ReferenceObligationBuilder.() -> Unit) = addReferenceObligation(ReferenceObligation.ReferenceObligationBuilderImpl().apply(f).build())
fun ReferenceInformation.ReferenceInformationBuilder.referenceObligation(index: Int, f: ReferenceObligation.ReferenceObligationBuilder.() -> Unit) = getOrCreateReferenceObligation(index).apply(f)
fun ReferenceInformation.ReferenceInformationBuilder.referencePrice(f: Price.PriceBuilder.() -> Unit) = orCreateReferencePrice.apply(f)

fun ReferenceObligation.ReferenceObligationBuilder.guarantor(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateGuarantor.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.loan(f: Loan.LoanBuilder.() -> Unit) = orCreateLoan.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.primaryObligor(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreatePrimaryObligor.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.primaryObligorReference(f: ReferenceWithMetaLegalEntity.ReferenceWithMetaLegalEntityBuilder.() -> Unit) = orCreatePrimaryObligorReference.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.security(f: Security.SecurityBuilder.() -> Unit) = orCreateSecurity.apply(f)

fun ReferencePair.ReferencePairBuilder.entityType(f: FieldWithMetaEntityTypeEnum.FieldWithMetaEntityTypeEnumBuilder.() -> Unit) = orCreateEntityType.apply(f)
fun ReferencePair.ReferencePairBuilder.referenceEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateReferenceEntity.apply(f)
fun ReferencePair.ReferencePairBuilder.referenceObligation(f: ReferenceObligation.ReferenceObligationBuilder.() -> Unit) = orCreateReferenceObligation.apply(f)

fun ReferencePool.ReferencePoolBuilder.referencePoolItem(f: ReferencePoolItem.ReferencePoolItemBuilder.() -> Unit) = addReferencePoolItem(ReferencePoolItem.ReferencePoolItemBuilderImpl().apply(f).build())
fun ReferencePool.ReferencePoolBuilder.referencePoolItem(index: Int, f: ReferencePoolItem.ReferencePoolItemBuilder.() -> Unit) = getOrCreateReferencePoolItem(index).apply(f)

fun ReferencePoolItem.ReferencePoolItemBuilder.cashSettlementTermsReference(f: ReferenceWithMetaCashSettlementTerms.ReferenceWithMetaCashSettlementTermsBuilder.() -> Unit) = orCreateCashSettlementTermsReference.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.constituentWeight(f: ConstituentWeight.ConstituentWeightBuilder.() -> Unit) = orCreateConstituentWeight.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.physicalSettlementTermsReference(f: ReferenceWithMetaPhysicalSettlementTerms.ReferenceWithMetaPhysicalSettlementTermsBuilder.() -> Unit) = orCreatePhysicalSettlementTermsReference.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.protectionTermsReference(f: ReferenceWithMetaProtectionTerms.ReferenceWithMetaProtectionTermsBuilder.() -> Unit) = orCreateProtectionTermsReference.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.referencePair(f: ReferencePair.ReferencePairBuilder.() -> Unit) = orCreateReferencePair.apply(f)

fun ReferenceSwapCurve.ReferenceSwapCurveBuilder.makeWholeAmount(f: MakeWholeAmount.MakeWholeAmountBuilder.() -> Unit) = orCreateMakeWholeAmount.apply(f)
fun ReferenceSwapCurve.ReferenceSwapCurveBuilder.swapUnwindValue(f: SwapCurveValuation.SwapCurveValuationBuilder.() -> Unit) = orCreateSwapUnwindValue.apply(f)

fun Regime.RegimeBuilder.applicableRegime(f: ApplicableRegime.ApplicableRegimeBuilder.() -> Unit) = addApplicableRegime(ApplicableRegime.ApplicableRegimeBuilderImpl().apply(f).build())
fun Regime.RegimeBuilder.applicableRegime(index: Int, f: ApplicableRegime.ApplicableRegimeBuilder.() -> Unit) = getOrCreateApplicableRegime(index).apply(f)

fun RegimeTerms.RegimeTermsBuilder.retrospectiveEffect(f: RetrospectiveEffect.RetrospectiveEffectBuilder.() -> Unit) = orCreateRetrospectiveEffect.apply(f)
fun RegimeTerms.RegimeTermsBuilder.simmException(f: SimmException.SimmExceptionBuilder.() -> Unit) = orCreateSimmException.apply(f)


fun RelatedAgreement.RelatedAgreementBuilder.documentationIdentification(f: DocumentationIdentification.DocumentationIdentificationBuilder.() -> Unit) = orCreateDocumentationIdentification.apply(f)
fun RelatedAgreement.RelatedAgreementBuilder.legalAgreement(f: LegalAgreement.LegalAgreementBuilder.() -> Unit) = orCreateLegalAgreement.apply(f)

fun RelatedParty.RelatedPartyBuilder.accountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateAccountReference.apply(f)
fun RelatedParty.RelatedPartyBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)

fun RelativeDateOffset.RelativeDateOffsetBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)
fun RelativeDateOffset.RelativeDateOffsetBuilder.businessCentersReference(f: ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.() -> Unit) = orCreateBusinessCentersReference.apply(f)
fun RelativeDateOffset.RelativeDateOffsetBuilder.dateRelativeTo(f: BasicReferenceWithMetaDate.BasicReferenceWithMetaDateBuilder.() -> Unit) = orCreateDateRelativeTo.apply(f)

fun RelativeDates.RelativeDatesBuilder.scheduleBounds(f: DateRange.DateRangeBuilder.() -> Unit) = orCreateScheduleBounds.apply(f)

fun RelativePrice.RelativePriceBuilder.bondEquityModel(f: BondEquityModel.BondEquityModelBuilder.() -> Unit) = addBondEquityModel(BondEquityModel.BondEquityModelBuilderImpl().apply(f).build())
fun RelativePrice.RelativePriceBuilder.bondEquityModel(index: Int, f: BondEquityModel.BondEquityModelBuilder.() -> Unit) = getOrCreateBondEquityModel(index).apply(f)


fun Reset.ResetBuilder.aggregationMethodology(f: AggregationMethod.AggregationMethodBuilder.() -> Unit) = orCreateAggregationMethodology.apply(f)
fun Reset.ResetBuilder.observations(f: ReferenceWithMetaObservation.ReferenceWithMetaObservationBuilder.() -> Unit) = addObservations(ReferenceWithMetaObservation.ReferenceWithMetaObservationBuilderImpl().apply(f).build())
fun Reset.ResetBuilder.observations(index: Int, f: ReferenceWithMetaObservation.ReferenceWithMetaObservationBuilder.() -> Unit) = getOrCreateObservations(index).apply(f)
fun Reset.ResetBuilder.resetValue(f: Price.PriceBuilder.() -> Unit) = orCreateResetValue.apply(f)

fun ResetDates.ResetDatesBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDatesReference.apply(f)
fun ResetDates.ResetDatesBuilder.finalFixingDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateFinalFixingDate.apply(f)
fun ResetDates.ResetDatesBuilder.fixingDates(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateFixingDates.apply(f)
fun ResetDates.ResetDatesBuilder.initialFixingDate(f: InitialFixingDate.InitialFixingDateBuilder.() -> Unit) = orCreateInitialFixingDate.apply(f)
fun ResetDates.ResetDatesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ResetDates.ResetDatesBuilder.rateCutOffDaysOffset(f: Offset.OffsetBuilder.() -> Unit) = orCreateRateCutOffDaysOffset.apply(f)
fun ResetDates.ResetDatesBuilder.resetDatesAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateResetDatesAdjustments.apply(f)
fun ResetDates.ResetDatesBuilder.resetFrequency(f: ResetFrequency.ResetFrequencyBuilder.() -> Unit) = orCreateResetFrequency.apply(f)


fun ResetInstruction.ResetInstructionBuilder.payout(f: ReferenceWithMetaPayout.ReferenceWithMetaPayoutBuilder.() -> Unit) = orCreatePayout.apply(f)

fun ResetPrimitive.ResetPrimitiveBuilder.after(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun ResetPrimitive.ResetPrimitiveBuilder.before(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateBefore.apply(f)

fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.futureValueNotional(f: FutureValueAmount.FutureValueAmountBuilder.() -> Unit) = orCreateFutureValueNotional.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.quantityMultiplier(f: QuantityMultiplier.QuantityMultiplierBuilder.() -> Unit) = orCreateQuantityMultiplier.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.quantityReference(f: ReferenceWithMetaResolvablePayoutQuantity.ReferenceWithMetaResolvablePayoutQuantityBuilder.() -> Unit) = orCreateQuantityReference.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.quantitySchedule(f: NonNegativeQuantitySchedule.NonNegativeQuantityScheduleBuilder.() -> Unit) = orCreateQuantitySchedule.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.resolvedQuantity(f: ReferenceWithMetaQuantity.ReferenceWithMetaQuantityBuilder.() -> Unit) = orCreateResolvedQuantity.apply(f)

fun Resource.ResourceBuilder.language(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateLanguage.apply(f)
fun Resource.ResourceBuilder.length(f: ResourceLength.ResourceLengthBuilder.() -> Unit) = orCreateLength.apply(f)
fun Resource.ResourceBuilder.mimeType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMimeType.apply(f)
fun Resource.ResourceBuilder.resourceId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateResourceId.apply(f)
fun Resource.ResourceBuilder.resourceType(f: FieldWithMetaResourceTypeEnum.FieldWithMetaResourceTypeEnumBuilder.() -> Unit) = orCreateResourceType.apply(f)


fun Restructuring.RestructuringBuilder.restructuringType(f: FieldWithMetaRestructuringEnum.FieldWithMetaRestructuringEnumBuilder.() -> Unit) = orCreateRestructuringType.apply(f)



fun ReturnInstruction.ReturnInstructionBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = addQuantity(Quantity.QuantityBuilderImpl().apply(f).build())
fun ReturnInstruction.ReturnInstructionBuilder.quantity(index: Int, f: Quantity.QuantityBuilder.() -> Unit) = getOrCreateQuantity(index).apply(f)

fun RightsEvents.RightsEventsBuilder.additionalRightsEvent(f: AdditionalRightsEvent.AdditionalRightsEventBuilder.() -> Unit) = orCreateAdditionalRightsEvent.apply(f)
fun RightsEvents.RightsEventsBuilder.controlAgreementNecEvent(f: ControlAgreementNecEvent.ControlAgreementNecEventBuilder.() -> Unit) = orCreateControlAgreementNecEvent.apply(f)
fun RightsEvents.RightsEventsBuilder.securityProviderRightsEvent(f: SecurityProviderRightsEvent.SecurityProviderRightsEventBuilder.() -> Unit) = orCreateSecurityProviderRightsEvent.apply(f)
fun RightsEvents.RightsEventsBuilder.securityTakerRightsEvent(f: SecuredPartyRightsEvent.SecuredPartyRightsEventBuilder.() -> Unit) = orCreateSecurityTakerRightsEvent.apply(f)

fun RollFeature.RollFeatureBuilder.deliveryDateRollConvention(f: Offset.OffsetBuilder.() -> Unit) = orCreateDeliveryDateRollConvention.apply(f)


fun Schedule.ScheduleBuilder.step(f: Step.StepBuilder.() -> Unit) = addStep(Step.StepBuilderImpl().apply(f).build())
fun Schedule.ScheduleBuilder.step(index: Int, f: Step.StepBuilder.() -> Unit) = getOrCreateStep(index).apply(f)


fun SecuredPartyRightsEvent.SecuredPartyRightsEventBuilder.securedPartyRightsEventElection(f: SecuredPartyRightsEventElection.SecuredPartyRightsEventElectionBuilder.() -> Unit) = addSecuredPartyRightsEventElection(SecuredPartyRightsEventElection.SecuredPartyRightsEventElectionBuilderImpl().apply(f).build())
fun SecuredPartyRightsEvent.SecuredPartyRightsEventBuilder.securedPartyRightsEventElection(index: Int, f: SecuredPartyRightsEventElection.SecuredPartyRightsEventElectionBuilder.() -> Unit) = getOrCreateSecuredPartyRightsEventElection(index).apply(f)


fun Security.SecurityBuilder.debtType(f: DebtType.DebtTypeBuilder.() -> Unit) = orCreateDebtType.apply(f)

fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.appropriatedCollateralValuation(f: AppropriatedCollateralValuation.AppropriatedCollateralValuationBuilder.() -> Unit) = orCreateAppropriatedCollateralValuation.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.enforcementEvent(f: EnforcementEvent.EnforcementEventBuilder.() -> Unit) = orCreateEnforcementEvent.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.executionTerms(f: ExecutionTerms.ExecutionTermsBuilder.() -> Unit) = orCreateExecutionTerms.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.jurisdictionRelatedTerms(f: JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.() -> Unit) = orCreateJurisdictionRelatedTerms.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.pledgedAccount(f: Account.AccountBuilder.() -> Unit) = orCreatePledgedAccount.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.processAgent(f: ProcessAgent.ProcessAgentBuilder.() -> Unit) = orCreateProcessAgent.apply(f)

fun SecurityFinanceLeg.SecurityFinanceLegBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SecurityFinanceLeg.SecurityFinanceLegBuilder.settlementDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)

fun SecurityFinancePayout.SecurityFinancePayoutBuilder.collateralProvisions(f: CollateralProvisions.CollateralProvisionsBuilder.() -> Unit) = orCreateCollateralProvisions.apply(f)
fun SecurityFinancePayout.SecurityFinancePayoutBuilder.dividendTerms(f: DividendTerms.DividendTermsBuilder.() -> Unit) = orCreateDividendTerms.apply(f)
fun SecurityFinancePayout.SecurityFinancePayoutBuilder.durationType(f: Duration.DurationBuilder.() -> Unit) = orCreateDurationType.apply(f)
fun SecurityFinancePayout.SecurityFinancePayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SecurityFinancePayout.SecurityFinancePayoutBuilder.minimumFee(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumFee.apply(f)
fun SecurityFinancePayout.SecurityFinancePayoutBuilder.securityFinanceLeg(f: SecurityFinanceLeg.SecurityFinanceLegBuilder.() -> Unit) = addSecurityFinanceLeg(SecurityFinanceLeg.SecurityFinanceLegBuilderImpl().apply(f).build())
fun SecurityFinancePayout.SecurityFinancePayoutBuilder.securityFinanceLeg(index: Int, f: SecurityFinanceLeg.SecurityFinanceLegBuilder.() -> Unit) = getOrCreateSecurityFinanceLeg(index).apply(f)
fun SecurityFinancePayout.SecurityFinancePayoutBuilder.securityInformation(f: Product.ProductBuilder.() -> Unit) = orCreateSecurityInformation.apply(f)

fun SecurityLeg.SecurityLegBuilder.buyerSeller(f: BuyerSeller.BuyerSellerBuilder.() -> Unit) = orCreateBuyerSeller.apply(f)
fun SecurityLeg.SecurityLegBuilder.deliveryDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateDeliveryDate.apply(f)
fun SecurityLeg.SecurityLegBuilder.fxRate(f: ExchangeRate.ExchangeRateBuilder.() -> Unit) = orCreateFxRate.apply(f)
fun SecurityLeg.SecurityLegBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SecurityLeg.SecurityLegBuilder.settlementAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateSettlementAmount.apply(f)
fun SecurityLeg.SecurityLegBuilder.settlementDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)

fun SecurityLendingInvoice.SecurityLendingInvoiceBuilder.billingRecord(f: BillingRecord.BillingRecordBuilder.() -> Unit) = addBillingRecord(BillingRecord.BillingRecordBuilderImpl().apply(f).build())
fun SecurityLendingInvoice.SecurityLendingInvoiceBuilder.billingRecord(index: Int, f: BillingRecord.BillingRecordBuilder.() -> Unit) = getOrCreateBillingRecord(index).apply(f)
fun SecurityLendingInvoice.SecurityLendingInvoiceBuilder.billingSummary(f: BillingSummary.BillingSummaryBuilder.() -> Unit) = addBillingSummary(BillingSummary.BillingSummaryBuilderImpl().apply(f).build())
fun SecurityLendingInvoice.SecurityLendingInvoiceBuilder.billingSummary(index: Int, f: BillingSummary.BillingSummaryBuilder.() -> Unit) = getOrCreateBillingSummary(index).apply(f)
fun SecurityLendingInvoice.SecurityLendingInvoiceBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SecurityLendingInvoice.SecurityLendingInvoiceBuilder.receivingParty(f: Party.PartyBuilder.() -> Unit) = orCreateReceivingParty.apply(f)
fun SecurityLendingInvoice.SecurityLendingInvoiceBuilder.sendingParty(f: Party.PartyBuilder.() -> Unit) = orCreateSendingParty.apply(f)

fun SecurityPayout.SecurityPayoutBuilder.initialMargin(f: InitialMargin.InitialMarginBuilder.() -> Unit) = orCreateInitialMargin.apply(f)
fun SecurityPayout.SecurityPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SecurityPayout.SecurityPayoutBuilder.securityLeg(f: SecurityLeg.SecurityLegBuilder.() -> Unit) = addSecurityLeg(SecurityLeg.SecurityLegBuilderImpl().apply(f).build())
fun SecurityPayout.SecurityPayoutBuilder.securityLeg(index: Int, f: SecurityLeg.SecurityLegBuilder.() -> Unit) = getOrCreateSecurityLeg(index).apply(f)
fun SecurityPayout.SecurityPayoutBuilder.securityValuation(f: SecurityValuation.SecurityValuationBuilder.() -> Unit) = addSecurityValuation(SecurityValuation.SecurityValuationBuilderImpl().apply(f).build())
fun SecurityPayout.SecurityPayoutBuilder.securityValuation(index: Int, f: SecurityValuation.SecurityValuationBuilder.() -> Unit) = getOrCreateSecurityValuation(index).apply(f)

fun SecurityProviderRightsEvent.SecurityProviderRightsEventBuilder.partyElection(f: SecurityProviderRightsEventElection.SecurityProviderRightsEventElectionBuilder.() -> Unit) = addPartyElection(SecurityProviderRightsEventElection.SecurityProviderRightsEventElectionBuilderImpl().apply(f).build())
fun SecurityProviderRightsEvent.SecurityProviderRightsEventBuilder.partyElection(index: Int, f: SecurityProviderRightsEventElection.SecurityProviderRightsEventElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)


fun SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.security(f: Security.SecurityBuilder.() -> Unit) = addSecurity(Security.SecurityBuilderImpl().apply(f).build())
fun SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.security(index: Int, f: Security.SecurityBuilder.() -> Unit) = getOrCreateSecurity(index).apply(f)
fun SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.transferorTransferee(f: TransferorTransferee.TransferorTransfereeBuilder.() -> Unit) = orCreateTransferorTransferee.apply(f)

fun SecurityTransferComponent.SecurityTransferComponentBuilder.breakdown(f: SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.() -> Unit) = addBreakdown(SecurityTransferBreakdown.SecurityTransferBreakdownBuilderImpl().apply(f).build())
fun SecurityTransferComponent.SecurityTransferComponentBuilder.breakdown(index: Int, f: SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.() -> Unit) = getOrCreateBreakdown(index).apply(f)
fun SecurityTransferComponent.SecurityTransferComponentBuilder.security(f: Security.SecurityBuilder.() -> Unit) = orCreateSecurity.apply(f)
fun SecurityTransferComponent.SecurityTransferComponentBuilder.transferorTransferee(f: TransferorTransferee.TransferorTransfereeBuilder.() -> Unit) = orCreateTransferorTransferee.apply(f)

fun SecurityValuation.SecurityValuationBuilder.securityValuationModel(f: SecurityValuationModel.SecurityValuationModelBuilder.() -> Unit) = orCreateSecurityValuationModel.apply(f)
fun SecurityValuation.SecurityValuationBuilder.underlier(f: Security.SecurityBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun SecurityValuationModel.SecurityValuationModelBuilder.bondValuationModel(f: BondValuationModel.BondValuationModelBuilder.() -> Unit) = orCreateBondValuationModel.apply(f)
fun SecurityValuationModel.SecurityValuationModelBuilder.unitContractValuationModel(f: UnitContractValuationModel.UnitContractValuationModelBuilder.() -> Unit) = orCreateUnitContractValuationModel.apply(f)

fun Sellr.SellrBuilder.acctOwnr(f: AcctOwnr.AcctOwnrBuilder.() -> Unit) = orCreateAcctOwnr.apply(f)

fun SensitivityMethodologies.SensitivityMethodologiesBuilder.sensitivityToCommodity(f: SensitivityMethodology.SensitivityMethodologyBuilder.() -> Unit) = orCreateSensitivityToCommodity.apply(f)
fun SensitivityMethodologies.SensitivityMethodologiesBuilder.sensitivityToEquity(f: SensitivityMethodology.SensitivityMethodologyBuilder.() -> Unit) = orCreateSensitivityToEquity.apply(f)


fun SettledEntityMatrix.SettledEntityMatrixBuilder.matrixSource(f: FieldWithMetaSettledEntityMatrixSourceEnum.FieldWithMetaSettledEntityMatrixSourceEnumBuilder.() -> Unit) = orCreateMatrixSource.apply(f)

fun SettlementBase.SettlementBaseBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SettlementBase.SettlementBaseBuilder.settlementCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSettlementCurrency.apply(f)
fun SettlementBase.SettlementBaseBuilder.settlementDate(f: SettlementDate.SettlementDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)

fun SettlementDate.SettlementDateBuilder.adjustableDates(f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = orCreateAdjustableDates.apply(f)
fun SettlementDate.SettlementDateBuilder.businessDateRange(f: BusinessDateRange.BusinessDateRangeBuilder.() -> Unit) = orCreateBusinessDateRange.apply(f)
fun SettlementDate.SettlementDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SettlementDate.SettlementDateBuilder.settlementDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)


fun SettlementOrigin.SettlementOriginBuilder.cashSettlementTerms(f: ReferenceWithMetaCashSettlementTerms.ReferenceWithMetaCashSettlementTermsBuilder.() -> Unit) = orCreateCashSettlementTerms.apply(f)
fun SettlementOrigin.SettlementOriginBuilder.cashflow(f: ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.() -> Unit) = orCreateCashflow.apply(f)
fun SettlementOrigin.SettlementOriginBuilder.equityPayout(f: ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.() -> Unit) = orCreateEquityPayout.apply(f)
fun SettlementOrigin.SettlementOriginBuilder.interestRatePayout(f: ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.() -> Unit) = orCreateInterestRatePayout.apply(f)
fun SettlementOrigin.SettlementOriginBuilder.physicalSettlementTerms(f: ReferenceWithMetaPhysicalSettlementTerms.ReferenceWithMetaPhysicalSettlementTermsBuilder.() -> Unit) = orCreatePhysicalSettlementTerms.apply(f)
fun SettlementOrigin.SettlementOriginBuilder.securityFinancePayout(f: ReferenceWithMetaSecurityFinancePayout.ReferenceWithMetaSecurityFinancePayoutBuilder.() -> Unit) = orCreateSecurityFinancePayout.apply(f)
fun SettlementOrigin.SettlementOriginBuilder.securityPayout(f: ReferenceWithMetaSecurityPayout.ReferenceWithMetaSecurityPayoutBuilder.() -> Unit) = orCreateSecurityPayout.apply(f)
fun SettlementOrigin.SettlementOriginBuilder.settlementTerms(f: ReferenceWithMetaSettlementTerms.ReferenceWithMetaSettlementTermsBuilder.() -> Unit) = orCreateSettlementTerms.apply(f)

fun SettlementRateOption.SettlementRateOptionBuilder.priceSourceDisruption(f: PriceSourceDisruption.PriceSourceDisruptionBuilder.() -> Unit) = orCreatePriceSourceDisruption.apply(f)
fun SettlementRateOption.SettlementRateOptionBuilder.settlementRateOption(f: FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.() -> Unit) = orCreateSettlementRateOption.apply(f)

fun SettlementTerms.SettlementTermsBuilder.cashSettlementTerms(f: CashSettlementTerms.CashSettlementTermsBuilder.() -> Unit) = addCashSettlementTerms(CashSettlementTerms.CashSettlementTermsBuilderImpl().apply(f).build())
fun SettlementTerms.SettlementTermsBuilder.cashSettlementTerms(index: Int, f: CashSettlementTerms.CashSettlementTermsBuilder.() -> Unit) = getOrCreateCashSettlementTerms(index).apply(f)
fun SettlementTerms.SettlementTermsBuilder.physicalSettlementTerms(f: PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.() -> Unit) = orCreatePhysicalSettlementTerms.apply(f)

fun SimmCalculationCurrency.SimmCalculationCurrencyBuilder.partyElection(f: CalculationCurrencyElection.CalculationCurrencyElectionBuilder.() -> Unit) = addPartyElection(CalculationCurrencyElection.CalculationCurrencyElectionBuilderImpl().apply(f).build())
fun SimmCalculationCurrency.SimmCalculationCurrencyBuilder.partyElection(index: Int, f: CalculationCurrencyElection.CalculationCurrencyElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)



fun SimplePayment.SimplePaymentBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SimplePayment.SimplePaymentBuilder.paymentAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePaymentAmount.apply(f)
fun SimplePayment.SimplePaymentBuilder.paymentDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreatePaymentDate.apply(f)


fun Sngl.SnglBuilder.indx(f: Indx.IndxBuilder.() -> Unit) = orCreateIndx.apply(f)


fun SpecifiedCurrency.SpecifiedCurrencyBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun SpecifiedEntities.SpecifiedEntitiesBuilder.specifiedEntity(f: SpecifiedEntity.SpecifiedEntityBuilder.() -> Unit) = addSpecifiedEntity(SpecifiedEntity.SpecifiedEntityBuilderImpl().apply(f).build())
fun SpecifiedEntities.SpecifiedEntitiesBuilder.specifiedEntity(index: Int, f: SpecifiedEntity.SpecifiedEntityBuilder.() -> Unit) = getOrCreateSpecifiedEntity(index).apply(f)

fun SpecifiedEntity.SpecifiedEntityBuilder.party(f: Party.PartyBuilder.() -> Unit) = orCreateParty.apply(f)
fun SpecifiedEntity.SpecifiedEntityBuilder.specifiedEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addSpecifiedEntity(LegalEntity.LegalEntityBuilderImpl().apply(f).build())
fun SpecifiedEntity.SpecifiedEntityBuilder.specifiedEntity(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateSpecifiedEntity(index).apply(f)

fun SplitPrimitive.SplitPrimitiveBuilder.after(f: TradeState.TradeStateBuilder.() -> Unit) = addAfter(TradeState.TradeStateBuilderImpl().apply(f).build())
fun SplitPrimitive.SplitPrimitiveBuilder.after(index: Int, f: TradeState.TradeStateBuilder.() -> Unit) = getOrCreateAfter(index).apply(f)
fun SplitPrimitive.SplitPrimitiveBuilder.before(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateBefore.apply(f)

fun SpreadSchedule.SpreadScheduleBuilder.spreadScheduleType(f: FieldWithMetaSpreadScheduleTypeEnum.FieldWithMetaSpreadScheduleTypeEnumBuilder.() -> Unit) = orCreateSpreadScheduleType.apply(f)

fun State.StateBuilder.closedState(f: ClosedState.ClosedStateBuilder.() -> Unit) = orCreateClosedState.apply(f)

fun Step.StepBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun StockSplitInstruction.StockSplitInstructionBuilder.tradeState(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateTradeState.apply(f)

fun StrategyFeature.StrategyFeatureBuilder.calendarSpread(f: CalendarSpread.CalendarSpreadBuilder.() -> Unit) = orCreateCalendarSpread.apply(f)
fun StrategyFeature.StrategyFeatureBuilder.strikeSpread(f: StrikeSpread.StrikeSpreadBuilder.() -> Unit) = orCreateStrikeSpread.apply(f)

fun Strike.StrikeBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun StrikeSpread.StrikeSpreadBuilder.upperStrike(f: OptionStrike.OptionStrikeBuilder.() -> Unit) = orCreateUpperStrike.apply(f)

fun StubCalculationPeriodAmount.StubCalculationPeriodAmountBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDatesReference.apply(f)
fun StubCalculationPeriodAmount.StubCalculationPeriodAmountBuilder.finalStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateFinalStub.apply(f)
fun StubCalculationPeriodAmount.StubCalculationPeriodAmountBuilder.initialStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateInitialStub.apply(f)

fun StubFloatingRate.StubFloatingRateBuilder.capRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addCapRateSchedule(StrikeSchedule.StrikeScheduleBuilderImpl().apply(f).build())
fun StubFloatingRate.StubFloatingRateBuilder.capRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateCapRateSchedule(index).apply(f)
fun StubFloatingRate.StubFloatingRateBuilder.floatingRateMultiplierSchedule(f: Schedule.ScheduleBuilder.() -> Unit) = orCreateFloatingRateMultiplierSchedule.apply(f)
fun StubFloatingRate.StubFloatingRateBuilder.floorRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addFloorRateSchedule(StrikeSchedule.StrikeScheduleBuilderImpl().apply(f).build())
fun StubFloatingRate.StubFloatingRateBuilder.floorRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateFloorRateSchedule(index).apply(f)
fun StubFloatingRate.StubFloatingRateBuilder.indexTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateIndexTenor.apply(f)
fun StubFloatingRate.StubFloatingRateBuilder.spreadSchedule(f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = addSpreadSchedule(SpreadSchedule.SpreadScheduleBuilderImpl().apply(f).build())
fun StubFloatingRate.StubFloatingRateBuilder.spreadSchedule(index: Int, f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = getOrCreateSpreadSchedule(index).apply(f)

fun StubPeriod.StubPeriodBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDatesReference.apply(f)
fun StubPeriod.StubPeriodBuilder.finalStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateFinalStub.apply(f)
fun StubPeriod.StubPeriodBuilder.initialStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateInitialStub.apply(f)

fun StubValue.StubValueBuilder.floatingRate(f: StubFloatingRate.StubFloatingRateBuilder.() -> Unit) = addFloatingRate(StubFloatingRate.StubFloatingRateBuilderImpl().apply(f).build())
fun StubValue.StubValueBuilder.floatingRate(index: Int, f: StubFloatingRate.StubFloatingRateBuilder.() -> Unit) = getOrCreateFloatingRate(index).apply(f)
fun StubValue.StubValueBuilder.stubAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateStubAmount.apply(f)

fun SubstitutedRegime.SubstitutedRegimeBuilder.regimeTerms(f: SubstitutedRegimeTerms.SubstitutedRegimeTermsBuilder.() -> Unit) = addRegimeTerms(SubstitutedRegimeTerms.SubstitutedRegimeTermsBuilderImpl().apply(f).build())
fun SubstitutedRegime.SubstitutedRegimeBuilder.regimeTerms(index: Int, f: SubstitutedRegimeTerms.SubstitutedRegimeTermsBuilder.() -> Unit) = getOrCreateRegimeTerms(index).apply(f)



fun SwapCurveValuation.SwapCurveValuationBuilder.indexTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateIndexTenor.apply(f)

fun Swp.SwpBuilder.swpIn(f: SwpIn.SwpInBuilder.() -> Unit) = orCreateSwpIn.apply(f)
fun Swp.SwpBuilder.swpOut(f: SwpOut.SwpOutBuilder.() -> Unit) = orCreateSwpOut.apply(f)

fun SwpIn.SwpInBuilder.sngl(f: Sngl.SnglBuilder.() -> Unit) = orCreateSngl.apply(f)

fun SwpOut.SwpOutBuilder.sngl(f: Sngl.SnglBuilder.() -> Unit) = orCreateSngl.apply(f)



fun TerminationCurrency.TerminationCurrencyBuilder.partyOptionTerminationCurrency(f: PartyOptionTerminationCurrency.PartyOptionTerminationCurrencyBuilder.() -> Unit) = orCreatePartyOptionTerminationCurrency.apply(f)
fun TerminationCurrency.TerminationCurrencyBuilder.statedTerminationCurrency(f: TerminationCurrencySelection.TerminationCurrencySelectionBuilder.() -> Unit) = orCreateStatedTerminationCurrency.apply(f)

fun TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.effectiveDate(f: AmendmentEffectiveDate.AmendmentEffectiveDateBuilder.() -> Unit) = orCreateEffectiveDate.apply(f)
fun TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.partyElection(f: TerminationCurrencyElection.TerminationCurrencyElectionBuilder.() -> Unit) = addPartyElection(TerminationCurrencyElection.TerminationCurrencyElectionBuilderImpl().apply(f).build())
fun TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.partyElection(index: Int, f: TerminationCurrencyElection.TerminationCurrencyElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun TerminationCurrencyElection.TerminationCurrencyElectionBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun TerminationCurrencySelection.TerminationCurrencySelectionBuilder.partyElection(f: PartyTerminationCurrencySelection.PartyTerminationCurrencySelectionBuilder.() -> Unit) = addPartyElection(PartyTerminationCurrencySelection.PartyTerminationCurrencySelectionBuilderImpl().apply(f).build())
fun TerminationCurrencySelection.TerminationCurrencySelectionBuilder.partyElection(index: Int, f: PartyTerminationCurrencySelection.PartyTerminationCurrencySelectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun TermsChangePrimitive.TermsChangePrimitiveBuilder.after(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun TermsChangePrimitive.TermsChangePrimitiveBuilder.before(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateBefore.apply(f)

fun Threshold.ThresholdBuilder.partyElection(f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = addPartyElection(ElectiveAmountElection.ElectiveAmountElectionBuilderImpl().apply(f).build())
fun Threshold.ThresholdBuilder.partyElection(index: Int, f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply(f)

fun TimeZone.TimeZoneBuilder.location(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateLocation.apply(f)

fun TradableProduct.TradableProductBuilder.ancillaryParty(f: AncillaryParty.AncillaryPartyBuilder.() -> Unit) = addAncillaryParty(AncillaryParty.AncillaryPartyBuilderImpl().apply(f).build())
fun TradableProduct.TradableProductBuilder.ancillaryParty(index: Int, f: AncillaryParty.AncillaryPartyBuilder.() -> Unit) = getOrCreateAncillaryParty(index).apply(f)
fun TradableProduct.TradableProductBuilder.counterparty(f: Counterparty.CounterpartyBuilder.() -> Unit) = addCounterparty(Counterparty.CounterpartyBuilderImpl().apply(f).build())
fun TradableProduct.TradableProductBuilder.counterparty(index: Int, f: Counterparty.CounterpartyBuilder.() -> Unit) = getOrCreateCounterparty(index).apply(f)
fun TradableProduct.TradableProductBuilder.product(f: Product.ProductBuilder.() -> Unit) = orCreateProduct.apply(f)
fun TradableProduct.TradableProductBuilder.settlementInstructions(f: SettlementInstructions.SettlementInstructionsBuilder.() -> Unit) = addSettlementInstructions(SettlementInstructions.SettlementInstructionsBuilderImpl().apply(f).build())
fun TradableProduct.TradableProductBuilder.settlementInstructions(index: Int, f: SettlementInstructions.SettlementInstructionsBuilder.() -> Unit) = getOrCreateSettlementInstructions(index).apply(f)
fun TradableProduct.TradableProductBuilder.tradeLot(f: TradeLot.TradeLotBuilder.() -> Unit) = addTradeLot(TradeLot.TradeLotBuilderImpl().apply(f).build())
fun TradableProduct.TradableProductBuilder.tradeLot(index: Int, f: TradeLot.TradeLotBuilder.() -> Unit) = getOrCreateTradeLot(index).apply(f)

fun Trade.TradeBuilder.account(f: Account.AccountBuilder.() -> Unit) = addAccount(Account.AccountBuilderImpl().apply(f).build())
fun Trade.TradeBuilder.account(index: Int, f: Account.AccountBuilder.() -> Unit) = getOrCreateAccount(index).apply(f)
fun Trade.TradeBuilder.collateral(f: Collateral.CollateralBuilder.() -> Unit) = orCreateCollateral.apply(f)
fun Trade.TradeBuilder.contractDetails(f: ContractDetails.ContractDetailsBuilder.() -> Unit) = orCreateContractDetails.apply(f)
fun Trade.TradeBuilder.executionDetails(f: ExecutionDetails.ExecutionDetailsBuilder.() -> Unit) = orCreateExecutionDetails.apply(f)
fun Trade.TradeBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Trade.TradeBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilderImpl().apply(f).build())
fun Trade.TradeBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply(f)
fun Trade.TradeBuilder.partyRole(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRole(PartyRole.PartyRoleBuilderImpl().apply(f).build())
fun Trade.TradeBuilder.partyRole(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRole(index).apply(f)
fun Trade.TradeBuilder.tradableProduct(f: TradableProduct.TradableProductBuilder.() -> Unit) = orCreateTradableProduct.apply(f)
fun Trade.TradeBuilder.tradeDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateTradeDate.apply(f)
fun Trade.TradeBuilder.tradeIdentifier(f: Identifier.IdentifierBuilder.() -> Unit) = addTradeIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun Trade.TradeBuilder.tradeIdentifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateTradeIdentifier(index).apply(f)

fun TradeLot.TradeLotBuilder.lotIdentifier(f: Identifier.IdentifierBuilder.() -> Unit) = addLotIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun TradeLot.TradeLotBuilder.lotIdentifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateLotIdentifier(index).apply(f)
fun TradeLot.TradeLotBuilder.priceQuantity(f: PriceQuantity.PriceQuantityBuilder.() -> Unit) = addPriceQuantity(PriceQuantity.PriceQuantityBuilderImpl().apply(f).build())
fun TradeLot.TradeLotBuilder.priceQuantity(index: Int, f: PriceQuantity.PriceQuantityBuilder.() -> Unit) = getOrCreatePriceQuantity(index).apply(f)

fun TradeState.TradeStateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun TradeState.TradeStateBuilder.resetHistory(f: Reset.ResetBuilder.() -> Unit) = addResetHistory(Reset.ResetBuilderImpl().apply(f).build())
fun TradeState.TradeStateBuilder.resetHistory(index: Int, f: Reset.ResetBuilder.() -> Unit) = getOrCreateResetHistory(index).apply(f)
fun TradeState.TradeStateBuilder.state(f: State.StateBuilder.() -> Unit) = orCreateState.apply(f)
fun TradeState.TradeStateBuilder.trade(f: Trade.TradeBuilder.() -> Unit) = orCreateTrade.apply(f)
fun TradeState.TradeStateBuilder.transferHistory(f: Transfer.TransferBuilder.() -> Unit) = addTransferHistory(Transfer.TransferBuilderImpl().apply(f).build())
fun TradeState.TradeStateBuilder.transferHistory(index: Int, f: Transfer.TransferBuilder.() -> Unit) = getOrCreateTransferHistory(index).apply(f)

fun TradeWarehouseWorkflow.TradeWarehouseWorkflowBuilder.partyCustomisedWorkflow(f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = addPartyCustomisedWorkflow(PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilderImpl().apply(f).build())
fun TradeWarehouseWorkflow.TradeWarehouseWorkflowBuilder.partyCustomisedWorkflow(index: Int, f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = getOrCreatePartyCustomisedWorkflow(index).apply(f)




fun Transfer.TransferBuilder.identifier(f: FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.() -> Unit) = addIdentifier(FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilderImpl().apply(f).build())
fun Transfer.TransferBuilder.identifier(index: Int, f: FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply(f)
fun Transfer.TransferBuilder.observable(f: Observable.ObservableBuilder.() -> Unit) = orCreateObservable.apply(f)
fun Transfer.TransferBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun Transfer.TransferBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = orCreateQuantity.apply(f)
fun Transfer.TransferBuilder.settlementDate(f: AdjustableOrAdjustedOrRelativeDate.AdjustableOrAdjustedOrRelativeDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)
fun Transfer.TransferBuilder.settlementOrigin(f: SettlementOrigin.SettlementOriginBuilder.() -> Unit) = orCreateSettlementOrigin.apply(f)

fun TransferBase.TransferBaseBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun TransferBase.TransferBaseBuilder.transferCalculation(f: TransferCalculation.TransferCalculationBuilder.() -> Unit) = orCreateTransferCalculation.apply(f)

fun TransferBreakdown.TransferBreakdownBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = addLineage(Lineage.LineageBuilderImpl().apply(f).build())
fun TransferBreakdown.TransferBreakdownBuilder.lineage(index: Int, f: Lineage.LineageBuilder.() -> Unit) = getOrCreateLineage(index).apply(f)

fun TransferCalculation.TransferCalculationBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = addLineage(Lineage.LineageBuilderImpl().apply(f).build())
fun TransferCalculation.TransferCalculationBuilder.lineage(index: Int, f: Lineage.LineageBuilder.() -> Unit) = getOrCreateLineage(index).apply(f)
fun TransferCalculation.TransferCalculationBuilder.period(f: CalculationPeriodBase.CalculationPeriodBaseBuilder.() -> Unit) = orCreatePeriod.apply(f)

fun TransferInstruction.TransferInstructionBuilder.payerReceiver(f: PayerReceiver.PayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun TransferInstruction.TransferInstructionBuilder.payout(f: ReferenceWithMetaPayout.ReferenceWithMetaPayoutBuilder.() -> Unit) = orCreatePayout.apply(f)
fun TransferInstruction.TransferInstructionBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = orCreateQuantity.apply(f)
fun TransferInstruction.TransferInstructionBuilder.resets(f: Reset.ResetBuilder.() -> Unit) = addResets(Reset.ResetBuilderImpl().apply(f).build())
fun TransferInstruction.TransferInstructionBuilder.resets(index: Int, f: Reset.ResetBuilder.() -> Unit) = getOrCreateResets(index).apply(f)

fun TransferPrimitive.TransferPrimitiveBuilder.after(f: TradeState.TradeStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun TransferPrimitive.TransferPrimitiveBuilder.before(f: ReferenceWithMetaTradeState.ReferenceWithMetaTradeStateBuilder.() -> Unit) = orCreateBefore.apply(f)
fun TransferPrimitive.TransferPrimitiveBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun TransferorTransferee.TransferorTransfereeBuilder.transfereeAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateTransfereeAccountReference.apply(f)
fun TransferorTransferee.TransferorTransfereeBuilder.transfereePartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateTransfereePartyReference.apply(f)
fun TransferorTransferee.TransferorTransfereeBuilder.transferorAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateTransferorAccountReference.apply(f)
fun TransferorTransferee.TransferorTransfereeBuilder.transferorPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateTransferorPartyReference.apply(f)

fun Transfers.TransfersBuilder.transfers(f: Transfer.TransferBuilder.() -> Unit) = addTransfers(Transfer.TransferBuilderImpl().apply(f).build())
fun Transfers.TransfersBuilder.transfers(index: Int, f: Transfer.TransferBuilder.() -> Unit) = getOrCreateTransfers(index).apply(f)

fun Trigger.TriggerBuilder.creditEvents(f: CreditEvents.CreditEventsBuilder.() -> Unit) = orCreateCreditEvents.apply(f)
fun Trigger.TriggerBuilder.creditEventsReference(f: ReferenceWithMetaCreditEvents.ReferenceWithMetaCreditEventsBuilder.() -> Unit) = orCreateCreditEventsReference.apply(f)

fun TriggerEvent.TriggerEventBuilder.featurePayment(f: FeaturePayment.FeaturePaymentBuilder.() -> Unit) = orCreateFeaturePayment.apply(f)
fun TriggerEvent.TriggerEventBuilder.schedule(f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = addSchedule(AveragingSchedule.AveragingScheduleBuilderImpl().apply(f).build())
fun TriggerEvent.TriggerEventBuilder.schedule(index: Int, f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = getOrCreateSchedule(index).apply(f)
fun TriggerEvent.TriggerEventBuilder.trigger(f: Trigger.TriggerBuilder.() -> Unit) = orCreateTrigger.apply(f)
fun TriggerEvent.TriggerEventBuilder.triggerDates(f: DateList.DateListBuilder.() -> Unit) = orCreateTriggerDates.apply(f)

fun Tx.TxBuilder.newTx(f: New.NewBuilder.() -> Unit) = orCreateNewTx.apply(f)
fun Tx.TxBuilder.pric(f: Pric.PricBuilder.() -> Unit) = orCreatePric.apply(f)
fun Tx.TxBuilder.qty(f: Qty.QtyBuilder.() -> Unit) = orCreateQty.apply(f)

fun UmbrellaAgreement.UmbrellaAgreementBuilder.parties(f: UmbrellaAgreementEntity.UmbrellaAgreementEntityBuilder.() -> Unit) = addParties(UmbrellaAgreementEntity.UmbrellaAgreementEntityBuilderImpl().apply(f).build())
fun UmbrellaAgreement.UmbrellaAgreementBuilder.parties(index: Int, f: UmbrellaAgreementEntity.UmbrellaAgreementEntityBuilder.() -> Unit) = getOrCreateParties(index).apply(f)


fun UndrlygInstrm.UndrlygInstrmBuilder.swp(f: Swp.SwpBuilder.() -> Unit) = orCreateSwp.apply(f)

fun UnitContractValuationModel.UnitContractValuationModelBuilder.numberOfUnits(f: Quantity.QuantityBuilder.() -> Unit) = orCreateNumberOfUnits.apply(f)
fun UnitContractValuationModel.UnitContractValuationModelBuilder.unitPrice(f: Money.MoneyBuilder.() -> Unit) = orCreateUnitPrice.apply(f)

fun UnitType.UnitTypeBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun UnitType.UnitTypeBuilder.frequency(f: Frequency.FrequencyBuilder.() -> Unit) = orCreateFrequency.apply(f)

fun ValuationDate.ValuationDateBuilder.fxFixingDate(f: FxFixingDate.FxFixingDateBuilder.() -> Unit) = orCreateFxFixingDate.apply(f)
fun ValuationDate.ValuationDateBuilder.fxFixingSchedule(f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = orCreateFxFixingSchedule.apply(f)
fun ValuationDate.ValuationDateBuilder.multipleValuationDates(f: MultipleValuationDates.MultipleValuationDatesBuilder.() -> Unit) = orCreateMultipleValuationDates.apply(f)
fun ValuationDate.ValuationDateBuilder.singleValuationDate(f: SingleValuationDate.SingleValuationDateBuilder.() -> Unit) = orCreateSingleValuationDate.apply(f)
fun ValuationDate.ValuationDateBuilder.valuationDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateValuationDate.apply(f)

fun ValuationMethod.ValuationMethodBuilder.cashCollateralValuationMethod(f: CashCollateralValuationMethod.CashCollateralValuationMethodBuilder.() -> Unit) = orCreateCashCollateralValuationMethod.apply(f)
fun ValuationMethod.ValuationMethodBuilder.minimumQuotationAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumQuotationAmount.apply(f)
fun ValuationMethod.ValuationMethodBuilder.quotationAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateQuotationAmount.apply(f)
fun ValuationMethod.ValuationMethodBuilder.valuationSource(f: ValuationSource.ValuationSourceBuilder.() -> Unit) = orCreateValuationSource.apply(f)


fun ValuationSource.ValuationSourceBuilder.dealerOrCCP(f: AncillaryEntity.AncillaryEntityBuilder.() -> Unit) = orCreateDealerOrCCP.apply(f)
fun ValuationSource.ValuationSourceBuilder.informationSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateInformationSource.apply(f)
fun ValuationSource.ValuationSourceBuilder.quotedCurrencyPair(f: ReferenceWithMetaQuotedCurrencyPair.ReferenceWithMetaQuotedCurrencyPairBuilder.() -> Unit) = orCreateQuotedCurrencyPair.apply(f)
fun ValuationSource.ValuationSourceBuilder.referenceBanks(f: ReferenceBanks.ReferenceBanksBuilder.() -> Unit) = orCreateReferenceBanks.apply(f)
fun ValuationSource.ValuationSourceBuilder.settlementRateOption(f: SettlementRateOption.SettlementRateOptionBuilder.() -> Unit) = orCreateSettlementRateOption.apply(f)




fun Workflow.WorkflowBuilder.steps(f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = addSteps(WorkflowStep.WorkflowStepBuilderImpl().apply(f).build())
fun Workflow.WorkflowBuilder.steps(index: Int, f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = getOrCreateSteps(index).apply(f)

fun WorkflowStep.WorkflowStepBuilder.account(f: Account.AccountBuilder.() -> Unit) = addAccount(Account.AccountBuilderImpl().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.account(index: Int, f: Account.AccountBuilder.() -> Unit) = getOrCreateAccount(index).apply(f)
fun WorkflowStep.WorkflowStepBuilder.businessEvent(f: BusinessEvent.BusinessEventBuilder.() -> Unit) = orCreateBusinessEvent.apply(f)
fun WorkflowStep.WorkflowStepBuilder.creditLimitInformation(f: CreditLimitInformation.CreditLimitInformationBuilder.() -> Unit) = orCreateCreditLimitInformation.apply(f)
fun WorkflowStep.WorkflowStepBuilder.eventIdentifier(f: Identifier.IdentifierBuilder.() -> Unit) = addEventIdentifier(Identifier.IdentifierBuilderImpl().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.eventIdentifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateEventIdentifier(index).apply(f)
fun WorkflowStep.WorkflowStepBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun WorkflowStep.WorkflowStepBuilder.messageInformation(f: MessageInformation.MessageInformationBuilder.() -> Unit) = orCreateMessageInformation.apply(f)
fun WorkflowStep.WorkflowStepBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun WorkflowStep.WorkflowStepBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilderImpl().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply(f)
fun WorkflowStep.WorkflowStepBuilder.previousWorkflowStep(f: ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.() -> Unit) = orCreatePreviousWorkflowStep.apply(f)
fun WorkflowStep.WorkflowStepBuilder.proposedInstruction(f: Instruction.InstructionBuilder.() -> Unit) = orCreateProposedInstruction.apply(f)
fun WorkflowStep.WorkflowStepBuilder.timestamp(f: EventTimestamp.EventTimestampBuilder.() -> Unit) = addTimestamp(EventTimestamp.EventTimestampBuilderImpl().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.timestamp(index: Int, f: EventTimestamp.EventTimestampBuilder.() -> Unit) = getOrCreateTimestamp(index).apply(f)

fun WorkflowStepState.WorkflowStepStateBuilder.partyCustomisedWorkflow(f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = addPartyCustomisedWorkflow(PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilderImpl().apply(f).build())
fun WorkflowStepState.WorkflowStepStateBuilder.partyCustomisedWorkflow(index: Int, f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = getOrCreatePartyCustomisedWorkflow(index).apply(f)