package com.soten.kotlininaction.chapter04.imp

interface Focusable {
	fun setFocus(boolean: Boolean) = println("I ${if (boolean) "got" else "lost"} focus.")
	fun showOff() = println("I'm focusable")
}
