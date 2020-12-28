package com.soten.fastcampus.learn

fun main() {
    val a: Int = 5
    val b: Int = 10

    if (a > b) {
        println("a 는 b 보다 큽니다.")
    } else {
        println("a 는 b 보다 작습니다.")
    }

    // 값을 리턴하는 if
    val max = if (a > b) a else b

    val min = if (a < b) {
        b
    } else {
        a
    }

    println(max)
    println(min)

    // 엘비스 연산자
    val number: Int? = null
    val number1 = number ?: 10 // number 의 값이 null 이면 10을 대입하라.

    println(number1)

    // when
    val value: Int = 3

    when (value) {
        1 -> {
            println("value is 1")
        }
        3 -> println("value is 3")
        else -> {
            println("I do not know value")
        }
    }

    // when 엘비스 연산자
    val value1 = when (value) {
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value1)

    val value2: Int = 10
    when (value2) {
        is Int -> {
            println("value2 is int")
        }
        else -> {
            println("value2 is not int")
        }
    }

    val value3: Int = 60
    when (value3) {
        in 60..70 -> {
            println("value in 60-70")
        }
        in 70..80 -> {
            println("value in 60-70")
        }

    }
}

