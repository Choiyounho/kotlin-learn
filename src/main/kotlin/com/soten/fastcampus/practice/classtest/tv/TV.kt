package com.soten.fastcampus.practice.classtest.tv

class TV {

	var state: Boolean = false
	var channel: Int = 0

	fun switch(): Boolean {
		return if (!state) {
			println("전원을 켭니다.")
			state = !state
			state
		} else {
			println("전원을 끕니다.")
			state = !state
			state
		}
	}

	fun upChannel(): String {
		if (!state) {
			return ""
		}
		channel += 1
		if (channel > 3) {
			channel = 0
		}
		return "${channel}번 채널입니다."
	}

	fun downChannel(): String {
		if (!state) {
			return ""
		}
		channel -= 1
		if (channel < 0) {
			channel = 3
		}
		return "${channel}번 채널입니다."
	}

}
