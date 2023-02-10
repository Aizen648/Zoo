package org.example.Animal.fishs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoldFishTest {

    @Test
    void GoldFish_TestingGettersFromLombok_Name_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        GoldFish goldFish = new GoldFish(name, age, male, fin);
        assertEquals(name,goldFish.getName());
    }
    @Test
    void GoldFish_TestingSettersAndGettersFromLombok_Age_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        GoldFish goldFish = new GoldFish(name, age, male, fin);
        age++;
        goldFish.setAge(age);
        assertEquals(age,goldFish.getAge());
    }
    @Test
    void GoldFish_TestingGettersFromLombok_Male_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        GoldFish goldFish = new GoldFish(name, age, male, fin);
        assertEquals(male,goldFish.isMale());
    }
    @Test
    void GoldFish_TestingSettersAndGettersFromLombok_Tail_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        GoldFish goldFish = new GoldFish(name, age, male, fin);
        fin=false;
        goldFish.setFin(fin);
        assertEquals(fin,goldFish.isFin());
    }
}