package com.stackroute.domain;

public class Actor {
   public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display()
    {
        System.out.println("name="+this.name+" gender="+this.gender+" age="+this.age);
    }

    private String name;
    private String gender;



    private int age;
}
