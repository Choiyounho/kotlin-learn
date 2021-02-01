package com.soten.udemy

class Singleton private constructor(val name: String) {

	companion object {
		@Volatile
		private var INSTANCE: Singleton? = null

		fun getInstance(name: String): Singleton =
			INSTANCE ?: synchronized(this) {
				INSTANCE ?: Singleton(name).also { INSTANCE = it }
			}
	}

}

object Eager
