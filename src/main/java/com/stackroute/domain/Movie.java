package com.stackroute.domain;

public class Movie {
   
    public Movie(Actor actor) {
        this.actor = actor;
    }
 public void setActor(Actor actor) {
        this.actor = actor;
    }

    private Actor actor;
    public void display()
    {
        actor.display();
    }

}
