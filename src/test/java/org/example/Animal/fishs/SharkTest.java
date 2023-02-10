package org.example.Animal.fishs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SharkTest {

    @Test
    void Shark_TestingGettersFromLombok_Name_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        Shark shark = new Shark(name, age, male, fin);
        assertEquals(name,shark.getName());
    }
    @Test
    void Shark_TestingSettersAndGettersFromLombok_Age_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        Shark shark = new Shark(name, age, male, fin);
        age++;
        shark.setAge(age);
        assertEquals(age,shark.getAge());
    }
    @Test
    void Shark_TestingGettersFromLombok_Male_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        Shark shark = new Shark(name, age, male, fin);
        assertEquals(male,shark.isMale());
    }
    @Test
    void Shark_TestingSettersAndGettersFromLombok_Tail_Equals() {
        String name = "Rybuś";
        int age = 13;
        boolean male = true;
        boolean fin = true;
        Shark shark = new Shark(name, age, male, fin);
        fin=false;
        shark.setFin(fin);
        assertEquals(fin,shark.isFin());
    }
}