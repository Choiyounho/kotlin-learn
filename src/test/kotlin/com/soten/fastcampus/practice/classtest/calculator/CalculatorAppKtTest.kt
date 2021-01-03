package com.soten.fastcampus.practice.classtest.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CalculatorAppKtTest {

	@Test
	@DisplayName("계산기 초기화")
	fun clear() {
		val cal = Calculator(5)

		assertThat(cal.clear()).isEqualTo(0)
	}

	@Test
	@DisplayName("더하기 테스트")
	fun plus() {
		val cal = Calculator(5)

		assertThat(cal.plus(5)).isEqualTo(10)
	}

	@Test
	@DisplayName("빼기 테스트")
	fun minus() {
		val cal = Calculator(5)

		assertThat(cal.minus(5)).isEqualTo(0)
	}

	@Test
	@DisplayName("곱하기 테스트")
	fun multiply() {
		val cal = Calculator(5)

		assertThat(cal.multiply(2)).isEqualTo(10)
	}

	@Test
	fun divide() {
		val cal = Calculator(10)

		assertThat(cal.divide(2)).isEqualTo(5)
	}

}
