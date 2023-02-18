package org.example.Animal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Animal {
    private final String name;
    private int age;
    private final boolean male;
    public void eat(){
        System.out.println("yami");
    }
    public abstract Size giveSize();
}
