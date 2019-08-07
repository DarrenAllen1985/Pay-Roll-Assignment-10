package com.darren.service;

import com.darren.domain.demography.Gender;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {


    Set<Gender> getAll();
}
