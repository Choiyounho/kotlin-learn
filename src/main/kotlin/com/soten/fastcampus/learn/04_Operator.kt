package com.soten.fastcampus.learn

import sun.plugin.cache.FileVersion

fun main() {

    // 산술 연산자
    val plus = 10 + 1
    val minus = 10 - 1
    val multiple = 9 * 1
    val division = 20 / 3
    val remainder = 20 % 3

    println(plus)
    println(minus)
    println(multiple)
    println(division)
    println(remainder)

    var substitute = 5
    substitute += 5

    println(substitute)

    // 대입 연산자
    var result = 0

    // 복합 연산자
    result += plus
    println(result)

    result -= minus
    println(result)

    result *= multiple
    println(result)

    result /= division
    println(remainder)

    result %= remainder
    println(result)

    // 증감 연산자
    result++
    println(result)

    result--
    println(result)

    // 비교 연산자
    val numberFour = 4
    val numberFive = 5
    val comparison = numberFive > numberFour
    val comparison1 = numberFive == numberFour
    val comparison2 = !comparison1

    println(comparison)
    println(comparison1)
    println(comparison2)

    // 논리 연산자
    val and = comparison && comparison2
    val or = comparison || comparison2

    println(and)
    println(or)

}
