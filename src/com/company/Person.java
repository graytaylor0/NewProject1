package com.company;
import java.util.ArrayList;

public abstract class Person {
    protected int id;
    protected String name;
    protected int age;
    protected ArrayList<Movie> movies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){
        this.id = 0;
        this.name = "";
        this.age = 0;
    }
    public Person(int id, String name, int age, ArrayList<Movie> movies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.movies = movies;
    }
}
