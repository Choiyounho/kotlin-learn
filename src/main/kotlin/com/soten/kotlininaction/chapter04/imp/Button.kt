package com.soten.kotlininaction.chapter04.imp

class Button: Clickable, Focusable {
	override fun click() = println("I was clicked")
	override fun showOff() {
		super<Clickable>.showOff() // 같은 메서드명을 가진 두개의 인터페이스의 구현방법
		super<Focusable>.showOff()
	}
}
