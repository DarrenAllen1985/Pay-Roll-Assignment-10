package com.darren.service;

import com.darren.domain.user.Employee;
import com.darren.factory.user.EmployeeFactory;
import com.darren.repository.user.EmployeeRepository;
import com.darren.repository.user.impl.EmployeeRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

public class EmployeeServiceTest {

    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Mikhail", "Hathey");
    }


    @Test
    public void getAll(){
        Set<Employee> employee = this.repository.getAll();
        System.out.println("In getall, all = " + employee);
    }
}