package com.darren.service.impl;

import com.darren.domain.user.EmployeeGender;

import com.darren.repository.user.EmployeeGenderRepository;
import com.darren.repository.user.impl.EmployeeGenderRepositoryImpl;
import com.darren.service.EmployeeGenderService;


import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderService service = null;
    private EmployeeGenderRepository employeeGenderRepository;

    private EmployeeGenderServiceImpl(){
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderService getEmployeeGenderService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.employeeGenderRepository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.employeeGenderRepository.update(employeeGender);
    }

    @Override
    public EmployeeGender delete(String s) {
        return this.employeeGenderRepository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.employeeGenderRepository.read(s);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        Set<EmployeeGender> employeeGender = this.employeeGenderRepository.getAll();
        System.out.println("In getall, all = " + employeeGender);
        return employeeGender;
    }


}
