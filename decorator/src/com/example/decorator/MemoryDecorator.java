package com.example.decorator;

public abstract class MemoryDecorator extends IphoneDecorator {

    public MemoryDecorator(IphoneComponent iphoneToBeDecorated) {
        super(iphoneToBeDecorated);
    }

    abstract double size ();
}
