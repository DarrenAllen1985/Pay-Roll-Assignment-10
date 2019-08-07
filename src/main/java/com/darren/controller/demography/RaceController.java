package com.darren.controller.demography;


import com.darren.domain.demography.Race;
import com.darren.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

public class RaceController {
    @Autowired
    @Qualifier("RaceServiceImpl")
    private RaceService service;

    @PostMapping("/create")
    @ResponseBody
    public Race create(Race race) {
        return service.create(race);
    }

    @PostMapping("/update")
    @ResponseBody
    public Race update(Race race) {
        return service.update(race);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id) {
        service.delete(id);

    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Race read(@PathVariable String id) {
        return service.read(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Race> getAll() {
        return service.getAll();
    }




}
