package lecture01

fun main() {
    var a = 0
    for(i in 1..100) {
        a += i
    }
    println("1 + 2 + … + 100 = $a")
}