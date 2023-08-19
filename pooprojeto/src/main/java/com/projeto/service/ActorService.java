package com.projeto.service;

import java.util.ArrayList;
import java.util.List;

import com.projeto.repository.ActorRepository;
import com.projeto.domain.Actor;


public class ActorService {
    
    private static int counterId;
    private ActorRepository repo;

    public void createActor(String name, int age, String gender, String birthName, String miniBio){

        Actor act = new Actor(name,age,gender,birthName,counterId,miniBio);

        repo.add(act);
        counterId++;
    }

    public Actor getActor(int index){
        return repo.get(index);
    }

    public List<Object> getAll(){
        return this.repo.getAll();
    }

    @Override
    public String toString(){
        return repo.toString();
    }

  
}
