package com.starwars.usecase.person;

import com.starwars.model.People;
import com.starwars.repository.PeopleRepository;
import org.springframework.stereotype.Service;

/**
 * Created by sjmg on 7/07/17.
 */
@Service
public class DeleteById {
    private PeopleRepository peopleRepository;

    public DeleteById(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }
    public void execute(Long id) {
        peopleRepository.delete(id);
    }
}
