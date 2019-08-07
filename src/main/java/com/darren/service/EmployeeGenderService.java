package com.darren.service;

import com.darren.domain.user.EmployeeGender;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
