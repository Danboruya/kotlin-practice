package lecture01

fun main() {
    while(true) {
        print("a = ? >> ")
        val aIn = readLine()
        print("b = ? >> ")
        val bIn = readLine()
        if (aIn != null && bIn != null) {
            val a = aIn.toDouble()
            val b = bIn.toDouble()
            val s = when {
                a != 0.0 -> {
                    println("x = ${equation(a, b)}")
                    1
                }
                b == 0.0 -> 0
                else -> 2
            }
            println("s = $s")
        } else {
            println("Both input required")
            continue
        }
    }
}

private fun equation(a: Double, b: Double):Double {
    return b / a
}