package com.darren.service.demography;

import com.darren.domain.demography.Gender;
import com.darren.domain.demography.Race;
import com.darren.service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}