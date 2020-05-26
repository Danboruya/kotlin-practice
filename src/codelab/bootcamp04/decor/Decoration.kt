package codelab.bootcamp04.decor

data class Decoration(val rocks: String) {
}

data class Decoration2(val rocks: String, val wood: String, val diver: String) {
}

fun makeDecorations() {
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)


    // Compare two data class objects
    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    // Destruction
    val d5 = Decoration2("Crystal", "Wood", "Diver")
    println(d5)

    // assign all properties to three variables
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

}

fun main() {
    makeDecorations()
}