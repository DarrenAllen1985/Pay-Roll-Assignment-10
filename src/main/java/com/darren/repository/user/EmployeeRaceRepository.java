package com.darren.repository.user;

import com.darren.domain.user.EmployeeRace;
import com.darren.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
