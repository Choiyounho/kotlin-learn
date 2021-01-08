package com.soten.kotlininaction.chapter04.imp

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class ButtonTest {

	@Test
	@DisplayName("인터페이스 구현 테스트")
	fun test() {
		val button = Button()

		assertThat(button.setFocus(true)).isEqualTo(println("got"))
	}
}
