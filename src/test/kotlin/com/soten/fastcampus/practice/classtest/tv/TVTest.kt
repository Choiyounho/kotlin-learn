package com.soten.fastcampus.practice.classtest.tv

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class TVTest {

	val tv = TV()

	@BeforeEach
	fun setUp() {
		tv.switch()
	}

	@Test
	@DisplayName("tv 전원 on/off")
	fun switch() {
		assertThat(tv.switch()).isFalse()
	}

	@Test
	@DisplayName("채널 업")
	fun up() {
		assertThat(tv.upChannel()).isEqualTo("${tv.channel}번 채널입니다.")
	}

	@Test
	@DisplayName("채널 다운")
	fun down() {
		assertThat(tv.downChannel()).isEqualTo("${tv.channel}번 채널입니다.")
	}

}
