package com.starwars.usecase.person;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;

import java.util.List;

/**
 * Created by sjmg on 7/07/17.
 */
public class FindAll {
    private PeopleRepository peopleRepository;

    public FindAll(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public List<People> execute() {
        return peopleRepository.findAll();
    }
}
