package com.soten.fastcampus.learn.inheritance

open class Car() {

	open fun drive(): String {
		return "주행하다."
	}

	fun stop() {
		println("멈추다.")
	}
}
