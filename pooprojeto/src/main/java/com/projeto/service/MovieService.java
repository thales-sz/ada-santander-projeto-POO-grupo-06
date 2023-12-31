package com.projeto.service;


import com.projeto.domain.*;
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

    public int create(String name, LocalDate releaseDate, double budget, String description) {
        Movie movie = new Movie(++MovieService.COUNTER_MOVIE_ID, name, releaseDate, budget, description);
        this.movieRepository.add(movie);

        return movie.getId();
    }

    public Movie find(String name) {
        return this.movieRepository.getByName(name);
    }

    public List<Movie> listAll() {
        return this.movieRepository.getAll().stream().filter(element -> element instanceof Movie)
                .map(element -> (Movie) element).collect(Collectors.toList());
    }

    public void associateActor(Movie movie, Actor actor) {
        movie.getActors().add(actor);
    }

    public void associateDirector(Movie movie, Director director, DirectorService directorService) {
        movie.getDirectors().add(director);
    }

    public void associateProducer() {

    }

    public void associateScreenwriter() {

    }

}
