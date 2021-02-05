package com.soten.udemy

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import java.lang.NullPointerException

class Section4Null {

	@Test
	@DisplayName("코틀린은 ?를 사용하지 않으면 컴파일 에러가 난다.")
	fun test() {
		setInfo("Ab", null)

		val temp: String? = null
		val size = temp?.length
		println(size)
	}

	private fun setInfo(a: String, b: String?) {
		println("a $a b $b")
	}

	@Test
	@DisplayName("Safe Call")
	fun safe_call() {
		val aaa: AAA? = AAA(BBB(null))
		val name = aaa?.bbb?.ccc?.name
		println("name $name")
	}

	data class AAA(val bbb: BBB?)
	data class BBB(val ccc: CCC?)
	data class CCC(val name: String?)

	@Test
	@DisplayName("엘비스 연산자 ?:")
	fun elvis_operator() {
		val temp: String? = null
		println("size ${getSize(temp)}")
	}

	private fun getSize(a: String?): Int = a?.length ?: 0

	@Test
	@DisplayName("엘비스 연산자 !!")
	fun elvis_operator2() {
		val temp: String? = null
		println("size ${getSize2(temp)}")
	}

	private fun getSize2(a: String?): Int = try {a!!.length ?: 0} catch (e: NullPointerException) {0}

	@Test
	@DisplayName("안전한 형변환")
	fun casting() {
		val a: Any? = "name".length
		val b: Int? = a as Int ?: 0
		println(b)
	}

	@Test
	@DisplayName("list에서 null 값 제외하기")
	fun exclude_null() {
		val listWithNulls: List<String?> = listOf("A", null, "b")
		for (item in listWithNulls) {
			if (item != null) {
				println("Text : $item")
			}
		}
		println()
		// 스트림 사용
		listWithNulls.filterNotNull().forEach {
			println("Text : $it")
		}
	}

	@Test
	fun library() {
		val sample: Sample? = Sample("User name", 20, "user Id")

		sample?.let {
//			tvName.text = it.name
//			tvAge.text = it.age
//			tvId.text = it.id
		} ?: println("Sample is null!!!")
	}

	data class Sample(val name: String, val age: Int, val id: String)
}
