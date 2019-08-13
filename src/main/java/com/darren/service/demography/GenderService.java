package com.darren.service.demography;

import com.darren.domain.demography.Gender;
import com.darren.service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {

    Set<Gender> getAll();
}
