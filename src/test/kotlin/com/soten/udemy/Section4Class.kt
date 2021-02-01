package com.soten.udemy

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class Section4Class {

	@Test
	@DisplayName("class 내에 직접 접근을 위한 함수와 변수 정의")
	fun companion_object() {
		Base.NAME
		Base.TYPE
		Base.isTypeZero()
	}

	// companion object로 java의 static 처럼 kotlin에서 사용
	class Base {
		companion object {
			val TYPE: Int = 0
			val NAME: String = "name"
			fun isTypeZero(): Boolean {
				return TYPE == 0
			}
		}
	}

	// const와 @JvmField, @JvmStatic을 쓰면 자바에서도 스태틱 메서드처럼 접근이 가능하다
	class Base2 {
		companion object {
			const val TYPE: Int = 0
			@JvmField
			val NAME: String = "name"
			@JvmStatic
			fun isTypeZero(): Boolean {
				return TYPE == 0
			}
		}
	}

	@Test
	@DisplayName("sealed class")
	fun sealed_class_test() {
		println(eval(Sum(Const(0.0), Const(1.0))))
	}

	private fun eval(expr: Expr): Double = when (expr) {
		is Const -> expr.number
		is Sum -> eval(expr.e1) + eval(expr.e2)
		NotANumber -> Double.NaN
	}

}

sealed class Expr(val name: String) // sealed class 는 private 클래스이다.
class Const(val number: Double) : Expr("")
data class Sum(val e1: Expr, val e2: Expr) : Expr("")
object NotANumber : Expr("")

