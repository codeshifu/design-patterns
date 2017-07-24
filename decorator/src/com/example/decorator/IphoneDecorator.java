package com.example.decorator;

public abstract class IphoneDecorator extends IphoneComponent {
    protected IphoneComponent iphoneToBeDecorated;

    public IphoneDecorator(IphoneComponent iphoneToBeDecorated) {
        this.iphoneToBeDecorated = iphoneToBeDecorated;
    }

    @Override
    int storageCapacity() {
        return iphoneToBeDecorated.storageCapacity();
    }

    public double memory () {
        return iphoneToBeDecorated.memory();
    }

    public String getDescription () {
        return iphoneToBeDecorated.getDescription();
    }
}
