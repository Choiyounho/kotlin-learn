package com.soten.fastcampus.practice.classtest.bank

class Account(val name: String, val birthday: String) {

	var balance: Int = 0

	fun checkBalance():String {
		return "잔액 : $balance 원"
	}

	fun deposit(money: Int): String {
		balance += money
		return "$balance 원이 입금되었습니다."
	}

	fun withdrawal(money: Int): String {
		if (balance >= money) {
			balance -= money
			return "$balance 원이 출금되었습니다."
		} else {
			throw IllegalArgumentException("잔액이 부족합니다.")
		}
	}

}
