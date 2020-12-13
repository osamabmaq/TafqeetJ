package tech.moussa.tafqeetk.numbers

abstract class QuantitativeNumberNamesFactory {
    // TODO: Localization for different languages
    private val thousands = QuantitativeNumberNames(
        "ألف",
        "ألفين",
        "آلاف",
        "ألفًا"
    )
    private val millions = QuantitativeNumberNames(
        "مليون",
        "مليونين",
        "ملايين",
        "مليونًا"
    )
    private val billions = QuantitativeNumberNames(
        "مليار",
        "مليارين",
        "مليارات",
        "مليارًا"
    )
    private val trillions = QuantitativeNumberNames(
        "ترليون",
        "ترليونين",
        "ترليونات",
        "ترليونًا"
    )
    fun getThousands(): QuantitativeNumberNames {
        return this.thousands
    }
    fun getMillions(): QuantitativeNumberNames {
        return this.millions
    }
    fun getBillions(): QuantitativeNumberNames {
        return this.billions
    }
    fun getTrillions(): QuantitativeNumberNames {
        return this.trillions
    }
}