package com.darren.repository.demography.impl;

import com.darren.domain.demography.Gender;
import com.darren.factory.demography.GenderFactory;
import com.darren.repository.demography.GenderRepository;
import org.junit.*;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderRepositoryImplTest {
    private GenderRepository genderRepository;
    private Gender gender;

    private Gender getSavedGender(){
        Set<Gender> savedGenders = this.genderRepository.getAll();
        return savedGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.genderRepository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Male");
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void a_create() {
        Gender employee = GenderFactory.buildGender("Male");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_update() {
        Gender employee = GenderFactory.buildGender("Male");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getId());
        employee.setDescription("Male");
        genderRepository.update(employee);
        Assert.assertEquals(employee.getDescription(), inRepo.getDescription());
    }

    @Test
    public void e_delete() {
        Gender employee = GenderFactory.buildGender("Male");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getId());
        Assert.assertNotNull(inRepo);
        genderRepository.delete(employee.getId());
        Gender deleted = genderRepository.read(employee.getId());
        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {
        Gender employee = GenderFactory.buildGender("Male");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Gender> employeeSet = genderRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }
}