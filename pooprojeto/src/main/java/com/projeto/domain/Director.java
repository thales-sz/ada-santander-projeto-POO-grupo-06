package com.projeto.domain;

public class Director extends  Person {
    private int id;

    public Director(String name, int age, String gender, int id) {
        super(name, age, gender);
    }

    public int getId() {
        return id;
    }


}
