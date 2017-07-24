package com.example.decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<IphoneComponent> listOfIphones = new ArrayList<>();
        IphoneComponent iphone5 = new IPhone5();
        IphoneComponent iphone5C = new IPhone5C();

        System.out.println(
                        "=======================" +
                        "\nBEFORE UPGRADE\n" +
                        "======================="
        );

        System.out.println(iphone5.toString() + "\n");
        System.out.println(iphone5C.toString() + "\n");
        System.out.println(
                "=======================" +
                        "\nAFTER UPGRADE\n" +
                        "======================="
        );

        iphone5 = new Storage16GB(iphone5);
        iphone5C = new Memory4GB(new Storage16GB(iphone5C));

        System.out.println(iphone5.toString() + "\n");
        System.out.println(iphone5C.toString() + "\n");
    }
}
