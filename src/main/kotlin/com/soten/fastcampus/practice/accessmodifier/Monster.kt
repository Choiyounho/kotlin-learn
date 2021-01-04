package com.soten.fastcampus.practice.accessmodifier

class Monster(private var hp: Int, private val power: Int) {

	fun attack(night: Night) {
		night.defense(power)
	}

	fun defense(damage: Int)  {
		hp -= damage
		if (hp > 0) {
			println("몬스터의 현재 체력은 $hp 입니다.")
		} else {
			println("몬스터가 죽었습니다.")
		}
	}

}
