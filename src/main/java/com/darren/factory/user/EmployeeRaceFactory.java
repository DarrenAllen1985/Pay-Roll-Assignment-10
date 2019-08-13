package com.darren.factory.user;

import com.darren.domain.user.EmployeeRace;
import com.darren.util.Misc;

public class EmployeeRaceFactory {
    public static EmployeeRace buildEmployeeRace(String employeeNumber, String raceId){
        return new EmployeeRace.Builder()
                .employeeNumber(Misc.generateId())
                .raceId()
                .build();
    }

}
