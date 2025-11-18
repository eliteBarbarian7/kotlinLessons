package org.example

fun main() {
    //операторы сравнения

    // < , > , <= , >= , == , != , === , !==
    // true, false
    print("Введите ваш возраст: ")
    val userAge = readln().toInt()

    if (AGE_OF_MAJORITY < userAge){
        println("Вы старше 18 лет")
    }
    else if (AGE_OF_MAJORITY == userAge){
        println("Вам ровно 18 лет")
    }
    else {
        println("Вам меньше 18 лет")
    }



    val itog = !(userAge < DRUGOE_CHISLO) && !(userAge > AGE_OF_MAJORITY)

    println(itog)

    val anotherItog = userAge in DRUGOE_CHISLO..AGE_OF_MAJORITY
    println(anotherItog)


    val peremennayDlyWhen = when(userAge){
        100 -> "ты ввёл число сто"
        200 -> "you wrote number twohundred"
        else -> "ты другое число ввёл"
    }

    println(peremennayDlyWhen)
}

const val AGE_OF_MAJORITY = 18

const val DRUGOE_CHISLO = 15

const val newText = "Novoe predlojenie"