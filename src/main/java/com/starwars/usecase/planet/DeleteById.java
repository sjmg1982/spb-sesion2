package com.starwars.usecase.planet;

import com.starwars.model.Planet;
import com.starwars.repository.PlanetRepository;
import org.springframework.stereotype.Service;

/**
 * Created by sjmg on 7/07/17.
 */
@Service
public class DeleteById {
    private PlanetRepository planetRepository;


    public DeleteById(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    public void execute(Long id) {

        planetRepository.delete(id);
    }
}
