package com.darren.repository.user.impl;

import com.darren.domain.user.EmployeeGender;
import com.darren.factory.user.EmployeeGenderFactory;
import com.darren.repository.user.EmployeeGenderRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepository employeeGenderRepository;
    private EmployeeGender employeeGender;

    private EmployeeGender getSavedEmployeeGender(){
        Set<EmployeeGender> savedEmployeeGenders = this.employeeGenderRepository.getAll();
        return savedEmployeeGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void a_create() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);
        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_update() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);
        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());
        employee.setEmployeeNumber("456");
        employeeGenderRepository.update(employee);
        Assert.assertEquals(employee.getEmployeeNumber(), inRepo.getEmployeeNumber());
    }

    @Test
    public void e_delete() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);
        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());
        Assert.assertNotNull(inRepo);
        employeeGenderRepository.delete(employee.getEmployeeNumber());
        EmployeeGender deleted = employeeGenderRepository.read(employee.getEmployeeNumber());
        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {
        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender("123", "789");

        employeeGenderRepository.create(employee);
        EmployeeGender inRepo = employeeGenderRepository.read(employee.getEmployeeNumber());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {

        Set<EmployeeGender> employeeSet = employeeGenderRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }
}