package com.soten.kotlininaction.chapter04

class GetterAndSetter {

}

class User(val name: String) {

	var address: String = "unspecified"
		set(value: String) {
			println("""
			Address was changed for $name:
			"$field" -> "$value".""".trimIndent()) // 뒷받침하는 필드 값 읽기
			field = value // 뒷받침하는 필드 값 변경하기
		}

}

// 프로퍼티값 변경 불가능
class LengthCounter {
	var counter: Int = 0
		private set

	fun addWord(word: String) {
		counter += word.length
	}
}


