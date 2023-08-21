package com.projeto.service;

import java.util.List;

import com.projeto.domain.Screenwriter;
import com.projeto.repository.ScreenwriterRepository;

public class ScreewriterService {

  private ScreenwriterRepository screenWriterRepository = new ScreenwriterRepository();

  public void create(String name, int age, String gender) {
    Screenwriter screenwriter = new Screenwriter(name, age, gender);
    this.screenWriterRepository.add(screenwriter);
  }

  public Object find(String name) {
    return this.screenWriterRepository.find(name);
  }

  public List<Object> listAll() {
    return this.screenWriterRepository.getAll();
  }
}