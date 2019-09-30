package com.company;
import java.util.ArrayList;

public class Movie {
    private int id;
    private String name;
    private int year;
    private String genre;
    private ArrayList<Person> cast_and_crew;

    public Movie(){
        this.id = 0;
        this.name = "";
        this.year = 0;
        this.genre = "";
        cast_and_crew = new ArrayList<Person>();
    }

    public Movie(int id, String name, int year, String genre, ArrayList<Person> cast_and_crew){
        this.genre = genre;
        this.id = id;
        this.year = year;
        this.name = name;
        this.cast_and_crew = cast_and_crew;
    }

    public int getId() {
        return id;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String removePerson(int id){
        for (int i = 0; i < cast_and_crew.size(); i++){
            if (cast_and_crew.get(i).getId() == id){
                cast_and_crew.remove(i);
                return cast_and_crew.get(i).getName();
            }
        }
        return "No person found with that ID.";
    }

    public void addPerson(Person person){
        cast_and_crew.add(person);
    }

    public void printCastAndCrew() {
        for (int i = 0; i < cast_and_crew.size(); i++) {
            System.out.println(cast_and_crew.get(i));
        }
    }
    @Override
    public String toString(){
        return "Id: " + id + ", Name: " + name + ", Year: " + year + ", Genre: " + genre;
    }
}
