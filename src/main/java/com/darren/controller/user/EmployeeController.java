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
import com.darren.service.demography.GenderService;
import com.darren.service.demography.RaceService;
import com.darren.service.demography.impl.GenderServiceImpl;
import com.darren.service.demography.impl.RaceServiceImpl;
import com.darren.service.user.EmployeeGenderService;
import com.darren.service.user.EmployeeRaceService;
import com.darren.service.user.EmployeeService;
import com.darren.service.user.impl.EmployeeGenderServiceImpl;
import com.darren.service.user.impl.EmployeeRaceServiceImpl;
import com.darren.service.user.impl.EmployeeServiceImpl;


public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getEmployeeService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getEmployeeGenderService();
    private EmployeeRaceService employeeRaceService = EmployeeRaceServiceImpl.getEmployeeRaceService();
    private RaceService raceService = RaceServiceImpl.getRaceService();
    private GenderService genderService = GenderServiceImpl.getGenderService();

    public void create(String firstName, String lastName, int genderId, int raceId){

        Employee employee = EmployeeFactory.buildEmployee(firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("123", "456");
        employeeGenderService.create(employeeGender);

        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("567", "987");
        employeeRaceService.create(employeeRace);

        Race race = RaceFactory.buildRace("Indian");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender("Male");
        genderService.create(gender);


    }


}
