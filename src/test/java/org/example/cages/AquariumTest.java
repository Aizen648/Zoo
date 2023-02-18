package org.example.cages;

import org.example.Animal.fishs.GoldFish;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquariumTest {
    @Test
    void Aquarium_TestingGettersFromLombok_Witdh_Equals() {
        int witdh=12;
        int length=12;
        int depth=5;
        boolean saltWater=true;
        Aquarium aquarium = new Aquarium(witdh,length,depth,saltWater);
        assertEquals(witdh,aquarium.getWitdh());
    }
    @Test
    void Aquarium_TestingGettersFromLombok_Length_Equals() {
        int witdh=12;
        int length=12;
        int depth=5;
        boolean saltWater=true;
        Aquarium aquarium = new Aquarium(witdh,length,depth,saltWater);
        assertEquals(length,aquarium.getLength());
    }
    @Test
    void Aquarium_TestingGettersFromLombok_Depth_Equals() {
        int witdh=12;
        int length=12;
        int depth=5;
        boolean saltWater=true;
        Aquarium aquarium = new Aquarium(witdh,length,depth,saltWater);
        assertEquals(depth,aquarium.getDepth());
    }
    @Test
    void Aquarium_TestingSetterAndGettersFromLombok_saltWater_Equals() {
        int witdh=12;
        int length=12;
        int depth=5;
        boolean saltWater=true;
        Aquarium aquarium = new Aquarium(witdh,length,depth,saltWater);
        saltWater=false;
        aquarium.setSaltWater(saltWater);
        assertEquals(saltWater,aquarium.isSaltWater());
    }
    @Test
    void Aquarium_GetSize_Equals() {
        int witdh=12;
        int length=12;
        int depth=5;
        boolean saltWater=true;
        Aquarium aquarium = new Aquarium(witdh,length,depth,saltWater);
        assertEquals(12*12*5,aquarium.getSize());
    }
    @Test
    void Aquarium_TestingSetterAndGettersFromLombok_Fish_Equals() {
        int witdh=12;
        int length=12;
        int depth=5;
        boolean saltWater=true;
        Aquarium aquarium = new Aquarium(witdh,length,depth,saltWater);
        GoldFish goldFish = new GoldFish("rybuś", 12, true, true);
        aquarium.setFish(goldFish);
        assertEquals(goldFish,aquarium.getFish());
    }

}