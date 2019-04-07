package lecture01

fun main() {
    val a = 100
    val b = 49
    var q = 0
    var r = a
    do {
        r -= b
        q++
    } while (r >= b)
    println("a - b_1 - b_2 - … - b_$q = $r")
    println("a % b = ${a % b}")
}