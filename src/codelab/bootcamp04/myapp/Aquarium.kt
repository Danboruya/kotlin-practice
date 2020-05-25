package codelab.bootcamp04.myapp

// Aquarium class Constractor with default arguments.
//class Aquarium (length: Int = 100, width: Int = 20, height: Int = 40){
//    var width = length
//    var height: Int = height
//    var length: Int = length

// More compact way
open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    init {
        println("aquarium initializing")
    }
//
//    constructor(numberOfFish: Int) : this() {
//        val tank = numberOfFish * 2000 * 1.1
//        height = (tank / (length * width)).toInt()
//    }

    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    // Property getter
    open var volume: Int
        get() = width * height* length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm")
        // Get volume value from property getter
        println("Volume: $volume l Water: $water l (${water / volume * 100}% full)")
    }
}