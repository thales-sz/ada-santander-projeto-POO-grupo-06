package com.projeto.service;

import com.projeto.domain.Producer;
import com.projeto.repository.ProducerRepository;

import java.util.stream.Collectors;

public class ProducerService {

    private int producerID;
    private ProducerRepository producerRep;

    public ProducerService(ProducerRepository producerRep){
        this.producerRep = producerRep;
    }

    public int criateProducer(String name, int age, String gender ){
        Producer prodc = new Producer(name, age, gender, ++this.producerID);

        this.producerRep.add(prodc);
        return prodc.getId();
    }

    public Producer findProducer(String name){
        return producerRep.find(name);
    }

    public Object listAllProducer(){
        return producerRep.getAll()
                .stream()
                .filter(element -> element instanceof Producer)
                .map(elemente -> (Producer) elemente)
                .collect(Collectors.toList());
    }
}
