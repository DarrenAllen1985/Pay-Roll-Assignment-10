package com.darren.factory.demography;

import com.darren.domain.demography.Gender;
import com.darren.util.Misc;

public class GenderFactory {

    public static Gender buildGender(String gender){
        return new Gender.Builder()
                .id(Misc.generateId())
                .description(gender)
                .build();
    }
}
