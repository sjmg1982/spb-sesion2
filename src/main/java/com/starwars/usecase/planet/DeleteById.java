package com.starwars.usecase.planet;

import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;

/**
 * Created by sjmg on 7/07/17.
 */
public class DeleteById {
    private PlanetRepository planetRepository;


    public DeleteById(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet execute(Long id) {

        return planetRepository.delete(id);
    }
}