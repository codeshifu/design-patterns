package com.example.decorator;

public class Memory4GB extends MemoryDecorator {

    public Memory4GB(IphoneComponent iphoneToBeDecorated) {
        super(iphoneToBeDecorated);
    }

    @Override
    double size() {
        return 4;
    }

    @Override
    public double memory() {
        return super.memory() + size();
    }
}
