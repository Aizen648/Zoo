package org.example.Animal.fishs;

import org.example.Animal.Size;

public class GoldFish extends Fish {
    public GoldFish(String name, int age, boolean male, boolean fin) {
        super(name, age, male, fin);
    }
    @Override
    public Size giveSize() {
        return Size.SMALL;
    }

}
