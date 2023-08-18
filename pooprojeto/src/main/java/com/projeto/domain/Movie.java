package com.projeto.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final int id;
    private String name;
    private LocalDate releaseDate;
    private double budget;
    private String description;
    private List<Actor> actors;
    private List<Director> directors;
    private List<Producer> producers;
    private List<Screenwriter> screenwriters;

    public Movie(int id, String name, LocalDate releaseDate, double budget, String description) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.budget = budget;
        this.description = description;
        this.actors = new ArrayList<>();
        this.directors = new ArrayList<>();
        this.producers = new ArrayList<>();
        this.screenwriters = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Actor> getActors() {
        return this.actors;
    }

    public List<Director> getDirectors() {
        return this.directors;
    }

    public List<Producer> getProducers() {
        return this.producers;
    }

    public List<Screenwriter> getScreenwriters() {
        return this.screenwriters;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + this.name + '\'' +
                ", releaseDate='" + this.releaseDate + '\'' +
                ", budget=" + this.budget +
                ", description='" + this.description + '\'' +
                ", actors=" + this.actors +
                ", directors=" + this.directors +
                ", producers=" + this.producers +
                ", screenwriters=" + this.screenwriters +
                '}';
    }
}
