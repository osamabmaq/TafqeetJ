package tech.moussa.tafqeetk.numbers

object FractionalRatioNames {
    // TODO: Localization for different languages
    private val fractionalRatioNamesMap = mapOf<Int, String>(
        1 to "بالعشرة",
        2 to "بالمئة",
        3 to "بالألف",
        4 to "بالعشرة آلاف",
        5 to "بالمئة ألف",
        6 to "بالمليون",
        7 to "بالعشرة ملايين",
        8 to "بالمئة مليون",
        9 to "بالمليار",
        10 to "بالعشرة مليارات",
        11 to "بالمئة مليار",
        12 to "بالترليون",
        13 to "بالعشرة ترليونات",
        14 to "بالمئة ترليون",
        15 to "بالكوادرليون"
    )

    fun getRatio(numberOfFractionalDigits: Int): String? {
        return this.fractionalRatioNamesMap[numberOfFractionalDigits]
    }
}