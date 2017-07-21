package com.example.strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Duck> listOfDucks = new ArrayList<>();

        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        listOfDucks.add(mallardDuck);
        listOfDucks.add(rubberDuck);
        listOfDucks.add(decoyDuck);

        // change behaviour at runtime
        rubberDuck.setFlyBehaviour(new FlyNoWay());
        rubberDuck.setQuackBehaviour(new MuteQuack());

        decoyDuck.setQuackBehaviour(new MuteQuack());
        decoyDuck.setFlyBehaviour(new FlyNoWay());

        for (Duck duck : listOfDucks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();

            System.out.println("\n");
        }
    }
}
