package org.example.Animal.cats;
import org.example.Animal.Size;
import org.example.Animal.features.Smellblood;

public class Lion extends Cat implements Smellblood {
    public Lion(String name, int age, boolean male, boolean tail) {
        super(name, age, male, tail);
    }

    @Override
    public Size giveSize() {
        return Size.BIG;
    }

    @Override
    public void giveVoice() {
        System.out.println("Grrrr");
    }

}
