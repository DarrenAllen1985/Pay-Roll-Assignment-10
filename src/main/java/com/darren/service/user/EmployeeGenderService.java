package com.darren.service.user;

import com.darren.domain.user.EmployeeGender;
import com.darren.service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
