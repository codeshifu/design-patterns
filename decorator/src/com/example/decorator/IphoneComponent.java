package com.example.decorator;

import java.text.DecimalFormat;

public abstract class IphoneComponent {

    abstract String getDescription ();

    int storageCapacity() {
        return 16; // all iphones get at least 16GB storage capacity
    }

    double memory () {
        return 2.01; // all iphones get at least 2GB memory
    }

    @Override
    public String toString() {
        DecimalFormat format = new DecimalFormat("#.##");
        String memoryFormattedInDecimal = format.format(memory());
        return this.getDescription() + "\n" +
                "Storage Capacity: " + this.storageCapacity() + "GB\n" +
                "Memory: " + memoryFormattedInDecimal + "GB";
    }
}
