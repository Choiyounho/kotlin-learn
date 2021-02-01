package com.soten.udemy

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

// Nested class = static
class Outer {
	private val bar: Int = 1

	class Nested { // static class
		fun foo() = 2
	}

	inner class Inner {
		fun foo() = bar
	}
}

class Section4Class2 {

	@Test
	@DisplayName("Nested와 inner 클래스 접근")
	fun class_access() {
		val foo = Outer.Nested().foo()

		val demo = Outer().Inner().foo()
	}

	// Higher order function
	@Test
	@DisplayName("파라미터 정의 - 파라미터가 없을 경우")
	fun parameter() {
		print { "return message" }
		print2 { "$it return message" }
	}

	private fun print(body: () -> String) {
		println(body())
	}

	private fun print2(body: (Int) -> String) {
		println(body(5))
	}

	@Test
	@DisplayName("파라미터 정의 - 1개 이상인 경우")
	fun parameter2() {
		print3 { s, s2 -> "$s, $s2, return message" }
	}

	private fun print3(body: (String, String) -> String) {
		println(body("One", "Tow"))
	}

	// Higher order function 2개 이상

	@Test
	@DisplayName("파라미터 정의 - 함수가 2개 이상인 경우")
	fun parameter3() {
		print4 ({int, message -> "$int, $message"}) {"message2"}
	}

	private fun print4(body: (Int, String) -> String, body2: () -> String) {
		println(body(1, "message"))
	}

	@Test
	@DisplayName("변수에 Higher-Order-Functions 정의하기")
	fun test() {
		higherOrderFunction("")

		higherOrderFunction2 = {
			println("print!!")
		}

		higherOrderFunction2("")
	}

	var higherOrderFunction: (String) -> Unit = {
		println("print!!!")
	}

	var higherOrderFunction2: (String) -> Unit = {
		println("print!!!")
	}

	@Test
	@DisplayName("let - data의 null 체크를 할 때 주로 사용")
	fun let() {
		show("")
		show(null)

	}

	private fun show(name: String?) {
		name?.let {
			println("name $it length ${it.length}")
		} ?: println("null")
	}

	@Test
	@DisplayName("also - 블록을 구분해주는 역할")
	fun also() {
		val block = Block("ABC")
		val temp = block.copyName(20)
		println("block $block temp $temp")
	}

	data class Block(var name: String = "", var age: Int = 10)

	private fun Block.copyName(age: Int) = Block().also {
		it.name = this.name
		it.age = age
	}

	@Test
	@DisplayName("takeIf - 가져 온 값을 체크, 조건 충족 못하면 null")
	fun takeIf() {
		val block = Block("ABC")
		println("out ${block.takeIf { it.age > 10 }}")
	}

	@Test
	@DisplayName("takeUnless - 가져 온 값을 체크, 충족 하면 null")
	fun takeUnless() {
		val block = Block("ABC")
		println("out ${block.takeUnless { it.age > 10 }}")
	}

}
