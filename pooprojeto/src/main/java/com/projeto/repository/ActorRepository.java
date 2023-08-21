package com.projeto.repository;

import java.util.Collections;
import java.util.List;

import com.projeto.domain.Actor;

public class ActorRepository extends Repository {

    public ActorRepository() {
        super();
    }

    @Override
    public void add(Object entrada) {
        this.list.add(entrada);
    }

    @Override
    public Actor get(int index) {
        for (Object obj : this.list) {
            if (obj instanceof Actor) {
                Actor actor = (Actor) obj;
                if (actor.getId() == index) {
                    return actor;
                }
            }
        }
        return null;
    }

    public Actor getActorByName(String name) {
        for (Object obj : this.list) {
            if (obj instanceof Actor) {
                Actor actor = (Actor) obj;
                if (actor.getName().equals(name)) {
                    return actor;
                }
            }
        }
        return null;
    }

    @Override
    public List<Object> getAll() {
        return Collections.unmodifiableList(this.list);
    }

    @Override
    public String toString() {
        String result = "Actors:";
        if (this.list.isEmpty()) {
            result = "\nThere are no registered actors!";
        } else {
            for (int i = 0; i < this.list.size(); i++) {
                result += "\n" + (i + 1) + "- " + this.list.get(i).toString();
            }
        }
        return result;
    }

}
