package com.soten.kotlininaction.chapter06

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class TypeSystem {

	@Test
	@DisplayName("null이 될 수 있는 타입")
	fun nullable_type() {
		println(y)
		println(strLenSafe("abcd"))

		println(strLenSafe2(x))
	}
	// Type? = Type or null

	//	fun strLenSafe(s: String?) = s.length 불가능
	// 널이 될 수 있는 타입의 변수가 있다면 그에 대해 수행할 수 있는 연산이 제한된다.
	private fun strLenSafe(s: String?) = s?.length

	//  널이 될 수 있는 값을 널이 될 수 없는 타입의 변수에 대입할 수 없다.
	val x: String? = null
//	var y: String = x 불가능
	var y: String? = x

	private fun strLenSafe2(s: String?): Int = s?.length ?: 0


}
