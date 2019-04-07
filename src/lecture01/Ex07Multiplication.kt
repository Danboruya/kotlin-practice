package lecture01

fun main() {
    val a = 100
    val b = 50
    var c = 0
    var d = 1

    do {
        c += a
        d++
    } while(d <= b)
    println("a_0 + a_2 + … + a_$b = $c")
}