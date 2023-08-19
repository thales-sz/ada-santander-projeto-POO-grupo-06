package com.projeto.domain;

public class Screenwriter extends Person {
  private static int nextId = 1;
  private int id;

  public Screenwriter(String name, int age, String gender) {
    super(name, age, gender);
    this.id = nextId++;
  }

  public String toString() {
    return "Screenwriter: " + getName() + ", " + getAge() + ", " + getGender();
  }

  public int getId() {
    return this.id;
  }
}
