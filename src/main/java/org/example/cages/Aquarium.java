package org.example.cages;

import lombok.Getter;
import lombok.Setter;
import org.example.Animal.fishs.Fish;

@Setter
@Getter
public class Aquarium extends Cage{
    private final int depth;
    private boolean saltWater;
    private Fish fish;

    public Aquarium(int witdh, int length, int depth, boolean saltWater) {
        super(witdh, length);
        this.depth = depth;
        this.saltWater=saltWater;
    }
    @Override
    public int getSize() {
        return getWitdh()*getDepth()*getLength();
    }
}
