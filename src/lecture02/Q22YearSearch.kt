package lecture02

fun main() {
    var a = 0
    loop@ while(true) {
        if (a % 3 == 2 && a % 5 == 1 && a % 7 == 6) {
            break@loop
        } else {
            a += 1
        }
    }
    println("age: $a")
}