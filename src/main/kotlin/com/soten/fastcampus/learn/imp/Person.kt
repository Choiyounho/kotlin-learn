package com.soten.fastcampus.learn.imp

interface Person {

	fun eat()  // 메서드 내용을 구현하지 않을 경우 자식 클래스에서 반드시 구현해야함.

	fun sleep()

	fun rest() { // 메서드 내용을 구현을 했으면, 자식클래스에서 구현하지 않아도 됨.
		println("휴식을 취하다")
	}
}
