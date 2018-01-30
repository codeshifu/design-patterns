package com.example.strategy.kotlin

fun main(args: Array<String>) {
    val mallardDuck = MallardDuck()
    val decoyDuck = DecoyDuck()
    val rubberDuck = RubberDuck()

    println(mallardDuck.performFly())

    decoyDuck.flyBehaviour = FlyNoWay()
    rubberDuck.flyBehaviour = FlyNoWay()

    println(decoyDuck.performFly())
    println(rubberDuck.performFly())

}