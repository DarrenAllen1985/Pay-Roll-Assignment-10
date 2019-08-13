package com.darren.repository.demography.impl;

import com.darren.domain.demography.Race;
import com.darren.factory.demography.RaceFactory;
import com.darren.repository.demography.RaceRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {
    private RaceRepository raceRepository;
    private Race race;

    private Race getSavedRace(){
        Set<Race> savedRaces = this.raceRepository.getAll();
        return savedRaces.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
/*        this.raceRepository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.buildRace("Indian");*/
        this.raceRepository = RaceRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void a_create() {
        Race employee = RaceFactory.buildRace("Indian");

        raceRepository.create(employee);
        Race inRepo = raceRepository.read(employee.getDescription());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_update() {
        Race employee = RaceFactory.buildRace("Male");

        raceRepository.create(employee);
        Race inRepo = raceRepository.read(employee.getId());
        employee.setDescription("Darren Allen");
        raceRepository.update(employee);
        Assert.assertEquals(employee.getDescription(), inRepo.getDescription());
    }

    @Test
    public void e_delete() {
        Race employee = RaceFactory.buildRace("Female");

        raceRepository.create(employee);
        Race inRepo = raceRepository.read(employee.getDescription());
        Assert.assertNotNull(inRepo);
        raceRepository.delete(employee.getDescription());
        Race deleted = raceRepository.read(employee.getDescription());
        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {
        Race employee = RaceFactory.buildRace("Female");

        raceRepository.create(employee);
        Race inRepo = raceRepository.read(employee.getDescription());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {

        Set<Race> employeeSet = raceRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }
}