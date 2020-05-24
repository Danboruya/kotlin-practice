package codelab.bootcamp03

import java.util.Random

fun main(args: Array<String>) {
    println("Hello ${args[0]}")

    // println function return Unit type
    val isUnit = println("This is an expression")
    println(isUnit)

    val temperture = 10
    // if expression can accept on kotlin
    val isHot = if (temperture > 50) true else false
    println(isHot)

    // If expression can write in String template
    val message = "The water temperture is ${if (temperture > 50) "too warm" else "OK"}."
    println(message)

    feedTheFish()
    swim()
    swim("slow")
    swim(speed="turtle-like")

    // Filter
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    println(decorations.filter {it[0] == 'p'})

    // eager filter
    val eager = decorations.filter {it[0] == 'p'}
    println("eager: $eager")

    // lazy will wit until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: $filtered")

    // Force evaluation of the lazy list
    val newList = filtered.toList()
    println("new list: $newList")

    val lazyMap = decorations.asSequence().map {
        println("access: $it")
        it
    }

    println("lazy: $lazyMap")
    println("-----")
    println("first: ${lazyMap.first()}")
    println("-----")
    println("all: ${lazyMap.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("-----")
    println("filtered: ${lazyMap2.toList()}")
    println()

    // lambda expression
    var dirtyLevel = 20
    val waterFilter = { dirty: Int -> dirty / 2}
    println(waterFilter(dirtyLevel))

    // variable named watterFilter1 has Int argument and returns Int value
    val waterFilter1: (Int) -> Int = {dirty -> dirty / 2}

    // high-order function with lambda expression
    println(updateDirty(30, waterFilter1))

    // Using normal named function
    fun increaseDirty(start: Int) = start + 1
    // In this updateDirty function, it doesn't call function
    println(updateDirty(15, ::increaseDirty))

    var dirtyLevel2 = 19
    dirtyLevel2 = updateDirty(dirtyLevel2) {dirtyLevel2 -> dirtyLevel2 + 23}
    println(dirtyLevel2)
}

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

fun shouldChangeWater(day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

// Single-expression functions
fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day == "Sunday"

// Using default parameter to avoid too much overloading of function
fun swim(speed: String = "fast") {
    println("swimming $speed")
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    println("Change water: ${shouldChangeWater(day)}")
}

fun fishFood(day: String): String {
    val food: String
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }
}

fun randomDay() : String {
    val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}