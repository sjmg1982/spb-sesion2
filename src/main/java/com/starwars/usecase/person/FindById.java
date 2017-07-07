package com.starwars.usecase.person;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 * Created by sjmg on 7/07/17.
 */
@Service
public class FindById {
    private PeopleRepository peopleRepository;

    public FindById(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public People execute(@NonNull Long id) {
        return peopleRepository.findOne(id);
    }
}
