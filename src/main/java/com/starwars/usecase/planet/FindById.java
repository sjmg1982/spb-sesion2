package com.starwars.usecase.planet;

import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;
import org.springframework.stereotype.Service;

/**
 * Created by sjmg on 7/07/17.
 */
@Service
public class FindById {
    private PlanetRepository planetRepository;


    public FindById(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet execute(Long id) {
        return planetRepository.findOne(id);
    }
}
