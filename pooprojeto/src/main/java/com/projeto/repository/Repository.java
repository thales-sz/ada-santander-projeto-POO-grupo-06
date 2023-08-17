package com.projeto.repository;

import java.util.ArrayList;
import java.util.List;

public abstract class Repository {
    private List<Object> list;

    public Repository() {
        this.list = new ArrayList<>();
    }

    public abstract void add(Object entrada);

    public abstract Object get(int index);

    public abstract List<Object> getAll();

}
