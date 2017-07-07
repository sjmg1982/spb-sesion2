package com.starwars.usecase.film;

import com.starwars.model.Film;
import com.starwars.repository.FilmRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;

/**
 * Created by sjmg on 7/07/17.
 */
@Service
public class SaveFilm {
    private FilmRepository filmRepository;

    public SaveFilm(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
    public Film execute(@NonNull Film film){
        return filmRepository.save(film);
    }
}
