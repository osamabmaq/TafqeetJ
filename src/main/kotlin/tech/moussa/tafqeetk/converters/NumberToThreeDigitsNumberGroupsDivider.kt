package tech.moussa.tafqeetk.converters

import tech.moussa.tafqeetk.numbers.NumberSign
import tech.moussa.tafqeetk.numbers.ThreeDigitsNumber
import kotlin.collections.ArrayList
import kotlin.math.abs

class NumberToThreeDigitsNumberGroupsDivider {
    private val groupsNames: List<String> = listOf(
            "basicNumberGroup",
            "thousands",
            "millions",
            "billions",
            "trillions"
    )

    fun divide(number: Long): Map<String, ThreeDigitsNumber> {
        val numbersGroups: List<ThreeDigitsNumber> = this.getThreeDigitsNumberList(abs(number).toString(), NumberSign.signOf(number))
        return this.mapWithGroupsNames(numbersGroups)
    }

    private fun getThreeDigitsNumberList(number: String, sign: NumberSign): List<ThreeDigitsNumber> {
        val numbersGroups: MutableList<ThreeDigitsNumber> = ArrayList<ThreeDigitsNumber>()
        var i = number.length
        var k = i - 3
        while (i > 0) {
            if (k < 0) k = 0
            numbersGroups.add(createThreeDigitsNumberOf(number.substring(k, i), sign))
            i -= 3
            k = i - 3
        }
        return numbersGroups
    }

    private fun createThreeDigitsNumberOf(number: String, sign: NumberSign): ThreeDigitsNumber {
        return ThreeDigitsNumber.of(number.toInt(), sign)
    }

    private fun mapWithGroupsNames(numbersGroups: List<ThreeDigitsNumber>): Map<String, ThreeDigitsNumber> {
        val numbersGroupsMap = mutableMapOf<String, ThreeDigitsNumber>()
        for (i in numbersGroups.indices) {
            numbersGroupsMap[this.groupsNames[i]] = numbersGroups[i]
        }
        return numbersGroupsMap
    }
}