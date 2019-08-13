package com.darren.service.demography;

import com.darren.domain.demography.Race;
import com.darren.factory.demography.RaceFactory;
import com.darren.repository.demography.RaceRepository;
import com.darren.repository.demography.impl.RaceRepositoryImpl;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceServiceTest {

        private RaceRepository repository;
        private Race race;

        @Before
        public void setUp() throws Exception {
            this.repository = RaceRepositoryImpl.getRepository();
            this.race = RaceFactory.buildRace("Coloured");
        }


        @Test
        public void getAll(){
            Set<Race> race = this.repository.getAll();
            System.out.println("In getall, all = " + race);
        }
}