package com.starwars.rest;

import com.starwars.model.Planet;
import com.starwars.usecase.planet.FindAllPlanets;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sjmg on 7/07/17.
 */
@RestController
@RequestMapping("/planets")
public class PlanetController {

    private FindAllPlanets findAllPlanets;

    public PlanetController(FindAllPlanets findAllPlanets) {
        this.findAllPlanets = findAllPlanets;
    }

    @RequestMapping("/find-all")
    public ResponseEntity<List<Planet>> findAll() {
        List<Planet>planets= findAllPlanets.execute();

        return new ResponseEntity<List<Planet>>(planets, HttpStatus.OK);
    }
}
