package com.darren.service;

import com.darren.domain.demography.Gender;
import com.darren.domain.demography.Race;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}