package lecture02

import kotlin.math.sqrt

fun main() {
    var n = 0
    var x = sqrt(189899.0)
    println("x = $x")
    if(x >= 0) {
        while(x >= 1) {
            x -= 1.0
            n += 1
        }
    } else {
        while(x < 0) {
            x += 1.0
            n -= 1
        }
    }
    println("Gaussian x = $n")
}