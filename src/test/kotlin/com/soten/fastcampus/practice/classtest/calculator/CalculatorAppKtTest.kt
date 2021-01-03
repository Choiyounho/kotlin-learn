package com.soten.fastcampus.practice.classtest.calculator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CalculatorAppKtTest {

	private val cal: Calculator = Calculator(5)

	@Test
	@DisplayName("계산기 초기화")
	fun clear() {
		assertThat(cal.clear()).isEqualTo(0)
	}

	@Test
	@DisplayName("더하기 테스트")
	fun plus() {
		assertThat(cal.plus(5)).isEqualTo(10)
	}

	@Test
	@DisplayName("빼기 테스트")
	fun minus() {
		assertThat(cal.minus(5)).isEqualTo(0)
	}

	@Test
	@DisplayName("곱하기 테스트")
	fun multiply() {
		assertThat(cal.multiply(2)).isEqualTo(10)
	}

	@Test
	fun divide() {
		assertThat(cal.divide(5)).isEqualTo(1)
	}

}
