package com.soten.kotlininaction.chapter04

// (1)          (----주 생성자----)
class Initialize(_name:String) {

	val name: String

	init { // init 키워드는 초기화 블록을 시작한다. 이 블록에서는 클래스의 객체가 만들어질 때 실행될 초기화 코드가 들어가낟.
		name = _name
	}

}

// (2) 별다른 애노테이션이나 가시성 변경자가 없다면 constructor를 생략해도 된다.
class Initialize2(_name: String) {

	val name = _name

}

// (3) "val"은 이 파라미터에 상응하는 프로퍼티가 생성된다는 뜻이다.
class Initialize3(val name: String)

/*
   (4) 기본값을 부여한 생성자
   모든 생성자 파라미터에 디폴트 값을 지정하면 컴파일러가 자동으로 디폴트 생성자를 만들어준다.
   의존관계 주입 프레임워크 등 자바 라이브러리들과의 통합을 쉽게 해준다.
 */
class Initialize4(val name: String, val age: Int = 25)

// (5) 인스턴스를 못하게하는 유틸리티 함수를 담아두는 역할일 경우 쓰인다. (싱글턴 사용하고 싶을 때도 쓰임)
class Initialize5 private constructor() {}

// (6) 생성자가 여러개인 경우
//  인자에 디폴트 값을 제공하기 위해 부생성자를 여럿 만들지 않고, 파라미터의 디폴트 값을 생성자 시그니처에 직접 명시하는 것이 좋다.
class Initialize6 {

	constructor(name: String) {}

	constructor(name: String, age: Int) {}

}
