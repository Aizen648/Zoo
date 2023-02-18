package org.example.Animal.cats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TigerTest {
    @Test
    void Tiger_TestingGettersFromLombok_Name_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Tiger tiger = new Tiger(name, age, male, tail);
        assertEquals(name,tiger.getName());
    }
    @Test
    void Tiger_TestingSettersAndGettersFromLombok_Age_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Tiger tiger = new Tiger(name, age, male, tail);
        age++;
        tiger.setAge(age);
        assertEquals(age,tiger.getAge());
    }
    @Test
    void Tiger_TestingGettersFromLombok_Male_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Tiger tiger = new Tiger(name, age, male, tail);
        assertEquals(male,tiger.isMale());
    }
    @Test
    void Tiger_TestingSettersAndGettersFromLombok_Tail_Equals() {
        String name = "Kiciuś";
        int age = 13;
        boolean male = true;
        boolean tail = true;
        Tiger tiger = new Tiger(name, age, male, tail);
        tail=false;
        tiger.setTail(tail);
        assertEquals(tail,tiger.isTail());
    }
}