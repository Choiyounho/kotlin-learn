package com.soten.fastcampus.practice.classtest.bank

class Account(val name: String, val birthday: String) {

	private var balance: Int = 0

	fun checkBalance() {
		println("잔액 : $balance 원")
	}

	fun deposit(money: Int) {
		balance += money
		println("$balance 원이 입금되었습니다.")
		checkBalance()
	}

	fun withdrawal(money: Int) {
		if (balance >= money) {
			balance -= money
			println("$balance 원이 출금되었습니다.")
		} else {
			println("잔액이 부족합니다.")
		}
	}

}
