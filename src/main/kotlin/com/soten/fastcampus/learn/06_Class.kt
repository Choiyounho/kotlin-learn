package com.soten.fastcampus.learn

fun main() {

	val bigCar = Car(engine = "v9", body = "big")
	val bigCar1 = Car(engine = "v9", body = "small")
	println(bigCar.body)
	println(bigCar1.engine)

	val superCar = SuperCar(engine = "super", body = "lam", door = "auto")
	println(superCar.door)

	val runAbleCar = RunAbleCar(engine = "simple engine", body = "hard")
	runAbleCar.ride()
	runAbleCar.drive()
	runAbleCar.navi("부산")

}

//  클래스 만드는 방법 (1)
class Car(var engine: String, var body: String) {

}

//  클래스 만드는 방법 (2)
class SuperCar {

	var engine: String
	var body: String
	var door: String

	constructor(engine: String, body: String, door: String) {
		this.engine = engine
		this.body = body
		this.door = door
	}

}

// 클래스 만드는 방법 (3) : 반드시 필요한 멤버변수만을 파라미터에 넣는 방식
class Car1 constructor(engine: String, body: String) {

	var door: String = ""

	constructor(engine: String, body: String, door: String) : this(engine, body) {
		this.door = door
	}

}

// 클래스 만드는 방법 (4)
class Car2 {

	var engine: String = ""
	var body: String = ""
	var door: String = ""

	constructor(engine: String, body: String) {
		this.engine = engine
		this.body = body
	}

	constructor(engine: String, body: String, door: String) {
		this.engine = engine
		this.body = body
		this.door = door
	}

}

class RunAbleCar(engine: String, body: String) {

	// 인스턴스화 할 때 가장 먼저 호출됨
	init {
		println("RunAbleCar 만들어 졌습니다")
	}

	fun ride() {
		println("탑승 하였습니다.")
	}

	fun drive() {
		println("달립니다")
	}

	fun navi(destination: String) {
		println("$destination 으로 달립니다")
	}

}


