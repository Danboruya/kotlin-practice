package lecture02

fun main() {
    var x = 0
    var y = 56
    var c: Int

    loop@ while (true) {
        c = ((2 * x) + (4 * y))
        when (c) {
            150 -> break@loop
            else -> {
                x += 1
                y -= 1
            }
        }
    }
    println(x)
    println(y)
}