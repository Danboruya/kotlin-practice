package codelab.bootcamp02

fun main() {
    // List

    // Immutable list
    val school = listOf("mackerel", "trout", "halibut")
    // school.remove("trout") <- can't remove the element because of school list is immutable!
    println(school)

    // Can change the element of list of val variable
    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")

    // Array
    val school2 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school2))

    // Mixed type can accept for Array in Kotlin
    val mix = arrayOf("fish", 2)

    // Fixed type of array. e.g) Int array
    val numbers = intArrayOf(1, 2, 3)

    val numbers2 = intArrayOf(1, 2, 3)
    val numbers3 = intArrayOf(4, 5, 6)
    val foo2 = numbers3 + numbers
    println(foo2[5])
    println(foo2)

    // List of list and other element
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(numbers, oceans, "salmon") // <- Any type can accept?
    println(oddList)

    // it refers to array index
    val array = Array(5) {it * 2}
    println(java.util.Arrays.toString(array))

    // for loop
    for (element in school) {
        print(element + " ")
    }

    for ((index, elm) in school.withIndex()) {
        println("Item at $index is $elm\n")
    }

    // Another for loop
    for (i in 1..5) print(i)
    for (i in 5 downTo 1) println(i)
    for (i in 3..6 step 2) println(i)
    for (i in 'd'..'g') println(i)

    // While and do-While
    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in water\n")

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubkes in the water\n")

    // Repeat loop
    repeat(2) {
        println("A fish is swimming")
    }
}
