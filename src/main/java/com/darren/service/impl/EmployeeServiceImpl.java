package com.darren.service.impl;

import com.darren.domain.user.Employee;
import com.darren.repository.user.EmployeeRepository;
import com.darren.repository.user.impl.EmployeeRepositoryImpl;
import com.darren.service.EmployeeService;

import java.util.Set;

public class EmployeeServiceImpl implements EmployeeService {

    private static EmployeeService service = null;
    private EmployeeRepository employeeRepository;

    private EmployeeServiceImpl()
    {
        this.employeeRepository = EmployeeRepositoryImpl.getRepository();
    }

    public static EmployeeService getEmployeeService(){
        if (service == null) service = new EmployeeServiceImpl();
        return service;
    }

    @Override
    public Employee create(Employee employee) {
        return this.employeeRepository.create(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepository.update(employee);
    }

    @Override
    public Employee delete(String s) {
        return this.employeeRepository.delete(s);
    }

    @Override
    public Employee read(String s) {
        return this.employeeRepository.read(s);
    }

    /*@Override
    public Employee saveEmployee(String firstName, String lastName, String gender){
        Employee e = EmployeeFactory.buildEmployee(firstName, lastName);
        //get gender if exist

        create(e);
        return e;
    }*/

    @Override
    public Set<Employee> getAll() {
        Set<Employee> employee = this.employeeRepository.getAll();
        System.out.println("In getall, all = " + employee);
        return employee;
    }
}
