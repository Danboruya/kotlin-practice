package excise01

fun main(args: Array<String>) {
    val array : Array<Int> = parceToOctal(15)
    print("Octal: ")
    for (elem in array) {
        print(elem)
    }
    println()
}

fun parceToOctal(d : Int): Array<Int> {
    var decimal : Int = d
    val octal: Array<Int> = arrayOf(0, 0, 0, 0)
    var index: Int = 0
    while (decimal > 0) {
        octal[octal.size - 1 - index] = decimal % 8
        decimal /= 8
        index++
    }
    return octal
}