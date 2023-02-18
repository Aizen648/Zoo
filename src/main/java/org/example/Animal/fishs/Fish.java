package org.example.Animal.fishs;

import lombok.Getter;
import lombok.Setter;
import org.example.Animal.Animal;

@Getter
@Setter
public abstract class Fish extends Animal {
    private boolean fin;
    public Fish(String name, int age, boolean male, boolean fin) {
        super(name, age, male);
        this.fin=fin;
    }

}
