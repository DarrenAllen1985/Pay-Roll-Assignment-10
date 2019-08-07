package com.darren.controller.user;

import com.darren.domain.demography.Gender;
import com.darren.domain.user.EmployeeGender;
import com.darren.service.EmployeeGenderService;
import com.darren.service.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

public class EmployeeGenderController {
    @Autowired
    @Qualifier("EmployeeGenderServiceImpl")
    private EmployeeGenderService service;

    @PostMapping("/create")
    @ResponseBody
    public EmployeeGender create(EmployeeGender employeeGender) {
        return service.create(employeeGender);
    }

    @PostMapping("/update")
    @ResponseBody
    public EmployeeGender update(EmployeeGender employeeGender) {
        return service.update(employeeGender);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public EmployeeGender read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<EmployeeGender> getAll() {
        return service.getAll();
    }
}
