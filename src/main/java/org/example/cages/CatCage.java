package org.example.cages;

import lombok.Getter;
import lombok.Setter;
import org.example.Animal.cats.Cat;

@Getter
@Setter
public class CatCage extends Cage {
    private final int height;
    private final boolean glassCage;
    private Cat cat;
    public CatCage(int witdh, int length, int height, boolean glassCage) {
        super(witdh, length);
        this.height = height;
        this.glassCage = glassCage;
    }

    @Override
    public int getSize() {
        return getWitdh()*getHeight()*getLength();
    }

}
