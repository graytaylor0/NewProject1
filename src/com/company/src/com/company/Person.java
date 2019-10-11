package com.company;
import java.util.ArrayList;

public class Person {
    protected int id;
    protected String name;
    protected int age;
    protected String job;

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

    public void setJob(String j){ this.job = job; }

    public String getName() {
        return name;
    }

    public void addMovie(Movie m)
    {
        movies.add(m);
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){
        this.id = 0;
        this.name = "";
        this.age = 0;
        this.job = "";
    }
    public Person(int id, String name, int age, String j,ArrayList<Movie> movies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.movies = movies;
        this.job = j;
    }
    public Person(String name)
    {
        this.id = 0;
        this.name = name;
        this.age = 0;
        this.job = "";
        this.movies = new ArrayList<Movie>();
    }
    @Override
    public String toString()
    {
        return "id: " + id + " name: " + name + " age: " + age + " job: " + job + " Movies: :" +  movies;
    }


}
