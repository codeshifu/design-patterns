package com.example.strategy.samples.ex02;

public abstract class AppleLaptop {
    DisplayBehaviour displayBehaviour;
    String name;

    public AppleLaptop() {
        this.name = "Unknown";
        displayBehaviour = new NoRetina();
    }

    public void setDisplayBehaviour(DisplayBehaviour displayBehaviour) {
        this.displayBehaviour = displayBehaviour;
    }

    String getDisplaySpec () {
        return displayBehaviour.displayType();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName() +
                " + " +
                this.getDisplaySpec();
    }
}
