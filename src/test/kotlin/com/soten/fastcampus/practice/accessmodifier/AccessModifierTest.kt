package com.soten.fastcampus.practice.accessmodifier

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class AccessModifierTest {

	@Test
	@DisplayName("접근 제어자를 이용한 몬스터, 기사 클래스 실습")
	fun test() {
		val night = Night(20, 4)
		val monster = Monster(15, 3)

		night.attack(monster)
		monster.attack(night)
	}

}
