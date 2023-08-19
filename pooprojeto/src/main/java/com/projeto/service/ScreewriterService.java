package com.projeto.service;

import com.projeto.domain.Screenwriter;
import com.projeto.repository.ScreenwriterRepository;

public class ScreewriterService {

  private ScreenwriterRepository screenWriterRepository;

  public void create(String name, int age, String gender) {
    Screenwriter screenwriter = new Screenwriter(name, age, gender);
    this.screenWriterRepository.add(screenwriter);
  }
}