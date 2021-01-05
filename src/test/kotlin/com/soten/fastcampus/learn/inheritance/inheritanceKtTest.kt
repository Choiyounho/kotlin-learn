package com.soten.fastcampus.learn.inheritance

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class inheritanceKtTest {

	@Test
	@DisplayName("상속 기능 테스트")
	fun inheritance() {
		val superCar = SuperCar()

		assertThat(superCar.drive()).isEqualTo("빠르게 주행하다.")
	}
}
