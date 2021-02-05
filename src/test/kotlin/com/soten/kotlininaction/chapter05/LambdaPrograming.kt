package com.soten.kotlininaction.chapter05

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class LambdaPrograming {

	val personList = arrayListOf<Person>(
		Person("윤호", 28), Person("한결", 27),
	Person("민현", 27)
	)

	@Test
	fun lambdaMap() {
		println(personList.map(Person::age))

		println(personList.map { it.age })

	}

	@Test
	fun lambdaFilter() {
		println(personList.filter { it.age > 27 }.map(Person::name))

	}

	@Test
	@DisplayName("모든 원사가 술어에 만족하는 지 확인 하는 컬렉션")
	fun all() {
		println(personList.all(canBeInClub27))
	}

	private val canBeInClub27 = { p: Person -> p.age <= 27}

	@Test
	@DisplayName("술어를 만족하는 원소가 하나라도 있는 지 알아내는 컬렉션")
	fun any() {
		println(personList.any(canBeInClub27))
	}

	@Test
	@DisplayName("술어를 만족하는 원소의 개수")
	fun count() {
		println(personList.count(canBeInClub27))
	}

	@Test
	@DisplayName("원소를 구분하는 특성")
	fun groupBy() {
		println(personList.groupBy { it.age })
	}

	data class Person(val name: String, val age: Int)

	@Test
	@DisplayName("인자로 주어진 람다를 컬렌션의 모든 객체에 적용하고, 결과를 리스트에 모은다.")
	fun flatmap() {
		val strings = listOf("abc", "def")

		println(strings.flatMap { it.toList() })
	}

	class Book(val title: String, val authors: List<String>)
}
