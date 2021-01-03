package com.soten.fastcampus.practice.classtest.calculator

class Calculator(var initNumber: Int) {

	fun clear():Int {
		initNumber = 0
		println(initNumber)
		return initNumber
	}

	fun plus(number: Int): Int {
		initNumber += number
		println(initNumber)
		return initNumber
	}


	fun minus(number: Int): Int {
		initNumber -= number
		println(initNumber)
		return initNumber
	}

	fun multiply(number: Int): Int {
		initNumber *= number
		println(initNumber)
		return initNumber
	}

	fun divide(number: Int): Int {
		initNumber /= number
		println(initNumber)
		return initNumber
	}

}
