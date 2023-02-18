package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.cages.Cage;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class Zoo {
    private List<Cage> cages = new ArrayList<>();
    public void addCage(Cage cage){
        cages.add(cage);
    }
    public int getNumberOfCage(){
        return cages.size();
    }
}
