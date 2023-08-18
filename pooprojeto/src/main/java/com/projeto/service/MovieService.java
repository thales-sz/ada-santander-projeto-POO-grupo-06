package com.projeto.service;

import com.projeto.domain.Movie;
import com.projeto.repository.MovieRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {
    private static int COUNTER_MOVIE_ID;
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void create(String name, LocalDate releaseDate, double budget, String description) {
        this.movieRepository.add(new Movie(++this.COUNTER_MOVIE_ID, name, releaseDate, budget, description));
    }

    public Movie find(String name) {
        return this.movieRepository.getByName(name);
    }

    public List<Movie> listAll() {
        return this.movieRepository.getAll()
                .stream()
                .filter(element -> element instanceof Movie)
                .map(element -> (Movie) element)
                .collect(Collectors.toList());
    }


    public void associateActor() {

    }

    public void associateDirector() {

    }

    public void associateProducer() {

    }

    public void associateScreenwriter() {

    }

}
