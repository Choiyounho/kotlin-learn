package com.soten.fastcampus.practice.classtest.calculator

class Calculator(var initNumber: Int) {

	fun clear() {
		initNumber = 0
		println(initNumber)
	}

	fun plus(number: Int) {
		initNumber += number
		println(initNumber)
	}

	fun minus(number: Int) {
		initNumber -= number
		println(initNumber)
	}

	fun multiply(number: Int) {
		initNumber *= number
		println(initNumber)
	}

	fun divide(number: Int) {
		initNumber /= number
		println(initNumber)
	}

}
