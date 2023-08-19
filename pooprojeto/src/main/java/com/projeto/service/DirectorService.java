package com.projeto.service;

import com.projeto.domain.Director;
import com.projeto.repository.DirectorRepository;

public class DirectorService {
    public int contador=1;
    private DirectorRepository directorRepository;
    public DirectorService(DirectorRepository directorRepository){
        this.directorRepository= directorRepository;
    }
    public int createDirector(String nome, int age,String gender){
        Director director = new Director(nome,age,gender,contador);
        contador++;
        directorRepository.add(director);
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
