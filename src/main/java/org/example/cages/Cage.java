package org.example.cages;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public abstract class Cage {
    private final int witdh;
    private final int length;
    public abstract int getSize();

}
