package com.lessons.first

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val result = calculateEquation(a, b, c)
    println(result)
}


fun calculateEquation(a: Int, b: Int, c: Int) : String {
    // Область допустимых значений
    if (c < 0) return "NO SOLUTION"

    if (b == c && a == 0) {
        return if (a == 0) "MANY SOLUTIONS" else "0"
    }

    val xDouble = (c * c - b) / a.toDouble()
    val xInt = (c * c - b) / a

    if ((a * xInt + b) < 0) return "NO SOLUTION"

    if (xDouble == xInt.toDouble()) {
        return xInt.toString()
    } else {
        return "NO SOLUTION"
    }
}