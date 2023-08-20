package com.projeto.service;

import com.projeto.domain.Director;
import com.projeto.repository.DirectorRepository;

public class DirectorService {
    private static int counter_Director;
    private DirectorRepository directorRepository;
    public DirectorService(DirectorRepository directorRepository){
        this.directorRepository= directorRepository;
    }
    public int createDirector(String nome, int age,String gender){

        Director director = new Director(nome,age,gender,++this.counter_Director);

        this.directorRepository.add(director);
        return director.getId();

    }
    //public List
    public Director findDirector(String nome){
        return directorRepository.find(nome);
    }
    public Object listAllDirector(){
        return (directorRepository.getAll());
    }



}
