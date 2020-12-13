package tech.moussa.tafqeetk.numbers

class QuantitativeNumberNames(
    val nameWhenEqualsOne: String,
    val nameWhenEqualsTwo: String,
    val nameWhenBetweenThreeAndTen: String,
    val nameWhenBetweenElevenAndNinetyNine: String
) {
    override fun toString(): String {
        return "QuantitiveNumberNames{" +
                "nameWhenEqualsOne='" + this.nameWhenEqualsOne + '\'' +
                ", nameWhenEqualsTwo='" + this.nameWhenEqualsTwo + '\'' +
                ", nameWhenBetweenThreeAndTen='" + this.nameWhenBetweenThreeAndTen + '\'' +
                ", nameWhenBetweenElevenAndNinetyNine='" + this.nameWhenBetweenElevenAndNinetyNine + '\'' +
                '}'
    }
}