package com.soten.udemy


// kotlin은 abstract/interface를 제외한 모든 클래스는 final이다.

open class Customer(age: Int)

class User(age: Int) : Customer(age) {

}
