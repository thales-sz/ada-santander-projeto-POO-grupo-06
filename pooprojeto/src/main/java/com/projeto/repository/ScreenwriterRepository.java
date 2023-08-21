package com.projeto.repository;

import java.util.ArrayList;
import java.util.List;

import com.projeto.domain.Screenwriter;

public class ScreenwriterRepository extends Repository {

  public ScreenwriterRepository() {
    this.list = new ArrayList<Object>();
  }

  @Override
  public void add(Object screenwriter) {
    this.list.add(screenwriter);
  }

  @Override
  public Object get(int index) {
    for (Object obj : this.list) {
      if (obj instanceof Screenwriter) {
        Screenwriter screenwriter = (Screenwriter) obj;
        if (screenwriter.getId() == index) {
          return obj;
        }
      }
    }
    return null;
  }

  public Object find(String name) {
    for (Object obj : this.list) {
      if (obj instanceof Screenwriter) {
        Screenwriter screenwriter = (Screenwriter) obj;
        if (screenwriter.getName().equalsIgnoreCase(name)) {
          return screenwriter;
        }
      }
    }
    return null;
  }

  @Override
  public List<Object> getAll() {
    return this.list;
  }
}
