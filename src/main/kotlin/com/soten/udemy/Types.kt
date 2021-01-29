package com.soten.udemy

val oneMillion = 1_000_000 // 숫자 사이에 _ 추가 가능

val sample: Int = 10000
val sampleBoxed: Int? = sample
val sampleBoxed2: Int? = sample

fun main() {
	println(sample === sample) // true

	println(sampleBoxed === sampleBoxed2) // false
	// 코틀린에서 === 는 메모리의 값을 비교하는 것이다.

	val aLong: Long = 0
	val aInt: Int = aLong.toInt() // 코틀린에서는 롱의 값을 인트에 대입할 수 없다.

}
