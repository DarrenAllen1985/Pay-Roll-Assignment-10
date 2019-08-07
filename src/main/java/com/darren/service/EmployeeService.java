package com.darren.service;

import com.darren.domain.user.Employee;

import java.util.Set;

public interface EmployeeService extends IService<Employee, String> {


    Set<Employee> getAll();
}
