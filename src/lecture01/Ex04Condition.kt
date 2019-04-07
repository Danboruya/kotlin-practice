package lecture01

fun main() {
    while(true) {
        print("a = ? >> ")
        val aIn = readLine()
        if(aIn != null) {
            val a = aIn.toDouble()
            val b = when {
                a > 0 -> 1
                a == 0.0 -> 0
                else -> -1
            }
            println(b)
        } else {
            println("Input required")
            continue
        }
    }
}