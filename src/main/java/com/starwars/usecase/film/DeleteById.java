package com.starwars.usecase.film;

import com.starwars.repository.FilmRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 * Created by sjmg on 7/07/17.
 */
@Service
public class DeleteById {
    private FilmRepository filmRepository;

    public DeleteById(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public void execute(@NonNull Long id) {
        filmRepository.delete(id);
    }
}
