package com.soten.fastcampus.learn

private var year = 2020 // 변하는 변수
private var hello = "hello"
private val num = 100 // 변하지 않는 변수 Java 로는 final 변수

fun main() {

    println(year + 1)
    println(hello)
    println(num)

    year = 2011
    hello = "hi"
//  number = 105 Val cannot be reassigned

    println(year)
    println(hello)
    println(num)

}
