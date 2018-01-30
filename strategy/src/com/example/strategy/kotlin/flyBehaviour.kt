package com.example.strategy.kotlin

interface FlyBehaviour {
    fun fly()
}

class FlyNoWay : FlyBehaviour {
    override fun fly() {
        println("I can't fly")
    }
}

class FlyWithWings: FlyBehaviour {
    override fun fly() {
        println("Flying with wings...")
    }
}