package com.soten.fastcampus.practice.accessmodifier

class Night(private var hp: Int, private val power: Int) {

	fun attack(monster: Monster) {
		monster.defense(power)
	}

	fun defense(damage: Int)  {
		hp -= damage
		if (hp > 0) {
			heal()
			println("기사의 현재 체력은 $hp 입니다.")
		} else {
			println("기사가 죽었습니다.")
		}
	}

	private fun heal() {
		hp += 3
	}

}
