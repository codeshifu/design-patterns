package strategy;

public class DefaultQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("quack! quack!!");
    }
}
