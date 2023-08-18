package com.projeto.service;

import com.projeto.domain.Director;
import com.projeto.repository.DirectorRepository;

public class DirectorService {
    public int contador=0;
    private DirectorRepository directorRepository;
    public DirectorService(DirectorRepository directorRepository){
        this.directorRepository=directorRepository;
    }
    public void createDirector(String nome, int age,String gender){
        Director director = new Director(nome,age,gender,contador);
        contador++;
        directorRepository.add(director);
    }
    //public List
    public Director findDirector(String nome){

        return null;
    }
    public Object listAllDirector(){
        return (directorRepository.getAll());
    }


}
