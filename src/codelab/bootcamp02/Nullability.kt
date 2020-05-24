package codelab.bootcamp02

fun main() {
    // Nullable
    var marbles: Int? = null

    // Not nullable
    // var rocks: Int = null

    var fishFoodTreat = 6
    if (fishFoodTreat != null) {
        fishFoodTreat + fishFoodTreat.dec()
    }

    var fishFoodTreat1 = 6
    fishFoodTreat1 = fishFoodTreat1?.dec()
    fishFoodTreat1 = fishFoodTreat1?.dec() ?: 0

    val s: String = "ABC"
    val len = s!!.length
}

