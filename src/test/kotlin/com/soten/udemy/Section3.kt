package com.soten.udemy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Section3 {

	@Test
	@DisplayName("function 구현")
	fun function() {
		assertThat(getSum(1, 2)).isEqualTo(3)
	}

	private fun getSum(a: Int, b: Int) = a + b

	@Test
	@DisplayName("extension Function 구현")
	fun extension_function() {
		assertThat(4.max(6)).isEqualTo(6)
	}

	private fun Int.max(x: Int): Int = if (this > x) this else x

	@Test
	@DisplayName("extension Function - infix notation 구현")
	fun extension_function_infix_notation() {
		assertThat(4 min 6).isEqualTo(4)
	}

	private infix fun Int.min(x: Int) = if (this < x) this else x

	@Test
	@DisplayName("extension 호출 방법")
	fun extension_test() {
		val c = C()
		c.foo() // member
		c.foo(5) // extension
	}

	class C {
		fun foo() {
			println("member")
		}
	}

	private fun C.foo(a: Int) {
		println("extension")
	}

	@Test
	@DisplayName("loop break - break 구간 설정")
	fun loop() {
		loop@ for (i in 1..100) {
			for (j in 1..100) {
				if (j > 10) break@loop
				print(j)
			}
			println()
		}
		println("end")
	}

	@Test
	@DisplayName("lit - return 뒤에 붙이며, 스킵하는 구간  설정")
	fun lit() {
		val ints = mutableListOf(1, 2, 0, 4, 5)
		ints.forEach lit@{
			if (it == 0) return@lit
			print(it)
		}
	}

	@Test
	@DisplayName("@forEach - lit 와 동일한 기능")
	fun forEachAnnotation() {
		val ints = mutableListOf(1, 2, 0, 4, 5)
		ints.forEach {
			if (it == 0) return@forEach
			print(it)
		}
	}

	@Test
	fun this_expression() {
		Sample().SampleB().test(0)
	}

	class Sample {
		inner class SampleB {
			fun Int.foo() {
				val a = this@Sample
				val a1 = this@SampleB

				test()
				this@Sample.test()

				val b = this
				val b1 = this@foo

				println("b === c ${b === b1}")
			}

			fun test(a: Int) {
				a.foo()
			}

			fun test() {
				println("test - inner class")
			}
		}
		fun test() {
			println("test - class Sample")
		}

	}
}
