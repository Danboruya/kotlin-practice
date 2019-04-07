package lecture02

fun main() {
    // In kotlin, it can use scope function like "also"
    // In other language, using XOR operation
    var a = 100
    var b = 9
    a = b.also { b = a }
    println(a)
    println(b)
}