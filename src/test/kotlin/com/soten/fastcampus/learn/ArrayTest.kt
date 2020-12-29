package com.soten.fastcampus.learn

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import kotlin.Array

class ArrayTest {

	@Test
	@DisplayName("배열 생성(1) : 타입 지정")
	fun createArray() {
		val group = arrayOf<Int>(1, 2, 3, 4, 5)

		assertThat(group is Array).isTrue
	}

	@Test
	@DisplayName("배열 생성(2) : 타입 지정")
	fun createArray1() {
		val group = intArrayOf(1, 2, 3, 4, 5)

		assertThat(group is IntArray).isTrue
	}

	@Test
	@DisplayName("배열 생성(3) : 타입 미지정")
	fun createArray2() {
		val group = arrayOf(1, 2, 3, 4, 5)

		assertThat(group is Array).isTrue
	}

	@Test
	@DisplayName("배열 생성(4) : 타입 미지정, {} 안에 기본값")
	fun createArray3() {
		val group = Array(10) { 15 }
		val group1 = Array(5) { 1;2;3;4;5 }

		assertAll({
			assertThat(group[4]).isEqualTo(15)
			assertThat(group1[4]).isEqualTo(5)
		})
	}

	@Test
	@DisplayName("배열 값 출력")
	fun getArray() {
		val group = arrayOf(1, 2, 3, 4, 5)

		println(group[2])
		assertThat(group.get(2)).isEqualTo(3)
	}

	@Test
	@DisplayName("배열 값 변경")
	fun setArray() {
		val group = arrayOf(1, 2, 3, 4, 5)

		group.set(2, 100)
		group[3] = 150
		assertAll({
			assertThat(group[2]).isEqualTo(100)
			assertThat(group.get(3)).isEqualTo(150)
		})
	}

}
