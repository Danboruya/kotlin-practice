package practice01

import java.io.PrintWriter

fun main(args: Array<String>) {
    val pw = PrintWriter(System.out)
    val x : Int = readLine()!!.toInt()
    val y : Int = readLine()!!.toInt()
    pw.println(x + y)
    pw.println(x - y)
    pw.println(x * y)
    pw.println(x.toDouble() / y.toDouble())
    pw.println(x % y)
    pw.flush()
}