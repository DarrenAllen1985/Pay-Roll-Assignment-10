package com.darren.service.demography.impl;

import com.darren.domain.demography.Race;
import com.darren.repository.demography.RaceRepository;
import com.darren.repository.demography.impl.RaceRepositoryImpl;
import com.darren.service.demography.RaceService;

import java.util.Set;

public class RaceServiceImpl implements RaceService {

    private static RaceService service = null;
    private RaceRepository raceRepository;

    private RaceServiceImpl(){
        this.raceRepository = RaceRepositoryImpl.getRepository();
    }

    public static RaceService getRaceService(){
        if (service == null) service = new RaceServiceImpl();
        return service;
    }

    @Override
    public Race create(Race race) {
        return this.raceRepository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.raceRepository.update(race);
    }

    @Override
    public Race delete(String s) {
        return this.raceRepository.delete(s);
    }

    @Override
    public Race read(String s) {
        return this.raceRepository.read(s);
    }

    @Override
    public Set<Race> getAll() {
        Set<Race> race = this.raceRepository.getAll();
        System.out.println("In getall, all = " + race);
        return race;
    }
}