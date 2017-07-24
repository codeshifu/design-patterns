package com.example.decorator;

public class Storage16GB extends StorageDecorator {
    public Storage16GB(IphoneComponent iphoneToBeDecorated) {
        super(iphoneToBeDecorated);
    }

    @Override
    int size() {
        return 16;
    }

    @Override
    int storageCapacity() {
        return super.storageCapacity() + size();
    }
}
