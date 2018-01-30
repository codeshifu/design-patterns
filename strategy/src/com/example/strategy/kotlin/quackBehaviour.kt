package com.example.strategy.kotlin

interface QuackBehaviour {
    fun quack()
}

class DefaultQuack: QuackBehaviour {
    override fun quack() {
        println("quack! quack!!")
    }
}

class MuteQuack: QuackBehaviour {
    override fun quack() {
        println("")
    }
}