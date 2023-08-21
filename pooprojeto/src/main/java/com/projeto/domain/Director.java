package com.projeto.domain;

public class Director extends Person {
    private int id;

    public Director(String name, int age, String gender, int id) {
        super(name, age, gender);
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String toString() {
        String string = "Diretor: '" + getName() + "'" +
                "\nIdade: " + getAge() +
                "\nGênero: " + getGender() +
                "\nIdentificação: '" + getId() + "'";
        return string;
    }
}
