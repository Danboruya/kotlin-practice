package codelab.bootcamp04.myapp

class Shark: FishColor, FishAction {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor):
    FishAction by PrintingFishAction("eat algae"),
    FishColor by fishColor


class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

interface FishAction {
    fun eat()
}

// Interface delegation
interface FishColor {
    val color: String
}

object GoldColor: FishColor {
    override val color = "gold"
}

// Enum sample
enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF)
}

enum class Direction(val degrees: Int) {
    NORTH(0), SOUTH(180), EAST(90), WEST(270)
}

// Sealed class
sealed class Seal

// Sealed class can subclass only form this file
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal):String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "Sea lion"
    }
}

fun main() {
    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)
    println(Direction.EAST.degrees)
}