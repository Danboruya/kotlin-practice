package practice01

import java.io.PrintWriter

fun main(args: Array<String>) {
    val pw = PrintWriter(System.out)
    val x = readLine()!!.toInt()
    pw.println(x)
    pw.println(x * x)
    pw.println(x * x * x)
    pw.flush()
}