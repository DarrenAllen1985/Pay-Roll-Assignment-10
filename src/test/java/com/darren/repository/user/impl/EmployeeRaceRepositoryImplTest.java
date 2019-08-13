package com.darren.repository.user.impl;

import com.darren.domain.user.EmployeeRace;
import com.darren.factory.user.EmployeeRaceFactory;
import com.darren.repository.user.EmployeeRaceRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeRaceRepositoryImplTest {
    private EmployeeRaceRepository employeeRaceRepository;
    private EmployeeRace employeeRace;

    private EmployeeRace getSavedEmployeeRace(){
        Set<EmployeeRace> savedEmployeeRaces = this.employeeRaceRepository.getAll();
        return savedEmployeeRaces.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.employeeRaceRepository = EmployeeRaceRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {

        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("123", "789");
        employeeRaceRepository.create(employee);
        EmployeeRace inRepo = employeeRaceRepository.read(employee.getEmployeeNumber());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_update() {

        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("123", "789");
        employeeRaceRepository.create(employee);
        EmployeeRace inRepo = employeeRaceRepository.read(employee.getEmployeeNumber());
        employee.setEmployeeNumber("456");
        employeeRaceRepository.update(employee);
        Assert.assertEquals(employee.getEmployeeNumber(), inRepo.getEmployeeNumber());
    }

    @Test
    public void e_delete() {

        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("123", "789");
        employeeRaceRepository.create(employee);
        EmployeeRace inRepo = employeeRaceRepository.read(employee.getEmployeeNumber());
        Assert.assertNotNull(inRepo);
        employeeRaceRepository.delete(employee.getEmployeeNumber());
        EmployeeRace deleted = employeeRaceRepository.read(employee.getEmployeeNumber());
        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {

        EmployeeRace employee = EmployeeRaceFactory.buildEmployeeRace("123", "789");
        employeeRaceRepository.create(employee);
        EmployeeRace inRepo = employeeRaceRepository.read(employee.getEmployeeNumber());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<EmployeeRace> employeeSet = employeeRaceRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }
}