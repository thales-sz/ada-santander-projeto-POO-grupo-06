package com.projeto.repository;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository {
    private List<Object> list;

    public Repository() {
        this.list = new ArrayList<>();
    }

    public void add(Object entrada) {
        list.add(entrada);
    }
    public Object get(int index){
        if(index >= 0 && index < list.size()){
            return list.get(index);
        }
        return null;
    }
    public List<Object> getAll() {
        return new ArrayList<>(list);
    }

}
