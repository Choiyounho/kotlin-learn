package com.soten.fastcampus.learn

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class GenericTest {

	val list = listOf(1, 2, 3, "가")

	@Test
	@DisplayName("제너릭 미사용")
	fun unusedGeneric() {
		assertThat(list[2].toString()).isEqualTo("3")
	}

	@Test
	@DisplayName("제네릭 사용")
	fun useGeneric() {
		val list2 = listOf<String>("a", "b", "c")
		assertThat(list2[2]).isEqualTo("c")
	}

}
