package com.darren.service.user;

import com.darren.domain.user.EmployeeRace;
import com.darren.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeRace, String>{
    Set<EmployeeRace> getAll();
}
