package com.soten.fastcampus.practice.classtest.tv

class TV {

	private var state: Boolean = false
	private var channel: Int = 0

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

	fun upChannel() {
		if (!state) {
			println("Tv가 꺼져있습니다.")
			return
		}
		channel += 1
		if (channel > 3) {
			channel = 0
		}
		println("${channel}번 채널입니다.")
	}

	fun downChannel() {
		if (!state) {
			println("Tv가 꺼져있습니다.")
			return
		}
		channel -= 1
		if (channel < 0) {
			channel = 3
		}
		println("${channel}번 채널입니다.")
	}

}
