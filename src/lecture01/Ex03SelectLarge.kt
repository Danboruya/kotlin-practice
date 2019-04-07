package lecture01

fun main() {
    while(true) {
        print("a = ? >> ")
        val aIn = readLine()
        print("b = ? >> ")
        val bIn = readLine()
        if(aIn != null && bIn != null) {
            val a = aIn.toDouble()
            val b = bIn.toDouble()
            val c = when {
                a > b -> a
                else -> b
            }
            println("$c")
        } else {
            println("Warning: Both input variable required.")
            continue
        }
    }
}