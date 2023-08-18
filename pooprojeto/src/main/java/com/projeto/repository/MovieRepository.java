package com.projeto.repository;

import com.projeto.domain.Movie;

import java.util.Collections;
import java.util.List;

public class MovieRepository extends Repository {

    public MovieRepository() {
        super();
    }

    @Override
    public void add(Object entrada) {
        this.list.add(entrada);
    }

    @Override
    public Object get(int index) {
        for(Object obj : this.list) {
            if(obj instanceof Movie) {
                Movie movie = (Movie) obj;
                if(movie.getId() == index) {
                    return obj;
                }
            }
        }
        return null;
    }

    public Movie getByName(String name) {
        for(Object obj : this.list) {
            if(obj instanceof Movie) {
                Movie movie = (Movie) obj;
                if(movie.getName().equalsIgnoreCase(name)) {
                    return movie;
                }
            }
        }
        return null;
    }

    @Override
    public List<Object> getAll() {
        return Collections.unmodifiableList(this.list);
    }

    @Override
    public String toString() {
        return "MovieRepository{" +
                "list=" + this.list +
                '}';
    }
}
