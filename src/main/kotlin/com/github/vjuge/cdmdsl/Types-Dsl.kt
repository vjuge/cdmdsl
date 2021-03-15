package com.github.vjuge.cdmdsl

import cdm.base.*
import cdm.base.datetime.*
import cdm.base.datetime.metafields.*
import cdm.base.math.*
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
import cdm.product.common.schedule.*
import cdm.product.common.schedule.metafields.ReferenceWithMetaCalculationPeriodDates
import cdm.product.common.schedule.metafields.ReferenceWithMetaPaymentDates
import cdm.product.common.settlement.*
import cdm.product.common.settlement.*
import cdm.product.common.settlement.metafields.ReferenceWithMetaCashSettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaCashflow
import cdm.product.common.settlement.metafields.ReferenceWithMetaPhysicalSettlementTerms
import cdm.product.common.settlement.metafields.ReferenceWithMetaResolvablePayoutQuantity
import cdm.product.template.*
import cdm.product.template.metafields.*
import cdm.regulation.*
import com.rosetta.model.metafields.*
import org.isda.cdm.*
import java.util.ArrayList

fun AccessConditions.AccessConditionsBuilder.additionalTerminationEvent(f: AdditionalTerminationEvent.AdditionalTerminationEventBuilder.() -> Unit) = addAdditionalTerminationEvent(AdditionalTerminationEvent.AdditionalTerminationEventBuilder().apply(f).build())
fun AccessConditions.AccessConditionsBuilder.additionalTerminationEvent(index: Int, f: AdditionalTerminationEvent.AdditionalTerminationEventBuilder.() -> Unit) = getOrCreateAdditionalTerminationEvent(index).apply{AdditionalTerminationEvent.AdditionalTerminationEventBuilder().apply(f).build()}
fun AccessConditions.AccessConditionsBuilder.partyElection(f: AccessConditionsElections.AccessConditionsElectionsBuilder.() -> Unit) = addPartyElection(AccessConditionsElections.AccessConditionsElectionsBuilder().apply(f).build())
fun AccessConditions.AccessConditionsBuilder.partyElection(index: Int, f: AccessConditionsElections.AccessConditionsElectionsBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{AccessConditionsElections.AccessConditionsElectionsBuilder().apply(f).build()}


fun Account.AccountBuilder.accountBeneficiary(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateAccountBeneficiary.apply(f)
fun Account.AccountBuilder.accountName(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateAccountName.apply(f)
fun Account.AccountBuilder.accountNumber(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateAccountNumber.apply(f)
fun Account.AccountBuilder.accountType(f: FieldWithMetaAccountTypeEnum.FieldWithMetaAccountTypeEnumBuilder.() -> Unit) = orCreateAccountType.apply(f)
fun Account.AccountBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Account.AccountBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)
fun Account.AccountBuilder.servicingParty(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateServicingParty.apply(f)

fun AcctOwnr.AcctOwnrBuilder.id(f: Id.IdBuilder.() -> Unit) = orCreateId.apply(f)

fun ActualPrice.ActualPriceBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun AdditionalDisruptionEvents.AdditionalDisruptionEventsBuilder.determiningParty(f: CounterpartyOrRelatedParty.CounterpartyOrRelatedPartyBuilder.() -> Unit) = orCreateDeterminingParty.apply(f)


fun AdditionalObligations.AdditionalObligationsBuilder.party(f: Party.PartyBuilder.() -> Unit) = orCreateParty.apply(f)

fun AdditionalRegime.AdditionalRegimeBuilder.regimeTerms(f: RegimeTerms.RegimeTermsBuilder.() -> Unit) = addRegimeTerms(RegimeTerms.RegimeTermsBuilder().apply(f).build())
fun AdditionalRegime.AdditionalRegimeBuilder.regimeTerms(index: Int, f: RegimeTerms.RegimeTermsBuilder.() -> Unit) = getOrCreateRegimeTerms(index).apply{RegimeTerms.RegimeTermsBuilder().apply(f).build()}

fun AdditionalRepresentation.AdditionalRepresentationBuilder.partyElection(f: AdditionalRepresentationElection.AdditionalRepresentationElectionBuilder.() -> Unit) = addPartyElection(AdditionalRepresentationElection.AdditionalRepresentationElectionBuilder().apply(f).build())
fun AdditionalRepresentation.AdditionalRepresentationBuilder.partyElection(index: Int, f: AdditionalRepresentationElection.AdditionalRepresentationElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{AdditionalRepresentationElection.AdditionalRepresentationElectionBuilder().apply(f).build()}


fun AdditionalRepresentations.AdditionalRepresentationsBuilder.additionalRepresentation(f: AdditionalRepresentation.AdditionalRepresentationBuilder.() -> Unit) = orCreateAdditionalRepresentation.apply(f)




fun Address.AddressBuilder.country(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCountry.apply(f)

fun AddressForNotices.AddressForNoticesBuilder.additionalNotices(f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = addAdditionalNotices(PartyContactInformation.PartyContactInformationBuilder().apply(f).build())
fun AddressForNotices.AddressForNoticesBuilder.additionalNotices(index: Int, f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = getOrCreateAdditionalNotices(index).apply{PartyContactInformation.PartyContactInformationBuilder().apply(f).build()}
fun AddressForNotices.AddressForNoticesBuilder.primaryNotices(f: ContactElection.ContactElectionBuilder.() -> Unit) = orCreatePrimaryNotices.apply(f)


fun AdjustableDate.AdjustableDateBuilder.adjustedDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateAdjustedDate.apply(f)
fun AdjustableDate.AdjustableDateBuilder.dateAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustments.apply(f)
fun AdjustableDate.AdjustableDateBuilder.dateAdjustmentsReference(f: ReferenceWithMetaBusinessDayAdjustments.ReferenceWithMetaBusinessDayAdjustmentsBuilder.() -> Unit) = orCreateDateAdjustmentsReference.apply(f)
fun AdjustableDate.AdjustableDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun AdjustableDates.AdjustableDatesBuilder.adjustedDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = addAdjustedDate(FieldWithMetaDate.FieldWithMetaDateBuilder().apply(f).build())
fun AdjustableDates.AdjustableDatesBuilder.adjustedDate(index: Int, f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = getOrCreateAdjustedDate(index).apply{FieldWithMetaDate.FieldWithMetaDateBuilder().apply(f).build()}
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

fun Affirmation.AffirmationBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = addIdentifier(Identifier.IdentifierBuilder().apply(f).build())
fun Affirmation.AffirmationBuilder.identifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply{Identifier.IdentifierBuilder().apply(f).build()}
fun Affirmation.AffirmationBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun Affirmation.AffirmationBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilder().apply(f).build())
fun Affirmation.AffirmationBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply{Party.PartyBuilder().apply(f).build()}
fun Affirmation.AffirmationBuilder.partyRole(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRole(PartyRole.PartyRoleBuilder().apply(f).build())
fun Affirmation.AffirmationBuilder.partyRole(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRole(index).apply{PartyRole.PartyRoleBuilder().apply(f).build()}

fun AgencyRatingCriteria.AgencyRatingCriteriaBuilder.creditNotation(f: CreditNotation.CreditNotationBuilder.() -> Unit) = addCreditNotation(CreditNotation.CreditNotationBuilder().apply(f).build())
fun AgencyRatingCriteria.AgencyRatingCriteriaBuilder.creditNotation(index: Int, f: CreditNotation.CreditNotationBuilder.() -> Unit) = getOrCreateCreditNotation(index).apply{CreditNotation.CreditNotationBuilder().apply(f).build()}

fun AggregationParameters.AggregationParametersBuilder.contractReference(f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = addContractReference(ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build())
fun AggregationParameters.AggregationParametersBuilder.contractReference(index: Int, f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = getOrCreateContractReference(index).apply{ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build()}
fun AggregationParameters.AggregationParametersBuilder.executionReference(f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = addExecutionReference(ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build())
fun AggregationParameters.AggregationParametersBuilder.executionReference(index: Int, f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = getOrCreateExecutionReference(index).apply{ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build()}
fun AggregationParameters.AggregationParametersBuilder.party(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addParty(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build())
fun AggregationParameters.AggregationParametersBuilder.party(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreateParty(index).apply{ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build()}
fun AggregationParameters.AggregationParametersBuilder.product(f: Product.ProductBuilder.() -> Unit) = addProduct(Product.ProductBuilder().apply(f).build())
fun AggregationParameters.AggregationParametersBuilder.product(index: Int, f: Product.ProductBuilder.() -> Unit) = getOrCreateProduct(index).apply{Product.ProductBuilder().apply(f).build()}

fun Agreement.AgreementBuilder.collateralTransferAgreementElections(f: CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.() -> Unit) = orCreateCollateralTransferAgreementElections.apply(f)
fun Agreement.AgreementBuilder.creditSupportAgreementElections(f: CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.() -> Unit) = orCreateCreditSupportAgreementElections.apply(f)
fun Agreement.AgreementBuilder.masterAgreementSchedule(f: MasterAgreementSchedule.MasterAgreementScheduleBuilder.() -> Unit) = orCreateMasterAgreementSchedule.apply(f)
fun Agreement.AgreementBuilder.securityAgreementElections(f: SecurityAgreementElections.SecurityAgreementElectionsBuilder.() -> Unit) = orCreateSecurityAgreementElections.apply(f)

fun AgreementTerms.AgreementTermsBuilder.agreement(f: Agreement.AgreementBuilder.() -> Unit) = orCreateAgreement.apply(f)
fun AgreementTerms.AgreementTermsBuilder.relatedAgreements(f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = addRelatedAgreements(RelatedAgreement.RelatedAgreementBuilder().apply(f).build())
fun AgreementTerms.AgreementTermsBuilder.relatedAgreements(index: Int, f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = getOrCreateRelatedAgreements(index).apply{RelatedAgreement.RelatedAgreementBuilder().apply(f).build()}
fun AgreementTerms.AgreementTermsBuilder.umbrellaAgreement(f: UmbrellaAgreement.UmbrellaAgreementBuilder.() -> Unit) = orCreateUmbrellaAgreement.apply(f)

fun AllocationBreakdown.AllocationBreakdownBuilder.account(f: Account.AccountBuilder.() -> Unit) = orCreateAccount.apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.allocationTradeId(f: Identifier.IdentifierBuilder.() -> Unit) = addAllocationTradeId(Identifier.IdentifierBuilder().apply(f).build())
fun AllocationBreakdown.AllocationBreakdownBuilder.allocationTradeId(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateAllocationTradeId(index).apply{Identifier.IdentifierBuilder().apply(f).build()}
fun AllocationBreakdown.AllocationBreakdownBuilder.collateral(f: Collateral.CollateralBuilder.() -> Unit) = orCreateCollateral.apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)
fun AllocationBreakdown.AllocationBreakdownBuilder.quantity(f: QuantityNotation.QuantityNotationBuilder.() -> Unit) = orCreateQuantity.apply(f)

fun AllocationInstruction.AllocationInstructionBuilder.breakdowns(f: AllocationBreakdown.AllocationBreakdownBuilder.() -> Unit) = addBreakdowns(AllocationBreakdown.AllocationBreakdownBuilder().apply(f).build())
fun AllocationInstruction.AllocationInstructionBuilder.breakdowns(index: Int, f: AllocationBreakdown.AllocationBreakdownBuilder.() -> Unit) = getOrCreateBreakdowns(index).apply{AllocationBreakdown.AllocationBreakdownBuilder().apply(f).build()}


fun AmericanExercise.AmericanExerciseBuilder.commencementDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateCommencementDate.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.earliestExerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateEarliestExerciseTime.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.exerciseFeeSchedule(f: ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.() -> Unit) = orCreateExerciseFeeSchedule.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.expirationDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateExpirationDate.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.expirationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateExpirationTime.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.latestExerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateLatestExerciseTime.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.multipleExercise(f: MultipleExercise.MultipleExerciseBuilder.() -> Unit) = orCreateMultipleExercise.apply(f)
fun AmericanExercise.AmericanExerciseBuilder.relevantUnderlyingDate(f: AdjustableOrRelativeDates.AdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateRelevantUnderlyingDate.apply(f)

fun AmountSchedule.AmountScheduleBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addCurrency(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun AmountSchedule.AmountScheduleBuilder.currency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateCurrency(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}

fun ApplicableRegime.ApplicableRegimeBuilder.regimeTerms(f: RegimeTerms.RegimeTermsBuilder.() -> Unit) = addRegimeTerms(RegimeTerms.RegimeTermsBuilder().apply(f).build())
fun ApplicableRegime.ApplicableRegimeBuilder.regimeTerms(index: Int, f: RegimeTerms.RegimeTermsBuilder.() -> Unit) = getOrCreateRegimeTerms(index).apply{RegimeTerms.RegimeTermsBuilder().apply(f).build()}


fun Asian.AsianBuilder.averagingPeriodIn(f: AveragingPeriod.AveragingPeriodBuilder.() -> Unit) = orCreateAveragingPeriodIn.apply(f)
fun Asian.AsianBuilder.averagingPeriodOut(f: AveragingPeriod.AveragingPeriodBuilder.() -> Unit) = orCreateAveragingPeriodOut.apply(f)

fun AssetCriteria.AssetCriteriaBuilder.agencyRating(f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = addAgencyRating(AgencyRatingCriteria.AgencyRatingCriteriaBuilder().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.agencyRating(index: Int, f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = getOrCreateAgencyRating(index).apply{AgencyRatingCriteria.AgencyRatingCriteriaBuilder().apply(f).build()}
fun AssetCriteria.AssetCriteriaBuilder.assetCountryOfOrigin(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addAssetCountryOfOrigin(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.assetCountryOfOrigin(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateAssetCountryOfOrigin(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun AssetCriteria.AssetCriteriaBuilder.collateralAssetType(f: AssetType.AssetTypeBuilder.() -> Unit) = addCollateralAssetType(AssetType.AssetTypeBuilder().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.collateralAssetType(index: Int, f: AssetType.AssetTypeBuilder.() -> Unit) = getOrCreateCollateralAssetType(index).apply{AssetType.AssetTypeBuilder().apply(f).build()}
fun AssetCriteria.AssetCriteriaBuilder.denominatedCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addDenominatedCurrency(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.denominatedCurrency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateDenominatedCurrency(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun AssetCriteria.AssetCriteriaBuilder.maturityRange(f: PeriodRange.PeriodRangeBuilder.() -> Unit) = orCreateMaturityRange.apply(f)
fun AssetCriteria.AssetCriteriaBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ProductIdentifier.ProductIdentifierBuilder().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.productIdentifier(index: Int, f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply{ProductIdentifier.ProductIdentifierBuilder().apply(f).build()}
fun AssetCriteria.AssetCriteriaBuilder.productTaxonomy(f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = addProductTaxonomy(ProductTaxonomy.ProductTaxonomyBuilder().apply(f).build())
fun AssetCriteria.AssetCriteriaBuilder.productTaxonomy(index: Int, f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = getOrCreateProductTaxonomy(index).apply{ProductTaxonomy.ProductTaxonomyBuilder().apply(f).build()}

fun AssetIdentifier.AssetIdentifierBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun AssetIdentifier.AssetIdentifierBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = orCreateProductIdentifier.apply(f)
fun AssetIdentifier.AssetIdentifierBuilder.rateOption(f: FloatingRateOption.FloatingRateOptionBuilder.() -> Unit) = orCreateRateOption.apply(f)


fun AssetType.AssetTypeBuilder.debtType(f: DebtType.DebtTypeBuilder.() -> Unit) = orCreateDebtType.apply(f)

fun AssignedIdentifier.AssignedIdentifierBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)

fun AutomaticEarlyTermination.AutomaticEarlyTerminationBuilder.partyElection(f: AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder.() -> Unit) = addPartyElection(AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder().apply(f).build())
fun AutomaticEarlyTermination.AutomaticEarlyTerminationBuilder.partyElection(index: Int, f: AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder().apply(f).build()}

fun AutomaticEarlyTerminationElection.AutomaticEarlyTerminationElectionBuilder.party(f: Party.PartyBuilder.() -> Unit) = orCreateParty.apply(f)


fun AveragingObservation.AveragingObservationBuilder.fxRateObservable(f: FxRateObservable.FxRateObservableBuilder.() -> Unit) = orCreateFxRateObservable.apply(f)
fun AveragingObservation.AveragingObservationBuilder.observationDates(f: ObservationDates.ObservationDatesBuilder.() -> Unit) = orCreateObservationDates.apply(f)
fun AveragingObservation.AveragingObservationBuilder.observationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateObservationTime.apply(f)
fun AveragingObservation.AveragingObservationBuilder.precision(f: Rounding.RoundingBuilder.() -> Unit) = orCreatePrecision.apply(f)

fun AveragingObservationList.AveragingObservationListBuilder.averagingObservation(f: WeightedAveragingObservation.WeightedAveragingObservationBuilder.() -> Unit) = addAveragingObservation(WeightedAveragingObservation.WeightedAveragingObservationBuilder().apply(f).build())
fun AveragingObservationList.AveragingObservationListBuilder.averagingObservation(index: Int, f: WeightedAveragingObservation.WeightedAveragingObservationBuilder.() -> Unit) = getOrCreateAveragingObservation(index).apply{WeightedAveragingObservation.WeightedAveragingObservationBuilder().apply(f).build()}

fun AveragingPeriod.AveragingPeriodBuilder.averagingDateTimes(f: DateTimeList.DateTimeListBuilder.() -> Unit) = orCreateAveragingDateTimes.apply(f)
fun AveragingPeriod.AveragingPeriodBuilder.averagingObservations(f: AveragingObservationList.AveragingObservationListBuilder.() -> Unit) = orCreateAveragingObservations.apply(f)
fun AveragingPeriod.AveragingPeriodBuilder.marketDisruption(f: FieldWithMetaMarketDisruptionEnum.FieldWithMetaMarketDisruptionEnumBuilder.() -> Unit) = orCreateMarketDisruption.apply(f)
fun AveragingPeriod.AveragingPeriodBuilder.schedule(f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = addSchedule(AveragingSchedule.AveragingScheduleBuilder().apply(f).build())
fun AveragingPeriod.AveragingPeriodBuilder.schedule(index: Int, f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = getOrCreateSchedule(index).apply{AveragingSchedule.AveragingScheduleBuilder().apply(f).build()}

fun AveragingSchedule.AveragingScheduleBuilder.averagingPeriodFrequency(f: CalculationPeriodFrequency.CalculationPeriodFrequencyBuilder.() -> Unit) = orCreateAveragingPeriodFrequency.apply(f)

fun Barrier.BarrierBuilder.barrierCap(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateBarrierCap.apply(f)
fun Barrier.BarrierBuilder.barrierFloor(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateBarrierFloor.apply(f)

fun BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.baseCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateBaseCurrency.apply(f)
fun BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.eligibleCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addEligibleCurrency(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun BaseAndEligibleCurrency.BaseAndEligibleCurrencyBuilder.eligibleCurrency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateEligibleCurrency(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}

fun BasketReferenceInformation.BasketReferenceInformationBuilder.basketId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addBasketId(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun BasketReferenceInformation.BasketReferenceInformationBuilder.basketId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateBasketId(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
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





fun BondChoiceModel.BondChoiceModelBuilder.bond(f: Bond.BondBuilder.() -> Unit) = orCreateBond.apply(f)
fun BondChoiceModel.BondChoiceModelBuilder.convertibleBond(f: ConvertibleBond.ConvertibleBondBuilder.() -> Unit) = orCreateConvertibleBond.apply(f)


fun BondEquityModel.BondEquityModelBuilder.bondchoiceModel(f: BondChoiceModel.BondChoiceModelBuilder.() -> Unit) = orCreateBondchoiceModel.apply(f)
fun BondEquityModel.BondEquityModelBuilder.equity(f: Equity.EquityBuilder.() -> Unit) = orCreateEquity.apply(f)

fun BondPriceAndYieldModel.BondPriceAndYieldModelBuilder.cleanOrDirtyPrice(f: CleanOrDirtyPrice.CleanOrDirtyPriceBuilder.() -> Unit) = orCreateCleanOrDirtyPrice.apply(f)
fun BondPriceAndYieldModel.BondPriceAndYieldModelBuilder.relativePrice(f: RelativePrice.RelativePriceBuilder.() -> Unit) = orCreateRelativePrice.apply(f)

fun BondReference.BondReferenceBuilder.bond(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = orCreateBond.apply(f)

fun BondType.BondTypeBuilder.bondEconomics(f: BondEconomics.BondEconomicsBuilder.() -> Unit) = addBondEconomics(BondEconomics.BondEconomicsBuilder().apply(f).build())
fun BondType.BondTypeBuilder.bondEconomics(index: Int, f: BondEconomics.BondEconomicsBuilder.() -> Unit) = getOrCreateBondEconomics(index).apply{BondEconomics.BondEconomicsBuilder().apply(f).build()}

fun BondValuationModel.BondValuationModelBuilder.accrualsAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateAccrualsAmount.apply(f)
fun BondValuationModel.BondValuationModelBuilder.bondPriceAndYieldModel(f: BondPriceAndYieldModel.BondPriceAndYieldModelBuilder.() -> Unit) = orCreateBondPriceAndYieldModel.apply(f)
fun BondValuationModel.BondValuationModelBuilder.nominalAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateNominalAmount.apply(f)

fun BrokerConfirmation.BrokerConfirmationBuilder.brokerConfirmationType(f: FieldWithMetaBrokerConfirmationTypeEnum.FieldWithMetaBrokerConfirmationTypeEnumBuilder.() -> Unit) = orCreateBrokerConfirmationType.apply(f)

fun BusinessCenterTime.BusinessCenterTimeBuilder.businessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = orCreateBusinessCenter.apply(f)

fun BusinessCenters.BusinessCentersBuilder.businessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = addBusinessCenter(FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder().apply(f).build())
fun BusinessCenters.BusinessCentersBuilder.businessCenter(index: Int, f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = getOrCreateBusinessCenter(index).apply{FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder().apply(f).build()}
fun BusinessCenters.BusinessCentersBuilder.businessCentersReference(f: ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.() -> Unit) = orCreateBusinessCentersReference.apply(f)
fun BusinessCenters.BusinessCentersBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun BusinessDateRange.BusinessDateRangeBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)

fun BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)
fun BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun BusinessEvent.BusinessEventBuilder.eventEffect(f: EventEffect.EventEffectBuilder.() -> Unit) = orCreateEventEffect.apply(f)
fun BusinessEvent.BusinessEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun BusinessEvent.BusinessEventBuilder.primitives(f: PrimitiveEvent.PrimitiveEventBuilder.() -> Unit) = addPrimitives(PrimitiveEvent.PrimitiveEventBuilder().apply(f).build())
fun BusinessEvent.BusinessEventBuilder.primitives(index: Int, f: PrimitiveEvent.PrimitiveEventBuilder.() -> Unit) = getOrCreatePrimitives(index).apply{PrimitiveEvent.PrimitiveEventBuilder().apply(f).build()}
fun BusinessEvent.BusinessEventBuilder.workflowEventState(f: WorkflowStepState.WorkflowStepStateBuilder.() -> Unit) = orCreateWorkflowEventState.apply(f)

fun BusinessUnit.BusinessUnitBuilder.contactInformation(f: ContactInformation.ContactInformationBuilder.() -> Unit) = orCreateContactInformation.apply(f)
fun BusinessUnit.BusinessUnitBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun BusinessUnit.BusinessUnitBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun Buyr.BuyrBuilder.acctOwnr(f: AcctOwnr.AcctOwnrBuilder.() -> Unit) = orCreateAcctOwnr.apply(f)

fun CalculationAgent.CalculationAgentBuilder.calculationAgentBusinessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = orCreateCalculationAgentBusinessCenter.apply(f)
fun CalculationAgent.CalculationAgentBuilder.calculationAgentParty(f: CounterpartyOrRelatedParty.CounterpartyOrRelatedPartyBuilder.() -> Unit) = orCreateCalculationAgentParty.apply(f)

fun CalculationAgentModel.CalculationAgentModelBuilder.calculationAgent(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgent.apply(f)

fun CalculationAgentTerms.CalculationAgentTermsBuilder.party(f: BasicReferenceWithMetaString.BasicReferenceWithMetaStringBuilder.() -> Unit) = orCreateParty.apply(f)

fun CalculationAndTiming.CalculationAndTimingBuilder.bespokeCalculationDate(f: BespokeCalculationDate.BespokeCalculationDateBuilder.() -> Unit) = orCreateBespokeCalculationDate.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.bespokeCalculationTime(f: BespokeCalculationTime.BespokeCalculationTimeBuilder.() -> Unit) = orCreateBespokeCalculationTime.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.calculationAgentTerms(f: CalculationAgentTerms.CalculationAgentTermsBuilder.() -> Unit) = orCreateCalculationAgentTerms.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.calculationDateLocation(f: CalculationDateLocation.CalculationDateLocationBuilder.() -> Unit) = orCreateCalculationDateLocation.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.collateralValuationAgent(f: CollateralValuationAgent.CollateralValuationAgentBuilder.() -> Unit) = orCreateCollateralValuationAgent.apply(f)
fun CalculationAndTiming.CalculationAndTimingBuilder.notificationTime(f: NotificationTime.NotificationTimeBuilder.() -> Unit) = orCreateNotificationTime.apply(f)

fun CalculationCurrencyElection.CalculationCurrencyElectionBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun CalculationDateLocation.CalculationDateLocationBuilder.partyElection(f: CalculationDateLocationElection.CalculationDateLocationElectionBuilder.() -> Unit) = addPartyElection(CalculationDateLocationElection.CalculationDateLocationElectionBuilder().apply(f).build())
fun CalculationDateLocation.CalculationDateLocationBuilder.partyElection(index: Int, f: CalculationDateLocationElection.CalculationDateLocationElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{CalculationDateLocationElection.CalculationDateLocationElectionBuilder().apply(f).build()}

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
fun CancelableProvision.CancelableProvisionBuilder.finalCalculationPeriodDateAdjustment(f: FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.() -> Unit) = addFinalCalculationPeriodDateAdjustment(FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder().apply(f).build())
fun CancelableProvision.CancelableProvisionBuilder.finalCalculationPeriodDateAdjustment(index: Int, f: FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.() -> Unit) = getOrCreateFinalCalculationPeriodDateAdjustment(index).apply{FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder().apply(f).build()}
fun CancelableProvision.CancelableProvisionBuilder.initialFee(f: SimplePayment.SimplePaymentBuilder.() -> Unit) = orCreateInitialFee.apply(f)

fun CancelableProvisionAdjustedDates.CancelableProvisionAdjustedDatesBuilder.cancellationEvent(f: CancellationEvent.CancellationEventBuilder.() -> Unit) = addCancellationEvent(CancellationEvent.CancellationEventBuilder().apply(f).build())
fun CancelableProvisionAdjustedDates.CancelableProvisionAdjustedDatesBuilder.cancellationEvent(index: Int, f: CancellationEvent.CancellationEventBuilder.() -> Unit) = getOrCreateCancellationEvent(index).apply{CancellationEvent.CancellationEventBuilder().apply(f).build()}

fun CancellationEvent.CancellationEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun CashExercise.CashExerciseBuilder.cashflow(f: Cashflow.CashflowBuilder.() -> Unit) = orCreateCashflow.apply(f)
fun CashExercise.CashExerciseBuilder.quantity(f: QuantityNotation.QuantityNotationBuilder.() -> Unit) = orCreateQuantity.apply(f)

fun CashPrice.CashPriceBuilder.cashflowAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateCashflowAmount.apply(f)
fun CashPrice.CashPriceBuilder.cleanNetPrice(f: ActualPrice.ActualPriceBuilder.() -> Unit) = orCreateCleanNetPrice.apply(f)
fun CashPrice.CashPriceBuilder.grossPrice(f: ActualPrice.ActualPriceBuilder.() -> Unit) = orCreateGrossPrice.apply(f)
fun CashPrice.CashPriceBuilder.netPrice(f: ActualPrice.ActualPriceBuilder.() -> Unit) = orCreateNetPrice.apply(f)

fun CashPriceMethod.CashPriceMethodBuilder.cashSettlementCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCashSettlementCurrency.apply(f)
fun CashPriceMethod.CashPriceMethodBuilder.cashSettlementReferenceBanks(f: CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder.() -> Unit) = orCreateCashSettlementReferenceBanks.apply(f)

fun CashSettlementPaymentDate.CashSettlementPaymentDateBuilder.adjustableDates(f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = orCreateAdjustableDates.apply(f)
fun CashSettlementPaymentDate.CashSettlementPaymentDateBuilder.businessDateRange(f: BusinessDateRange.BusinessDateRangeBuilder.() -> Unit) = orCreateBusinessDateRange.apply(f)
fun CashSettlementPaymentDate.CashSettlementPaymentDateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun CashSettlementPaymentDate.CashSettlementPaymentDateBuilder.relativeDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateRelativeDate.apply(f)

fun CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder.referenceBank(f: ReferenceBank.ReferenceBankBuilder.() -> Unit) = addReferenceBank(ReferenceBank.ReferenceBankBuilder().apply(f).build())
fun CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder.referenceBank(index: Int, f: ReferenceBank.ReferenceBankBuilder.() -> Unit) = getOrCreateReferenceBank(index).apply{ReferenceBank.ReferenceBankBuilder().apply(f).build()}

fun CashSettlementTerms.CashSettlementTermsBuilder.cashSettlementAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateCashSettlementAmount.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.minimumQuotationAmout(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumQuotationAmout.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.quotationAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateQuotationAmount.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.valuationDate(f: ValuationDate.ValuationDateBuilder.() -> Unit) = orCreateValuationDate.apply(f)
fun CashSettlementTerms.CashSettlementTermsBuilder.valuationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateValuationTime.apply(f)

fun CashTransferBreakdown.CashTransferBreakdownBuilder.amount(f: Money.MoneyBuilder.() -> Unit) = orCreateAmount.apply(f)
fun CashTransferBreakdown.CashTransferBreakdownBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)

fun CashTransferComponent.CashTransferComponentBuilder.amount(f: Money.MoneyBuilder.() -> Unit) = orCreateAmount.apply(f)
fun CashTransferComponent.CashTransferComponentBuilder.breakdown(f: CashTransferBreakdown.CashTransferBreakdownBuilder.() -> Unit) = addBreakdown(CashTransferBreakdown.CashTransferBreakdownBuilder().apply(f).build())
fun CashTransferComponent.CashTransferComponentBuilder.breakdown(index: Int, f: CashTransferBreakdown.CashTransferBreakdownBuilder.() -> Unit) = getOrCreateBreakdown(index).apply{CashTransferBreakdown.CashTransferBreakdownBuilder().apply(f).build()}
fun CashTransferComponent.CashTransferComponentBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)

fun Cashflow.CashflowBuilder.cashflowAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateCashflowAmount.apply(f)
fun Cashflow.CashflowBuilder.cashflowDate(f: AdjustableOrAdjustedOrRelativeDate.AdjustableOrAdjustedOrRelativeDateBuilder.() -> Unit) = orCreateCashflowDate.apply(f)
fun Cashflow.CashflowBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Cashflow.CashflowBuilder.payerReceiver(f: PayerReceiver.PayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun Cashflow.CashflowBuilder.paymentDiscounting(f: PaymentDiscounting.PaymentDiscountingBuilder.() -> Unit) = orCreatePaymentDiscounting.apply(f)
fun Cashflow.CashflowBuilder.premiumExpression(f: PremiumExpression.PremiumExpressionBuilder.() -> Unit) = orCreatePremiumExpression.apply(f)
fun Cashflow.CashflowBuilder.presentValueAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePresentValueAmount.apply(f)

fun CashflowRepresentation.CashflowRepresentationBuilder.paymentCalculationPeriod(f: PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.() -> Unit) = addPaymentCalculationPeriod(PaymentCalculationPeriod.PaymentCalculationPeriodBuilder().apply(f).build())
fun CashflowRepresentation.CashflowRepresentationBuilder.paymentCalculationPeriod(index: Int, f: PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.() -> Unit) = getOrCreatePaymentCalculationPeriod(index).apply{PaymentCalculationPeriod.PaymentCalculationPeriodBuilder().apply(f).build()}
fun CashflowRepresentation.CashflowRepresentationBuilder.principalExchange(f: PrincipalExchange.PrincipalExchangeBuilder.() -> Unit) = addPrincipalExchange(PrincipalExchange.PrincipalExchangeBuilder().apply(f).build())
fun CashflowRepresentation.CashflowRepresentationBuilder.principalExchange(index: Int, f: PrincipalExchange.PrincipalExchangeBuilder.() -> Unit) = getOrCreatePrincipalExchange(index).apply{PrincipalExchange.PrincipalExchangeBuilder().apply(f).build()}

fun CleanOrDirtyPrice.CleanOrDirtyPriceBuilder.cleanPrice(f: CleanPrice.CleanPriceBuilder.() -> Unit) = orCreateCleanPrice.apply(f)


fun ClearingInstruction.ClearingInstructionBuilder.alphaContract(f: Contract.ContractBuilder.() -> Unit) = orCreateAlphaContract.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.clearerParty1(f: Party.PartyBuilder.() -> Unit) = orCreateClearerParty1.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.clearerParty2(f: Party.PartyBuilder.() -> Unit) = orCreateClearerParty2.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.clearingParty(f: Party.PartyBuilder.() -> Unit) = orCreateClearingParty.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.party1(f: Party.PartyBuilder.() -> Unit) = orCreateParty1.apply(f)
fun ClearingInstruction.ClearingInstructionBuilder.party2(f: Party.PartyBuilder.() -> Unit) = orCreateParty2.apply(f)


fun Collateral.CollateralBuilder.independentAmount(f: IndependentAmount.IndependentAmountBuilder.() -> Unit) = orCreateIndependentAmount.apply(f)


fun CollateralIssuerType.CollateralIssuerTypeBuilder.quasiGovernmentType(f: QuasiGovernmentIssuerType.QuasiGovernmentIssuerTypeBuilder.() -> Unit) = orCreateQuasiGovernmentType.apply(f)
fun CollateralIssuerType.CollateralIssuerTypeBuilder.regionalGovernmentType(f: RegionalGovernmentIssuerType.RegionalGovernmentIssuerTypeBuilder.() -> Unit) = orCreateRegionalGovernmentType.apply(f)
fun CollateralIssuerType.CollateralIssuerTypeBuilder.specialPurposeVehicleType(f: SpecialPurposeVehicleIssuerType.SpecialPurposeVehicleIssuerTypeBuilder.() -> Unit) = orCreateSpecialPurposeVehicleType.apply(f)

fun CollateralManagementAgreement.CollateralManagementAgreementBuilder.partyElection(f: CollateralManagementAgreementElection.CollateralManagementAgreementElectionBuilder.() -> Unit) = addPartyElection(CollateralManagementAgreementElection.CollateralManagementAgreementElectionBuilder().apply(f).build())
fun CollateralManagementAgreement.CollateralManagementAgreementBuilder.partyElection(index: Int, f: CollateralManagementAgreementElection.CollateralManagementAgreementElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{CollateralManagementAgreementElection.CollateralManagementAgreementElectionBuilder().apply(f).build()}



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
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.substitutedRegime(f: SubstitutedRegime.SubstitutedRegimeBuilder.() -> Unit) = orCreateSubstitutedRegime.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.substitution(f: Substitution.SubstitutionBuilder.() -> Unit) = orCreateSubstitution.apply(f)
fun CollateralTransferAgreementElections.CollateralTransferAgreementElectionsBuilder.terminationCurrencyAmendment(f: TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.() -> Unit) = orCreateTerminationCurrencyAmendment.apply(f)

fun CollateralTreatment.CollateralTreatmentBuilder.concentrationLimit(f: ConcentrationLimit.ConcentrationLimitBuilder.() -> Unit) = addConcentrationLimit(ConcentrationLimit.ConcentrationLimitBuilder().apply(f).build())
fun CollateralTreatment.CollateralTreatmentBuilder.concentrationLimit(index: Int, f: ConcentrationLimit.ConcentrationLimitBuilder.() -> Unit) = getOrCreateConcentrationLimit(index).apply{ConcentrationLimit.ConcentrationLimitBuilder().apply(f).build()}
fun CollateralTreatment.CollateralTreatmentBuilder.valuationPercentage(f: CollateralValuationPercentage.CollateralValuationPercentageBuilder.() -> Unit) = orCreateValuationPercentage.apply(f)

fun CollateralValuationAgent.CollateralValuationAgentBuilder.partyElection(f: CollateralValuationAgentElection.CollateralValuationAgentElectionBuilder.() -> Unit) = addPartyElection(CollateralValuationAgentElection.CollateralValuationAgentElectionBuilder().apply(f).build())
fun CollateralValuationAgent.CollateralValuationAgentBuilder.partyElection(index: Int, f: CollateralValuationAgentElection.CollateralValuationAgentElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{CollateralValuationAgentElection.CollateralValuationAgentElectionBuilder().apply(f).build()}




fun CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.commodity(f: Commodity.CommodityBuilder.() -> Unit) = orCreateCommodity.apply(f)
fun CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.transferorTransferee(f: TransferorTransferee.TransferorTransfereeBuilder.() -> Unit) = orCreateTransferorTransferee.apply(f)

fun CommodityTransferComponent.CommodityTransferComponentBuilder.breakdown(f: CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.() -> Unit) = addBreakdown(CommodityTransferBreakdown.CommodityTransferBreakdownBuilder().apply(f).build())
fun CommodityTransferComponent.CommodityTransferComponentBuilder.breakdown(index: Int, f: CommodityTransferBreakdown.CommodityTransferBreakdownBuilder.() -> Unit) = getOrCreateBreakdown(index).apply{CommodityTransferBreakdown.CommodityTransferBreakdownBuilder().apply(f).build()}
fun CommodityTransferComponent.CommodityTransferComponentBuilder.commodity(f: Commodity.CommodityBuilder.() -> Unit) = orCreateCommodity.apply(f)
fun CommodityTransferComponent.CommodityTransferComponentBuilder.transferorTransferee(f: TransferorTransferee.TransferorTransfereeBuilder.() -> Unit) = orCreateTransferorTransferee.apply(f)

fun Composite.CompositeBuilder.fxSpotRateSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateFxSpotRateSource.apply(f)
fun Composite.CompositeBuilder.relativeDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateRelativeDate.apply(f)

fun ComputedAmount.ComputedAmountBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun ConcentrationLimit.ConcentrationLimitBuilder.concentrationLimitCriteria(f: ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.() -> Unit) = addConcentrationLimitCriteria(ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder().apply(f).build())
fun ConcentrationLimit.ConcentrationLimitBuilder.concentrationLimitCriteria(index: Int, f: ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.() -> Unit) = getOrCreateConcentrationLimitCriteria(index).apply{ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder().apply(f).build()}
fun ConcentrationLimit.ConcentrationLimitBuilder.valueCap(f: Money.MoneyBuilder.() -> Unit) = orCreateValueCap.apply(f)

fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.asset(f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = addAsset(AssetCriteria.AssetCriteriaBuilder().apply(f).build())
fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.asset(index: Int, f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = getOrCreateAsset(index).apply{AssetCriteria.AssetCriteriaBuilder().apply(f).build()}
fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.issuer(f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = addIssuer(IssuerCriteria.IssuerCriteriaBuilder().apply(f).build())
fun ConcentrationLimitCriteria.ConcentrationLimitCriteriaBuilder.issuer(index: Int, f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = getOrCreateIssuer(index).apply{IssuerCriteria.IssuerCriteriaBuilder().apply(f).build()}

fun ConditionsPrecedent.ConditionsPrecedentBuilder.accessConditions(f: AccessConditions.AccessConditionsBuilder.() -> Unit) = orCreateAccessConditions.apply(f)

fun Confirmation.ConfirmationBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = addIdentifier(Identifier.IdentifierBuilder().apply(f).build())
fun Confirmation.ConfirmationBuilder.identifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply{Identifier.IdentifierBuilder().apply(f).build()}
fun Confirmation.ConfirmationBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun Confirmation.ConfirmationBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilder().apply(f).build())
fun Confirmation.ConfirmationBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply{Party.PartyBuilder().apply(f).build()}
fun Confirmation.ConfirmationBuilder.partyRole(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRole(PartyRole.PartyRoleBuilder().apply(f).build())
fun Confirmation.ConfirmationBuilder.partyRole(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRole(index).apply{PartyRole.PartyRoleBuilder().apply(f).build()}


fun ContactElection.ContactElectionBuilder.partyElection(f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = addPartyElection(PartyContactInformation.PartyContactInformationBuilder().apply(f).build())
fun ContactElection.ContactElectionBuilder.partyElection(index: Int, f: PartyContactInformation.PartyContactInformationBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{PartyContactInformation.PartyContactInformationBuilder().apply(f).build()}

fun ContactInformation.ContactInformationBuilder.address(f: Address.AddressBuilder.() -> Unit) = addAddress(Address.AddressBuilder().apply(f).build())
fun ContactInformation.ContactInformationBuilder.address(index: Int, f: Address.AddressBuilder.() -> Unit) = getOrCreateAddress(index).apply{Address.AddressBuilder().apply(f).build()}
fun ContactInformation.ContactInformationBuilder.telephone(f: TelephoneNumber.TelephoneNumberBuilder.() -> Unit) = addTelephone(TelephoneNumber.TelephoneNumberBuilder().apply(f).build())
fun ContactInformation.ContactInformationBuilder.telephone(index: Int, f: TelephoneNumber.TelephoneNumberBuilder.() -> Unit) = getOrCreateTelephone(index).apply{TelephoneNumber.TelephoneNumberBuilder().apply(f).build()}

fun Contract.ContractBuilder.account(f: Account.AccountBuilder.() -> Unit) = addAccount(Account.AccountBuilder().apply(f).build())
fun Contract.ContractBuilder.account(index: Int, f: Account.AccountBuilder.() -> Unit) = getOrCreateAccount(index).apply{Account.AccountBuilder().apply(f).build()}
fun Contract.ContractBuilder.closedState(f: ClosedState.ClosedStateBuilder.() -> Unit) = orCreateClosedState.apply(f)
fun Contract.ContractBuilder.collateral(f: Collateral.CollateralBuilder.() -> Unit) = orCreateCollateral.apply(f)
fun Contract.ContractBuilder.contractIdentifier(f: Identifier.IdentifierBuilder.() -> Unit) = addContractIdentifier(Identifier.IdentifierBuilder().apply(f).build())
fun Contract.ContractBuilder.contractIdentifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateContractIdentifier(index).apply{Identifier.IdentifierBuilder().apply(f).build()}
fun Contract.ContractBuilder.documentation(f: RelatedAgreement.RelatedAgreementBuilder.() -> Unit) = orCreateDocumentation.apply(f)
fun Contract.ContractBuilder.governingLaw(f: FieldWithMetaGoverningLawEnum.FieldWithMetaGoverningLawEnumBuilder.() -> Unit) = orCreateGoverningLaw.apply(f)
fun Contract.ContractBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Contract.ContractBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilder().apply(f).build())
fun Contract.ContractBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply{Party.PartyBuilder().apply(f).build()}
fun Contract.ContractBuilder.partyContractInformation(f: PartyContractInformation.PartyContractInformationBuilder.() -> Unit) = addPartyContractInformation(PartyContractInformation.PartyContractInformationBuilder().apply(f).build())
fun Contract.ContractBuilder.partyContractInformation(index: Int, f: PartyContractInformation.PartyContractInformationBuilder.() -> Unit) = getOrCreatePartyContractInformation(index).apply{PartyContractInformation.PartyContractInformationBuilder().apply(f).build()}
fun Contract.ContractBuilder.partyRole(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRole(PartyRole.PartyRoleBuilder().apply(f).build())
fun Contract.ContractBuilder.partyRole(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRole(index).apply{PartyRole.PartyRoleBuilder().apply(f).build()}
fun Contract.ContractBuilder.tradableProduct(f: TradableProduct.TradableProductBuilder.() -> Unit) = orCreateTradableProduct.apply(f)
fun Contract.ContractBuilder.tradeDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateTradeDate.apply(f)

fun ContractFormationPrimitive.ContractFormationPrimitiveBuilder.after(f: PostContractFormationState.PostContractFormationStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun ContractFormationPrimitive.ContractFormationPrimitiveBuilder.before(f: ReferenceWithMetaExecutionState.ReferenceWithMetaExecutionStateBuilder.() -> Unit) = orCreateBefore.apply(f)

fun ContractState.ContractStateBuilder.contract(f: Contract.ContractBuilder.() -> Unit) = orCreateContract.apply(f)
fun ContractState.ContractStateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ContractState.ContractStateBuilder.updatedContract(f: Contract.ContractBuilder.() -> Unit) = orCreateUpdatedContract.apply(f)

fun ContractualMatrix.ContractualMatrixBuilder.matrixTerm(f: FieldWithMetaMatrixTermEnum.FieldWithMetaMatrixTermEnumBuilder.() -> Unit) = orCreateMatrixTerm.apply(f)
fun ContractualMatrix.ContractualMatrixBuilder.matrixType(f: FieldWithMetaMatrixTypeEnum.FieldWithMetaMatrixTypeEnumBuilder.() -> Unit) = orCreateMatrixType.apply(f)

fun ContractualProduct.ContractualProductBuilder.economicTerms(f: EconomicTerms.EconomicTermsBuilder.() -> Unit) = orCreateEconomicTerms.apply(f)
fun ContractualProduct.ContractualProductBuilder.meta(f: MetaAndTemplateFields.MetaAndTemplateFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ContractualProduct.ContractualProductBuilder.productIdentification(f: ProductIdentification.ProductIdentificationBuilder.() -> Unit) = orCreateProductIdentification.apply(f)
fun ContractualProduct.ContractualProductBuilder.productTaxonomy(f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = addProductTaxonomy(ProductTaxonomy.ProductTaxonomyBuilder().apply(f).build())
fun ContractualProduct.ContractualProductBuilder.productTaxonomy(index: Int, f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = getOrCreateProductTaxonomy(index).apply{ProductTaxonomy.ProductTaxonomyBuilder().apply(f).build()}

fun ContractualTermsSupplement.ContractualTermsSupplementBuilder.contractualTermsSupplementType(f: FieldWithMetaContractualSupplementEnum.FieldWithMetaContractualSupplementEnumBuilder.() -> Unit) = orCreateContractualTermsSupplementType.apply(f)

fun ControlAgreement.ControlAgreementBuilder.partyElection(f: ControlAgreementElections.ControlAgreementElectionsBuilder.() -> Unit) = addPartyElection(ControlAgreementElections.ControlAgreementElectionsBuilder().apply(f).build())
fun ControlAgreement.ControlAgreementBuilder.partyElection(index: Int, f: ControlAgreementElections.ControlAgreementElectionsBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{ControlAgreementElections.ControlAgreementElectionsBuilder().apply(f).build()}


fun ControlAgreementNecEvent.ControlAgreementNecEventBuilder.controlAgreementNecEventElection(f: ControlAgreementNecEventElection.ControlAgreementNecEventElectionBuilder.() -> Unit) = addControlAgreementNecEventElection(ControlAgreementNecEventElection.ControlAgreementNecEventElectionBuilder().apply(f).build())
fun ControlAgreementNecEvent.ControlAgreementNecEventBuilder.controlAgreementNecEventElection(index: Int, f: ControlAgreementNecEventElection.ControlAgreementNecEventElectionBuilder.() -> Unit) = getOrCreateControlAgreementNecEventElection(index).apply{ControlAgreementNecEventElection.ControlAgreementNecEventElectionBuilder().apply(f).build()}



fun Counterparty.CounterpartyBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)


fun CoveredTransactions.CoveredTransactionsBuilder.additionalObligations(f: AdditionalObligations.AdditionalObligationsBuilder.() -> Unit) = addAdditionalObligations(AdditionalObligations.AdditionalObligationsBuilder().apply(f).build())
fun CoveredTransactions.CoveredTransactionsBuilder.additionalObligations(index: Int, f: AdditionalObligations.AdditionalObligationsBuilder.() -> Unit) = getOrCreateAdditionalObligations(index).apply{AdditionalObligations.AdditionalObligationsBuilder().apply(f).build()}
fun CoveredTransactions.CoveredTransactionsBuilder.coveredTransactions(f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = addCoveredTransactions(ProductTaxonomy.ProductTaxonomyBuilder().apply(f).build())
fun CoveredTransactions.CoveredTransactionsBuilder.coveredTransactions(index: Int, f: ProductTaxonomy.ProductTaxonomyBuilder.() -> Unit) = getOrCreateCoveredTransactions(index).apply{ProductTaxonomy.ProductTaxonomyBuilder().apply(f).build()}

fun CreditDefaultPayout.CreditDefaultPayoutBuilder.cashSettlementTerms(f: CashSettlementTerms.CashSettlementTermsBuilder.() -> Unit) = addCashSettlementTerms(CashSettlementTerms.CashSettlementTermsBuilder().apply(f).build())
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.cashSettlementTerms(index: Int, f: CashSettlementTerms.CashSettlementTermsBuilder.() -> Unit) = getOrCreateCashSettlementTerms(index).apply{CashSettlementTerms.CashSettlementTermsBuilder().apply(f).build()}
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.generalTerms(f: GeneralTerms.GeneralTermsBuilder.() -> Unit) = orCreateGeneralTerms.apply(f)
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.physicalSettlementTerms(f: PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.() -> Unit) = addPhysicalSettlementTerms(PhysicalSettlementTerms.PhysicalSettlementTermsBuilder().apply(f).build())
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.physicalSettlementTerms(index: Int, f: PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.() -> Unit) = getOrCreatePhysicalSettlementTerms(index).apply{PhysicalSettlementTerms.PhysicalSettlementTermsBuilder().apply(f).build()}
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.protectionTerms(f: ProtectionTerms.ProtectionTermsBuilder.() -> Unit) = addProtectionTerms(ProtectionTerms.ProtectionTermsBuilder().apply(f).build())
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.protectionTerms(index: Int, f: ProtectionTerms.ProtectionTermsBuilder.() -> Unit) = getOrCreateProtectionTerms(index).apply{ProtectionTerms.ProtectionTermsBuilder().apply(f).build()}
fun CreditDefaultPayout.CreditDefaultPayoutBuilder.transactedPrice(f: TransactedPrice.TransactedPriceBuilder.() -> Unit) = orCreateTransactedPrice.apply(f)

fun CreditEventNotice.CreditEventNoticeBuilder.notifyingParty(f: NotifyingParty.NotifyingPartyBuilder.() -> Unit) = orCreateNotifyingParty.apply(f)
fun CreditEventNotice.CreditEventNoticeBuilder.publiclyAvailableInformation(f: PubliclyAvailableInformation.PubliclyAvailableInformationBuilder.() -> Unit) = orCreatePubliclyAvailableInformation.apply(f)

fun CreditEvents.CreditEventsBuilder.creditEventNotice(f: CreditEventNotice.CreditEventNoticeBuilder.() -> Unit) = orCreateCreditEventNotice.apply(f)
fun CreditEvents.CreditEventsBuilder.defaultRequirement(f: Money.MoneyBuilder.() -> Unit) = orCreateDefaultRequirement.apply(f)
fun CreditEvents.CreditEventsBuilder.failureToPay(f: FailureToPay.FailureToPayBuilder.() -> Unit) = orCreateFailureToPay.apply(f)
fun CreditEvents.CreditEventsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun CreditEvents.CreditEventsBuilder.restructuring(f: Restructuring.RestructuringBuilder.() -> Unit) = orCreateRestructuring.apply(f)

fun CreditLimitInformation.CreditLimitInformationBuilder.limitApplicable(f: LimitApplicableExtended.LimitApplicableExtendedBuilder.() -> Unit) = addLimitApplicable(LimitApplicableExtended.LimitApplicableExtendedBuilder().apply(f).build())
fun CreditLimitInformation.CreditLimitInformationBuilder.limitApplicable(index: Int, f: LimitApplicableExtended.LimitApplicableExtendedBuilder.() -> Unit) = getOrCreateLimitApplicable(index).apply{LimitApplicableExtended.LimitApplicableExtendedBuilder().apply(f).build()}

fun CreditLimitUtilisation.CreditLimitUtilisationBuilder.executed(f: CreditLimitUtilisationPosition.CreditLimitUtilisationPositionBuilder.() -> Unit) = orCreateExecuted.apply(f)
fun CreditLimitUtilisation.CreditLimitUtilisationBuilder.pending(f: CreditLimitUtilisationPosition.CreditLimitUtilisationPositionBuilder.() -> Unit) = orCreatePending.apply(f)


fun CreditNotation.CreditNotationBuilder.agency(f: FieldWithMetaCreditRatingAgencyEnum.FieldWithMetaCreditRatingAgencyEnumBuilder.() -> Unit) = orCreateAgency.apply(f)
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
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.substitutedRegime(f: SubstitutedRegime.SubstitutedRegimeBuilder.() -> Unit) = orCreateSubstitutedRegime.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.substitution(f: Substitution.SubstitutionBuilder.() -> Unit) = orCreateSubstitution.apply(f)
fun CreditSupportAgreementElections.CreditSupportAgreementElectionsBuilder.terminationCurrencyAmendment(f: TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.() -> Unit) = orCreateTerminationCurrencyAmendment.apply(f)

fun CreditSupportObligations.CreditSupportObligationsBuilder.bespokeTransferTiming(f: BespokeTransferTiming.BespokeTransferTimingBuilder.() -> Unit) = orCreateBespokeTransferTiming.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.creditSupportObligationsVariationMargin(f: CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.() -> Unit) = orCreateCreditSupportObligationsVariationMargin.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.marginApproach(f: MarginApproach.MarginApproachBuilder.() -> Unit) = orCreateMarginApproach.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.minimumTransferAmount(f: MinimumTransferAmount.MinimumTransferAmountBuilder.() -> Unit) = orCreateMinimumTransferAmount.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.rounding(f: CollateralRounding.CollateralRoundingBuilder.() -> Unit) = orCreateRounding.apply(f)
fun CreditSupportObligations.CreditSupportObligationsBuilder.threshold(f: Threshold.ThresholdBuilder.() -> Unit) = orCreateThreshold.apply(f)

fun CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.eligibleCollateral(f: EligibleCollateralVariationMargin.EligibleCollateralVariationMarginBuilder.() -> Unit) = orCreateEligibleCollateral.apply(f)
fun CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.ineligibleCreditSupport(f: IneligibleCreditSupport.IneligibleCreditSupportBuilder.() -> Unit) = orCreateIneligibleCreditSupport.apply(f)
fun CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.majorCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addMajorCurrency(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun CreditSupportObligationsVariationMargin.CreditSupportObligationsVariationMarginBuilder.majorCurrency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateMajorCurrency(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}

fun CrossCurrencyMethod.CrossCurrencyMethodBuilder.cashSettlementCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addCashSettlementCurrency(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun CrossCurrencyMethod.CrossCurrencyMethodBuilder.cashSettlementCurrency(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateCashSettlementCurrency(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun CrossCurrencyMethod.CrossCurrencyMethodBuilder.cashSettlementReferenceBanks(f: CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder.() -> Unit) = addCashSettlementReferenceBanks(CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder().apply(f).build())
fun CrossCurrencyMethod.CrossCurrencyMethodBuilder.cashSettlementReferenceBanks(index: Int, f: CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder.() -> Unit) = getOrCreateCashSettlementReferenceBanks(index).apply{CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder().apply(f).build()}

fun CrossCurrencyTerms.CrossCurrencyTermsBuilder.principalExchanges(f: PrincipalExchanges.PrincipalExchangesBuilder.() -> Unit) = orCreatePrincipalExchanges.apply(f)
fun CrossCurrencyTerms.CrossCurrencyTermsBuilder.settlementProvision(f: SettlementProvision.SettlementProvisionBuilder.() -> Unit) = orCreateSettlementProvision.apply(f)


fun Curve.CurveBuilder.commodityCurve(f: FieldWithMetaCommodityReferencePriceEnum.FieldWithMetaCommodityReferencePriceEnumBuilder.() -> Unit) = orCreateCommodityCurve.apply(f)
fun Curve.CurveBuilder.interestRateCurve(f: InterestRateCurve.InterestRateCurveBuilder.() -> Unit) = orCreateInterestRateCurve.apply(f)

fun Custodian.CustodianBuilder.partyElection(f: CustodianElection.CustodianElectionBuilder.() -> Unit) = addPartyElection(CustodianElection.CustodianElectionBuilder().apply(f).build())
fun Custodian.CustodianBuilder.partyElection(index: Int, f: CustodianElection.CustodianElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{CustodianElection.CustodianElectionBuilder().apply(f).build()}

fun CustodianElection.CustodianElectionBuilder.custodian(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateCustodian.apply(f)
fun CustodianElection.CustodianElectionBuilder.segregatedCashAccount(f: Account.AccountBuilder.() -> Unit) = orCreateSegregatedCashAccount.apply(f)
fun CustodianElection.CustodianElectionBuilder.segregatedSecurityAccount(f: Account.AccountBuilder.() -> Unit) = orCreateSegregatedSecurityAccount.apply(f)

fun CustodianEvent.CustodianEventBuilder.endDate(f: CustodianEventEndDate.CustodianEventEndDateBuilder.() -> Unit) = orCreateEndDate.apply(f)

fun CustodianEventEndDate.CustodianEventEndDateBuilder.dateOfTimelyStatement(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateDateOfTimelyStatement.apply(f)
fun CustodianEventEndDate.CustodianEventEndDateBuilder.daysAfterCustodianEvent(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateDaysAfterCustodianEvent.apply(f)
fun CustodianEventEndDate.CustodianEventEndDateBuilder.releaseDate(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateReleaseDate.apply(f)
fun CustodianEventEndDate.CustodianEventEndDateBuilder.safekeepingPeriodExpiry(f: CustomisableOffset.CustomisableOffsetBuilder.() -> Unit) = orCreateSafekeepingPeriodExpiry.apply(f)

fun CustodianRisk.CustodianRiskBuilder.partyElection(f: CustodianRiskElection.CustodianRiskElectionBuilder.() -> Unit) = addPartyElection(CustodianRiskElection.CustodianRiskElectionBuilder().apply(f).build())
fun CustodianRisk.CustodianRiskBuilder.partyElection(index: Int, f: CustodianRiskElection.CustodianRiskElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{CustodianRiskElection.CustodianRiskElectionBuilder().apply(f).build()}


fun CustodianTerms.CustodianTermsBuilder.initialDesignation(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateInitialDesignation.apply(f)
fun CustodianTerms.CustodianTermsBuilder.minimumAssets(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumAssets.apply(f)
fun CustodianTerms.CustodianTermsBuilder.minimumRating(f: CreditNotations.CreditNotationsBuilder.() -> Unit) = orCreateMinimumRating.apply(f)

fun CustodyArrangements.CustodyArrangementsBuilder.collateralAccessBreach(f: CollateralAccessBreach.CollateralAccessBreachBuilder.() -> Unit) = orCreateCollateralAccessBreach.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.collateralManagementAgreeement(f: CollateralManagementAgreement.CollateralManagementAgreementBuilder.() -> Unit) = orCreateCollateralManagementAgreeement.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.controlAgreement(f: ControlAgreement.ControlAgreementBuilder.() -> Unit) = orCreateControlAgreement.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.custodian(f: Custodian.CustodianBuilder.() -> Unit) = orCreateCustodian.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.custodianEvent(f: CustodianEvent.CustodianEventBuilder.() -> Unit) = orCreateCustodianEvent.apply(f)
fun CustodyArrangements.CustodyArrangementsBuilder.custodianRisk(f: CustodianRisk.CustodianRiskBuilder.() -> Unit) = orCreateCustodianRisk.apply(f)

fun CustomisableOffset.CustomisableOffsetBuilder.offset(f: Offset.OffsetBuilder.() -> Unit) = orCreateOffset.apply(f)





fun DateRelativeToCalculationPeriodDates.DateRelativeToCalculationPeriodDatesBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = addCalculationPeriodDatesReference(ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder().apply(f).build())
fun DateRelativeToCalculationPeriodDates.DateRelativeToCalculationPeriodDatesBuilder.calculationPeriodDatesReference(index: Int, f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = getOrCreateCalculationPeriodDatesReference(index).apply{ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder().apply(f).build()}

fun DateRelativeToPaymentDates.DateRelativeToPaymentDatesBuilder.paymentDatesReference(f: ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder.() -> Unit) = addPaymentDatesReference(ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder().apply(f).build())
fun DateRelativeToPaymentDates.DateRelativeToPaymentDatesBuilder.paymentDatesReference(index: Int, f: ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder.() -> Unit) = getOrCreatePaymentDatesReference(index).apply{ReferenceWithMetaPaymentDates.ReferenceWithMetaPaymentDatesBuilder().apply(f).build()}



fun DebtType.DebtTypeBuilder.debtEconomics(f: DebtEconomics.DebtEconomicsBuilder.() -> Unit) = addDebtEconomics(DebtEconomics.DebtEconomicsBuilder().apply(f).build())
fun DebtType.DebtTypeBuilder.debtEconomics(index: Int, f: DebtEconomics.DebtEconomicsBuilder.() -> Unit) = getOrCreateDebtEconomics(index).apply{DebtEconomics.DebtEconomicsBuilder().apply(f).build()}

fun DeliverableObligations.DeliverableObligationsBuilder.assignableLoan(f: PCDeliverableObligationCharac.PCDeliverableObligationCharacBuilder.() -> Unit) = orCreateAssignableLoan.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.consentRequiredLoan(f: PCDeliverableObligationCharac.PCDeliverableObligationCharacBuilder.() -> Unit) = orCreateConsentRequiredLoan.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.directLoanParticipation(f: LoanParticipation.LoanParticipationBuilder.() -> Unit) = orCreateDirectLoanParticipation.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.indirectLoanParticipation(f: LoanParticipation.LoanParticipationBuilder.() -> Unit) = orCreateIndirectLoanParticipation.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.maximumMaturity(f: Period.PeriodBuilder.() -> Unit) = orCreateMaximumMaturity.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.notDomesticCurrency(f: NotDomesticCurrency.NotDomesticCurrencyBuilder.() -> Unit) = orCreateNotDomesticCurrency.apply(f)
fun DeliverableObligations.DeliverableObligationsBuilder.specifiedCurrency(f: SpecifiedCurrency.SpecifiedCurrencyBuilder.() -> Unit) = orCreateSpecifiedCurrency.apply(f)


fun DerivInstrmAttrbts.DerivInstrmAttrbtsBuilder.undrlygInstrm(f: UndrlygInstrm.UndrlygInstrmBuilder.() -> Unit) = orCreateUndrlygInstrm.apply(f)

fun DiscountingMethod.DiscountingMethodBuilder.discountRateDayCountFraction(f: FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.() -> Unit) = orCreateDiscountRateDayCountFraction.apply(f)

fun DisputeResolution.DisputeResolutionBuilder.recalculationOfValue(f: RecalculationOfValue.RecalculationOfValueBuilder.() -> Unit) = orCreateRecalculationOfValue.apply(f)
fun DisputeResolution.DisputeResolutionBuilder.resolutionTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateResolutionTime.apply(f)

fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestAdjustment(f: InterestAdjustment.InterestAdjustmentBuilder.() -> Unit) = orCreateInterestAdjustment.apply(f)
fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestAmount(f: InterestAmount.InterestAmountBuilder.() -> Unit) = orCreateInterestAmount.apply(f)
fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestRate(f: EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.() -> Unit) = addInterestRate(EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder().apply(f).build())
fun DistributionAndInterestPayment.DistributionAndInterestPaymentBuilder.interestRate(index: Int, f: EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.() -> Unit) = getOrCreateInterestRate(index).apply{EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder().apply(f).build()}

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
fun DividendReturnTerms.DividendReturnTermsBuilder.extraordinaryDividendsParty(f: CounterpartyOrRelatedParty.CounterpartyOrRelatedPartyBuilder.() -> Unit) = orCreateExtraordinaryDividendsParty.apply(f)

fun Document.DocumentBuilder.finInstrmRptgTxRpt(f: FinInstrmRptgTxRpt.FinInstrmRptgTxRptBuilder.() -> Unit) = orCreateFinInstrmRptgTxRpt.apply(f)

fun DocumentationIdentification.DocumentationIdentificationBuilder.attachment(f: Resource.ResourceBuilder.() -> Unit) = addAttachment(Resource.ResourceBuilder().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.attachment(index: Int, f: Resource.ResourceBuilder.() -> Unit) = getOrCreateAttachment(index).apply{Resource.ResourceBuilder().apply(f).build()}
fun DocumentationIdentification.DocumentationIdentificationBuilder.brokerConfirmation(f: BrokerConfirmation.BrokerConfirmationBuilder.() -> Unit) = orCreateBrokerConfirmation.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualDefinitions(f: FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder.() -> Unit) = addContractualDefinitions(FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualDefinitions(index: Int, f: FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder.() -> Unit) = getOrCreateContractualDefinitions(index).apply{FieldWithMetaContractualDefinitionsEnum.FieldWithMetaContractualDefinitionsEnumBuilder().apply(f).build()}
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualMatrix(f: ContractualMatrix.ContractualMatrixBuilder.() -> Unit) = addContractualMatrix(ContractualMatrix.ContractualMatrixBuilder().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualMatrix(index: Int, f: ContractualMatrix.ContractualMatrixBuilder.() -> Unit) = getOrCreateContractualMatrix(index).apply{ContractualMatrix.ContractualMatrixBuilder().apply(f).build()}
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualTermsSupplement(f: ContractualTermsSupplement.ContractualTermsSupplementBuilder.() -> Unit) = addContractualTermsSupplement(ContractualTermsSupplement.ContractualTermsSupplementBuilder().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.contractualTermsSupplement(index: Int, f: ContractualTermsSupplement.ContractualTermsSupplementBuilder.() -> Unit) = getOrCreateContractualTermsSupplement(index).apply{ContractualTermsSupplement.ContractualTermsSupplementBuilder().apply(f).build()}
fun DocumentationIdentification.DocumentationIdentificationBuilder.creditSupportAgreement(f: CreditSupportAgreement.CreditSupportAgreementBuilder.() -> Unit) = orCreateCreditSupportAgreement.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.masterAgreement(f: MasterAgreement.MasterAgreementBuilder.() -> Unit) = orCreateMasterAgreement.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.masterConfirmation(f: MasterConfirmation.MasterConfirmationBuilder.() -> Unit) = orCreateMasterConfirmation.apply(f)
fun DocumentationIdentification.DocumentationIdentificationBuilder.otherAgreement(f: OtherAgreement.OtherAgreementBuilder.() -> Unit) = addOtherAgreement(OtherAgreement.OtherAgreementBuilder().apply(f).build())
fun DocumentationIdentification.DocumentationIdentificationBuilder.otherAgreement(index: Int, f: OtherAgreement.OtherAgreementBuilder.() -> Unit) = getOrCreateOtherAgreement(index).apply{OtherAgreement.OtherAgreementBuilder().apply(f).build()}

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
fun EligibilityToHoldCollateral.EligibilityToHoldCollateralBuilder.eligibleCountry(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addEligibleCountry(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun EligibilityToHoldCollateral.EligibilityToHoldCollateralBuilder.eligibleCountry(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateEligibleCountry(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}

fun EligibleCollateral.EligibleCollateralBuilder.criteria(f: EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.() -> Unit) = addCriteria(EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder().apply(f).build())
fun EligibleCollateral.EligibleCollateralBuilder.criteria(index: Int, f: EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.() -> Unit) = getOrCreateCriteria(index).apply{EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder().apply(f).build()}

fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.asset(f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = addAsset(AssetCriteria.AssetCriteriaBuilder().apply(f).build())
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.asset(index: Int, f: AssetCriteria.AssetCriteriaBuilder.() -> Unit) = getOrCreateAsset(index).apply{AssetCriteria.AssetCriteriaBuilder().apply(f).build()}
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.issuer(f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = addIssuer(IssuerCriteria.IssuerCriteriaBuilder().apply(f).build())
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.issuer(index: Int, f: IssuerCriteria.IssuerCriteriaBuilder.() -> Unit) = getOrCreateIssuer(index).apply{IssuerCriteria.IssuerCriteriaBuilder().apply(f).build()}
fun EligibleCollateralCriteria.EligibleCollateralCriteriaBuilder.treatment(f: CollateralTreatment.CollateralTreatmentBuilder.() -> Unit) = orCreateTreatment.apply(f)

fun EligibleCollateralVariationMargin.EligibleCollateralVariationMarginBuilder.partyElection(f: EligibleCollateralVariationMarginElection.EligibleCollateralVariationMarginElectionBuilder.() -> Unit) = orCreatePartyElection.apply(f)

fun EligibleCollateralVariationMarginElection.EligibleCollateralVariationMarginElectionBuilder.eligibleCollateral(f: EligibleCollateral.EligibleCollateralBuilder.() -> Unit) = addEligibleCollateral(EligibleCollateral.EligibleCollateralBuilder().apply(f).build())
fun EligibleCollateralVariationMarginElection.EligibleCollateralVariationMarginElectionBuilder.eligibleCollateral(index: Int, f: EligibleCollateral.EligibleCollateralBuilder.() -> Unit) = getOrCreateEligibleCollateral(index).apply{EligibleCollateral.EligibleCollateralBuilder().apply(f).build()}
fun EligibleCollateralVariationMarginElection.EligibleCollateralVariationMarginElectionBuilder.party(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateParty.apply(f)

fun EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.actual365Currency(f: FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.() -> Unit) = orCreateActual365Currency.apply(f)
fun EligibleCurrencyInterestRate.EligibleCurrencyInterestRateBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)





fun EquityPayout.EquityPayoutBuilder.calculationPeriodDates(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDates.apply(f)
fun EquityPayout.EquityPayoutBuilder.dividendReturnTerms(f: DividendReturnTerms.DividendReturnTermsBuilder.() -> Unit) = orCreateDividendReturnTerms.apply(f)
fun EquityPayout.EquityPayoutBuilder.fxFeature(f: FxFeature.FxFeatureBuilder.() -> Unit) = orCreateFxFeature.apply(f)
fun EquityPayout.EquityPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun EquityPayout.EquityPayoutBuilder.payerReceiver(f: PayerReceiver.PayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun EquityPayout.EquityPayoutBuilder.paymentDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreatePaymentDates.apply(f)
fun EquityPayout.EquityPayoutBuilder.priceReturnTerms(f: PriceReturnTerms.PriceReturnTermsBuilder.() -> Unit) = orCreatePriceReturnTerms.apply(f)
fun EquityPayout.EquityPayoutBuilder.settlementTerms(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateSettlementTerms.apply(f)
fun EquityPayout.EquityPayoutBuilder.underlier(f: Underlier.UnderlierBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.equityCalculationPeriod(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = orCreateEquityCalculationPeriod.apply(f)
fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.equityCashSettlementDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreateEquityCashSettlementDates.apply(f)
fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.pricingMethodElection(f: PriceReturnTerms.PriceReturnTermsBuilder.() -> Unit) = orCreatePricingMethodElection.apply(f)
fun EquitySwapMasterConfirmation2018.EquitySwapMasterConfirmation2018Builder.settlementTerms(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = orCreateSettlementTerms.apply(f)

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

fun EventEffect.EventEffectBuilder.contract(f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = addContract(ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build())
fun EventEffect.EventEffectBuilder.contract(index: Int, f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = getOrCreateContract(index).apply{ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build()}
fun EventEffect.EventEffectBuilder.effectedContract(f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = addEffectedContract(ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build())
fun EventEffect.EventEffectBuilder.effectedContract(index: Int, f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = getOrCreateEffectedContract(index).apply{ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build()}
fun EventEffect.EventEffectBuilder.effectedExecution(f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = addEffectedExecution(ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build())
fun EventEffect.EventEffectBuilder.effectedExecution(index: Int, f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = getOrCreateEffectedExecution(index).apply{ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build()}
fun EventEffect.EventEffectBuilder.execution(f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = addExecution(ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build())
fun EventEffect.EventEffectBuilder.execution(index: Int, f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = getOrCreateExecution(index).apply{ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build()}
fun EventEffect.EventEffectBuilder.productIdentifier(f: ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder().apply(f).build())
fun EventEffect.EventEffectBuilder.productIdentifier(index: Int, f: ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply{ReferenceWithMetaProductIdentifier.ReferenceWithMetaProductIdentifierBuilder().apply(f).build()}
fun EventEffect.EventEffectBuilder.transfer(f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = addTransfer(ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder().apply(f).build())
fun EventEffect.EventEffectBuilder.transfer(index: Int, f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = getOrCreateTransfer(index).apply{ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder().apply(f).build()}

fun EventTestBundle.EventTestBundleBuilder.computedAmount(f: ComputedAmount.ComputedAmountBuilder.() -> Unit) = addComputedAmount(ComputedAmount.ComputedAmountBuilder().apply(f).build())
fun EventTestBundle.EventTestBundleBuilder.computedAmount(index: Int, f: ComputedAmount.ComputedAmountBuilder.() -> Unit) = getOrCreateComputedAmount(index).apply{ComputedAmount.ComputedAmountBuilder().apply(f).build()}
fun EventTestBundle.EventTestBundleBuilder.event(f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = addEvent(WorkflowStep.WorkflowStepBuilder().apply(f).build())
fun EventTestBundle.EventTestBundleBuilder.event(index: Int, f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = getOrCreateEvent(index).apply{WorkflowStep.WorkflowStepBuilder().apply(f).build()}


fun ExchangeRate.ExchangeRateBuilder.crossRate(f: CrossRate.CrossRateBuilder.() -> Unit) = addCrossRate(CrossRate.CrossRateBuilder().apply(f).build())
fun ExchangeRate.ExchangeRateBuilder.crossRate(index: Int, f: CrossRate.CrossRateBuilder.() -> Unit) = getOrCreateCrossRate(index).apply{CrossRate.CrossRateBuilder().apply(f).build()}
fun ExchangeRate.ExchangeRateBuilder.quotedCurrencyPair(f: QuotedCurrencyPair.QuotedCurrencyPairBuilder.() -> Unit) = orCreateQuotedCurrencyPair.apply(f)


fun ExctgPrsn.ExctgPrsnBuilder.prsn(f: Prsn.PrsnBuilder.() -> Unit) = orCreatePrsn.apply(f)

fun ExecutingEntity.ExecutingEntityBuilder.addressOfBranch(f: Address.AddressBuilder.() -> Unit) = orCreateAddressOfBranch.apply(f)
fun ExecutingEntity.ExecutingEntityBuilder.addressOfIncorporation(f: Address.AddressBuilder.() -> Unit) = orCreateAddressOfIncorporation.apply(f)

fun Execution.ExecutionBuilder.closedState(f: ClosedState.ClosedStateBuilder.() -> Unit) = orCreateClosedState.apply(f)
fun Execution.ExecutionBuilder.executionVenue(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateExecutionVenue.apply(f)
fun Execution.ExecutionBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = addIdentifier(Identifier.IdentifierBuilder().apply(f).build())
fun Execution.ExecutionBuilder.identifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply{Identifier.IdentifierBuilder().apply(f).build()}
fun Execution.ExecutionBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Execution.ExecutionBuilder.party(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addParty(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build())
fun Execution.ExecutionBuilder.party(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreateParty(index).apply{ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build()}
fun Execution.ExecutionBuilder.partyRole(f: PartyRole.PartyRoleBuilder.() -> Unit) = addPartyRole(PartyRole.PartyRoleBuilder().apply(f).build())
fun Execution.ExecutionBuilder.partyRole(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreatePartyRole(index).apply{PartyRole.PartyRoleBuilder().apply(f).build()}
fun Execution.ExecutionBuilder.settlementTerms(f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = addSettlementTerms(SettlementTerms.SettlementTermsBuilder().apply(f).build())
fun Execution.ExecutionBuilder.settlementTerms(index: Int, f: SettlementTerms.SettlementTermsBuilder.() -> Unit) = getOrCreateSettlementTerms(index).apply{SettlementTerms.SettlementTermsBuilder().apply(f).build()}
fun Execution.ExecutionBuilder.tradableProduct(f: TradableProduct.TradableProductBuilder.() -> Unit) = orCreateTradableProduct.apply(f)
fun Execution.ExecutionBuilder.tradeDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateTradeDate.apply(f)



fun ExecutionPrimitive.ExecutionPrimitiveBuilder.after(f: ExecutionState.ExecutionStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun ExecutionPrimitive.ExecutionPrimitiveBuilder.before(f: ReferenceWithMetaExecutionState.ReferenceWithMetaExecutionStateBuilder.() -> Unit) = addBefore(ReferenceWithMetaExecutionState.ReferenceWithMetaExecutionStateBuilder().apply(f).build())
fun ExecutionPrimitive.ExecutionPrimitiveBuilder.before(index: Int, f: ReferenceWithMetaExecutionState.ReferenceWithMetaExecutionStateBuilder.() -> Unit) = getOrCreateBefore(index).apply{ReferenceWithMetaExecutionState.ReferenceWithMetaExecutionStateBuilder().apply(f).build()}

fun ExecutionState.ExecutionStateBuilder.execution(f: Execution.ExecutionBuilder.() -> Unit) = orCreateExecution.apply(f)
fun ExecutionState.ExecutionStateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExecutionTerms.ExecutionTermsBuilder.executionLanguage(f: ExecutionLanguage.ExecutionLanguageBuilder.() -> Unit) = orCreateExecutionLanguage.apply(f)
fun ExecutionTerms.ExecutionTermsBuilder.executionLocation(f: ExecutionLocation.ExecutionLocationBuilder.() -> Unit) = orCreateExecutionLocation.apply(f)

fun ExerciseEvent.ExerciseEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExerciseFee.ExerciseFeeBuilder.feePaymentDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateFeePaymentDate.apply(f)
fun ExerciseFee.ExerciseFeeBuilder.notionalReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionalReference.apply(f)

fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.feeAmountSchedule(f: AmountSchedule.AmountScheduleBuilder.() -> Unit) = orCreateFeeAmountSchedule.apply(f)
fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.feePaymentDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateFeePaymentDate.apply(f)
fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.feeRateSchedule(f: Schedule.ScheduleBuilder.() -> Unit) = orCreateFeeRateSchedule.apply(f)
fun ExerciseFeeSchedule.ExerciseFeeScheduleBuilder.notionalReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionalReference.apply(f)

fun ExerciseNotice.ExerciseNoticeBuilder.businessCenter(f: FieldWithMetaBusinessCenterEnum.FieldWithMetaBusinessCenterEnumBuilder.() -> Unit) = orCreateBusinessCenter.apply(f)

fun ExerciseOutcome.ExerciseOutcomeBuilder.cashExercise(f: CashExercise.CashExerciseBuilder.() -> Unit) = orCreateCashExercise.apply(f)
fun ExerciseOutcome.ExerciseOutcomeBuilder.contract(f: Contract.ContractBuilder.() -> Unit) = orCreateContract.apply(f)
fun ExerciseOutcome.ExerciseOutcomeBuilder.physicalExercise(f: PhysicalExercise.PhysicalExerciseBuilder.() -> Unit) = orCreatePhysicalExercise.apply(f)

fun ExercisePeriod.ExercisePeriodBuilder.earliestExerciseDateTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateEarliestExerciseDateTenor.apply(f)
fun ExercisePeriod.ExercisePeriodBuilder.exerciseFrequency(f: Period.PeriodBuilder.() -> Unit) = orCreateExerciseFrequency.apply(f)
fun ExercisePeriod.ExercisePeriodBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExercisePrimitive.ExercisePrimitiveBuilder.after(f: ExerciseOutcome.ExerciseOutcomeBuilder.() -> Unit) = orCreateAfter.apply(f)
fun ExercisePrimitive.ExercisePrimitiveBuilder.before(f: ReferenceWithMetaContractState.ReferenceWithMetaContractStateBuilder.() -> Unit) = orCreateBefore.apply(f)
fun ExercisePrimitive.ExercisePrimitiveBuilder.exerciseDate(f: AdjustableOrAdjustedDate.AdjustableOrAdjustedDateBuilder.() -> Unit) = orCreateExerciseDate.apply(f)
fun ExercisePrimitive.ExercisePrimitiveBuilder.exerciseTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateExerciseTime.apply(f)

fun ExerciseProcedure.ExerciseProcedureBuilder.automaticExercise(f: AutomaticExercise.AutomaticExerciseBuilder.() -> Unit) = orCreateAutomaticExercise.apply(f)
fun ExerciseProcedure.ExerciseProcedureBuilder.manualExercise(f: ManualExercise.ManualExerciseBuilder.() -> Unit) = orCreateManualExercise.apply(f)

fun ExtendibleProvision.ExtendibleProvisionBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.exerciseNotice(f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = orCreateExerciseNotice.apply(f)
fun ExtendibleProvision.ExtendibleProvisionBuilder.extendibleProvisionAdjustedDates(f: ExtendibleProvisionAdjustedDates.ExtendibleProvisionAdjustedDatesBuilder.() -> Unit) = orCreateExtendibleProvisionAdjustedDates.apply(f)

fun ExtendibleProvisionAdjustedDates.ExtendibleProvisionAdjustedDatesBuilder.extensionEvent(f: ExtensionEvent.ExtensionEventBuilder.() -> Unit) = addExtensionEvent(ExtensionEvent.ExtensionEventBuilder().apply(f).build())
fun ExtendibleProvisionAdjustedDates.ExtendibleProvisionAdjustedDatesBuilder.extensionEvent(index: Int, f: ExtensionEvent.ExtensionEventBuilder.() -> Unit) = getOrCreateExtensionEvent(index).apply{ExtensionEvent.ExtensionEventBuilder().apply(f).build()}

fun ExtensionEvent.ExtensionEventBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ExternalProductType.ExternalProductTypeBuilder.value(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateValue.apply(f)

fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.additionalDisruptionEvents(f: AdditionalDisruptionEvents.AdditionalDisruptionEventsBuilder.() -> Unit) = orCreateAdditionalDisruptionEvents.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.indexAdjustmentEvents(f: IndexAdjustmentEvents.IndexAdjustmentEventsBuilder.() -> Unit) = orCreateIndexAdjustmentEvents.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.mergerEvents(f: EquityCorporateEvents.EquityCorporateEventsBuilder.() -> Unit) = orCreateMergerEvents.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.representations(f: Representations.RepresentationsBuilder.() -> Unit) = orCreateRepresentations.apply(f)
fun ExtraordinaryEvents.ExtraordinaryEventsBuilder.tenderOfferEvents(f: EquityCorporateEvents.EquityCorporateEventsBuilder.() -> Unit) = orCreateTenderOfferEvents.apply(f)

fun FailureToPay.FailureToPayBuilder.gracePeriodExtension(f: GracePeriodExtension.GracePeriodExtensionBuilder.() -> Unit) = orCreateGracePeriodExtension.apply(f)
fun FailureToPay.FailureToPayBuilder.paymentRequirement(f: Money.MoneyBuilder.() -> Unit) = orCreatePaymentRequirement.apply(f)

fun FallbackReferencePrice.FallbackReferencePriceBuilder.calculationAgentDetermination(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgentDetermination.apply(f)
fun FallbackReferencePrice.FallbackReferencePriceBuilder.fallBackSettlementRateOption(f: FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.() -> Unit) = addFallBackSettlementRateOption(FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder().apply(f).build())
fun FallbackReferencePrice.FallbackReferencePriceBuilder.fallBackSettlementRateOption(index: Int, f: FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.() -> Unit) = getOrCreateFallBackSettlementRateOption(index).apply{FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder().apply(f).build()}
fun FallbackReferencePrice.FallbackReferencePriceBuilder.valuationPostponement(f: ValuationPostponement.ValuationPostponementBuilder.() -> Unit) = orCreateValuationPostponement.apply(f)

fun FeaturePayment.FeaturePaymentBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun FeaturePayment.FeaturePaymentBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FeaturePayment.FeaturePaymentBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun FeaturePayment.FeaturePaymentBuilder.paymentDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreatePaymentDate.apply(f)

fun FinInstrm.FinInstrmBuilder.othr(f: Othr.OthrBuilder.() -> Unit) = orCreateOthr.apply(f)


fun FinInstrmRptgTxRpt.FinInstrmRptgTxRptBuilder.tx(f: Tx.TxBuilder.() -> Unit) = orCreateTx.apply(f)

fun FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.relevantUnderlyingDateReference(f: ReferenceWithMetaAdjustableOrRelativeDates.ReferenceWithMetaAdjustableOrRelativeDatesBuilder.() -> Unit) = orCreateRelevantUnderlyingDateReference.apply(f)
fun FinalCalculationPeriodDateAdjustment.FinalCalculationPeriodDateAdjustmentBuilder.swapStreamReference(f: ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.() -> Unit) = orCreateSwapStreamReference.apply(f)


fun FixedRateSpecification.FixedRateSpecificationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FixedRateSpecification.FixedRateSpecificationBuilder.rateSchedule(f: Schedule.ScheduleBuilder.() -> Unit) = orCreateRateSchedule.apply(f)

fun FloatingAmountEvents.FloatingAmountEventsBuilder.additionalFixedPayments(f: AdditionalFixedPayments.AdditionalFixedPaymentsBuilder.() -> Unit) = orCreateAdditionalFixedPayments.apply(f)
fun FloatingAmountEvents.FloatingAmountEventsBuilder.floatingAmountProvisions(f: FloatingAmountProvisions.FloatingAmountProvisionsBuilder.() -> Unit) = orCreateFloatingAmountProvisions.apply(f)
fun FloatingAmountEvents.FloatingAmountEventsBuilder.interestShortfall(f: InterestShortFall.InterestShortFallBuilder.() -> Unit) = orCreateInterestShortfall.apply(f)



fun FloatingRate.FloatingRateBuilder.capRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addCapRateSchedule(StrikeSchedule.StrikeScheduleBuilder().apply(f).build())
fun FloatingRate.FloatingRateBuilder.capRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateCapRateSchedule(index).apply{StrikeSchedule.StrikeScheduleBuilder().apply(f).build()}
fun FloatingRate.FloatingRateBuilder.floatingRateMultiplierSchedule(f: Schedule.ScheduleBuilder.() -> Unit) = orCreateFloatingRateMultiplierSchedule.apply(f)
fun FloatingRate.FloatingRateBuilder.floorRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addFloorRateSchedule(StrikeSchedule.StrikeScheduleBuilder().apply(f).build())
fun FloatingRate.FloatingRateBuilder.floorRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateFloorRateSchedule(index).apply{StrikeSchedule.StrikeScheduleBuilder().apply(f).build()}
fun FloatingRate.FloatingRateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun FloatingRate.FloatingRateBuilder.spreadSchedule(f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = addSpreadSchedule(SpreadSchedule.SpreadScheduleBuilder().apply(f).build())
fun FloatingRate.FloatingRateBuilder.spreadSchedule(index: Int, f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = getOrCreateSpreadSchedule(index).apply{SpreadSchedule.SpreadScheduleBuilder().apply(f).build()}

fun FloatingRateDefinition.FloatingRateDefinitionBuilder.capRate(f: Strike.StrikeBuilder.() -> Unit) = addCapRate(Strike.StrikeBuilder().apply(f).build())
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.capRate(index: Int, f: Strike.StrikeBuilder.() -> Unit) = getOrCreateCapRate(index).apply{Strike.StrikeBuilder().apply(f).build()}
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.floorRate(f: Strike.StrikeBuilder.() -> Unit) = addFloorRate(Strike.StrikeBuilder().apply(f).build())
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.floorRate(index: Int, f: Strike.StrikeBuilder.() -> Unit) = getOrCreateFloorRate(index).apply{Strike.StrikeBuilder().apply(f).build()}
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.rateObservation(f: RateObservation.RateObservationBuilder.() -> Unit) = addRateObservation(RateObservation.RateObservationBuilder().apply(f).build())
fun FloatingRateDefinition.FloatingRateDefinitionBuilder.rateObservation(index: Int, f: RateObservation.RateObservationBuilder.() -> Unit) = getOrCreateRateObservation(index).apply{RateObservation.RateObservationBuilder().apply(f).build()}

fun FloatingRateOption.FloatingRateOptionBuilder.floatingRateIndex(f: FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.() -> Unit) = orCreateFloatingRateIndex.apply(f)
fun FloatingRateOption.FloatingRateOptionBuilder.indexTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateIndexTenor.apply(f)

fun FloatingRateSpecification.FloatingRateSpecificationBuilder.finalRateRounding(f: Rounding.RoundingBuilder.() -> Unit) = orCreateFinalRateRounding.apply(f)

fun ForeignExchange.ForeignExchangeBuilder.exchangeRate(f: ExchangeRate.ExchangeRateBuilder.() -> Unit) = orCreateExchangeRate.apply(f)
fun ForeignExchange.ForeignExchangeBuilder.exchangedCurrency1(f: Cashflow.CashflowBuilder.() -> Unit) = orCreateExchangedCurrency1.apply(f)
fun ForeignExchange.ForeignExchangeBuilder.exchangedCurrency2(f: Cashflow.CashflowBuilder.() -> Unit) = orCreateExchangedCurrency2.apply(f)
fun ForeignExchange.ForeignExchangeBuilder.tenorPeriod(f: Period.PeriodBuilder.() -> Unit) = orCreateTenorPeriod.apply(f)

fun ForwardPayout.ForwardPayoutBuilder.settlementTerms(f: OptionSettlement.OptionSettlementBuilder.() -> Unit) = orCreateSettlementTerms.apply(f)
fun ForwardPayout.ForwardPayoutBuilder.underlier(f: Underlier.UnderlierBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun FrenchLawAddendum.FrenchLawAddendumBuilder.partyElection(f: FrenchLawAddendumElection.FrenchLawAddendumElectionBuilder.() -> Unit) = addPartyElection(FrenchLawAddendumElection.FrenchLawAddendumElectionBuilder().apply(f).build())
fun FrenchLawAddendum.FrenchLawAddendumBuilder.partyElection(index: Int, f: FrenchLawAddendumElection.FrenchLawAddendumElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{FrenchLawAddendumElection.FrenchLawAddendumElectionBuilder().apply(f).build()}


fun Frequency.FrequencyBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun FutureValueAmount.FutureValueAmountBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun FxCashSettlement.FxCashSettlementBuilder.fixing(f: FxFixing.FxFixingBuilder.() -> Unit) = addFixing(FxFixing.FxFixingBuilder().apply(f).build())
fun FxCashSettlement.FxCashSettlementBuilder.fixing(index: Int, f: FxFixing.FxFixingBuilder.() -> Unit) = getOrCreateFixing(index).apply{FxFixing.FxFixingBuilder().apply(f).build()}
fun FxCashSettlement.FxCashSettlementBuilder.rateSourceFixing(f: FxRateSourceFixing.FxRateSourceFixingBuilder.() -> Unit) = addRateSourceFixing(FxRateSourceFixing.FxRateSourceFixingBuilder().apply(f).build())
fun FxCashSettlement.FxCashSettlementBuilder.rateSourceFixing(index: Int, f: FxRateSourceFixing.FxRateSourceFixingBuilder.() -> Unit) = getOrCreateRateSourceFixing(index).apply{FxRateSourceFixing.FxRateSourceFixingBuilder().apply(f).build()}
fun FxCashSettlement.FxCashSettlementBuilder.referenceCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateReferenceCurrency.apply(f)
fun FxCashSettlement.FxCashSettlementBuilder.settlementCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSettlementCurrency.apply(f)

fun FxFeature.FxFeatureBuilder.composite(f: Composite.CompositeBuilder.() -> Unit) = orCreateComposite.apply(f)
fun FxFeature.FxFeatureBuilder.crossCurrency(f: Composite.CompositeBuilder.() -> Unit) = orCreateCrossCurrency.apply(f)
fun FxFeature.FxFeatureBuilder.quanto(f: Quanto.QuantoBuilder.() -> Unit) = orCreateQuanto.apply(f)
fun FxFeature.FxFeatureBuilder.referenceCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateReferenceCurrency.apply(f)

fun FxFixing.FxFixingBuilder.fxSpotRateSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateFxSpotRateSource.apply(f)
fun FxFixing.FxFixingBuilder.quotedCurrencyPair(f: QuotedCurrencyPair.QuotedCurrencyPairBuilder.() -> Unit) = orCreateQuotedCurrencyPair.apply(f)

fun FxFixingDate.FxFixingDateBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)
fun FxFixingDate.FxFixingDateBuilder.businessCentersReference(f: ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.() -> Unit) = orCreateBusinessCentersReference.apply(f)
fun FxFixingDate.FxFixingDateBuilder.dateRelativeToCalculationPeriodDates(f: DateRelativeToCalculationPeriodDates.DateRelativeToCalculationPeriodDatesBuilder.() -> Unit) = orCreateDateRelativeToCalculationPeriodDates.apply(f)
fun FxFixingDate.FxFixingDateBuilder.dateRelativeToPaymentDates(f: DateRelativeToPaymentDates.DateRelativeToPaymentDatesBuilder.() -> Unit) = orCreateDateRelativeToPaymentDates.apply(f)

fun FxHaircutCurrency.FxHaircutCurrencyBuilder.fxDesignatedCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateFxDesignatedCurrency.apply(f)

fun FxInformationSource.FxInformationSourceBuilder.fixingTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateFixingTime.apply(f)


fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.fxSpotRateSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateFxSpotRateSource.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.varyingNotionalCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateVaryingNotionalCurrency.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.varyingNotionalFixingDates(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateVaryingNotionalFixingDates.apply(f)
fun FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.varyingNotionalInterimExchangePaymentDates(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateVaryingNotionalInterimExchangePaymentDates.apply(f)

fun FxRate.FxRateBuilder.quotedCurrencyPair(f: QuotedCurrencyPair.QuotedCurrencyPairBuilder.() -> Unit) = orCreateQuotedCurrencyPair.apply(f)

fun FxRateObservable.FxRateObservableBuilder.primaryFxSpotRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreatePrimaryFxSpotRateSource.apply(f)
fun FxRateObservable.FxRateObservableBuilder.quotedCurrencyPair(f: QuotedCurrencyPair.QuotedCurrencyPairBuilder.() -> Unit) = orCreateQuotedCurrencyPair.apply(f)
fun FxRateObservable.FxRateObservableBuilder.secondaryFxSpotRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateSecondaryFxSpotRateSource.apply(f)

fun FxRateSourceFixing.FxRateSourceFixingBuilder.fixingDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateFixingDate.apply(f)
fun FxRateSourceFixing.FxRateSourceFixingBuilder.settlementRateSource(f: FxSettlementRateSource.FxSettlementRateSourceBuilder.() -> Unit) = orCreateSettlementRateSource.apply(f)

fun FxSettlementRateSource.FxSettlementRateSourceBuilder.nonstandardSettlementRate(f: FxInformationSource.FxInformationSourceBuilder.() -> Unit) = orCreateNonstandardSettlementRate.apply(f)
fun FxSettlementRateSource.FxSettlementRateSourceBuilder.settlementRateOption(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSettlementRateOption.apply(f)

fun FxSpotRateSource.FxSpotRateSourceBuilder.fixingTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateFixingTime.apply(f)
fun FxSpotRateSource.FxSpotRateSourceBuilder.primaryRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreatePrimaryRateSource.apply(f)
fun FxSpotRateSource.FxSpotRateSourceBuilder.secondaryRateSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateSecondaryRateSource.apply(f)

fun GeneralSimmElections.GeneralSimmElectionsBuilder.simmCalculationCurrency(f: SimmCalculationCurrency.SimmCalculationCurrencyBuilder.() -> Unit) = orCreateSimmCalculationCurrency.apply(f)
fun GeneralSimmElections.GeneralSimmElectionsBuilder.simmVersion(f: SimmVersion.SimmVersionBuilder.() -> Unit) = orCreateSimmVersion.apply(f)

fun GeneralTerms.GeneralTermsBuilder.additionalTerm(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addAdditionalTerm(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun GeneralTerms.GeneralTermsBuilder.additionalTerm(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateAdditionalTerm(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun GeneralTerms.GeneralTermsBuilder.basketReferenceInformation(f: BasketReferenceInformation.BasketReferenceInformationBuilder.() -> Unit) = orCreateBasketReferenceInformation.apply(f)
fun GeneralTerms.GeneralTermsBuilder.buyerSeller(f: BuyerSeller.BuyerSellerBuilder.() -> Unit) = orCreateBuyerSeller.apply(f)
fun GeneralTerms.GeneralTermsBuilder.indexReferenceInformation(f: IndexReferenceInformation.IndexReferenceInformationBuilder.() -> Unit) = orCreateIndexReferenceInformation.apply(f)
fun GeneralTerms.GeneralTermsBuilder.referenceInformation(f: ReferenceInformation.ReferenceInformationBuilder.() -> Unit) = orCreateReferenceInformation.apply(f)

fun GracePeriodExtension.GracePeriodExtensionBuilder.gracePeriod(f: Offset.OffsetBuilder.() -> Unit) = orCreateGracePeriod.apply(f)

fun HoldingAndUsingPostedCollateral.HoldingAndUsingPostedCollateralBuilder.partyElection(f: HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder.() -> Unit) = addPartyElection(HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder().apply(f).build())
fun HoldingAndUsingPostedCollateral.HoldingAndUsingPostedCollateralBuilder.partyElection(index: Int, f: HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder().apply(f).build()}

fun HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder.eligibilityToHoldCollateral(f: EligibilityToHoldCollateral.EligibilityToHoldCollateralBuilder.() -> Unit) = orCreateEligibilityToHoldCollateral.apply(f)
fun HoldingAndUsingPostedCollateralElection.HoldingAndUsingPostedCollateralElectionBuilder.party(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateParty.apply(f)


fun IdentifiedProduct.IdentifiedProductBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = orCreateProductIdentifier.apply(f)

fun Identifier.IdentifierBuilder.assignedIdentifier(f: AssignedIdentifier.AssignedIdentifierBuilder.() -> Unit) = addAssignedIdentifier(AssignedIdentifier.AssignedIdentifierBuilder().apply(f).build())
fun Identifier.IdentifierBuilder.assignedIdentifier(index: Int, f: AssignedIdentifier.AssignedIdentifierBuilder.() -> Unit) = getOrCreateAssignedIdentifier(index).apply{AssignedIdentifier.AssignedIdentifierBuilder().apply(f).build()}
fun Identifier.IdentifierBuilder.issuer(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIssuer.apply(f)
fun Identifier.IdentifierBuilder.issuerReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateIssuerReference.apply(f)
fun Identifier.IdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun IndependentAmount.IndependentAmountBuilder.paymentDetail(f: PaymentDetail.PaymentDetailBuilder.() -> Unit) = addPaymentDetail(PaymentDetail.PaymentDetailBuilder().apply(f).build())
fun IndependentAmount.IndependentAmountBuilder.paymentDetail(index: Int, f: PaymentDetail.PaymentDetailBuilder.() -> Unit) = getOrCreatePaymentDetail(index).apply{PaymentDetail.PaymentDetailBuilder().apply(f).build()}



fun IndexReferenceInformation.IndexReferenceInformationBuilder.excludedReferenceEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addExcludedReferenceEntity(LegalEntity.LegalEntityBuilder().apply(f).build())
fun IndexReferenceInformation.IndexReferenceInformationBuilder.excludedReferenceEntity(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateExcludedReferenceEntity(index).apply{LegalEntity.LegalEntityBuilder().apply(f).build()}
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexAnnexSource(f: FieldWithMetaIndexAnnexSourceEnum.FieldWithMetaIndexAnnexSourceEnumBuilder.() -> Unit) = orCreateIndexAnnexSource.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addIndexId(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateIndexId(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun IndexReferenceInformation.IndexReferenceInformationBuilder.indexName(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIndexName.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.settledEntityMatrix(f: SettledEntityMatrix.SettledEntityMatrixBuilder.() -> Unit) = orCreateSettledEntityMatrix.apply(f)
fun IndexReferenceInformation.IndexReferenceInformationBuilder.tranche(f: Tranche.TrancheBuilder.() -> Unit) = orCreateTranche.apply(f)

fun Indx.IndxBuilder.nm(f: Nm.NmBuilder.() -> Unit) = orCreateNm.apply(f)

fun IneligibleCreditSupport.IneligibleCreditSupportBuilder.specifiedParty(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addSpecifiedParty(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build())
fun IneligibleCreditSupport.IneligibleCreditSupportBuilder.specifiedParty(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreateSpecifiedParty(index).apply{ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build()}

fun InflationRateSpecification.InflationRateSpecificationBuilder.indexSource(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIndexSource.apply(f)
fun InflationRateSpecification.InflationRateSpecificationBuilder.inflationLag(f: Offset.OffsetBuilder.() -> Unit) = orCreateInflationLag.apply(f)
fun InflationRateSpecification.InflationRateSpecificationBuilder.interpolationMethod(f: FieldWithMetaInterpolationMethodEnum.FieldWithMetaInterpolationMethodEnumBuilder.() -> Unit) = orCreateInterpolationMethod.apply(f)
fun InflationRateSpecification.InflationRateSpecificationBuilder.mainPublication(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMainPublication.apply(f)

fun InformationSource.InformationSourceBuilder.sourcePage(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSourcePage.apply(f)
fun InformationSource.InformationSourceBuilder.sourceProvider(f: FieldWithMetaInformationProviderEnum.FieldWithMetaInformationProviderEnumBuilder.() -> Unit) = orCreateSourceProvider.apply(f)

fun InitialFixingDate.InitialFixingDateBuilder.relativeDateOffset(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateRelativeDateOffset.apply(f)

fun InitialMargin.InitialMarginBuilder.margin(f: InitialMarginCalculation.InitialMarginCalculationBuilder.() -> Unit) = addMargin(InitialMarginCalculation.InitialMarginCalculationBuilder().apply(f).build())
fun InitialMargin.InitialMarginBuilder.margin(index: Int, f: InitialMarginCalculation.InitialMarginCalculationBuilder.() -> Unit) = getOrCreateMargin(index).apply{InitialMarginCalculation.InitialMarginCalculationBuilder().apply(f).build()}
fun InitialMargin.InitialMarginBuilder.marginThreshold(f: Money.MoneyBuilder.() -> Unit) = orCreateMarginThreshold.apply(f)
fun InitialMargin.InitialMarginBuilder.minimumTransferAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateMinimumTransferAmount.apply(f)


fun Instruction.InstructionBuilder.allocation(f: AllocationInstruction.AllocationInstructionBuilder.() -> Unit) = orCreateAllocation.apply(f)
fun Instruction.InstructionBuilder.clearing(f: ClearingInstruction.ClearingInstructionBuilder.() -> Unit) = orCreateClearing.apply(f)

fun InterestAdjustment.InterestAdjustmentBuilder.periodicity(f: InterestAdjustmentPeriodicity.InterestAdjustmentPeriodicityBuilder.() -> Unit) = orCreatePeriodicity.apply(f)


fun InterestAmount.InterestAmountBuilder.deliveryAmount(f: DeliveryAmount.DeliveryAmountBuilder.() -> Unit) = orCreateDeliveryAmount.apply(f)
fun InterestAmount.InterestAmountBuilder.returnAmount(f: ReturnAmount.ReturnAmountBuilder.() -> Unit) = orCreateReturnAmount.apply(f)

fun InterestRateCurve.InterestRateCurveBuilder.floatingRateIndex(f: FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.() -> Unit) = orCreateFloatingRateIndex.apply(f)
fun InterestRateCurve.InterestRateCurveBuilder.tenor(f: Period.PeriodBuilder.() -> Unit) = orCreateTenor.apply(f)

fun InterestRatePayout.InterestRatePayoutBuilder.bondReference(f: BondReference.BondReferenceBuilder.() -> Unit) = orCreateBondReference.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.calculationPeriodDates(f: CalculationPeriodDates.CalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDates.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.cashflowRepresentation(f: CashflowRepresentation.CashflowRepresentationBuilder.() -> Unit) = orCreateCashflowRepresentation.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.crossCurrencyTerms(f: CrossCurrencyTerms.CrossCurrencyTermsBuilder.() -> Unit) = orCreateCrossCurrencyTerms.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.dayCountFraction(f: FieldWithMetaDayCountFractionEnum.FieldWithMetaDayCountFractionEnumBuilder.() -> Unit) = orCreateDayCountFraction.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.discountingMethod(f: DiscountingMethod.DiscountingMethodBuilder.() -> Unit) = orCreateDiscountingMethod.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.payerReceiver(f: PayerReceiver.PayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.paymentDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreatePaymentDate.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.paymentDates(f: PaymentDates.PaymentDatesBuilder.() -> Unit) = orCreatePaymentDates.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.rateSpecification(f: RateSpecification.RateSpecificationBuilder.() -> Unit) = orCreateRateSpecification.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.resetDates(f: ResetDates.ResetDatesBuilder.() -> Unit) = orCreateResetDates.apply(f)
fun InterestRatePayout.InterestRatePayoutBuilder.stubPeriod(f: StubPeriod.StubPeriodBuilder.() -> Unit) = orCreateStubPeriod.apply(f)

fun InterestShortFall.InterestShortFallBuilder.rateSource(f: FieldWithMetaFloatingRateIndexEnum.FieldWithMetaFloatingRateIndexEnumBuilder.() -> Unit) = orCreateRateSource.apply(f)

fun InvstmtDcsnPrsn.InvstmtDcsnPrsnBuilder.prsn(f: Prsn.PrsnBuilder.() -> Unit) = orCreatePrsn.apply(f)

fun IssuerCriteria.IssuerCriteriaBuilder.issuerAgencyRating(f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = addIssuerAgencyRating(AgencyRatingCriteria.AgencyRatingCriteriaBuilder().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerAgencyRating(index: Int, f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = getOrCreateIssuerAgencyRating(index).apply{AgencyRatingCriteria.AgencyRatingCriteriaBuilder().apply(f).build()}
fun IssuerCriteria.IssuerCriteriaBuilder.issuerCountryOfOrigin(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addIssuerCountryOfOrigin(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerCountryOfOrigin(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateIssuerCountryOfOrigin(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun IssuerCriteria.IssuerCriteriaBuilder.issuerName(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addIssuerName(LegalEntity.LegalEntityBuilder().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerName(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateIssuerName(index).apply{LegalEntity.LegalEntityBuilder().apply(f).build()}
fun IssuerCriteria.IssuerCriteriaBuilder.issuerType(f: CollateralIssuerType.CollateralIssuerTypeBuilder.() -> Unit) = addIssuerType(CollateralIssuerType.CollateralIssuerTypeBuilder().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.issuerType(index: Int, f: CollateralIssuerType.CollateralIssuerTypeBuilder.() -> Unit) = getOrCreateIssuerType(index).apply{CollateralIssuerType.CollateralIssuerTypeBuilder().apply(f).build()}
fun IssuerCriteria.IssuerCriteriaBuilder.sovereignAgencyRating(f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = addSovereignAgencyRating(AgencyRatingCriteria.AgencyRatingCriteriaBuilder().apply(f).build())
fun IssuerCriteria.IssuerCriteriaBuilder.sovereignAgencyRating(index: Int, f: AgencyRatingCriteria.AgencyRatingCriteriaBuilder.() -> Unit) = getOrCreateSovereignAgencyRating(index).apply{AgencyRatingCriteria.AgencyRatingCriteriaBuilder().apply(f).build()}

fun IssuerTradeId.IssuerTradeIdBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun IssuerTradeId.IssuerTradeIdBuilder.issuer(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIssuer.apply(f)


fun JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.frenchLawAddendum(f: FrenchLawAddendum.FrenchLawAddendumBuilder.() -> Unit) = orCreateFrenchLawAddendum.apply(f)
fun JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.japaneseSecuritiesProvisions(f: JapaneseSecuritiesProvisions.JapaneseSecuritiesProvisionsBuilder.() -> Unit) = orCreateJapaneseSecuritiesProvisions.apply(f)

fun Knock.KnockBuilder.knockIn(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateKnockIn.apply(f)
fun Knock.KnockBuilder.knockOut(f: TriggerEvent.TriggerEventBuilder.() -> Unit) = orCreateKnockOut.apply(f)

fun LegalAgreement.LegalAgreementBuilder.agreementTerms(f: AgreementTerms.AgreementTermsBuilder.() -> Unit) = orCreateAgreementTerms.apply(f)
fun LegalAgreement.LegalAgreementBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun LegalAgreementBase.LegalAgreementBaseBuilder.agreementType(f: LegalAgreementType.LegalAgreementTypeBuilder.() -> Unit) = orCreateAgreementType.apply(f)
fun LegalAgreementBase.LegalAgreementBaseBuilder.contractualParty(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addContractualParty(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build())
fun LegalAgreementBase.LegalAgreementBaseBuilder.contractualParty(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreateContractualParty(index).apply{ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build()}
fun LegalAgreementBase.LegalAgreementBaseBuilder.identifier(f: Identifier.IdentifierBuilder.() -> Unit) = addIdentifier(Identifier.IdentifierBuilder().apply(f).build())
fun LegalAgreementBase.LegalAgreementBaseBuilder.identifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateIdentifier(index).apply{Identifier.IdentifierBuilder().apply(f).build()}
fun LegalAgreementBase.LegalAgreementBaseBuilder.otherParty(f: PartyRole.PartyRoleBuilder.() -> Unit) = addOtherParty(PartyRole.PartyRoleBuilder().apply(f).build())
fun LegalAgreementBase.LegalAgreementBaseBuilder.otherParty(index: Int, f: PartyRole.PartyRoleBuilder.() -> Unit) = getOrCreateOtherParty(index).apply{PartyRole.PartyRoleBuilder().apply(f).build()}


fun LegalEntity.LegalEntityBuilder.entityId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addEntityId(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun LegalEntity.LegalEntityBuilder.entityId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateEntityId(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun LegalEntity.LegalEntityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun LegalEntity.LegalEntityBuilder.name(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateName.apply(f)

fun LimitApplicable.LimitApplicableBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun LimitApplicable.LimitApplicableBuilder.limitType(f: FieldWithMetaCreditLimitTypeEnum.FieldWithMetaCreditLimitTypeEnumBuilder.() -> Unit) = orCreateLimitType.apply(f)
fun LimitApplicable.LimitApplicableBuilder.utilization(f: CreditLimitUtilisation.CreditLimitUtilisationBuilder.() -> Unit) = orCreateUtilization.apply(f)
fun LimitApplicable.LimitApplicableBuilder.velocity(f: Velocity.VelocityBuilder.() -> Unit) = orCreateVelocity.apply(f)

fun LimitApplicableExtended.LimitApplicableExtendedBuilder.limitLevel(f: FieldWithMetaLimitLevelEnum.FieldWithMetaLimitLevelEnumBuilder.() -> Unit) = orCreateLimitLevel.apply(f)

fun Lineage.LineageBuilder.cashflowReference(f: ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.() -> Unit) = addCashflowReference(ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder().apply(f).build())
fun Lineage.LineageBuilder.cashflowReference(index: Int, f: ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder.() -> Unit) = getOrCreateCashflowReference(index).apply{ReferenceWithMetaCashflow.ReferenceWithMetaCashflowBuilder().apply(f).build()}
fun Lineage.LineageBuilder.contractReference(f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = addContractReference(ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build())
fun Lineage.LineageBuilder.contractReference(index: Int, f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = getOrCreateContractReference(index).apply{ReferenceWithMetaContract.ReferenceWithMetaContractBuilder().apply(f).build()}
fun Lineage.LineageBuilder.creditDefaultPayoutReference(f: ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder.() -> Unit) = addCreditDefaultPayoutReference(ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder().apply(f).build())
fun Lineage.LineageBuilder.creditDefaultPayoutReference(index: Int, f: ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder.() -> Unit) = getOrCreateCreditDefaultPayoutReference(index).apply{ReferenceWithMetaCreditDefaultPayout.ReferenceWithMetaCreditDefaultPayoutBuilder().apply(f).build()}
fun Lineage.LineageBuilder.equityPayoutReference(f: ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.() -> Unit) = addEquityPayoutReference(ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder().apply(f).build())
fun Lineage.LineageBuilder.equityPayoutReference(index: Int, f: ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder.() -> Unit) = getOrCreateEquityPayoutReference(index).apply{ReferenceWithMetaEquityPayout.ReferenceWithMetaEquityPayoutBuilder().apply(f).build()}
fun Lineage.LineageBuilder.eventReference(f: ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.() -> Unit) = addEventReference(ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder().apply(f).build())
fun Lineage.LineageBuilder.eventReference(index: Int, f: ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.() -> Unit) = getOrCreateEventReference(index).apply{ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder().apply(f).build()}
fun Lineage.LineageBuilder.executionReference(f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = addExecutionReference(ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build())
fun Lineage.LineageBuilder.executionReference(index: Int, f: ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder.() -> Unit) = getOrCreateExecutionReference(index).apply{ReferenceWithMetaExecution.ReferenceWithMetaExecutionBuilder().apply(f).build()}
fun Lineage.LineageBuilder.interestRatePayoutReference(f: ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.() -> Unit) = addInterestRatePayoutReference(ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder().apply(f).build())
fun Lineage.LineageBuilder.interestRatePayoutReference(index: Int, f: ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder.() -> Unit) = getOrCreateInterestRatePayoutReference(index).apply{ReferenceWithMetaInterestRatePayout.ReferenceWithMetaInterestRatePayoutBuilder().apply(f).build()}
fun Lineage.LineageBuilder.legalAgreement(f: ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder.() -> Unit) = addLegalAgreement(ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder().apply(f).build())
fun Lineage.LineageBuilder.legalAgreement(index: Int, f: ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder.() -> Unit) = getOrCreateLegalAgreement(index).apply{ReferenceWithMetaLegalAgreement.ReferenceWithMetaLegalAgreementBuilder().apply(f).build()}
fun Lineage.LineageBuilder.optionPayoutReference(f: ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder.() -> Unit) = addOptionPayoutReference(ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder().apply(f).build())
fun Lineage.LineageBuilder.optionPayoutReference(index: Int, f: ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder.() -> Unit) = getOrCreateOptionPayoutReference(index).apply{ReferenceWithMetaOptionPayout.ReferenceWithMetaOptionPayoutBuilder().apply(f).build()}
fun Lineage.LineageBuilder.portfolioStateReference(f: ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder.() -> Unit) = addPortfolioStateReference(ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder().apply(f).build())
fun Lineage.LineageBuilder.portfolioStateReference(index: Int, f: ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder.() -> Unit) = getOrCreatePortfolioStateReference(index).apply{ReferenceWithMetaPortfolioState.ReferenceWithMetaPortfolioStateBuilder().apply(f).build()}
fun Lineage.LineageBuilder.transferReference(f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = addTransferReference(ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder().apply(f).build())
fun Lineage.LineageBuilder.transferReference(index: Int, f: ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder.() -> Unit) = getOrCreateTransferReference(index).apply{ReferenceWithMetaTransferPrimitive.ReferenceWithMetaTransferPrimitiveBuilder().apply(f).build()}

fun Loan.LoanBuilder.borrower(f: LegalEntity.LegalEntityBuilder.() -> Unit) = addBorrower(LegalEntity.LegalEntityBuilder().apply(f).build())
fun Loan.LoanBuilder.borrower(index: Int, f: LegalEntity.LegalEntityBuilder.() -> Unit) = getOrCreateBorrower(index).apply{LegalEntity.LegalEntityBuilder().apply(f).build()}
fun Loan.LoanBuilder.facilityType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateFacilityType.apply(f)
fun Loan.LoanBuilder.lien(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateLien.apply(f)
fun Loan.LoanBuilder.tranche(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateTranche.apply(f)


fun MakeWholeAmount.MakeWholeAmountBuilder.earlyCallDate(f: FieldWithMetaDate.FieldWithMetaDateBuilder.() -> Unit) = orCreateEarlyCallDate.apply(f)

fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.calculationAgent(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgent.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.cashSettlement(f: OptionCashSettlement.OptionCashSettlementBuilder.() -> Unit) = orCreateCashSettlement.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.mandatoryEarlyTerminationAdjustedDates(f: MandatoryEarlyTerminationAdjustedDates.MandatoryEarlyTerminationAdjustedDatesBuilder.() -> Unit) = orCreateMandatoryEarlyTerminationAdjustedDates.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.mandatoryEarlyTerminationDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateMandatoryEarlyTerminationDate.apply(f)
fun MandatoryEarlyTermination.MandatoryEarlyTerminationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun ManualExercise.ManualExerciseBuilder.exerciseNotice(f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = orCreateExerciseNotice.apply(f)


fun MasterAgreement.MasterAgreementBuilder.masterAgreementId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMasterAgreementId.apply(f)
fun MasterAgreement.MasterAgreementBuilder.masterAgreementType(f: FieldWithMetaMasterAgreementTypeEnum.FieldWithMetaMasterAgreementTypeEnumBuilder.() -> Unit) = orCreateMasterAgreementType.apply(f)
fun MasterAgreement.MasterAgreementBuilder.masterAgreementVersion(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMasterAgreementVersion.apply(f)

fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.addressForNotices(f: AddressForNotices.AddressForNoticesBuilder.() -> Unit) = orCreateAddressForNotices.apply(f)
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.automaticEarlyTermination(f: AutomaticEarlyTermination.AutomaticEarlyTerminationBuilder.() -> Unit) = orCreateAutomaticEarlyTermination.apply(f)
fun MasterAgreementSchedule.MasterAgreementScheduleBuilder.terminationCurrency(f: TerminationCurrency.TerminationCurrencyBuilder.() -> Unit) = orCreateTerminationCurrency.apply(f)

fun MasterConfirmation.MasterConfirmationBuilder.masterConfirmationAnnexType(f: FieldWithMetaMasterConfirmationAnnexTypeEnum.FieldWithMetaMasterConfirmationAnnexTypeEnumBuilder.() -> Unit) = orCreateMasterConfirmationAnnexType.apply(f)
fun MasterConfirmation.MasterConfirmationBuilder.masterConfirmationType(f: FieldWithMetaMasterConfirmationTypeEnum.FieldWithMetaMasterConfirmationTypeEnumBuilder.() -> Unit) = orCreateMasterConfirmationType.apply(f)


fun MessageInformation.MessageInformationBuilder.copyTo(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addCopyTo(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun MessageInformation.MessageInformationBuilder.copyTo(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateCopyTo(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun MessageInformation.MessageInformationBuilder.messageId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMessageId.apply(f)
fun MessageInformation.MessageInformationBuilder.sentBy(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSentBy.apply(f)
fun MessageInformation.MessageInformationBuilder.sentTo(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addSentTo(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun MessageInformation.MessageInformationBuilder.sentTo(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateSentTo(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}

fun MinimumTransferAmount.MinimumTransferAmountBuilder.partyElection(f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = addPartyElection(ElectiveAmountElection.ElectiveAmountElectionBuilder().apply(f).build())
fun MinimumTransferAmount.MinimumTransferAmountBuilder.partyElection(index: Int, f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{ElectiveAmountElection.ElectiveAmountElectionBuilder().apply(f).build()}

fun MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.effectiveDate(f: AmendmentEffectiveDate.AmendmentEffectiveDateBuilder.() -> Unit) = orCreateEffectiveDate.apply(f)
fun MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.partyElections(f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = addPartyElections(ElectiveAmountElection.ElectiveAmountElectionBuilder().apply(f).build())
fun MinimumTransferAmountAmendment.MinimumTransferAmountAmendmentBuilder.partyElections(index: Int, f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = getOrCreatePartyElections(index).apply{ElectiveAmountElection.ElectiveAmountElectionBuilder().apply(f).build()}

fun Money.MoneyBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun Money.MoneyBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun MultipleCreditNotations.MultipleCreditNotationsBuilder.creditNotation(f: FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder.() -> Unit) = addCreditNotation(FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder().apply(f).build())
fun MultipleCreditNotations.MultipleCreditNotationsBuilder.creditNotation(index: Int, f: FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder.() -> Unit) = getOrCreateCreditNotation(index).apply{FieldWithMetaCreditNotation.FieldWithMetaCreditNotationBuilder().apply(f).build()}

fun MultipleDebtTypes.MultipleDebtTypesBuilder.debtType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addDebtType(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun MultipleDebtTypes.MultipleDebtTypesBuilder.debtType(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreateDebtType(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}




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

fun NonDeliverableSettlement.NonDeliverableSettlementBuilder.fxFixingDate(f: FxFixingDate.FxFixingDateBuilder.() -> Unit) = orCreateFxFixingDate.apply(f)
fun NonDeliverableSettlement.NonDeliverableSettlementBuilder.fxFixingSchedule(f: AdjustableDates.AdjustableDatesBuilder.() -> Unit) = orCreateFxFixingSchedule.apply(f)
fun NonDeliverableSettlement.NonDeliverableSettlementBuilder.priceSourceDisruption(f: PriceSourceDisruption.PriceSourceDisruptionBuilder.() -> Unit) = orCreatePriceSourceDisruption.apply(f)
fun NonDeliverableSettlement.NonDeliverableSettlementBuilder.referenceCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateReferenceCurrency.apply(f)
fun NonDeliverableSettlement.NonDeliverableSettlementBuilder.settlementRateOption(f: FieldWithMetaSettlementRateOptionEnum.FieldWithMetaSettlementRateOptionEnumBuilder.() -> Unit) = orCreateSettlementRateOption.apply(f)


fun NonNegativeQuantitySchedule.NonNegativeQuantityScheduleBuilder.initialQuantity(f: NonNegativeQuantity.NonNegativeQuantityBuilder.() -> Unit) = orCreateInitialQuantity.apply(f)
fun NonNegativeQuantitySchedule.NonNegativeQuantityScheduleBuilder.stepSchedule(f: NonNegativeStepSchedule.NonNegativeStepScheduleBuilder.() -> Unit) = orCreateStepSchedule.apply(f)

fun NonNegativeStep.NonNegativeStepBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun NonNegativeStepSchedule.NonNegativeStepScheduleBuilder.step(f: NonNegativeStep.NonNegativeStepBuilder.() -> Unit) = addStep(NonNegativeStep.NonNegativeStepBuilder().apply(f).build())
fun NonNegativeStepSchedule.NonNegativeStepScheduleBuilder.step(index: Int, f: NonNegativeStep.NonNegativeStepBuilder.() -> Unit) = getOrCreateStep(index).apply{NonNegativeStep.NonNegativeStepBuilder().apply(f).build()}

fun NotDomesticCurrency.NotDomesticCurrencyBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun NotificationTime.NotificationTimeBuilder.partyElections(f: NotificationTimeElection.NotificationTimeElectionBuilder.() -> Unit) = addPartyElections(NotificationTimeElection.NotificationTimeElectionBuilder().apply(f).build())
fun NotificationTime.NotificationTimeBuilder.partyElections(index: Int, f: NotificationTimeElection.NotificationTimeElectionBuilder.() -> Unit) = getOrCreatePartyElections(index).apply{NotificationTimeElection.NotificationTimeElectionBuilder().apply(f).build()}

fun NotificationTimeElection.NotificationTimeElectionBuilder.notificationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateNotificationTime.apply(f)


fun Obligations.ObligationsBuilder.designatedPriority(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateDesignatedPriority.apply(f)
fun Obligations.ObligationsBuilder.notDomesticCurrency(f: NotDomesticCurrency.NotDomesticCurrencyBuilder.() -> Unit) = orCreateNotDomesticCurrency.apply(f)
fun Obligations.ObligationsBuilder.specifiedCurrency(f: SpecifiedCurrency.SpecifiedCurrencyBuilder.() -> Unit) = orCreateSpecifiedCurrency.apply(f)

fun ObservationDates.ObservationDatesBuilder.observationSchedule(f: ObservationSchedule.ObservationScheduleBuilder.() -> Unit) = addObservationSchedule(ObservationSchedule.ObservationScheduleBuilder().apply(f).build())
fun ObservationDates.ObservationDatesBuilder.observationSchedule(index: Int, f: ObservationSchedule.ObservationScheduleBuilder.() -> Unit) = getOrCreateObservationSchedule(index).apply{ObservationSchedule.ObservationScheduleBuilder().apply(f).build()}
fun ObservationDates.ObservationDatesBuilder.parametricSchedule(f: PeriodicDates.PeriodicDatesBuilder.() -> Unit) = orCreateParametricSchedule.apply(f)

fun ObservationPrimitive.ObservationPrimitiveBuilder.source(f: ObservationSource.ObservationSourceBuilder.() -> Unit) = orCreateSource.apply(f)
fun ObservationPrimitive.ObservationPrimitiveBuilder.time(f: TimeZone.TimeZoneBuilder.() -> Unit) = orCreateTime.apply(f)

fun ObservationSchedule.ObservationScheduleBuilder.date(f: AdjustableOrAdjustedDate.AdjustableOrAdjustedDateBuilder.() -> Unit) = orCreateDate.apply(f)

fun ObservationSource.ObservationSourceBuilder.curve(f: Curve.CurveBuilder.() -> Unit) = orCreateCurve.apply(f)
fun ObservationSource.ObservationSourceBuilder.informationSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateInformationSource.apply(f)



fun OptionCashSettlement.OptionCashSettlementBuilder.cashPriceAlternateMethod(f: CashPriceMethod.CashPriceMethodBuilder.() -> Unit) = orCreateCashPriceAlternateMethod.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.cashPriceMethod(f: CashPriceMethod.CashPriceMethodBuilder.() -> Unit) = orCreateCashPriceMethod.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.cashSettlementPaymentDate(f: CashSettlementPaymentDate.CashSettlementPaymentDateBuilder.() -> Unit) = orCreateCashSettlementPaymentDate.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.cashSettlementValuationDate(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateCashSettlementValuationDate.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.cashSettlementValuationTime(f: BusinessCenterTime.BusinessCenterTimeBuilder.() -> Unit) = orCreateCashSettlementValuationTime.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.collateralizedCashPriceMethod(f: YieldCurveMethod.YieldCurveMethodBuilder.() -> Unit) = orCreateCollateralizedCashPriceMethod.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.crossCurrencyMethod(f: CrossCurrencyMethod.CrossCurrencyMethodBuilder.() -> Unit) = orCreateCrossCurrencyMethod.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.parYieldCurveAdjustedMethod(f: YieldCurveMethod.YieldCurveMethodBuilder.() -> Unit) = orCreateParYieldCurveAdjustedMethod.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.parYieldCurveUnadjustedMethod(f: YieldCurveMethod.YieldCurveMethodBuilder.() -> Unit) = orCreateParYieldCurveUnadjustedMethod.apply(f)
fun OptionCashSettlement.OptionCashSettlementBuilder.zeroCouponYieldAdjustedMethod(f: YieldCurveMethod.YieldCurveMethodBuilder.() -> Unit) = orCreateZeroCouponYieldAdjustedMethod.apply(f)

fun OptionDenomination.OptionDenominationBuilder.entitlementCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateEntitlementCurrency.apply(f)

fun OptionExercise.OptionExerciseBuilder.exerciseProcedure(f: ExerciseProcedure.ExerciseProcedureBuilder.() -> Unit) = orCreateExerciseProcedure.apply(f)
fun OptionExercise.OptionExerciseBuilder.optionStyle(f: OptionStyle.OptionStyleBuilder.() -> Unit) = orCreateOptionStyle.apply(f)
fun OptionExercise.OptionExerciseBuilder.settlement(f: OptionSettlement.OptionSettlementBuilder.() -> Unit) = orCreateSettlement.apply(f)
fun OptionExercise.OptionExerciseBuilder.strike(f: OptionStrike.OptionStrikeBuilder.() -> Unit) = orCreateStrike.apply(f)

fun OptionFeature.OptionFeatureBuilder.averagingRateFeature(f: AveragingObservation.AveragingObservationBuilder.() -> Unit) = orCreateAveragingRateFeature.apply(f)
fun OptionFeature.OptionFeatureBuilder.barrier(f: Barrier.BarrierBuilder.() -> Unit) = orCreateBarrier.apply(f)
fun OptionFeature.OptionFeatureBuilder.fxFeature(f: FxFeature.FxFeatureBuilder.() -> Unit) = orCreateFxFeature.apply(f)
fun OptionFeature.OptionFeatureBuilder.knock(f: Knock.KnockBuilder.() -> Unit) = orCreateKnock.apply(f)
fun OptionFeature.OptionFeatureBuilder.passThrough(f: PassThrough.PassThroughBuilder.() -> Unit) = orCreatePassThrough.apply(f)
fun OptionFeature.OptionFeatureBuilder.strategyFeature(f: StrategyFeature.StrategyFeatureBuilder.() -> Unit) = orCreateStrategyFeature.apply(f)

fun OptionPayout.OptionPayoutBuilder.buyerSeller(f: BuyerSeller.BuyerSellerBuilder.() -> Unit) = orCreateBuyerSeller.apply(f)
fun OptionPayout.OptionPayoutBuilder.denomination(f: OptionDenomination.OptionDenominationBuilder.() -> Unit) = orCreateDenomination.apply(f)
fun OptionPayout.OptionPayoutBuilder.exerciseTerms(f: OptionExercise.OptionExerciseBuilder.() -> Unit) = orCreateExerciseTerms.apply(f)
fun OptionPayout.OptionPayoutBuilder.feature(f: OptionFeature.OptionFeatureBuilder.() -> Unit) = orCreateFeature.apply(f)
fun OptionPayout.OptionPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun OptionPayout.OptionPayoutBuilder.underlier(f: Underlier.UnderlierBuilder.() -> Unit) = orCreateUnderlier.apply(f)

fun OptionPhysicalSettlement.OptionPhysicalSettlementBuilder.predeterminedClearingOrganizationParty(f: CounterpartyOrRelatedParty.CounterpartyOrRelatedPartyBuilder.() -> Unit) = orCreatePredeterminedClearingOrganizationParty.apply(f)

fun OptionProvision.OptionProvisionBuilder.cancelableProvision(f: CancelableProvision.CancelableProvisionBuilder.() -> Unit) = orCreateCancelableProvision.apply(f)
fun OptionProvision.OptionProvisionBuilder.extendibleProvision(f: ExtendibleProvision.ExtendibleProvisionBuilder.() -> Unit) = orCreateExtendibleProvision.apply(f)

fun OptionSettlement.OptionSettlementBuilder.cashSettlementTerms(f: OptionCashSettlement.OptionCashSettlementBuilder.() -> Unit) = orCreateCashSettlementTerms.apply(f)
fun OptionSettlement.OptionSettlementBuilder.fxSettlementTerms(f: FxCashSettlement.FxCashSettlementBuilder.() -> Unit) = orCreateFxSettlementTerms.apply(f)
fun OptionSettlement.OptionSettlementBuilder.physicalSettlementTerms(f: OptionPhysicalSettlement.OptionPhysicalSettlementBuilder.() -> Unit) = orCreatePhysicalSettlementTerms.apply(f)

fun OptionStrike.OptionStrikeBuilder.averagingStrikeFeature(f: AveragingObservation.AveragingObservationBuilder.() -> Unit) = orCreateAveragingStrikeFeature.apply(f)
fun OptionStrike.OptionStrikeBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)
fun OptionStrike.OptionStrikeBuilder.referenceSwapCurve(f: ReferenceSwapCurve.ReferenceSwapCurveBuilder.() -> Unit) = orCreateReferenceSwapCurve.apply(f)
fun OptionStrike.OptionStrikeBuilder.strikeReference(f: ReferenceWithMetaFixedRateSpecification.ReferenceWithMetaFixedRateSpecificationBuilder.() -> Unit) = orCreateStrikeReference.apply(f)

fun OptionStyle.OptionStyleBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun OptionStyle.OptionStyleBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun OptionStyle.OptionStyleBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)

fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.americanExercise(f: AmericanExercise.AmericanExerciseBuilder.() -> Unit) = orCreateAmericanExercise.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.bermudaExercise(f: BermudaExercise.BermudaExerciseBuilder.() -> Unit) = orCreateBermudaExercise.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.calculationAgent(f: CalculationAgent.CalculationAgentBuilder.() -> Unit) = orCreateCalculationAgent.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.cashSettlement(f: OptionCashSettlement.OptionCashSettlementBuilder.() -> Unit) = orCreateCashSettlement.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.europeanExercise(f: EuropeanExercise.EuropeanExerciseBuilder.() -> Unit) = orCreateEuropeanExercise.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.exerciseNotice(f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = addExerciseNotice(ExerciseNotice.ExerciseNoticeBuilder().apply(f).build())
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.exerciseNotice(index: Int, f: ExerciseNotice.ExerciseNoticeBuilder.() -> Unit) = getOrCreateExerciseNotice(index).apply{ExerciseNotice.ExerciseNoticeBuilder().apply(f).build()}
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.optionalEarlyTerminationAdjustedDates(f: OptionalEarlyTerminationAdjustedDates.OptionalEarlyTerminationAdjustedDatesBuilder.() -> Unit) = orCreateOptionalEarlyTerminationAdjustedDates.apply(f)
fun OptionalEarlyTermination.OptionalEarlyTerminationBuilder.singlePartyOption(f: BuyerSeller.BuyerSellerBuilder.() -> Unit) = orCreateSinglePartyOption.apply(f)

fun OptionalEarlyTerminationAdjustedDates.OptionalEarlyTerminationAdjustedDatesBuilder.earlyTerminationEvent(f: EarlyTerminationEvent.EarlyTerminationEventBuilder.() -> Unit) = addEarlyTerminationEvent(EarlyTerminationEvent.EarlyTerminationEventBuilder().apply(f).build())
fun OptionalEarlyTerminationAdjustedDates.OptionalEarlyTerminationAdjustedDatesBuilder.earlyTerminationEvent(index: Int, f: EarlyTerminationEvent.EarlyTerminationEventBuilder.() -> Unit) = getOrCreateEarlyTerminationEvent(index).apply{EarlyTerminationEvent.EarlyTerminationEventBuilder().apply(f).build()}


fun OtherAgreement.OtherAgreementBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun OtherAgreement.OtherAgreementBuilder.otherAgreementType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateOtherAgreementType.apply(f)
fun OtherAgreement.OtherAgreementBuilder.version(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateVersion.apply(f)


fun OtherAgreements.OtherAgreementsBuilder.japaneseLawCsa(f: OtherAgreementTerms.OtherAgreementTermsBuilder.() -> Unit) = orCreateJapaneseLawCsa.apply(f)
fun OtherAgreements.OtherAgreementsBuilder.otherCsa(f: OtherAgreementTerms.OtherAgreementTermsBuilder.() -> Unit) = orCreateOtherCsa.apply(f)


fun Othr.OthrBuilder.derivInstrmAttrbts(f: DerivInstrmAttrbts.DerivInstrmAttrbtsBuilder.() -> Unit) = orCreateDerivInstrmAttrbts.apply(f)
fun Othr.OthrBuilder.finInstrmGnlAttrbts(f: FinInstrmGnlAttrbts.FinInstrmGnlAttrbtsBuilder.() -> Unit) = orCreateFinInstrmGnlAttrbts.apply(f)
fun Othr.OthrBuilder.schmeNm(f: SchmeNm.SchmeNmBuilder.() -> Unit) = orCreateSchmeNm.apply(f)


fun PackageInformation.PackageInformationBuilder.relatedParty(f: RelatedParty.RelatedPartyBuilder.() -> Unit) = addRelatedParty(RelatedParty.RelatedPartyBuilder().apply(f).build())
fun PackageInformation.PackageInformationBuilder.relatedParty(index: Int, f: RelatedParty.RelatedPartyBuilder.() -> Unit) = getOrCreateRelatedParty(index).apply{RelatedParty.RelatedPartyBuilder().apply(f).build()}

fun PartialExercise.PartialExerciseBuilder.notionaReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionaReference.apply(f)

fun Party.PartyBuilder.account(f: Account.AccountBuilder.() -> Unit) = orCreateAccount.apply(f)
fun Party.PartyBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Party.PartyBuilder.name(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateName.apply(f)
fun Party.PartyBuilder.partyId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = addPartyId(FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build())
fun Party.PartyBuilder.partyId(index: Int, f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = getOrCreatePartyId(index).apply{FieldWithMetaString.FieldWithMetaStringBuilder().apply(f).build()}
fun Party.PartyBuilder.person(f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = addPerson(NaturalPerson.NaturalPersonBuilder().apply(f).build())
fun Party.PartyBuilder.person(index: Int, f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = getOrCreatePerson(index).apply{NaturalPerson.NaturalPersonBuilder().apply(f).build()}

fun PartyAgreementIdentifier.PartyAgreementIdentifierBuilder.documentIdentifier(f: FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.() -> Unit) = addDocumentIdentifier(FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder().apply(f).build())
fun PartyAgreementIdentifier.PartyAgreementIdentifierBuilder.documentIdentifier(index: Int, f: FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder.() -> Unit) = getOrCreateDocumentIdentifier(index).apply{FieldWithMetaIdentifier.FieldWithMetaIdentifierBuilder().apply(f).build()}
fun PartyAgreementIdentifier.PartyAgreementIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun PartyContactInformation.PartyContactInformationBuilder.businessUnit(f: BusinessUnit.BusinessUnitBuilder.() -> Unit) = addBusinessUnit(BusinessUnit.BusinessUnitBuilder().apply(f).build())
fun PartyContactInformation.PartyContactInformationBuilder.businessUnit(index: Int, f: BusinessUnit.BusinessUnitBuilder.() -> Unit) = getOrCreateBusinessUnit(index).apply{BusinessUnit.BusinessUnitBuilder().apply(f).build()}
fun PartyContactInformation.PartyContactInformationBuilder.contactInformation(f: ContactInformation.ContactInformationBuilder.() -> Unit) = orCreateContactInformation.apply(f)
fun PartyContactInformation.PartyContactInformationBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)
fun PartyContactInformation.PartyContactInformationBuilder.person(f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = addPerson(NaturalPerson.NaturalPersonBuilder().apply(f).build())
fun PartyContactInformation.PartyContactInformationBuilder.person(index: Int, f: NaturalPerson.NaturalPersonBuilder.() -> Unit) = getOrCreatePerson(index).apply{NaturalPerson.NaturalPersonBuilder().apply(f).build()}

fun PartyContractInformation.PartyContractInformationBuilder.accountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateAccountReference.apply(f)
fun PartyContractInformation.PartyContractInformationBuilder.category(f: FieldWithMetaCategoryEnum.FieldWithMetaCategoryEnumBuilder.() -> Unit) = orCreateCategory.apply(f)
fun PartyContractInformation.PartyContractInformationBuilder.naturalPersonRole(f: NaturalPersonRole.NaturalPersonRoleBuilder.() -> Unit) = addNaturalPersonRole(NaturalPersonRole.NaturalPersonRoleBuilder().apply(f).build())
fun PartyContractInformation.PartyContractInformationBuilder.naturalPersonRole(index: Int, f: NaturalPersonRole.NaturalPersonRoleBuilder.() -> Unit) = getOrCreateNaturalPersonRole(index).apply{NaturalPersonRole.NaturalPersonRoleBuilder().apply(f).build()}
fun PartyContractInformation.PartyContractInformationBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)
fun PartyContractInformation.PartyContractInformationBuilder.relatedParty(f: RelatedParty.RelatedPartyBuilder.() -> Unit) = orCreateRelatedParty.apply(f)

fun PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.customisedWorkflow(f: CustomisedWorkflow.CustomisedWorkflowBuilder.() -> Unit) = addCustomisedWorkflow(CustomisedWorkflow.CustomisedWorkflowBuilder().apply(f).build())
fun PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.customisedWorkflow(index: Int, f: CustomisedWorkflow.CustomisedWorkflowBuilder.() -> Unit) = getOrCreateCustomisedWorkflow(index).apply{CustomisedWorkflow.CustomisedWorkflowBuilder().apply(f).build()}
fun PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)

fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.payerAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreatePayerAccountReference.apply(f)
fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.payerPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePayerPartyReference.apply(f)
fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.receiverAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateReceiverAccountReference.apply(f)
fun PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.receiverPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateReceiverPartyReference.apply(f)

fun PartyRole.PartyRoleBuilder.ownershipPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateOwnershipPartyReference.apply(f)
fun PartyRole.PartyRoleBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)

fun PassThrough.PassThroughBuilder.passThroughItem(f: PassThroughItem.PassThroughItemBuilder.() -> Unit) = addPassThroughItem(PassThroughItem.PassThroughItemBuilder().apply(f).build())
fun PassThrough.PassThroughBuilder.passThroughItem(index: Int, f: PassThroughItem.PassThroughItemBuilder.() -> Unit) = getOrCreatePassThroughItem(index).apply{PassThroughItem.PassThroughItemBuilder().apply(f).build()}

fun PassThroughItem.PassThroughItemBuilder.payerReceiver(f: PayerReceiver.PayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)

fun PayerReceiver.PayerReceiverBuilder.payerPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePayerPartyReference.apply(f)
fun PayerReceiver.PayerReceiverBuilder.receiverPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateReceiverPartyReference.apply(f)

fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.calculationPeriod(f: CalculationPeriod.CalculationPeriodBuilder.() -> Unit) = addCalculationPeriod(CalculationPeriod.CalculationPeriodBuilder().apply(f).build())
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.calculationPeriod(index: Int, f: CalculationPeriod.CalculationPeriodBuilder.() -> Unit) = getOrCreateCalculationPeriod(index).apply{CalculationPeriod.CalculationPeriodBuilder().apply(f).build()}
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.forecastPaymentAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateForecastPaymentAmount.apply(f)
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PaymentCalculationPeriod.PaymentCalculationPeriodBuilder.presentValueAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePresentValueAmount.apply(f)

fun PaymentDateSchedule.PaymentDateScheduleBuilder.finalPaymentDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateFinalPaymentDate.apply(f)
fun PaymentDateSchedule.PaymentDateScheduleBuilder.interimPaymentDates(f: AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.() -> Unit) = addInterimPaymentDates(AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder().apply(f).build())
fun PaymentDateSchedule.PaymentDateScheduleBuilder.interimPaymentDates(index: Int, f: AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder.() -> Unit) = getOrCreateInterimPaymentDates(index).apply{AdjustableRelativeOrPeriodicDates.AdjustableRelativeOrPeriodicDatesBuilder().apply(f).build()}

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

fun Payout.PayoutBuilder.cashflow(f: Cashflow.CashflowBuilder.() -> Unit) = addCashflow(Cashflow.CashflowBuilder().apply(f).build())
fun Payout.PayoutBuilder.cashflow(index: Int, f: Cashflow.CashflowBuilder.() -> Unit) = getOrCreateCashflow(index).apply{Cashflow.CashflowBuilder().apply(f).build()}
fun Payout.PayoutBuilder.creditDefaultPayout(f: CreditDefaultPayout.CreditDefaultPayoutBuilder.() -> Unit) = orCreateCreditDefaultPayout.apply(f)
fun Payout.PayoutBuilder.equityPayout(f: EquityPayout.EquityPayoutBuilder.() -> Unit) = addEquityPayout(EquityPayout.EquityPayoutBuilder().apply(f).build())
fun Payout.PayoutBuilder.equityPayout(index: Int, f: EquityPayout.EquityPayoutBuilder.() -> Unit) = getOrCreateEquityPayout(index).apply{EquityPayout.EquityPayoutBuilder().apply(f).build()}
fun Payout.PayoutBuilder.forwardPayout(f: ForwardPayout.ForwardPayoutBuilder.() -> Unit) = addForwardPayout(ForwardPayout.ForwardPayoutBuilder().apply(f).build())
fun Payout.PayoutBuilder.forwardPayout(index: Int, f: ForwardPayout.ForwardPayoutBuilder.() -> Unit) = getOrCreateForwardPayout(index).apply{ForwardPayout.ForwardPayoutBuilder().apply(f).build()}
fun Payout.PayoutBuilder.interestRatePayout(f: InterestRatePayout.InterestRatePayoutBuilder.() -> Unit) = addInterestRatePayout(InterestRatePayout.InterestRatePayoutBuilder().apply(f).build())
fun Payout.PayoutBuilder.interestRatePayout(index: Int, f: InterestRatePayout.InterestRatePayoutBuilder.() -> Unit) = getOrCreateInterestRatePayout(index).apply{InterestRatePayout.InterestRatePayoutBuilder().apply(f).build()}
fun Payout.PayoutBuilder.optionPayout(f: OptionPayout.OptionPayoutBuilder.() -> Unit) = addOptionPayout(OptionPayout.OptionPayoutBuilder().apply(f).build())
fun Payout.PayoutBuilder.optionPayout(index: Int, f: OptionPayout.OptionPayoutBuilder.() -> Unit) = getOrCreateOptionPayout(index).apply{OptionPayout.OptionPayoutBuilder().apply(f).build()}
fun Payout.PayoutBuilder.securityPayout(f: SecurityPayout.SecurityPayoutBuilder.() -> Unit) = addSecurityPayout(SecurityPayout.SecurityPayoutBuilder().apply(f).build())
fun Payout.PayoutBuilder.securityPayout(index: Int, f: SecurityPayout.SecurityPayoutBuilder.() -> Unit) = getOrCreateSecurityPayout(index).apply{SecurityPayout.SecurityPayoutBuilder().apply(f).build()}

fun PayoutBase.PayoutBaseBuilder.payoutQuantity(f: ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.() -> Unit) = orCreatePayoutQuantity.apply(f)

fun PercentageRule.PercentageRuleBuilder.notionalAmountReference(f: ReferenceWithMetaMoney.ReferenceWithMetaMoneyBuilder.() -> Unit) = orCreateNotionalAmountReference.apply(f)

fun Period.PeriodBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun PeriodBound.PeriodBoundBuilder.period(f: Period.PeriodBuilder.() -> Unit) = orCreatePeriod.apply(f)

fun PeriodRange.PeriodRangeBuilder.lowerBound(f: PeriodBound.PeriodBoundBuilder.() -> Unit) = orCreateLowerBound.apply(f)
fun PeriodRange.PeriodRangeBuilder.upperBound(f: PeriodBound.PeriodBoundBuilder.() -> Unit) = orCreateUpperBound.apply(f)

fun PeriodicDates.PeriodicDatesBuilder.endDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateEndDate.apply(f)
fun PeriodicDates.PeriodicDatesBuilder.periodDatesAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreatePeriodDatesAdjustments.apply(f)
fun PeriodicDates.PeriodicDatesBuilder.periodFrequency(f: CalculationPeriodFrequency.CalculationPeriodFrequencyBuilder.() -> Unit) = orCreatePeriodFrequency.apply(f)
fun PeriodicDates.PeriodicDatesBuilder.startDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateStartDate.apply(f)

fun PhysicalExercise.PhysicalExerciseBuilder.cashflow(f: Cashflow.CashflowBuilder.() -> Unit) = orCreateCashflow.apply(f)
fun PhysicalExercise.PhysicalExerciseBuilder.product(f: Product.ProductBuilder.() -> Unit) = orCreateProduct.apply(f)
fun PhysicalExercise.PhysicalExerciseBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = orCreateQuantity.apply(f)
fun PhysicalExercise.PhysicalExerciseBuilder.quantityNotation(f: QuantityNotation.QuantityNotationBuilder.() -> Unit) = addQuantityNotation(QuantityNotation.QuantityNotationBuilder().apply(f).build())
fun PhysicalExercise.PhysicalExerciseBuilder.quantityNotation(index: Int, f: QuantityNotation.QuantityNotationBuilder.() -> Unit) = getOrCreateQuantityNotation(index).apply{QuantityNotation.QuantityNotationBuilder().apply(f).build()}


fun PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.deliverableObligations(f: DeliverableObligations.DeliverableObligationsBuilder.() -> Unit) = orCreateDeliverableObligations.apply(f)
fun PhysicalSettlementTerms.PhysicalSettlementTermsBuilder.physicalSettlementPeriod(f: PhysicalSettlementPeriod.PhysicalSettlementPeriodBuilder.() -> Unit) = orCreatePhysicalSettlementPeriod.apply(f)

fun Portfolio.PortfolioBuilder.aggregationParameters(f: AggregationParameters.AggregationParametersBuilder.() -> Unit) = orCreateAggregationParameters.apply(f)
fun Portfolio.PortfolioBuilder.portfolioState(f: PortfolioState.PortfolioStateBuilder.() -> Unit) = orCreatePortfolioState.apply(f)

fun PortfolioState.PortfolioStateBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun PortfolioState.PortfolioStateBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PortfolioState.PortfolioStateBuilder.positions(f: Position.PositionBuilder.() -> Unit) = addPositions(Position.PositionBuilder().apply(f).build())
fun PortfolioState.PortfolioStateBuilder.positions(index: Int, f: Position.PositionBuilder.() -> Unit) = getOrCreatePositions(index).apply{Position.PositionBuilder().apply(f).build()}

fun Position.PositionBuilder.cashBalance(f: Money.MoneyBuilder.() -> Unit) = orCreateCashBalance.apply(f)
fun Position.PositionBuilder.contractReference(f: ReferenceWithMetaContract.ReferenceWithMetaContractBuilder.() -> Unit) = orCreateContractReference.apply(f)
fun Position.PositionBuilder.product(f: Product.ProductBuilder.() -> Unit) = orCreateProduct.apply(f)
fun Position.PositionBuilder.quantity(f: Quantity.QuantityBuilder.() -> Unit) = orCreateQuantity.apply(f)

fun PostContractFormationState.PostContractFormationStateBuilder.creditLimitInformation(f: CreditLimitInformation.CreditLimitInformationBuilder.() -> Unit) = orCreateCreditLimitInformation.apply(f)
fun PostContractFormationState.PostContractFormationStateBuilder.tradeWarehouseWorkflow(f: TradeWarehouseWorkflow.TradeWarehouseWorkflowBuilder.() -> Unit) = orCreateTradeWarehouseWorkflow.apply(f)

fun PostedCreditSupportItem.PostedCreditSupportItemBuilder.cashOrSecurityValue(f: Money.MoneyBuilder.() -> Unit) = orCreateCashOrSecurityValue.apply(f)
fun PostedCreditSupportItem.PostedCreditSupportItemBuilder.disputedCashOrSecurityValue(f: Money.MoneyBuilder.() -> Unit) = orCreateDisputedCashOrSecurityValue.apply(f)

fun PostingObligations.PostingObligationsBuilder.partyElection(f: PostingObligationsElection.PostingObligationsElectionBuilder.() -> Unit) = addPartyElection(PostingObligationsElection.PostingObligationsElectionBuilder().apply(f).build())
fun PostingObligations.PostingObligationsBuilder.partyElection(index: Int, f: PostingObligationsElection.PostingObligationsElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{PostingObligationsElection.PostingObligationsElectionBuilder().apply(f).build()}

fun PostingObligationsElection.PostingObligationsElectionBuilder.eligibleCollateral(f: EligibleCollateral.EligibleCollateralBuilder.() -> Unit) = addEligibleCollateral(EligibleCollateral.EligibleCollateralBuilder().apply(f).build())
fun PostingObligationsElection.PostingObligationsElectionBuilder.eligibleCollateral(index: Int, f: EligibleCollateral.EligibleCollateralBuilder.() -> Unit) = getOrCreateEligibleCollateral(index).apply{EligibleCollateral.EligibleCollateralBuilder().apply(f).build()}

fun PremiumExpression.PremiumExpressionBuilder.pricePerOption(f: Money.MoneyBuilder.() -> Unit) = orCreatePricePerOption.apply(f)

fun Pric.PricBuilder.pric(f: Pric.PricBuilder.() -> Unit) = orCreatePric.apply(f)

fun Price.PriceBuilder.cashPrice(f: CashPrice.CashPriceBuilder.() -> Unit) = orCreateCashPrice.apply(f)
fun Price.PriceBuilder.exchangeRate(f: ExchangeRate.ExchangeRateBuilder.() -> Unit) = orCreateExchangeRate.apply(f)
fun Price.PriceBuilder.fixedInterestRate(f: FixedInterestRate.FixedInterestRateBuilder.() -> Unit) = orCreateFixedInterestRate.apply(f)
fun Price.PriceBuilder.floatingInterestRate(f: FloatingInterestRate.FloatingInterestRateBuilder.() -> Unit) = orCreateFloatingInterestRate.apply(f)

fun PriceNotation.PriceNotationBuilder.assetIdentifier(f: AssetIdentifier.AssetIdentifierBuilder.() -> Unit) = orCreateAssetIdentifier.apply(f)
fun PriceNotation.PriceNotationBuilder.price(f: Price.PriceBuilder.() -> Unit) = orCreatePrice.apply(f)

fun PriceReturnTerms.PriceReturnTermsBuilder.valuationPriceFinal(f: EquityValuation.EquityValuationBuilder.() -> Unit) = orCreateValuationPriceFinal.apply(f)
fun PriceReturnTerms.PriceReturnTermsBuilder.valuationPriceInterim(f: EquityValuation.EquityValuationBuilder.() -> Unit) = orCreateValuationPriceInterim.apply(f)

fun PriceSourceDisruption.PriceSourceDisruptionBuilder.fallbackReferencePrice(f: FallbackReferencePrice.FallbackReferencePriceBuilder.() -> Unit) = orCreateFallbackReferencePrice.apply(f)

fun PrimitiveEvent.PrimitiveEventBuilder.contractFormation(f: ContractFormationPrimitive.ContractFormationPrimitiveBuilder.() -> Unit) = orCreateContractFormation.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.execution(f: ExecutionPrimitive.ExecutionPrimitiveBuilder.() -> Unit) = orCreateExecution.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.exercise(f: ExercisePrimitive.ExercisePrimitiveBuilder.() -> Unit) = orCreateExercise.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.observation(f: ObservationPrimitive.ObservationPrimitiveBuilder.() -> Unit) = orCreateObservation.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.quantityChange(f: QuantityChangePrimitive.QuantityChangePrimitiveBuilder.() -> Unit) = orCreateQuantityChange.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.reset(f: ResetPrimitive.ResetPrimitiveBuilder.() -> Unit) = orCreateReset.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.split(f: SplitPrimitive.SplitPrimitiveBuilder.() -> Unit) = orCreateSplit.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.termsChange(f: TermsChangePrimitive.TermsChangePrimitiveBuilder.() -> Unit) = orCreateTermsChange.apply(f)
fun PrimitiveEvent.PrimitiveEventBuilder.transfer(f: TransferPrimitive.TransferPrimitiveBuilder.() -> Unit) = orCreateTransfer.apply(f)

fun PrincipalExchange.PrincipalExchangeBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun PrincipalExchange.PrincipalExchangeBuilder.presentValuePrincipalExchangeAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePresentValuePrincipalExchangeAmount.apply(f)

fun PrincipalExchanges.PrincipalExchangesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun ProcessAgent.ProcessAgentBuilder.partyElection(f: ProcessAgentElection.ProcessAgentElectionBuilder.() -> Unit) = addPartyElection(ProcessAgentElection.ProcessAgentElectionBuilder().apply(f).build())
fun ProcessAgent.ProcessAgentBuilder.partyElection(index: Int, f: ProcessAgentElection.ProcessAgentElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{ProcessAgentElection.ProcessAgentElectionBuilder().apply(f).build()}


fun Product.ProductBuilder.commodity(f: Commodity.CommodityBuilder.() -> Unit) = orCreateCommodity.apply(f)
fun Product.ProductBuilder.contractualProduct(f: ContractualProduct.ContractualProductBuilder.() -> Unit) = orCreateContractualProduct.apply(f)
fun Product.ProductBuilder.foreignExchange(f: ForeignExchange.ForeignExchangeBuilder.() -> Unit) = orCreateForeignExchange.apply(f)
fun Product.ProductBuilder.index(f: Index.IndexBuilder.() -> Unit) = orCreateIndex.apply(f)
fun Product.ProductBuilder.loan(f: Loan.LoanBuilder.() -> Unit) = orCreateLoan.apply(f)
fun Product.ProductBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun Product.ProductBuilder.security(f: Security.SecurityBuilder.() -> Unit) = orCreateSecurity.apply(f)

fun ProductBase.ProductBaseBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ProductIdentifier.ProductIdentifierBuilder().apply(f).build())
fun ProductBase.ProductBaseBuilder.productIdentifier(index: Int, f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply{ProductIdentifier.ProductIdentifierBuilder().apply(f).build()}

fun ProductIdentification.ProductIdentificationBuilder.externalProductType(f: ExternalProductType.ExternalProductTypeBuilder.() -> Unit) = addExternalProductType(ExternalProductType.ExternalProductTypeBuilder().apply(f).build())
fun ProductIdentification.ProductIdentificationBuilder.externalProductType(index: Int, f: ExternalProductType.ExternalProductTypeBuilder.() -> Unit) = getOrCreateExternalProductType(index).apply{ExternalProductType.ExternalProductTypeBuilder().apply(f).build()}
fun ProductIdentification.ProductIdentificationBuilder.primaryAssetData(f: FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.() -> Unit) = orCreatePrimaryAssetData.apply(f)
fun ProductIdentification.ProductIdentificationBuilder.productIdentifier(f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = addProductIdentifier(ProductIdentifier.ProductIdentifierBuilder().apply(f).build())
fun ProductIdentification.ProductIdentificationBuilder.productIdentifier(index: Int, f: ProductIdentifier.ProductIdentifierBuilder.() -> Unit) = getOrCreateProductIdentifier(index).apply{ProductIdentifier.ProductIdentifierBuilder().apply(f).build()}
fun ProductIdentification.ProductIdentificationBuilder.secondaryAssetData(f: FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.() -> Unit) = addSecondaryAssetData(FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder().apply(f).build())
fun ProductIdentification.ProductIdentificationBuilder.secondaryAssetData(index: Int, f: FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder.() -> Unit) = getOrCreateSecondaryAssetData(index).apply{FieldWithMetaAssetClassEnum.FieldWithMetaAssetClassEnumBuilder().apply(f).build()}

fun ProductIdentifier.ProductIdentifierBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun ProductIdentifier.ProductIdentifierBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun ProtectionTerms.ProtectionTermsBuilder.creditEvents(f: CreditEvents.CreditEventsBuilder.() -> Unit) = orCreateCreditEvents.apply(f)
fun ProtectionTerms.ProtectionTermsBuilder.floatingAmountEvents(f: FloatingAmountEvents.FloatingAmountEventsBuilder.() -> Unit) = orCreateFloatingAmountEvents.apply(f)
fun ProtectionTerms.ProtectionTermsBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ProtectionTerms.ProtectionTermsBuilder.obligations(f: Obligations.ObligationsBuilder.() -> Unit) = orCreateObligations.apply(f)

fun Prsn.PrsnBuilder.othr(f: Othr.OthrBuilder.() -> Unit) = orCreateOthr.apply(f)




fun QuantityChangePrimitive.QuantityChangePrimitiveBuilder.after(f: Trade.TradeBuilder.() -> Unit) = orCreateAfter.apply(f)
fun QuantityChangePrimitive.QuantityChangePrimitiveBuilder.before(f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = orCreateBefore.apply(f)


fun QuantityGroups.QuantityGroupsBuilder.quantityGroups(f: QuantityGroup.QuantityGroupBuilder.() -> Unit) = addQuantityGroups(QuantityGroup.QuantityGroupBuilder().apply(f).build())
fun QuantityGroups.QuantityGroupsBuilder.quantityGroups(index: Int, f: QuantityGroup.QuantityGroupBuilder.() -> Unit) = getOrCreateQuantityGroups(index).apply{QuantityGroup.QuantityGroupBuilder().apply(f).build()}

fun QuantityMultiplier.QuantityMultiplierBuilder.fxLinkedNotionalSchedule(f: FxLinkedNotionalSchedule.FxLinkedNotionalScheduleBuilder.() -> Unit) = orCreateFxLinkedNotionalSchedule.apply(f)

fun QuantityNotation.QuantityNotationBuilder.assetIdentifier(f: AssetIdentifier.AssetIdentifierBuilder.() -> Unit) = orCreateAssetIdentifier.apply(f)
fun QuantityNotation.QuantityNotationBuilder.quantity(f: NonNegativeQuantity.NonNegativeQuantityBuilder.() -> Unit) = orCreateQuantity.apply(f)

fun Quanto.QuantoBuilder.fxRate(f: FxRate.FxRateBuilder.() -> Unit) = addFxRate(FxRate.FxRateBuilder().apply(f).build())
fun Quanto.QuantoBuilder.fxRate(index: Int, f: FxRate.FxRateBuilder.() -> Unit) = getOrCreateFxRate(index).apply{FxRate.FxRateBuilder().apply(f).build()}
fun Quanto.QuantoBuilder.fxSpotRateSource(f: FxSpotRateSource.FxSpotRateSourceBuilder.() -> Unit) = orCreateFxSpotRateSource.apply(f)


fun QuotedCurrencyPair.QuotedCurrencyPairBuilder.currency1(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency1.apply(f)
fun QuotedCurrencyPair.QuotedCurrencyPairBuilder.currency2(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency2.apply(f)

fun RateObservation.RateObservationBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun RateObservation.RateObservationBuilder.rateReference(f: ReferenceWithMetaRateObservation.ReferenceWithMetaRateObservationBuilder.() -> Unit) = orCreateRateReference.apply(f)

fun RateSpecification.RateSpecificationBuilder.fixedRate(f: FixedRateSpecification.FixedRateSpecificationBuilder.() -> Unit) = orCreateFixedRate.apply(f)
fun RateSpecification.RateSpecificationBuilder.floatingRate(f: FloatingRateSpecification.FloatingRateSpecificationBuilder.() -> Unit) = orCreateFloatingRate.apply(f)
fun RateSpecification.RateSpecificationBuilder.inflationRate(f: InflationRateSpecification.InflationRateSpecificationBuilder.() -> Unit) = orCreateInflationRate.apply(f)

fun RateSpecificationBase.RateSpecificationBaseBuilder.assetIdentifier(f: AssetIdentifier.AssetIdentifierBuilder.() -> Unit) = orCreateAssetIdentifier.apply(f)

fun RecalculationOfValue.RecalculationOfValueBuilder.partyElection(f: RecalculationOfValueElection.RecalculationOfValueElectionBuilder.() -> Unit) = addPartyElection(RecalculationOfValueElection.RecalculationOfValueElectionBuilder().apply(f).build())
fun RecalculationOfValue.RecalculationOfValueBuilder.partyElection(index: Int, f: RecalculationOfValueElection.RecalculationOfValueElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{RecalculationOfValueElection.RecalculationOfValueElectionBuilder().apply(f).build()}



fun ReferenceBank.ReferenceBankBuilder.referenceBankId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateReferenceBankId.apply(f)

fun ReferenceInformation.ReferenceInformationBuilder.referenceEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateReferenceEntity.apply(f)
fun ReferenceInformation.ReferenceInformationBuilder.referenceObligation(f: ReferenceObligation.ReferenceObligationBuilder.() -> Unit) = addReferenceObligation(ReferenceObligation.ReferenceObligationBuilder().apply(f).build())
fun ReferenceInformation.ReferenceInformationBuilder.referenceObligation(index: Int, f: ReferenceObligation.ReferenceObligationBuilder.() -> Unit) = getOrCreateReferenceObligation(index).apply{ReferenceObligation.ReferenceObligationBuilder().apply(f).build()}

fun ReferenceObligation.ReferenceObligationBuilder.guarantor(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateGuarantor.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.loan(f: Loan.LoanBuilder.() -> Unit) = orCreateLoan.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.primaryObligor(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreatePrimaryObligor.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.primaryObligorReference(f: ReferenceWithMetaLegalEntity.ReferenceWithMetaLegalEntityBuilder.() -> Unit) = orCreatePrimaryObligorReference.apply(f)
fun ReferenceObligation.ReferenceObligationBuilder.security(f: Security.SecurityBuilder.() -> Unit) = orCreateSecurity.apply(f)

fun ReferencePair.ReferencePairBuilder.entityType(f: FieldWithMetaEntityTypeEnum.FieldWithMetaEntityTypeEnumBuilder.() -> Unit) = orCreateEntityType.apply(f)
fun ReferencePair.ReferencePairBuilder.referenceEntity(f: LegalEntity.LegalEntityBuilder.() -> Unit) = orCreateReferenceEntity.apply(f)
fun ReferencePair.ReferencePairBuilder.referenceObligation(f: ReferenceObligation.ReferenceObligationBuilder.() -> Unit) = orCreateReferenceObligation.apply(f)

fun ReferencePool.ReferencePoolBuilder.referencePoolItem(f: ReferencePoolItem.ReferencePoolItemBuilder.() -> Unit) = addReferencePoolItem(ReferencePoolItem.ReferencePoolItemBuilder().apply(f).build())
fun ReferencePool.ReferencePoolBuilder.referencePoolItem(index: Int, f: ReferencePoolItem.ReferencePoolItemBuilder.() -> Unit) = getOrCreateReferencePoolItem(index).apply{ReferencePoolItem.ReferencePoolItemBuilder().apply(f).build()}

fun ReferencePoolItem.ReferencePoolItemBuilder.cashSettlementTermsReference(f: ReferenceWithMetaCashSettlementTerms.ReferenceWithMetaCashSettlementTermsBuilder.() -> Unit) = orCreateCashSettlementTermsReference.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.constituentWeight(f: ConstituentWeight.ConstituentWeightBuilder.() -> Unit) = orCreateConstituentWeight.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.physicalSettlementTermsReference(f: ReferenceWithMetaPhysicalSettlementTerms.ReferenceWithMetaPhysicalSettlementTermsBuilder.() -> Unit) = orCreatePhysicalSettlementTermsReference.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.protectionTermsReference(f: ReferenceWithMetaProtectionTerms.ReferenceWithMetaProtectionTermsBuilder.() -> Unit) = orCreateProtectionTermsReference.apply(f)
fun ReferencePoolItem.ReferencePoolItemBuilder.referencePair(f: ReferencePair.ReferencePairBuilder.() -> Unit) = orCreateReferencePair.apply(f)

fun ReferenceSwapCurve.ReferenceSwapCurveBuilder.makeWholeAmount(f: MakeWholeAmount.MakeWholeAmountBuilder.() -> Unit) = orCreateMakeWholeAmount.apply(f)
fun ReferenceSwapCurve.ReferenceSwapCurveBuilder.swapUnwindValue(f: SwapCurveValuation.SwapCurveValuationBuilder.() -> Unit) = orCreateSwapUnwindValue.apply(f)

fun Regime.RegimeBuilder.additionalRegime(f: AdditionalRegime.AdditionalRegimeBuilder.() -> Unit) = addAdditionalRegime(AdditionalRegime.AdditionalRegimeBuilder().apply(f).build())
fun Regime.RegimeBuilder.additionalRegime(index: Int, f: AdditionalRegime.AdditionalRegimeBuilder.() -> Unit) = getOrCreateAdditionalRegime(index).apply{AdditionalRegime.AdditionalRegimeBuilder().apply(f).build()}
fun Regime.RegimeBuilder.applicableRegime(f: ApplicableRegime.ApplicableRegimeBuilder.() -> Unit) = addApplicableRegime(ApplicableRegime.ApplicableRegimeBuilder().apply(f).build())
fun Regime.RegimeBuilder.applicableRegime(index: Int, f: ApplicableRegime.ApplicableRegimeBuilder.() -> Unit) = getOrCreateApplicableRegime(index).apply{ApplicableRegime.ApplicableRegimeBuilder().apply(f).build()}

fun RegimeTerms.RegimeTermsBuilder.retrospectiveEffect(f: RetrospectiveEffect.RetrospectiveEffectBuilder.() -> Unit) = orCreateRetrospectiveEffect.apply(f)
fun RegimeTerms.RegimeTermsBuilder.simmException(f: SimmException.SimmExceptionBuilder.() -> Unit) = orCreateSimmException.apply(f)


fun RelatedAgreement.RelatedAgreementBuilder.documentationIdentification(f: DocumentationIdentification.DocumentationIdentificationBuilder.() -> Unit) = orCreateDocumentationIdentification.apply(f)
fun RelatedAgreement.RelatedAgreementBuilder.legalAgreement(f: LegalAgreement.LegalAgreementBuilder.() -> Unit) = orCreateLegalAgreement.apply(f)

fun RelatedParty.RelatedPartyBuilder.accountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateAccountReference.apply(f)
fun RelatedParty.RelatedPartyBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreatePartyReference.apply(f)

fun RelatedPartyReference.RelatedPartyReferenceBuilder.partyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = addPartyReference(ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build())
fun RelatedPartyReference.RelatedPartyReferenceBuilder.partyReference(index: Int, f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = getOrCreatePartyReference(index).apply{ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder().apply(f).build()}

fun RelativeDateOffset.RelativeDateOffsetBuilder.businessCenters(f: BusinessCenters.BusinessCentersBuilder.() -> Unit) = orCreateBusinessCenters.apply(f)
fun RelativeDateOffset.RelativeDateOffsetBuilder.businessCentersReference(f: ReferenceWithMetaBusinessCenters.ReferenceWithMetaBusinessCentersBuilder.() -> Unit) = orCreateBusinessCentersReference.apply(f)
fun RelativeDateOffset.RelativeDateOffsetBuilder.dateRelativeTo(f: BasicReferenceWithMetaDate.BasicReferenceWithMetaDateBuilder.() -> Unit) = orCreateDateRelativeTo.apply(f)

fun RelativeDates.RelativeDatesBuilder.scheduleBounds(f: DateRange.DateRangeBuilder.() -> Unit) = orCreateScheduleBounds.apply(f)

fun RelativePrice.RelativePriceBuilder.bondEquityModel(f: BondEquityModel.BondEquityModelBuilder.() -> Unit) = addBondEquityModel(BondEquityModel.BondEquityModelBuilder().apply(f).build())
fun RelativePrice.RelativePriceBuilder.bondEquityModel(index: Int, f: BondEquityModel.BondEquityModelBuilder.() -> Unit) = getOrCreateBondEquityModel(index).apply{BondEquityModel.BondEquityModelBuilder().apply(f).build()}


fun ResetDates.ResetDatesBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDatesReference.apply(f)
fun ResetDates.ResetDatesBuilder.finalFixingDate(f: AdjustableDate.AdjustableDateBuilder.() -> Unit) = orCreateFinalFixingDate.apply(f)
fun ResetDates.ResetDatesBuilder.fixingDates(f: RelativeDateOffset.RelativeDateOffsetBuilder.() -> Unit) = orCreateFixingDates.apply(f)
fun ResetDates.ResetDatesBuilder.initialFixingDate(f: InitialFixingDate.InitialFixingDateBuilder.() -> Unit) = orCreateInitialFixingDate.apply(f)
fun ResetDates.ResetDatesBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ResetDates.ResetDatesBuilder.rateCutOffDaysOffset(f: Offset.OffsetBuilder.() -> Unit) = orCreateRateCutOffDaysOffset.apply(f)
fun ResetDates.ResetDatesBuilder.resetDatesAdjustments(f: BusinessDayAdjustments.BusinessDayAdjustmentsBuilder.() -> Unit) = orCreateResetDatesAdjustments.apply(f)
fun ResetDates.ResetDatesBuilder.resetFrequency(f: ResetFrequency.ResetFrequencyBuilder.() -> Unit) = orCreateResetFrequency.apply(f)


fun ResetPrimitive.ResetPrimitiveBuilder.after(f: ContractState.ContractStateBuilder.() -> Unit) = orCreateAfter.apply(f)
fun ResetPrimitive.ResetPrimitiveBuilder.before(f: ReferenceWithMetaContractState.ReferenceWithMetaContractStateBuilder.() -> Unit) = orCreateBefore.apply(f)

fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.assetIdentifier(f: AssetIdentifier.AssetIdentifierBuilder.() -> Unit) = orCreateAssetIdentifier.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.futureValueNotional(f: FutureValueAmount.FutureValueAmountBuilder.() -> Unit) = orCreateFutureValueNotional.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.quantityMultiplier(f: QuantityMultiplier.QuantityMultiplierBuilder.() -> Unit) = orCreateQuantityMultiplier.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.quantityReference(f: ReferenceWithMetaResolvablePayoutQuantity.ReferenceWithMetaResolvablePayoutQuantityBuilder.() -> Unit) = orCreateQuantityReference.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.quantitySchedule(f: NonNegativeQuantitySchedule.NonNegativeQuantityScheduleBuilder.() -> Unit) = orCreateQuantitySchedule.apply(f)
fun ResolvablePayoutQuantity.ResolvablePayoutQuantityBuilder.resolvedQuantity(f: NonNegativeQuantity.NonNegativeQuantityBuilder.() -> Unit) = orCreateResolvedQuantity.apply(f)

fun Resource.ResourceBuilder.language(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateLanguage.apply(f)
fun Resource.ResourceBuilder.length(f: ResourceLength.ResourceLengthBuilder.() -> Unit) = orCreateLength.apply(f)
fun Resource.ResourceBuilder.mimeType(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateMimeType.apply(f)
fun Resource.ResourceBuilder.resourceId(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateResourceId.apply(f)
fun Resource.ResourceBuilder.resourceType(f: FieldWithMetaResourceTypeEnum.FieldWithMetaResourceTypeEnumBuilder.() -> Unit) = orCreateResourceType.apply(f)


fun Restructuring.RestructuringBuilder.restructuringType(f: FieldWithMetaRestructuringEnum.FieldWithMetaRestructuringEnumBuilder.() -> Unit) = orCreateRestructuringType.apply(f)



fun RightsEvents.RightsEventsBuilder.additionalRightsEvent(f: AdditionalRightsEvent.AdditionalRightsEventBuilder.() -> Unit) = orCreateAdditionalRightsEvent.apply(f)
fun RightsEvents.RightsEventsBuilder.controlAgreementNecEvent(f: ControlAgreementNecEvent.ControlAgreementNecEventBuilder.() -> Unit) = orCreateControlAgreementNecEvent.apply(f)
fun RightsEvents.RightsEventsBuilder.securityProviderRightsEvent(f: SecurityProviderRightsEvent.SecurityProviderRightsEventBuilder.() -> Unit) = orCreateSecurityProviderRightsEvent.apply(f)
fun RightsEvents.RightsEventsBuilder.securityTakerRightsEvent(f: SecuredPartyRightsEvent.SecuredPartyRightsEventBuilder.() -> Unit) = orCreateSecurityTakerRightsEvent.apply(f)


fun Schedule.ScheduleBuilder.step(f: Step.StepBuilder.() -> Unit) = addStep(Step.StepBuilder().apply(f).build())
fun Schedule.ScheduleBuilder.step(index: Int, f: Step.StepBuilder.() -> Unit) = getOrCreateStep(index).apply{Step.StepBuilder().apply(f).build()}


fun SecuredPartyRightsEvent.SecuredPartyRightsEventBuilder.securedPartyRightsEventElection(f: SecuredPartyRightsEventElection.SecuredPartyRightsEventElectionBuilder.() -> Unit) = addSecuredPartyRightsEventElection(SecuredPartyRightsEventElection.SecuredPartyRightsEventElectionBuilder().apply(f).build())
fun SecuredPartyRightsEvent.SecuredPartyRightsEventBuilder.securedPartyRightsEventElection(index: Int, f: SecuredPartyRightsEventElection.SecuredPartyRightsEventElectionBuilder.() -> Unit) = getOrCreateSecuredPartyRightsEventElection(index).apply{SecuredPartyRightsEventElection.SecuredPartyRightsEventElectionBuilder().apply(f).build()}


fun Security.SecurityBuilder.debtType(f: DebtType.DebtTypeBuilder.() -> Unit) = orCreateDebtType.apply(f)

fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.appropriatedCollateralValuation(f: AppropriatedCollateralValuation.AppropriatedCollateralValuationBuilder.() -> Unit) = orCreateAppropriatedCollateralValuation.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.enforcementEvent(f: EnforcementEvent.EnforcementEventBuilder.() -> Unit) = orCreateEnforcementEvent.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.executionTerms(f: ExecutionTerms.ExecutionTermsBuilder.() -> Unit) = orCreateExecutionTerms.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.jurisdictionRelatedTerms(f: JurisdictionRelatedTerms.JurisdictionRelatedTermsBuilder.() -> Unit) = orCreateJurisdictionRelatedTerms.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.pledgedAccount(f: Account.AccountBuilder.() -> Unit) = orCreatePledgedAccount.apply(f)
fun SecurityAgreementElections.SecurityAgreementElectionsBuilder.processAgent(f: ProcessAgent.ProcessAgentBuilder.() -> Unit) = orCreateProcessAgent.apply(f)

fun SecurityLeg.SecurityLegBuilder.buyerSeller(f: BuyerSeller.BuyerSellerBuilder.() -> Unit) = orCreateBuyerSeller.apply(f)
fun SecurityLeg.SecurityLegBuilder.deliveryDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateDeliveryDate.apply(f)
fun SecurityLeg.SecurityLegBuilder.fxRate(f: ExchangeRate.ExchangeRateBuilder.() -> Unit) = orCreateFxRate.apply(f)
fun SecurityLeg.SecurityLegBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SecurityLeg.SecurityLegBuilder.settlementAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateSettlementAmount.apply(f)
fun SecurityLeg.SecurityLegBuilder.settlementDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)

fun SecurityPayout.SecurityPayoutBuilder.initialMargin(f: InitialMargin.InitialMarginBuilder.() -> Unit) = orCreateInitialMargin.apply(f)
fun SecurityPayout.SecurityPayoutBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SecurityPayout.SecurityPayoutBuilder.securityLeg(f: SecurityLeg.SecurityLegBuilder.() -> Unit) = addSecurityLeg(SecurityLeg.SecurityLegBuilder().apply(f).build())
fun SecurityPayout.SecurityPayoutBuilder.securityLeg(index: Int, f: SecurityLeg.SecurityLegBuilder.() -> Unit) = getOrCreateSecurityLeg(index).apply{SecurityLeg.SecurityLegBuilder().apply(f).build()}
fun SecurityPayout.SecurityPayoutBuilder.securityValuation(f: SecurityValuation.SecurityValuationBuilder.() -> Unit) = addSecurityValuation(SecurityValuation.SecurityValuationBuilder().apply(f).build())
fun SecurityPayout.SecurityPayoutBuilder.securityValuation(index: Int, f: SecurityValuation.SecurityValuationBuilder.() -> Unit) = getOrCreateSecurityValuation(index).apply{SecurityValuation.SecurityValuationBuilder().apply(f).build()}

fun SecurityProviderRightsEvent.SecurityProviderRightsEventBuilder.partyElection(f: SecurityProviderRightsEventElection.SecurityProviderRightsEventElectionBuilder.() -> Unit) = addPartyElection(SecurityProviderRightsEventElection.SecurityProviderRightsEventElectionBuilder().apply(f).build())
fun SecurityProviderRightsEvent.SecurityProviderRightsEventBuilder.partyElection(index: Int, f: SecurityProviderRightsEventElection.SecurityProviderRightsEventElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{SecurityProviderRightsEventElection.SecurityProviderRightsEventElectionBuilder().apply(f).build()}


fun SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.security(f: Security.SecurityBuilder.() -> Unit) = addSecurity(Security.SecurityBuilder().apply(f).build())
fun SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.security(index: Int, f: Security.SecurityBuilder.() -> Unit) = getOrCreateSecurity(index).apply{Security.SecurityBuilder().apply(f).build()}
fun SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.transferorTransferee(f: TransferorTransferee.TransferorTransfereeBuilder.() -> Unit) = orCreateTransferorTransferee.apply(f)

fun SecurityTransferComponent.SecurityTransferComponentBuilder.breakdown(f: SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.() -> Unit) = addBreakdown(SecurityTransferBreakdown.SecurityTransferBreakdownBuilder().apply(f).build())
fun SecurityTransferComponent.SecurityTransferComponentBuilder.breakdown(index: Int, f: SecurityTransferBreakdown.SecurityTransferBreakdownBuilder.() -> Unit) = getOrCreateBreakdown(index).apply{SecurityTransferBreakdown.SecurityTransferBreakdownBuilder().apply(f).build()}
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

fun SettlementProvision.SettlementProvisionBuilder.nonDeliverableSettlement(f: NonDeliverableSettlement.NonDeliverableSettlementBuilder.() -> Unit) = orCreateNonDeliverableSettlement.apply(f)
fun SettlementProvision.SettlementProvisionBuilder.settlementCurrency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateSettlementCurrency.apply(f)

fun SettlementRateSource.SettlementRateSourceBuilder.cashSettlementReferenceBanks(f: CashSettlementReferenceBanks.CashSettlementReferenceBanksBuilder.() -> Unit) = orCreateCashSettlementReferenceBanks.apply(f)
fun SettlementRateSource.SettlementRateSourceBuilder.informationSource(f: InformationSource.InformationSourceBuilder.() -> Unit) = orCreateInformationSource.apply(f)

fun SettlementTerms.SettlementTermsBuilder.assetIdentifier(f: AssetIdentifier.AssetIdentifierBuilder.() -> Unit) = orCreateAssetIdentifier.apply(f)
fun SettlementTerms.SettlementTermsBuilder.payerReceiver(f: PartyReferencePayerReceiver.PartyReferencePayerReceiverBuilder.() -> Unit) = orCreatePayerReceiver.apply(f)
fun SettlementTerms.SettlementTermsBuilder.settlementAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateSettlementAmount.apply(f)
fun SettlementTerms.SettlementTermsBuilder.settlementDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)

fun SimmCalculationCurrency.SimmCalculationCurrencyBuilder.partyElection(f: CalculationCurrencyElection.CalculationCurrencyElectionBuilder.() -> Unit) = addPartyElection(CalculationCurrencyElection.CalculationCurrencyElectionBuilder().apply(f).build())
fun SimmCalculationCurrency.SimmCalculationCurrencyBuilder.partyElection(index: Int, f: CalculationCurrencyElection.CalculationCurrencyElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{CalculationCurrencyElection.CalculationCurrencyElectionBuilder().apply(f).build()}


fun SimmVersion.SimmVersionBuilder.partyVersion(f: BasicReferenceWithMetaString.BasicReferenceWithMetaStringBuilder.() -> Unit) = orCreatePartyVersion.apply(f)

fun SimplePayment.SimplePaymentBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun SimplePayment.SimplePaymentBuilder.paymentAmount(f: Money.MoneyBuilder.() -> Unit) = orCreatePaymentAmount.apply(f)
fun SimplePayment.SimplePaymentBuilder.paymentDate(f: AdjustableOrRelativeDate.AdjustableOrRelativeDateBuilder.() -> Unit) = orCreatePaymentDate.apply(f)


fun Sngl.SnglBuilder.indx(f: Indx.IndxBuilder.() -> Unit) = orCreateIndx.apply(f)


fun SpecifiedCurrency.SpecifiedCurrencyBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun SplitOutcome.SplitOutcomeBuilder.originalTrade(f: Trade.TradeBuilder.() -> Unit) = orCreateOriginalTrade.apply(f)
fun SplitOutcome.SplitOutcomeBuilder.splitTrades(f: Trade.TradeBuilder.() -> Unit) = addSplitTrades(Trade.TradeBuilder().apply(f).build())
fun SplitOutcome.SplitOutcomeBuilder.splitTrades(index: Int, f: Trade.TradeBuilder.() -> Unit) = getOrCreateSplitTrades(index).apply{Trade.TradeBuilder().apply(f).build()}

fun SplitPrimitive.SplitPrimitiveBuilder.after(f: SplitOutcome.SplitOutcomeBuilder.() -> Unit) = orCreateAfter.apply(f)
fun SplitPrimitive.SplitPrimitiveBuilder.before(f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = orCreateBefore.apply(f)

fun SpreadSchedule.SpreadScheduleBuilder.spreadScheduleType(f: FieldWithMetaSpreadScheduleTypeEnum.FieldWithMetaSpreadScheduleTypeEnumBuilder.() -> Unit) = orCreateSpreadScheduleType.apply(f)

fun Step.StepBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun StockSplitInstruction.StockSplitInstructionBuilder.trade(f: Trade.TradeBuilder.() -> Unit) = orCreateTrade.apply(f)

fun StrategyFeature.StrategyFeatureBuilder.calendarSpread(f: CalendarSpread.CalendarSpreadBuilder.() -> Unit) = orCreateCalendarSpread.apply(f)
fun StrategyFeature.StrategyFeatureBuilder.strikeSpread(f: StrikeSpread.StrikeSpreadBuilder.() -> Unit) = orCreateStrikeSpread.apply(f)

fun Strike.StrikeBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)


fun StrikeSpread.StrikeSpreadBuilder.upperStrike(f: OptionStrike.OptionStrikeBuilder.() -> Unit) = orCreateUpperStrike.apply(f)

fun StubCalculationPeriodAmount.StubCalculationPeriodAmountBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDatesReference.apply(f)
fun StubCalculationPeriodAmount.StubCalculationPeriodAmountBuilder.finalStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateFinalStub.apply(f)
fun StubCalculationPeriodAmount.StubCalculationPeriodAmountBuilder.initialStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateInitialStub.apply(f)

fun StubFloatingRate.StubFloatingRateBuilder.capRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addCapRateSchedule(StrikeSchedule.StrikeScheduleBuilder().apply(f).build())
fun StubFloatingRate.StubFloatingRateBuilder.capRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateCapRateSchedule(index).apply{StrikeSchedule.StrikeScheduleBuilder().apply(f).build()}
fun StubFloatingRate.StubFloatingRateBuilder.floatingRateMultiplierSchedule(f: Schedule.ScheduleBuilder.() -> Unit) = orCreateFloatingRateMultiplierSchedule.apply(f)
fun StubFloatingRate.StubFloatingRateBuilder.floorRateSchedule(f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = addFloorRateSchedule(StrikeSchedule.StrikeScheduleBuilder().apply(f).build())
fun StubFloatingRate.StubFloatingRateBuilder.floorRateSchedule(index: Int, f: StrikeSchedule.StrikeScheduleBuilder.() -> Unit) = getOrCreateFloorRateSchedule(index).apply{StrikeSchedule.StrikeScheduleBuilder().apply(f).build()}
fun StubFloatingRate.StubFloatingRateBuilder.indexTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateIndexTenor.apply(f)
fun StubFloatingRate.StubFloatingRateBuilder.spreadSchedule(f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = addSpreadSchedule(SpreadSchedule.SpreadScheduleBuilder().apply(f).build())
fun StubFloatingRate.StubFloatingRateBuilder.spreadSchedule(index: Int, f: SpreadSchedule.SpreadScheduleBuilder.() -> Unit) = getOrCreateSpreadSchedule(index).apply{SpreadSchedule.SpreadScheduleBuilder().apply(f).build()}

fun StubPeriod.StubPeriodBuilder.calculationPeriodDatesReference(f: ReferenceWithMetaCalculationPeriodDates.ReferenceWithMetaCalculationPeriodDatesBuilder.() -> Unit) = orCreateCalculationPeriodDatesReference.apply(f)
fun StubPeriod.StubPeriodBuilder.finalStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateFinalStub.apply(f)
fun StubPeriod.StubPeriodBuilder.initialStub(f: StubValue.StubValueBuilder.() -> Unit) = orCreateInitialStub.apply(f)

fun StubValue.StubValueBuilder.floatingRate(f: StubFloatingRate.StubFloatingRateBuilder.() -> Unit) = addFloatingRate(StubFloatingRate.StubFloatingRateBuilder().apply(f).build())
fun StubValue.StubValueBuilder.floatingRate(index: Int, f: StubFloatingRate.StubFloatingRateBuilder.() -> Unit) = getOrCreateFloatingRate(index).apply{StubFloatingRate.StubFloatingRateBuilder().apply(f).build()}
fun StubValue.StubValueBuilder.stubAmount(f: Money.MoneyBuilder.() -> Unit) = orCreateStubAmount.apply(f)

fun SubstitutedRegime.SubstitutedRegimeBuilder.partyElection(f: SubstitutedRegimeElection.SubstitutedRegimeElectionBuilder.() -> Unit) = addPartyElection(SubstitutedRegimeElection.SubstitutedRegimeElectionBuilder().apply(f).build())
fun SubstitutedRegime.SubstitutedRegimeBuilder.partyElection(index: Int, f: SubstitutedRegimeElection.SubstitutedRegimeElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{SubstitutedRegimeElection.SubstitutedRegimeElectionBuilder().apply(f).build()}



fun SwapCurveValuation.SwapCurveValuationBuilder.indexTenor(f: Period.PeriodBuilder.() -> Unit) = orCreateIndexTenor.apply(f)

fun Swp.SwpBuilder.swpIn(f: SwpIn.SwpInBuilder.() -> Unit) = orCreateSwpIn.apply(f)
fun Swp.SwpBuilder.swpOut(f: SwpOut.SwpOutBuilder.() -> Unit) = orCreateSwpOut.apply(f)

fun SwpIn.SwpInBuilder.sngl(f: Sngl.SnglBuilder.() -> Unit) = orCreateSngl.apply(f)

fun SwpOut.SwpOutBuilder.sngl(f: Sngl.SnglBuilder.() -> Unit) = orCreateSngl.apply(f)




fun TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.effectiveDate(f: AmendmentEffectiveDate.AmendmentEffectiveDateBuilder.() -> Unit) = orCreateEffectiveDate.apply(f)
fun TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.partyElection(f: TerminationCurrencyElection.TerminationCurrencyElectionBuilder.() -> Unit) = addPartyElection(TerminationCurrencyElection.TerminationCurrencyElectionBuilder().apply(f).build())
fun TerminationCurrencyAmendment.TerminationCurrencyAmendmentBuilder.partyElection(index: Int, f: TerminationCurrencyElection.TerminationCurrencyElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{TerminationCurrencyElection.TerminationCurrencyElectionBuilder().apply(f).build()}

fun TerminationCurrencyElection.TerminationCurrencyElectionBuilder.currency(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateCurrency.apply(f)

fun TermsChangePrimitive.TermsChangePrimitiveBuilder.after(f: Trade.TradeBuilder.() -> Unit) = orCreateAfter.apply(f)
fun TermsChangePrimitive.TermsChangePrimitiveBuilder.before(f: ReferenceWithMetaTrade.ReferenceWithMetaTradeBuilder.() -> Unit) = orCreateBefore.apply(f)

fun Threshold.ThresholdBuilder.partyElection(f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = addPartyElection(ElectiveAmountElection.ElectiveAmountElectionBuilder().apply(f).build())
fun Threshold.ThresholdBuilder.partyElection(index: Int, f: ElectiveAmountElection.ElectiveAmountElectionBuilder.() -> Unit) = getOrCreatePartyElection(index).apply{ElectiveAmountElection.ElectiveAmountElectionBuilder().apply(f).build()}

fun TimeZone.TimeZoneBuilder.location(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateLocation.apply(f)

fun TradableProduct.TradableProductBuilder.counterparties(f: Counterparty.CounterpartyBuilder.() -> Unit) = addCounterparties(Counterparty.CounterpartyBuilder().apply(f).build())
fun TradableProduct.TradableProductBuilder.counterparties(index: Int, f: Counterparty.CounterpartyBuilder.() -> Unit) = getOrCreateCounterparties(index).apply{Counterparty.CounterpartyBuilder().apply(f).build()}
fun TradableProduct.TradableProductBuilder.priceNotation(f: PriceNotation.PriceNotationBuilder.() -> Unit) = addPriceNotation(PriceNotation.PriceNotationBuilder().apply(f).build())
fun TradableProduct.TradableProductBuilder.priceNotation(index: Int, f: PriceNotation.PriceNotationBuilder.() -> Unit) = getOrCreatePriceNotation(index).apply{PriceNotation.PriceNotationBuilder().apply(f).build()}
fun TradableProduct.TradableProductBuilder.product(f: Product.ProductBuilder.() -> Unit) = orCreateProduct.apply(f)
fun TradableProduct.TradableProductBuilder.quantityNotation(f: QuantityNotation.QuantityNotationBuilder.() -> Unit) = addQuantityNotation(QuantityNotation.QuantityNotationBuilder().apply(f).build())
fun TradableProduct.TradableProductBuilder.quantityNotation(index: Int, f: QuantityNotation.QuantityNotationBuilder.() -> Unit) = getOrCreateQuantityNotation(index).apply{QuantityNotation.QuantityNotationBuilder().apply(f).build()}
fun TradableProduct.TradableProductBuilder.relatedParties(f: RelatedPartyReference.RelatedPartyReferenceBuilder.() -> Unit) = addRelatedParties(RelatedPartyReference.RelatedPartyReferenceBuilder().apply(f).build())
fun TradableProduct.TradableProductBuilder.relatedParties(index: Int, f: RelatedPartyReference.RelatedPartyReferenceBuilder.() -> Unit) = getOrCreateRelatedParties(index).apply{RelatedPartyReference.RelatedPartyReferenceBuilder().apply(f).build()}

fun Trade.TradeBuilder.contract(f: Contract.ContractBuilder.() -> Unit) = orCreateContract.apply(f)
fun Trade.TradeBuilder.execution(f: Execution.ExecutionBuilder.() -> Unit) = orCreateExecution.apply(f)
fun Trade.TradeBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)

fun TradeWarehouseWorkflow.TradeWarehouseWorkflowBuilder.partyCustomisedWorkflow(f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = addPartyCustomisedWorkflow(PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder().apply(f).build())
fun TradeWarehouseWorkflow.TradeWarehouseWorkflowBuilder.partyCustomisedWorkflow(index: Int, f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = getOrCreatePartyCustomisedWorkflow(index).apply{PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder().apply(f).build()}




fun TransferBase.TransferBaseBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun TransferBase.TransferBaseBuilder.transferCalculation(f: TransferCalculation.TransferCalculationBuilder.() -> Unit) = orCreateTransferCalculation.apply(f)

fun TransferBreakdown.TransferBreakdownBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = addLineage(Lineage.LineageBuilder().apply(f).build())
fun TransferBreakdown.TransferBreakdownBuilder.lineage(index: Int, f: Lineage.LineageBuilder.() -> Unit) = getOrCreateLineage(index).apply{Lineage.LineageBuilder().apply(f).build()}

fun TransferCalculation.TransferCalculationBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = addLineage(Lineage.LineageBuilder().apply(f).build())
fun TransferCalculation.TransferCalculationBuilder.lineage(index: Int, f: Lineage.LineageBuilder.() -> Unit) = getOrCreateLineage(index).apply{Lineage.LineageBuilder().apply(f).build()}
fun TransferCalculation.TransferCalculationBuilder.period(f: CalculationPeriodBase.CalculationPeriodBaseBuilder.() -> Unit) = orCreatePeriod.apply(f)

fun TransferPrimitive.TransferPrimitiveBuilder.cashTransfer(f: CashTransferComponent.CashTransferComponentBuilder.() -> Unit) = addCashTransfer(CashTransferComponent.CashTransferComponentBuilder().apply(f).build())
fun TransferPrimitive.TransferPrimitiveBuilder.cashTransfer(index: Int, f: CashTransferComponent.CashTransferComponentBuilder.() -> Unit) = getOrCreateCashTransfer(index).apply{CashTransferComponent.CashTransferComponentBuilder().apply(f).build()}
fun TransferPrimitive.TransferPrimitiveBuilder.commodityTransfer(f: CommodityTransferComponent.CommodityTransferComponentBuilder.() -> Unit) = addCommodityTransfer(CommodityTransferComponent.CommodityTransferComponentBuilder().apply(f).build())
fun TransferPrimitive.TransferPrimitiveBuilder.commodityTransfer(index: Int, f: CommodityTransferComponent.CommodityTransferComponentBuilder.() -> Unit) = getOrCreateCommodityTransfer(index).apply{CommodityTransferComponent.CommodityTransferComponentBuilder().apply(f).build()}
fun TransferPrimitive.TransferPrimitiveBuilder.identifier(f: FieldWithMetaString.FieldWithMetaStringBuilder.() -> Unit) = orCreateIdentifier.apply(f)
fun TransferPrimitive.TransferPrimitiveBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun TransferPrimitive.TransferPrimitiveBuilder.securityTransfer(f: SecurityTransferComponent.SecurityTransferComponentBuilder.() -> Unit) = addSecurityTransfer(SecurityTransferComponent.SecurityTransferComponentBuilder().apply(f).build())
fun TransferPrimitive.TransferPrimitiveBuilder.securityTransfer(index: Int, f: SecurityTransferComponent.SecurityTransferComponentBuilder.() -> Unit) = getOrCreateSecurityTransfer(index).apply{SecurityTransferComponent.SecurityTransferComponentBuilder().apply(f).build()}
fun TransferPrimitive.TransferPrimitiveBuilder.settlementDate(f: AdjustableOrAdjustedOrRelativeDate.AdjustableOrAdjustedOrRelativeDateBuilder.() -> Unit) = orCreateSettlementDate.apply(f)

fun TransferorTransferee.TransferorTransfereeBuilder.transfereeAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateTransfereeAccountReference.apply(f)
fun TransferorTransferee.TransferorTransfereeBuilder.transfereePartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateTransfereePartyReference.apply(f)
fun TransferorTransferee.TransferorTransfereeBuilder.transferorAccountReference(f: ReferenceWithMetaAccount.ReferenceWithMetaAccountBuilder.() -> Unit) = orCreateTransferorAccountReference.apply(f)
fun TransferorTransferee.TransferorTransfereeBuilder.transferorPartyReference(f: ReferenceWithMetaParty.ReferenceWithMetaPartyBuilder.() -> Unit) = orCreateTransferorPartyReference.apply(f)

fun Trigger.TriggerBuilder.creditEvents(f: CreditEvents.CreditEventsBuilder.() -> Unit) = orCreateCreditEvents.apply(f)
fun Trigger.TriggerBuilder.creditEventsReference(f: ReferenceWithMetaCreditEvents.ReferenceWithMetaCreditEventsBuilder.() -> Unit) = orCreateCreditEventsReference.apply(f)

fun TriggerEvent.TriggerEventBuilder.featurePayment(f: FeaturePayment.FeaturePaymentBuilder.() -> Unit) = orCreateFeaturePayment.apply(f)
fun TriggerEvent.TriggerEventBuilder.schedule(f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = addSchedule(AveragingSchedule.AveragingScheduleBuilder().apply(f).build())
fun TriggerEvent.TriggerEventBuilder.schedule(index: Int, f: AveragingSchedule.AveragingScheduleBuilder.() -> Unit) = getOrCreateSchedule(index).apply{AveragingSchedule.AveragingScheduleBuilder().apply(f).build()}
fun TriggerEvent.TriggerEventBuilder.trigger(f: Trigger.TriggerBuilder.() -> Unit) = orCreateTrigger.apply(f)
fun TriggerEvent.TriggerEventBuilder.triggerDates(f: DateList.DateListBuilder.() -> Unit) = orCreateTriggerDates.apply(f)

fun Tx.TxBuilder.newTx(f: New.NewBuilder.() -> Unit) = orCreateNewTx.apply(f)
fun Tx.TxBuilder.pric(f: Pric.PricBuilder.() -> Unit) = orCreatePric.apply(f)
fun Tx.TxBuilder.qty(f: Qty.QtyBuilder.() -> Unit) = orCreateQty.apply(f)

fun UmbrellaAgreement.UmbrellaAgreementBuilder.parties(f: UmbrellaAgreementEntity.UmbrellaAgreementEntityBuilder.() -> Unit) = addParties(UmbrellaAgreementEntity.UmbrellaAgreementEntityBuilder().apply(f).build())
fun UmbrellaAgreement.UmbrellaAgreementBuilder.parties(index: Int, f: UmbrellaAgreementEntity.UmbrellaAgreementEntityBuilder.() -> Unit) = getOrCreateParties(index).apply{UmbrellaAgreementEntity.UmbrellaAgreementEntityBuilder().apply(f).build()}


fun Underlier.UnderlierBuilder.underlyingProduct(f: Product.ProductBuilder.() -> Unit) = orCreateUnderlyingProduct.apply(f)

fun UndrlygInstrm.UndrlygInstrmBuilder.swp(f: Swp.SwpBuilder.() -> Unit) = orCreateSwp.apply(f)

fun UnitContractValuationModel.UnitContractValuationModelBuilder.numberOfUnits(f: Quantity.QuantityBuilder.() -> Unit) = orCreateNumberOfUnits.apply(f)
fun UnitContractValuationModel.UnitContractValuationModelBuilder.unitPrice(f: Money.MoneyBuilder.() -> Unit) = orCreateUnitPrice.apply(f)

fun ValuationDate.ValuationDateBuilder.multipleValuationDates(f: MultipleValuationDates.MultipleValuationDatesBuilder.() -> Unit) = orCreateMultipleValuationDates.apply(f)
fun ValuationDate.ValuationDateBuilder.singleValuationDate(f: SingleValuationDate.SingleValuationDateBuilder.() -> Unit) = orCreateSingleValuationDate.apply(f)





fun Workflow.WorkflowBuilder.steps(f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = addSteps(WorkflowStep.WorkflowStepBuilder().apply(f).build())
fun Workflow.WorkflowBuilder.steps(index: Int, f: WorkflowStep.WorkflowStepBuilder.() -> Unit) = getOrCreateSteps(index).apply{WorkflowStep.WorkflowStepBuilder().apply(f).build()}

fun WorkflowStep.WorkflowStepBuilder.account(f: Account.AccountBuilder.() -> Unit) = addAccount(Account.AccountBuilder().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.account(index: Int, f: Account.AccountBuilder.() -> Unit) = getOrCreateAccount(index).apply{Account.AccountBuilder().apply(f).build()}
fun WorkflowStep.WorkflowStepBuilder.businessEvent(f: BusinessEvent.BusinessEventBuilder.() -> Unit) = orCreateBusinessEvent.apply(f)
fun WorkflowStep.WorkflowStepBuilder.eventIdentifier(f: Identifier.IdentifierBuilder.() -> Unit) = addEventIdentifier(Identifier.IdentifierBuilder().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.eventIdentifier(index: Int, f: Identifier.IdentifierBuilder.() -> Unit) = getOrCreateEventIdentifier(index).apply{Identifier.IdentifierBuilder().apply(f).build()}
fun WorkflowStep.WorkflowStepBuilder.lineage(f: Lineage.LineageBuilder.() -> Unit) = orCreateLineage.apply(f)
fun WorkflowStep.WorkflowStepBuilder.messageInformation(f: MessageInformation.MessageInformationBuilder.() -> Unit) = orCreateMessageInformation.apply(f)
fun WorkflowStep.WorkflowStepBuilder.meta(f: MetaFields.MetaFieldsBuilder.() -> Unit) = orCreateMeta.apply(f)
fun WorkflowStep.WorkflowStepBuilder.party(f: Party.PartyBuilder.() -> Unit) = addParty(Party.PartyBuilder().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.party(index: Int, f: Party.PartyBuilder.() -> Unit) = getOrCreateParty(index).apply{Party.PartyBuilder().apply(f).build()}
fun WorkflowStep.WorkflowStepBuilder.previousWorkflowStep(f: ReferenceWithMetaWorkflowStep.ReferenceWithMetaWorkflowStepBuilder.() -> Unit) = orCreatePreviousWorkflowStep.apply(f)
fun WorkflowStep.WorkflowStepBuilder.proposedInstruction(f: Instruction.InstructionBuilder.() -> Unit) = orCreateProposedInstruction.apply(f)
fun WorkflowStep.WorkflowStepBuilder.timestamp(f: EventTimestamp.EventTimestampBuilder.() -> Unit) = addTimestamp(EventTimestamp.EventTimestampBuilder().apply(f).build())
fun WorkflowStep.WorkflowStepBuilder.timestamp(index: Int, f: EventTimestamp.EventTimestampBuilder.() -> Unit) = getOrCreateTimestamp(index).apply{EventTimestamp.EventTimestampBuilder().apply(f).build()}

fun WorkflowStepState.WorkflowStepStateBuilder.partyCustomisedWorkflow(f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = addPartyCustomisedWorkflow(PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder().apply(f).build())
fun WorkflowStepState.WorkflowStepStateBuilder.partyCustomisedWorkflow(index: Int, f: PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder.() -> Unit) = getOrCreatePartyCustomisedWorkflow(index).apply{PartyCustomisedWorkflow.PartyCustomisedWorkflowBuilder().apply(f).build()}

fun YieldCurveMethod.YieldCurveMethodBuilder.settlementRateSource(f: SettlementRateSource.SettlementRateSourceBuilder.() -> Unit) = orCreateSettlementRateSource.apply(f)
