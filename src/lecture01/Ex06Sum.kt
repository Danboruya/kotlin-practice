package lecture01

fun main() {
    val a = Array(101) {it}
    for(i in 1..100) {
        a[0] += a[i]
    }
    println("a[1] + a[2] + … + a[100] = ${a[0]}")
}