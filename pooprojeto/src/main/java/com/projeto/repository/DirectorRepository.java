package com.projeto.repository;

import com.projeto.domain.Director;

import java.util.ArrayList;
import java.util.List;

public class DirectorRepository extends Repository{
    public DirectorRepository(){
        super();
        this.list= new ArrayList<Object>();
    }

    @Override
    public void add(Object input) {
       list.add(input);

    }

    @Override
    public Object get(String input) {
        for(Object list :list){
            if(input.equalsIgnoreCase(list.toString())){
                return list;
                }
            }
        return null;
    }

    @Override
    public List<Object> getAll() {
        return list;
    }
}
