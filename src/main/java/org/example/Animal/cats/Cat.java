package org.example.Animal.cats;

import lombok.*;
import org.example.Animal.Animal;
import org.example.Animal.features.Voice;

@Getter
@Setter
public abstract class Cat extends Animal implements Voice {
    private boolean tail;
    public Cat(String name, int age, boolean male, boolean tail) {
        super(name, age, male);
        this.tail=tail;
    }
    @Override
    public void giveVoice() {
        System.out.println("Miau");
    }

}
