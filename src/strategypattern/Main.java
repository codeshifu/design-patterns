package strategypattern;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Duck> listOfDucks = new ArrayList<>();

        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        listOfDucks.add(mallardDuck);
        listOfDucks.add(rubberDuck);

        // change behaviour at runtime
        rubberDuck.setFlyBehaviour(new FlyNoWay());
        rubberDuck.setQuackBehaviour(new MuteQuack());

        for (Duck duck : listOfDucks) {
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();

            System.out.println("\n");
        }
    }
}
