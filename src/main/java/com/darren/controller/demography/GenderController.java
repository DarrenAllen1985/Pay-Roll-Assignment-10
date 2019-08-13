package com.darren.controller.demography;

import com.darren.domain.demography.Gender;
import com.darren.service.demography.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

public class GenderController {
    @Autowired
    @Qualifier("GenderServiceImpl")
    private GenderService service;

    @PostMapping("/create")
    @ResponseBody
    public Gender create(Gender gender) {
        return service.create(gender);
    }

    @PostMapping("/update")
    @ResponseBody
    public Gender update(Gender gender) {
        return service.update(gender);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Gender read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Gender> getAll() {
        return service.getAll();
    }

}
