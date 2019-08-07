package com.darren.repository.user;

import com.darren.domain.user.EmployeeGender;
import com.darren.repository.IRepository;

import java.util.Set;

public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}

