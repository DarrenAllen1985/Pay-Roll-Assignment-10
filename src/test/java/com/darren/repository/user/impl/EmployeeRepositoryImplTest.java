package com.darren.repository.user.impl;

import com.darren.domain.user.Employee;
import com.darren.factory.user.EmployeeFactory;
import com.darren.repository.user.EmployeeRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static junit.framework.TestCase.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {

    private EmployeeRepository employeeRepository;
    private Employee employee;

    private Employee getSavedEmployee(){
        Set<Employee> savedEmployees = this.employeeRepository.getAll();
        return savedEmployees.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.employeeRepository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Darren", "Darren");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void a_create() {
        Employee e = EmployeeFactory.buildEmployee("Darren", "Darren");
        Employee savedE = this.employeeRepository.create(e);
        Assert.assertEquals(1, this.employeeRepository.getAll().size());
    }

    @Test
    public void b_update() {
        String newname = "New Test Employee Name created";
        Employee employee = new Employee.Builder().copy(getSavedEmployee()).employeeFirstName(newname).build();
        System.out.println(".....About to  update  = " + employee);
        Employee updated = this.employeeRepository.update(employee);
        System.out.println(".....Updated = " + updated);
        Assert.assertSame(newname, updated.getEmployeeFirstName());
        d_getAll();
    }

    @Test
    public void e_delete() {
        Employee savedEmployee = getSavedEmployee();
        this.employeeRepository.delete(savedEmployee.getEmployeeNumber());
        d_getAll();
    }

    @Test
    public void c_read() {
        Employee savedEmployee = getSavedEmployee();
        System.out.println("In read, employee id = " + savedEmployee.getEmployeeNumber());
        Employee read = this.employeeRepository.read(savedEmployee.getEmployeeNumber());
        System.out.println("In read, read = " + read);
        d_getAll();
        Assert.assertEquals(savedEmployee, read);
    }

    @Test
    public void d_getAll() {
        Set<Employee> all = this.employeeRepository.getAll();
        System.out.println("In getAll, all = " + all);
        //Assert.assertSame(1, all.size());
    }
}