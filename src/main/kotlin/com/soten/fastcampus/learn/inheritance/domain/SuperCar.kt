package com.soten.fastcampus.learn.inheritance.domain

class SuperCar: Car() {

	override fun drive(): String {
		val run = super.drive()

		return "빠르게 $run"
	}

}
