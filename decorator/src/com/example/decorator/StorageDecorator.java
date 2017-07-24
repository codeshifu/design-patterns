package com.example.decorator;

public abstract class StorageDecorator extends IphoneDecorator {
    public StorageDecorator(IphoneComponent iphoneToBeDecorated) {
        super(iphoneToBeDecorated);
    }

    abstract int size ();
}
