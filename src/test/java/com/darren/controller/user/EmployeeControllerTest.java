package com.darren.controller.user;

import com.darren.domain.demography.Gender;
import com.darren.domain.demography.Race;
import com.darren.domain.user.Employee;
import com.darren.domain.user.EmployeeGender;
import com.darren.domain.user.EmployeeRace;
import com.darren.factory.demography.GenderFactory;
import com.darren.factory.demography.RaceFactory;
import com.darren.factory.user.EmployeeFactory;
import com.darren.factory.user.EmployeeGenderFactory;
import com.darren.factory.user.EmployeeRaceFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeControllerTest {

    private EmployeeController employeeController;

    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }


    @Test
    public void create() {
        Gender gender = GenderFactory.buildGender("Male");
        Race race = RaceFactory.buildRace("Coloured");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "123");
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("123", "123");
        Employee employee = EmployeeFactory.buildEmployee("Darren", "Allen");

        //employeeController.create(employee.getEmployeeNumber(), employee.getEmployeeFirstName() ,employee.getEmployeeLastName(), gender.getId(),race.getId());

        employeeController.create("Darren", "Allen", 123, 456);
    }
}