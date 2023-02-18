package org.example;

import org.example.Animal.cats.Lion;
import org.example.Animal.cats.Tiger;
import org.example.Animal.fishs.GoldFish;
import org.example.Animal.fishs.Shark;
import org.example.cages.Aquarium;
import org.example.cages.CatCage;

public class Main {
    public static void main(String[] arg){

        Zoo zoo =new Zoo();

        CatCage catCage1=new CatCage(12,14,4,true);
        CatCage catCage2=new CatCage(12,14,4,true);

        Lion lion=new Lion("Mruczuś",23,true,true);
        Tiger tiger=new Tiger("Kiciuś",23,true,true);

        catCage1.setCat(lion);
        catCage2.setCat(tiger);


        GoldFish goldFish=new GoldFish("Złotek",11,false,true);
        Shark shark=new Shark("Rybuś",43,true,true);

        Aquarium aquarium1=new Aquarium(12,32,4,false);
        Aquarium aquarium2=new Aquarium(12,32,4,true);

        aquarium1.setFish(goldFish);
        aquarium2.setFish(shark);

        shark.smellblood();
        tiger.smellblood();
    }
}