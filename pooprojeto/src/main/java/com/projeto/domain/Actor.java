package com.projeto.domain;

public class Actor extends Person{
    
    private final int id;
    public String miniBio;

    public Actor(String name, int age, String gender, int id, String miniBio){
        super(name,age,gender);
        this.id = id;
        this.miniBio = miniBio;
    }

    public int getId(){
        return this.id;
    }
    
    public String getMiniBio(){
        return this.miniBio;
    }

    public void setMiniBio(String miniBio){
        this.miniBio = miniBio;
    }

    @Override
    public String toString(){
        return "Name: " + super.getName() +
                ", age: " + super.getAge() + 
                ", gender: " + super.getGender() +
                ", Mini Bio: " + this.miniBio;
    }

}
