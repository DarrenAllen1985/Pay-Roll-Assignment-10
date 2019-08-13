package com.darren.service.user;

import com.darren.domain.user.Employee;
import com.darren.service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {

    Set<Employee> getAll();
}
