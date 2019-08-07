package com.darren.repository.demography;

import com.darren.domain.demography.Race;
import com.darren.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
