package com.starwars.usecase.person;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import org.springframework.stereotype.Service;

/**
 * Created by sjmg on 7/07/17.
 */
@Service
public class SavePerson {
    private PeopleRepository peopleRepository;

    public SavePerson(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public People execute(People people) throws NullPointerException {
        if(people==null) {
            throw new NullPointerException("no existe people");
        }
        return peopleRepository.save(people);
    }
}
