package com.starwars.usecase.planet;

import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;

/**
 * Created by sjmg on 7/07/17.
 */
public class SavePlanet {
    private PlanetRepository planetRepository;

    public SavePlanet(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public Planet execute(Planet planet) throws NullPointerException {
        if(planet==null) {
            throw new NullPointerException("Planet is null");
        }
        return planetRepository.save(planet);
    }
}
