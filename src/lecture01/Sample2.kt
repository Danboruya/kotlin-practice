package lecture01

import kotlin.math.*

fun main() {
    while(true) {
        print("a = ? >> ")
        val aIn = readLine()
        if(aIn != null) {
            val a = aIn.toDouble()
            if (a >= 0) {
                val b = abs(a)
                println("b = $b")
            } else {
                val b = a
                println("b = $b")
            }
        } else {
          println("Input required")
          continue
        }
    }
}