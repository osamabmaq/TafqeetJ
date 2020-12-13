package tech.moussa.tafqeetk.numbers

abstract class BasicNumberPlacesNames {
    // TODO: Localization for different languages
    private val ones: Map<Int, String> = mapOf(
        0 to "صفر",
        1 to "واحد",
        2 to "اثنين",
        3 to "ثلاثة",
        4 to "أربعة",
        5 to "خمسة",
        6 to "ستة",
        7 to "سبعة",
        8 to "ثمانية",
        9 to "تسعة"
    )
    private val composedNumbers: Map<Int, String> = mapOf(
        11 to "أحد عشر",
        12 to "اثني عشر",
        13 to "ثلاثة عشر",
        14 to "أربعة عشر",
        15 to "خمسة عشر",
        16 to "ستة عشر",
        17 to "سبعة عشر",
        18 to "ثمانية عشر",
        19 to "تسعة عشر"
    )
    private val tens: Map<Int, String> = mapOf(
        10 to "عشرة",
        20 to "عشرين",
        30 to "ثلاثين",
        40 to "أربعين",
        50 to "خمسين",
        60 to "ستين",
        70 to "سبعين",
        80 to "ثمانين",
        90 to "تسعين"
    )
    private val hundreds: Map<Int, String> = mapOf(
        100 to "مئة",
        200 to "مئتين",
        300 to "ثلاثمئة",
        400 to "أربعمئة",
        500 to "خمسمئة",
        600 to "ستمئة",
        700 to "سبعمئة",
        800 to "ثمانمئة",
        900 to "تسعمئة"
    )

    fun getOnesMap(): Map<Int, String> {
        return this.ones
    }
    fun getComposedNumbersMap(): Map<Int, String> {
        return this.composedNumbers
    }
    fun getTensMap(): Map<Int, String> {
        return this.tens
    }
    fun getHundredsMap(): Map<Int, String> {
        return this.hundreds
    }
}