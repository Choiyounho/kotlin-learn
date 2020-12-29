package com.soten.fastcampus.learn

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class CollectionTest {

	@Test
	@DisplayName("list 생성 : 중복 허용")
	fun createList() {
		val numbers = listOf(1, 2, 3)
		assertThat(numbers).contains(1)
	}

	@Test
	@DisplayName("set 생성 : 중복 허용 x, 순서(index) 없음")
	fun createSet() {
		val numberSet = setOf(1, 2, 2, 3, 3)

		println(numberSet)

		numberSet.forEach { // 전체 출력 방법
			println(it)
		}

		assertThat(numberSet).contains(3)
	}

	@Test
	@DisplayName("map 생성 : key, value")
	fun createMap() {
		val numberMap = mapOf("One" to 1, "Two" to 2)
		println(numberMap)

		assertThat(numberMap["One"]).isEqualTo(1)
	}

	@Test
	@DisplayName("Mutable Collection")
	fun createMutable() {
		val mutableList = mutableListOf(1, 2, 3, 4, 5)

		mutableList.add(6)
		assertThat(mutableList[5]).isEqualTo(6)
	}

}
