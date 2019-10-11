package com.company;

import java.util.ArrayList;

//abstraction for people for easier access and calling
public class CrewMember extends Person {
    public String job;

    public CrewMember(){
        super();
        this.job = "";
    }

    public CrewMember(int id, String name, int age, String job, ArrayList<Movie> movies){
        //super(id, name, age, movies);
        this.job = job;
    }
    public String getRole(){
        return this.job;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + ", Age: " + age + ", Job: "  + job;
    }
}
