package org.example.cages;

import org.example.Animal.cats.Lion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatCageTest {
    @Test
    void CatCage_TestingGettersFromLombok_Width_Equals() {
        int width=12;
        int length=12;
        int height=5;
        boolean glassCage=true;
        CatCage catCage = new CatCage(width,length,height,glassCage);
        assertEquals(width, catCage.getWitdh());
    }
    @Test
    void CatCage_TestingGettersFromLombok_Length_Equals() {
        int width=12;
        int length=12;
        int height=5;
        boolean glassCage=true;
        CatCage catCage = new CatCage(width,length,height,glassCage);
        assertEquals(length, catCage.getLength());
    }
    @Test
    void CatCage_TestingGettersFromLombok_height_Equals() {
        int width=12;
        int length=12;
        int height=5;
        boolean glassCage=true;
        CatCage catCage = new CatCage(width,length,height,glassCage);
        assertEquals(height, catCage.getHeight());
    }
    @Test
    void CatCage_TestingSetterAndGettersFromLombok_glassCage_Equals() {
        int width=12;
        int length=12;
        int height=5;
        boolean glassCage=true;
        CatCage catCage = new CatCage(width,length,height,glassCage);
        assertEquals(glassCage, catCage.isGlassCage());
    }
    @Test
    void CatCage_GetSize_Equals() {
        int width=12;
        int length=12;
        int height=5;
        boolean glassCage=true;
        CatCage catCage = new CatCage(width,length,height,glassCage);
        assertEquals(12*12*5, catCage.getSize());
    }
    @Test
    void CatCage_TestingSetterAndGettersFromLombok_Lion_Equals() {
        int width=12;
        int length=12;
        int height=5;
        boolean glassCage=true;
        CatCage catCage = new CatCage(width,length,height,glassCage);
        Lion lion=new Lion("Kiciuś", 12, true, true);
        catCage.setCat(lion);
        assertEquals(lion, catCage.getCat());
    }
}