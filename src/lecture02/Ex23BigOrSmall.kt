package lecture02

fun main() {
    var a = 9
    var b = 100
    a = if(a >= b) a else {b.also { b = a }}
    println(a)
    println(b)
}