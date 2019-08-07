package com.darren.factory.demography;

import com.darren.domain.demography.Race;
import com.darren.util.Misc;

public class RaceFactory {

    public static Race buildRace(String race){
        return new Race.Builder()
                .id(Misc.generateId())
                .description(race)
                .build();
    }

}
