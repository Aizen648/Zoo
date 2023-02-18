package org.example.Animal.cats;
import org.example.Animal.features.Climbing;
import org.example.Animal.Size;
import org.example.Animal.features.Smellblood;

public class Tiger extends Cat implements Climbing, Smellblood {
    private boolean onTree=false;
    public Tiger(String name, int age, boolean male, boolean tail) {
        super(name, age, male, tail);
    }

    @Override
    public Size giveSize() {
        return Size.BIG;
    }

    @Override
    public void climbTheTree() {
        if(!onTree)
            System.out.println("Tiger "+getName()+" climb the tree");
        else
            System.out.println("Tiger "+getName()+" was already in the tree");
        onTree=true;
    }

    @Override
    public void jumpOffTheTree() {
        if(onTree)
            System.out.println("Tiger "+getName()+" jump off the tree");
        else
            System.out.println("Tiger "+getName()+" is not on the tree");
        onTree=false;
    }

    @Override
    public void giveVoice() {
        System.out.println("Grrrr");
    }

}
