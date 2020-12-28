package com.soten.fastcampus.practice

// 변수타입 연습

var name = "Younho"
var introduce = "My name is " + name + " Nice to meet you"
var introduce2 = "My name is $name Nice to meet you"

var nullAbleInt : Int? = null // 변수 타입 뒤에 ? 를 넣으면 null 을 가질 수 있게 됨

fun main() {
    println(introduce)
    println(introduce2)
    println(nullAbleInt)
}
