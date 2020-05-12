package lecture03

fun main() {
    println("x\t\t| y")
    println("--------+--------")
    for(x in 0..10) {
        println("$x\t\t  ${func(x)}")
    }
}

private fun func(x: Int):Int {
    return x * x
}