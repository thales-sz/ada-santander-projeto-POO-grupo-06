package com.projeto.domain;

public class Screenwriter extends Person {
  private static int nextId = 1;
  private int id;

  public Screenwriter(String name, int age, String gender) {
    super(name, age, gender);
    this.id = nextId++;
  }

  public String toString() {
    String string = "Roterista: '" + getName() + "'" +
        "\nIdade: " + getAge() +
        "\nGênero: " + getGender() +
        "\nIdentificação: '" + getId() + "'";
    return string;
  }

  public int getId() {
    return this.id;
  }
}
