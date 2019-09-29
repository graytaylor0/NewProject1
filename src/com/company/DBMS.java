package com.company;

import java.util.ArrayList;

public class DBMS {
    public static ArrayList<Movie> movies;
    public static ArrayList<Person> people;
    public static ArrayList<String> terminalNodes = new ArrayList<String>();

    public void CreateTable(String type){
        if (type == "movies") {
            movies = new ArrayList<Movie>();
        } else if (type == "people"){
            people = new ArrayList<Person>();
        }
    }
    public boolean compareTo(String operator, int num1, int num2){
        if (operator.equals("==")){
            return num1 == num2;
        }else if (operator.equals("!=")) {
            return num1 != num2;
        }else if (operator.equals("<")) {
            return num1 < num2;
        }else if (operator.equals(">")) {
            return num1 > num2;
        }else if (operator.equals(">=")) {
            return num1 >= num2;
        }else if (operator.equals("<=")) {
            return num1 <= num2;
        }
        return false;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void addPerson(Person person){
        people.add(person);
    }


    //Get and remove movies

    public Movie getMovieById(int id){
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                return movies.get(i);
            }
        }
        return new Movie();
    }

    public Movie removeMovieById(int id){
        for (int i = 0; i < movies.size(); i++){
            if (movies.get(i).getId() == id){
                Movie tempMovie = movies.get(i);
                movies.remove(i);
                return tempMovie;
            }
        }
        return new Movie();
    }

    public ArrayList<Movie> getMoviesByGenre(String genre){
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getGenre() == genre) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public void removeMoviesByGenre(String genre){
        int index = 0;
        while (index < movies.size()){
            if (movies.get(index).getGenre() == genre){
                movies.remove(index);
                index -= 1;
            }
            index += 1;
        }
    }

    public ArrayList<Movie> getMoviesByName(String name){
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName() == name) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public Movie removeMovieByName(String name){
        for (int i = 0; i < movies.size(); i++){
            if (movies.get(i).getName() == name){
                Movie tempMovie = movies.get(i);
                movies.remove(i);
                return tempMovie;
            }
        }
        return new Movie();
    }

    public ArrayList<Movie> getMoviesByYear(String operator, int year){
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (compareTo(operator, movies.get(i).getYear(), year)) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public void removeMoviesByYear(String operator, int year){
        int index = 0;
        while (index < movies.size()){
            if (compareTo(operator, movies.get(index).getYear(), year)){
                movies.remove(index);
                index -= 1;
            }
            index += 1;
        }
    }

    //show movies
    public void showMovies(){
        for (int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i));
        }
    }

    //show people
    public void showPeople(){
        for (int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
    }

    // get and remove people

    public Person getPersonById(int id){
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                return people.get(i);
            }
        }
        return new CastMember();
    }

    public Person removePersonById(int id){
        for (int i = 0; i < people.size(); i++){
            if (people.get(i).getId() == id){
                Person tempPerson = people.get(i);
                people.remove(i);
                return tempPerson;
            }
        }
        return new CastMember();
    }

    public void removePeopleByName(String name){
        int index = 0;
        while (index < people.size()){
            if (people.get(index).getName() == name){
                people.remove(index);
                index -= 1;
            }
            index += 1;
        }
    }

    public ArrayList<Person> getPeopleByName(String name){
        ArrayList<Person> filtered_people = new ArrayList<Person>();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName() == name) {
                filtered_people.add(people.get(i));
            }
        }
        return filtered_people;
    }

    public ArrayList<Person> getPeopleByAge(String operator, int age){
        ArrayList<Person> filtered_people = new ArrayList<Person>();
        for (int i = 0; i < people.size(); i++) {
            if (compareTo(operator, people.get(i).getAge(), age)) {
                filtered_people.add(people.get(i));
            }
        }
        return filtered_people;
    }

    public void removePeopleByAge(String operator, int age){
        int index = 0;
        while (index < people.size()){
            if (compareTo(operator, people.get(index).getAge(), age)){
                people.remove(index);
                index -= 1;
            }
            index += 1;
        }
    }
}
