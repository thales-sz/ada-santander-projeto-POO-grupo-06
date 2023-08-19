package com.projeto.domain;

public class Actor extends Person{
    
    private String birthName;
    private final int id;
    public String miniBio;

    public Actor(String name, int age, String gender, String birthName, int id, String miniBio){
        super(name,age,gender);
        this.birthName = birthName;
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
        return "Artistic Name: " + super.getName() +
                ", birth name: " + this.birthName +
                ", age: " + super.getAge() + 
                ", gender: " + super.getGender() +
                ", Mini Bio: " + this.miniBio;
    }

}
