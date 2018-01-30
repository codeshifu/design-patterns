package com.example.strategy.kotlin

abstract class Duck() {
    var flyBehaviour: FlyBehaviour
    var quackBehaviour: QuackBehaviour

    init {
        this.flyBehaviour = FlyWithWings()
        this.quackBehaviour = DefaultQuack()
    }

    constructor(flyBehaviour: FlyBehaviour, quackBehaviour: QuackBehaviour): this() {
        this.flyBehaviour = flyBehaviour
        this.quackBehaviour = quackBehaviour
    }

    fun swim () {
        println("swimming...")
    }

    abstract fun display()

    fun performFly () {
        flyBehaviour.fly()
    }

    fun performQuack () {
        quackBehaviour.quack()
    }
}

class MallardDuck: Duck() {
    override fun display() {
        println("display like a mallard duck")
    }
}

class DecoyDuck: Duck() {
    override fun display() {
        println("display like a decoy duck")
    }
}

class RubberDuck: Duck() {
    override fun display() {
        println("display like a rubber duck")
    }
}