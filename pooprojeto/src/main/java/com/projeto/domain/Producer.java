package com.projeto.domain;

public class Producer extends Person{

    private  int id;
    public Producer(String name, int age, String gender, int id) {
        super(name, age, gender);
        this.id = id;
    }

    public int getId() {
        return id;
    }



    @Override
    public String toString(){
        return "Produtor: " + getName() +
                "\nIdade: " + getAge() +
                "\nGênero: " + getGender() +
                "\nIdentificação: " + getId();
    }


}
