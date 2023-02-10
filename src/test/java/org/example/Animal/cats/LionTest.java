package org.example.Animal.cats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    @Test
    void Lion_TestingGettersFromLombok_Name_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Lion lion = new Lion(name, age, male, tail);
        assertEquals(name,lion.getName());
    }
    @Test
    void Lion_TestingSettersAndGettersFromLombok_Age_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Lion lion = new Lion(name, age, male, tail);
        age++;
        lion.setAge(age);
        assertEquals(age,lion.getAge());
    }
    @Test
    void Lion_TestingGettersFromLombok_Male_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Lion lion = new Lion(name, age, male, tail);
        assertEquals(male,lion.isMale());
    }
    @Test
    void Lion_TestingSettersAndGettersFromLombok_Tail_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Lion lion = new Lion(name, age, male, tail);
        tail=false;
        lion.setTail(tail);
        assertEquals(tail,lion.isTail());
    }
}