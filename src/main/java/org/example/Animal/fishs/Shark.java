package org.example.Animal.fishs;

import org.example.Animal.Size;
import org.example.Animal.features.Smellblood;

public class Shark extends Fish implements Smellblood {
    public Shark(String name, int age, boolean male, boolean fin) {
        super(name, age, male, fin);
    }
    @Override
    public Size giveSize() {
        return Size.BIG;
    }

    @Override
    public void smellblood() {
        System.out.println("i smell blood!!!");
    }

}
