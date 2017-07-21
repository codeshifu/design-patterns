package com.example.strategy;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("");
    }
}
