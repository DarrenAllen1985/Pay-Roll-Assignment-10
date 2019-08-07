package com.darren.repository.user;

import com.darren.domain.user.Employee;
import com.darren.repository.IRepository;

import java.util.Set;

public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}

