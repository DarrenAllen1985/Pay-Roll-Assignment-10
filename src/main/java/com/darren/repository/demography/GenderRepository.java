package com.darren.repository.demography;

import com.darren.domain.demography.Gender;
import com.darren.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
