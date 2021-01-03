package com.soten.fastcampus.practice.classtest.bank

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class AccountTest {

	val kakaoBank = Account("최윤호", "1994-12-06")

	@BeforeEach
	fun setUp() {
		kakaoBank.balance = 10000
	}

	@Test
	fun checkBalance() {
		assertThat(kakaoBank.checkBalance()).isEqualTo("잔액 : ${kakaoBank.balance} 원")
	}

	@Test
	@DisplayName("입금 테스트")
	fun deposit() {
		assertThat(kakaoBank.deposit(5000)).isEqualTo("${kakaoBank.balance} 원이 입금되었습니다.")
	}

	@Test
	fun withdrawal() {
		assertThat(kakaoBank.withdrawal(5000)).isEqualTo("${kakaoBank.balance} 원이 출금되었습니다.")
	}

}
