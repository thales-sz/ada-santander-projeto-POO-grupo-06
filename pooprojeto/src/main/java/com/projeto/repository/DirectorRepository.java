package com.projeto.repository;

import com.projeto.domain.Director;

import java.util.ArrayList;
import java.util.Collections;
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
    public Object get(int index) {
        for(Object obj : this.list){
            if(obj instanceof Director){
                Director director =(Director) obj;
                if(director.getId()== index){
                    return obj;
                }
            }
        }
        return null;
    }


    public Director find(String input) {

        for (Object obj : this.list) {
            if (obj instanceof Director) {
                Director director = (Director) obj;
                if (director.getName().equalsIgnoreCase(input)) {
                    return director;
                }

            }
        }
        return null;
    }
    @Override
    public List<Object> getAll() {
        return Collections.unmodifiableList(this.list);
    }
}
