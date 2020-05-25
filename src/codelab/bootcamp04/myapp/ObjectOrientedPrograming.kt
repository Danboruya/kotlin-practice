package codelab.bootcamp04.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()

    // Create Aquarium instance with width parameter
    // Default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()

    // Create Aquarium instance with two parameters
    // Default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()

    // Create Aquarium instance with three parameters
    // Everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    // This code print size two times, because first print run by primary constructor and
    // second one run by secondary constructor
    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
    aquarium6.printSize()
//    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")

//    val aquarium7 = Aquarium(numberOfFish = 29)
//    aquarium7.printSize()
//    aquarium7.volume = 70
//    aquarium7.printSize()

    val myAquarium1 = Aquarium(width = 25, length = 25, height = 40)
    myAquarium1.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    shark.eat()
}

fun main() {
    // buildAquarium()
    makeFish()
}