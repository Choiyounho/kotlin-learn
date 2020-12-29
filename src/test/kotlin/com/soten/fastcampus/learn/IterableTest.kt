package com.soten.fastcampus.learn

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class IterableTest {

	private lateinit var numbers: List<Int>

	@BeforeEach
	internal fun setUp() {
		numbers = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
	}

	@Test
	@DisplayName("반복하는 방법 (1) : 단순 출력")
	fun repeat() {
		for (item in numbers) {
			if (item == 5) {
				println("item is five")
			} else {
				println("item is not five")
			}
		}
	}

	@Test
	@DisplayName("반복하는 방법 (2) : for 문 사용")
	fun repeat1() {
		for ((index, item) in numbers.withIndex()) {
			println("index : $index value : $item")
		}
	}

	@Test
	@DisplayName("반복하는 방법 (3) : forEach 사용")
	fun repeat2() {

		numbers.forEach {
			println("index : " + (it - 1) + " value : " + numbers[it - 1])
		}
	}

	@Test
	@DisplayName("반복하는 방법 (4) : 자동으로 index 와 item 을 생성해주는 메서드")
	fun repeat3() {

		numbers.forEachIndexed { index, item -> println("index : $index value : $item") }
	}

	@Test
	@DisplayName("반복하는 방법 (5) : until 키워드를 이용 시 마지막 수를 포함하지 않는다.")
	fun repeat4() {
		for (it in 0 until numbers.size) {
			println("index : " + (it) + " value : " + numbers[it])
		}
	}

	@Test
	@DisplayName("반복하는 방법 (6) : step (N) 을 이용하여 N 번씩 점프하며 반복")
	fun repeat5() {
		for (it in 0 until numbers.size step (2)) { // step 을 사용하여 필터링
			println("index : " + (it) + " value : " + numbers[it])
		}
	}

	@Test
	@DisplayName("반복하는 방법 (7) : downTo(N) 를 이용 하여 N 까지 역순으로 반복")
	fun repeat6() {
		for (it in numbers.size - 1 downTo (0)) {
			println("index : " + (it) + " value : " + numbers[it])
		}
	}

	@Test
	@DisplayName("반복하는 방법 (8) : A..B 를 이용하여 B 까지 반복")
	fun repeat7() {
		for (i in 0..10) {
			println(i)
		}
	}

	@Test
	@DisplayName("반복하는 방법 (9) : while 문")
	fun repeat8() {
		var number: Int = 0
		var number1: Int = 4

		while (number < number1) {
			number++
			println("반복")
		}
	}

}
