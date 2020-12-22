package com.soten.fastcampus.learn

// fun 함수명(변수명 : T, 변수명 : T...) : R {}
fun plus(first: Int, second: Int): Int {
    return first + second
}

// 디폴트 값을 갖는 함수
fun plusFive(first: Int, second: Int = 5): Int {
    return first + second
}

// 반환값이 없는 함수 만들기
fun printPlus(first: Int, second: Int) {
    val result: Int = first + second
    println(result)
}

// 간단하게 함수를 선언하는 방법
fun plusSimple(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for (number in numbers) {
        println(number)
    }
}

fun main() {
    val result = plus(5, 2) // case 1
    println(result)

    val result1 = plus(first = 10, second = 20) // case 2
    println(result1)

    val result2 = plus(second = 10, first = 5) // case 3
    println(result2)

    val result3 = plusFive(20, 10)
    println(result3)

    val result4 = plusFive(20, 5)
    println(result4)

    printPlus(20, 5)

    val result5 = plusSimple(5, 12)
    println(result5)

    plusMany(1, 2, 3)
}


