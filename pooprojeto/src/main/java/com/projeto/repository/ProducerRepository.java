package com.projeto.repository;

import com.projeto.domain.Producer;

import java.util.ArrayList;
import java.util.List;

public class ProducerRepository extends Repository{

    public ProducerRepository(){
        super();
        this.list = new ArrayList<Object>();
    }

    @Override
    public void add(Object entrada) {
        list.add(entrada);
    }

    @Override
    public Object get(int index) {
        for(Object obj : this.list) {
            if(obj instanceof Producer) {
                Producer producer = (Producer) obj;
                if(producer.getId() == index) {
                    return obj;
                }
            }
        }
        return null;
    }

    @Override
    public List<Object> getAll() {
        return this.list;
    }

    public Producer find(String input){
        for (Object obj : this.list) {
            if (obj instanceof Producer) {
                Producer producer = (Producer) obj;
                if (producer.getName().equalsIgnoreCase(input)) {
                    return producer;
                }

            }
        }
        return null;
    }


}
