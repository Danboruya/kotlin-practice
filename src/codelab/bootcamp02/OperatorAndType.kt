package codelab.bootcamp02

fun main() {
    println(1 + 1)
    println(1.0 - 2.0)
    println(1 / 2)
    println(1.0 / 2.0)

    val i: Int = 6
    val b = i.toByte()
    println(b)

    val b2 : Byte = 1
//    val i1 : Int = b2
//    val i2 : String = b2
//    val i3 : Double = b2
    val i2 : Int = b2.toInt()
    val i3 : String = b2.toString()
    val i4 : Double = b2.toDouble()

    val byte = 0b11010010_01101001_10010100_10010010
    val a = byte.toInt()
    println(a)

    var fish = 1
    fish = 2
    val aquarium = 1
//    aquarium  = 2


    // variable in String
    val numberOfFish = 5
    val numberOfPlants = 12
    println("I have $numberOfFish fish" + " and $numberOfPlants plants")
}
