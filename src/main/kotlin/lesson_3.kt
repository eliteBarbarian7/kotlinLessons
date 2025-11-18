package org.example

fun main() {
    // конкатенация строк
    val zdarova = "privet"
    val space = " "

    val chislo = readln().toInt()

    println("What is your main question?" + zdarova + space)


    // интерполяция строк
    println("What is $zdarova your main question? \'${5 + chislo}\'")
}