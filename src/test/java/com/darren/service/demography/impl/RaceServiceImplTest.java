package com.darren.service.demography.impl;

import com.darren.domain.demography.Race;
import com.darren.factory.demography.RaceFactory;
import com.darren.repository.demography.impl.RaceRepositoryImpl;
import com.darren.service.demography.RaceService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceImplTest {

    private RaceRepositoryImpl repository;
    private Race race;
    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getRaceService();
    }

    @Test
    public void a_create() {
        Race employee = RaceFactory.buildRace("Coloured");

        service.create(employee);
        Race inRepo = service.read(employee.getId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        Race employee = RaceFactory.buildRace("Coloured");

        service.create(employee);
        Race inRepo = service.read(employee.getId());
        employee.setDescription("Darren");
        service.update(employee);
        Assert.assertEquals(employee.getId(), inRepo.getId());
    }

    @Test
    public void e_delete() {
        Race employee = RaceFactory.buildRace("Coloured");

        service.create(employee);
        Race inRepo = service.read(employee.getId());
        Assert.assertNotNull(inRepo);
        service.delete(employee.getId());
        Race deleted = service.read(employee.getId());
        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        Race employee = RaceFactory.buildRace("Coloured");

        service.create(employee);
        Race inRepo = service.read(employee.getId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}