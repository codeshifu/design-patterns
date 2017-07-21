package com.example.strategy.samples.ex02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AppleLaptop> appleLaptops = new ArrayList<>();
        AppleLaptop macbookAir = new MacbookAir();
        AppleLaptop macbookPro = new MacbookPro();

        appleLaptops.add(macbookAir);
        appleLaptops.add(macbookPro);

        // change behaviour at runtime
        macbookPro.setDisplayBehaviour(new RetinaDisplay());

        for (AppleLaptop laptop : appleLaptops) {
            System.out.println(laptop.toString());
            System.out.println();
        }
    }
}
