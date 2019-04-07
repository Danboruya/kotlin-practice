package lecture02

fun main() {
    var a = 10
    var b = 1
    val c: Int
    c = b
    b = a
    a = c
    println(a)
    println(b)
}