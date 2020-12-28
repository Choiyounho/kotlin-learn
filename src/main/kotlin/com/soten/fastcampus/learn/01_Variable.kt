package com.soten

var year = 2020 // 변하는 변수
var hello = "hello"
val number = 100 // 변하지 않는 변수 Java 로는 final 변수

fun main() {

    println(year + 1)
    println(hello)
    println(number)

    year = 2011
    hello = "hi"
//  number = 105 Val cannot be reassigned

    println(year)
    println(hello)
    println(number)

}
