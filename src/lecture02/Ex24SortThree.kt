package lecture02

fun main() {
    var a = 1
    var b = 109
    var c = 0

    when {
        a <= b -> a = b.also { b = a }
        a <= c -> a = c.also { c = a }
        b <= c -> b = c.also { b = c }
    }

    println("a = $a, b = $b, c = $c")
}