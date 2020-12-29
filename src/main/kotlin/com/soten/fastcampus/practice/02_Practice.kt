package com.soten.fastcampus.practice

import java.util.*

var scanner: Scanner = Scanner(System.`in`)

/*
   1번 문제 List 를 두개 만든다.
   첫번째 List 에는 0 부터 9 까지 값을 넣는다. (반복문 사용)
   두번째 List 에는 첫 번째 List 의 값을 하나씩 확인하여 짝수면 true, 홀수면 false 를 넣어 준다.
 */

private fun exam1() {
	val numbers = mutableListOf<Int>()
	for (i in 1 until 10) {
		numbers.add(i)
	}

	val isNumbers = mutableListOf<Boolean>()
	for (item in 0 until numbers.size) {
		if (numbers[item] % 2 == 1) {
			isNumbers.add(false)
		} else {
			isNumbers.add(true)
		}
	}
	println(numbers)
	println(isNumbers)
}

/*
   학점을 구하라.
   90점 이상 A
   70~89 -> B
   60~69 -> C
   그 외 F
 */

private fun exam2(point: Int): String {
	return when {
		point >= 90 -> "A 학점입니다."
		point >= 70 -> "B 학점입니다."
		point >= 60 -> "C 학점입니다."
		else -> "F 학점입니다."
	}
}

/*
   전달 받은 숫자의 각 자리 수의 합을 구하라
 */

private fun exam3(number: Int): Int {
	var result: Int = 0
	var num = number

	while (num != 0) {
		result += num % 10
		num /= 10
	}

	return result
}

/*
   구구단 출력
 */

private fun exam4() {
	for (i in 1..9) {
		println("$i 단 시작 ")
		for (j in 1..9) {
			println("$i * $j = " + (i * j))
		}
		println()
	}
}

fun main() {
	exam1()

	print("몇점을 받았나요? \n>>>")
	val point: Int = scanner.nextInt()
	println(exam2(point))

	println(exam3(35))

	exam4()

}
