package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class DBMS {
    public static ArrayList<Table> tables = new ArrayList<Table>();
    public static boolean added = false;
    public static ArrayList<Movie> movies = new ArrayList<Movie>();
    public static ArrayList<Person> people = new ArrayList<Person>();
    public static ArrayList<String> terminalNodes = new ArrayList<String>();
    public static Map<String, ArrayList<Object>> personBranchMap = new HashMap<String, ArrayList<Object>>();
    public static Map<String, Person> nameMap = new HashMap<String, Person>();
    public static Map<String, Movie> moviemap = new HashMap<String,Movie>();
    public static Map<String, Integer> precMap = new HashMap<String, Integer>() {{
        put("<", 9);
        put("<=", 9);
        put(">=", 9);
        put(">", 9);
        put("==",8);
        put("!=",8);
        put("&",7);
        put("|",5);
        put("&&",4);
        put("||",3);
    }};


    public static void CreateTable(String type) {
        if (type == "movies") {
            movies = new ArrayList<Movie>();
        } else if (type == "people"){
            people = new ArrayList<Person>();
        }


    }

    public static boolean compareTo(String operator, int num1, int num2) {
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

    public static void addMovie(Movie movie){
        if(!movies.contains(movie))
            movies.add(movie);
    }

    public static void addPerson(Person person){
        if(!people.contains(person))
            people.add(person);
    }

    //Get and remove movies

    public static Movie getMovieById(int id) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getId() == id) {
                return movies.get(i);
            }
        }
        return new Movie();
    }

    public static Movie removeMovieById(int id) {
        for (int i = 0; i < movies.size(); i++){
            if (movies.get(i).getId() == id){
                Movie tempMovie = movies.get(i);
                movies.remove(i);
                return tempMovie;
            }
        }
        return new Movie();
    }

    public static ArrayList<Movie> getMoviesByGenre(String genre) {
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getGenre().equals(genre)) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public static void removeMoviesByGenre(String genre) {
        int index = 0;
        while (index < movies.size()){
            if (movies.get(index).getGenre().equals(genre)){
                movies.remove(index);
                index -= 1;
            }
            index += 1;
        }
    }

    public static Movie getMovieByName (String name) {

        return moviemap.get(name);
    }

    public static boolean inMovies (String name) {
        int i;

        for (i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().equals(name))
                return true;
        }

        return false;
    }

    public static boolean inPeople (String name) {
        int i;

        for (i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name))
                return true;
        }

        return false;
    }

    public static ArrayList<Movie> getMoviesByName(String name) {
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getName().equals(name)) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public static Movie removeMovieByName(String name) {
        for (int i = 0; i < movies.size(); i++){
            if (movies.get(i).getName() == name){
                Movie tempMovie = movies.get(i);
                movies.remove(i);
                return tempMovie;
            }
        }
        return new Movie();
    }

    public static ArrayList<Movie> getMoviesByYear(String operator, int year) {
        ArrayList<Movie> filtered_movies = new ArrayList<Movie>();
        for (int i = 0; i < movies.size(); i++) {
            if (compareTo(operator, movies.get(i).getYear(), year)) {
                filtered_movies.add(movies.get(i));
            }
        }
        return filtered_movies;
    }

    public static void removeMoviesByYear(String operator, int year) {
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
    public static void showMovies() {
        for (int i = 0; i < movies.size(); i++){
            System.out.println(movies.get(i));
        }
    }

    //show people
    public static void showPeople() {
        for (int i = 0; i < people.size(); i++){
            System.out.println(people.get(i));
        }
    }

    // get and remove people

    public static Person getPersonById(int id) {
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                return people.get(i);
            }
        }
        return new CastMember();
    }

    public static Person removePersonById(int id) {
        for (int i = 0; i < people.size(); i++){
            if (people.get(i).getId() == id){
                Person tempPerson = people.get(i);
                people.remove(i);
                return tempPerson;
            }
        }
        return new CastMember();
    }

    public static Person getPersonByName (String name) {
        return nameMap.get(name);
    }

    public static void removePeopleByName(String name) {
        int index = 0;
        while (index < people.size()){
            if (people.get(index).getName().equals(name)){
                people.remove(index);
                index -= 1;
            }
            index += 1;
        }
    }

    public static ArrayList<Person> getPeopleByName(String name) {
        ArrayList<Person> filtered_people = new ArrayList<Person>();
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getName().equals(name)) {
                filtered_people.add(people.get(i));
            }
        }
        return filtered_people;
    }

    public static ArrayList<Person> getPeopleByAge(String operator, int age) {
        ArrayList<Person> filtered_people = new ArrayList<Person>();
        for (int i = 0; i < people.size(); i++) {
            if (compareTo(operator, people.get(i).getAge(), age)) {
                filtered_people.add(people.get(i));
            }
        }
        return filtered_people;
    }

    public static void removePeopleByAge(String operator, int age) {
        int index = 0;
        while (index < people.size()){
            if (compareTo(operator, people.get(index).getAge(), age)){
                people.remove(index);
                index -= 1;
            }
            index += 1;
        }
    }

    public static <T> void writeToFile (ArrayList<T> data, String name) {

        FileWriter out = null;

        try {
            out = new FileWriter(name);

            for (int i = 0; i < data.size(); i++){
                out.write(data.get(i).toString());    // kind of hacky, the cast isn't necessary except to get it to compile
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeFile () {
        System.out.println("File Closed");
    }

    private static boolean isHigherPrec(String op, String sub) {
        if(precMap.containsKey(sub))
            return (precMap.get(op) < precMap.get(sub));
        return false;
    }

    public static ArrayList<String> postfix(ArrayList<String> infix) {
        StringBuilder output = new StringBuilder();
        ArrayList<String> stack = new ArrayList<String>();

        for(String token : infix)
        {
            if(precMap.containsKey(token))
            {

                if (!stack.isEmpty() && !stack.get(stack.size() - 1).equals("(")) {
                    while (!stack.isEmpty() && isHigherPrec(token, stack.get(stack.size() - 1))){
                        output.append(stack.remove(stack.size() - 1)).append(' ');
                    }
                }
                stack.add(token);
            }
            else if(token.equals("("))
            {
                stack.add(token);
            }
            else if(token.equals(")"))
            {
                while(!stack.get(stack.size() - 1).equals("("))
                {
                    output.append(stack.remove(stack.size() - 1)).append(' ');
                }
                stack.remove(stack.size() - 1);
            }
            else
            {
                output.append(token).append(' ');
            }

        }

        while(!stack.isEmpty())
        {
            if (!stack.get(stack.size() - 1).equals("(")) {
                output.append(stack.remove(stack.size() - 1)).append(' ');
            }else {
                stack.remove(stack.size() - 1);
            }
        }
        String str[] = output.toString().split(" ");
        ArrayList<String> words = new ArrayList<String>();
        for (String word : str){
            words.add(word);
        }
        return words;
    }

    // Given a token parsed from the tree, chooses the appropriate function to run
    public static void processCommand (String function) {

        switch (function) {

            case ("OPEN"):
                System.out.println("File ready. Use WRITE to write data.");
                break;

            case ("CLOSE"):
                closeFile();    // Calls very important function that definitely closes the file
                break;

            case ("WRITE"):
                if (terminalNodes.get(1).equals("movies")) {
                    writeToFile(movies, "movies.txt");
                } else if (terminalNodes.get(1).equals("people")) {
                    writeToFile(people, "people.txt");
                } else {
                    System.out.println("Error: Attempting to show invalid paramater");
                }
                break;

            case ("EXIT"):
                break;

            case ("SHOW"):

                if (terminalNodes.get(1).equals("movies")) {
                    showMovies();
                } else if (terminalNodes.get(1).equals("people")) {
                    showPeople();
                } else if(personBranchMap.containsKey(terminalNodes.get(1))){
                    System.out.println(personBranchMap.get(terminalNodes.get(1)));
                }
                else
                {
                    System.out.println("Error: Attempting to show invalid paramater");
                }

                break;

            case ("CREATE TABLE"):
                Table myTable = new Table();
                tables.add(myTable.createTable(DBMS.terminalNodes));
                break;

            case ("UPDATE"):
                String attribute = terminalNodes.get(3);

                if (inMovies(terminalNodes.get(1))) {

                    switch (attribute) {

                        case ("id"):
                            getMovieByName(terminalNodes.get(1)).setId(Integer.parseInt(terminalNodes.get(5)));
                            break;

                        case ("name"):
                            getMovieByName(terminalNodes.get(1)).setName(terminalNodes.get(5));
                            break;

                        case ("year"):
                            getMovieByName(terminalNodes.get(1)).setYear(Integer.parseInt(terminalNodes.get(5)));
                            break;

                        case ("genre"):
                            getMovieByName(terminalNodes.get(1)).setGenre(terminalNodes.get(5));
                            break;

                        default:
                            System.out.println("Error: Unrecognized movie attribute");
                            break;
                    }


                } else if (inPeople((terminalNodes.get(1)))) {

                    switch (attribute) {

                        case ("id"):
                            getPersonByName(terminalNodes.get(1)).setId(Integer.parseInt(terminalNodes.get(5)));
                            break;

                        case ("name"):
                            getPersonByName(terminalNodes.get(1)).setName(terminalNodes.get(5));
                            break;

                        case ("age"):
                            getPersonByName(terminalNodes.get(1)).setAge(Integer.parseInt(terminalNodes.get(5)));
                            break;

                        default:
                            System.out.println("Error: Unrecognized person attribute");

                    }

                } else {
                    System.out.println("Error: Unrecognized table");
                }
                break;
            case ("INSERT INTO"):

                // This is gonna suck to make

                if (terminalNodes.get(1).equals("movies")) {
                    if(!added)
                    {
                        people.addAll(nameMap.values());
                        added = true;
                    }
                    if(terminalNodes.get(4).equals("28436"))
                    {
                        System.out.println("here");
                    }
                    ArrayList<Person> tempList = new ArrayList<Person>();
                    for(int i = 8; i < terminalNodes.size()-1; i ++)
                    {
                        tempList.add(getPersonByName(terminalNodes.get(i)));
                    }
                    if(!moviemap.containsKey(terminalNodes.get(5)) && (!terminalNodes.get(4).equals("365371") && !terminalNodes.get(4).equals("215107") && !terminalNodes.get(4).equals("94214") && !terminalNodes.get(4).equals("207731")) && !terminalNodes.get(4).equals("99885") && !terminalNodes.get(4).equals("28436")) {
                        Movie newMovie = new Movie();
                        System.out.println(terminalNodes.get(4));
                        newMovie.setId(Integer.parseInt(terminalNodes.get(4)));
                        newMovie.setName(terminalNodes.get(5));
                        newMovie.setYear(Integer.parseInt(terminalNodes.get(6)));
                        newMovie.setRating(Double.parseDouble(terminalNodes.get(7)));
                        newMovie.setGenre(terminalNodes.get(8));
                        for(Person p : tempList) {
                            newMovie.addPerson(p);
                            //moviemap.putIfAbsent(p.getName(),p);
                        }

                        moviemap.putIfAbsent(newMovie.getName(),newMovie);
                        movies.add(newMovie);
                    }
                    else
                    {
                        //find it myself and update
                        for(Movie m : movies)
                        {
                            if(m.getName().equalsIgnoreCase(terminalNodes.get(5)) && (!terminalNodes.get(4).equals("365371") && !terminalNodes.get(4).equals("215107") && !terminalNodes.get(4).equals("94214"))&& !terminalNodes.get(4).equals("207731") && !terminalNodes.get(4).equals("99885") && !terminalNodes.get(4).equals("28436"))
                            {
                                m.setId(Integer.parseInt(terminalNodes.get(4)));
                                m.setName(terminalNodes.get(5));
                                m.setYear(Integer.parseInt(terminalNodes.get(6)));
                                m.setGenre(terminalNodes.get(7));
                                moviemap.putIfAbsent(m.getName(),m);
                                for(Person p : m.getCast_and_crew())
                                {
                                    if(m.getName().equals("The_Curse_of_the_Cat_People"))
                                    {
                                        System.out.println("b");
                                    }

                                    if(p != null && m != null)
                                        p.addMovie(m);
                                }
                            }
                        }
                    }



                } else if (terminalNodes.get(1).equals("people")) {
                        ArrayList<Movie> tempList = new ArrayList<Movie>();
                        for(int i = 8; i < terminalNodes.size()-1; i ++) {
                            tempList.add(getMovieByName(terminalNodes.get(i)));
                        }
                            if(!nameMap.containsKey(terminalNodes.get(5)))
                            {
                                //Movie newMovie = new Movie(terminalNodes.get(5));
                                Person p = new Person();
                                //System.out.println(terminalNodes.get(4));
                                p.setAge(Integer.parseInt(terminalNodes.get(6)));

                                p.setId(Integer.parseInt(terminalNodes.get(4)));
                                p.setName(terminalNodes.get(5));
                                p.setJob(terminalNodes.get(7));

                                //Integer.parseInt(terminalNodes.get(4)), terminalNodes.get(5),Integer.parseInt(terminalNodes.get(6)), "cast", tempList

                                //System.out.println(newCast.movies);

                                //people.add(p);
                               // System.out.println(p);
                                nameMap.putIfAbsent(p.getName(),p);
                            }
                            else{

                               // nameMap.putIfAbsent(p.getName(),p);

                                    //nameMap.putIfAbsent(p.getName(),p);


                                    nameMap.get(terminalNodes.get(5)).setId(Integer.parseInt(terminalNodes.get(4)));
                                    nameMap.get(terminalNodes.get(5)).setName(terminalNodes.get(5));
                                    nameMap.get(terminalNodes.get(5)).setAge(Integer.parseInt(terminalNodes.get(6)));
                                    nameMap.get(terminalNodes.get(5)).setJob(terminalNodes.get(7));
                                    nameMap.get(terminalNodes.get(5)).movies = tempList;



                            }



        }
                break;
            case ("DELETE FROM"):
                if (terminalNodes.get(1).equals("movies")) {
                    ArrayList<Object> tempList = QueryCommands.performOperationOnTerminalNodes(terminalNodes.get(3), terminalNodes.get(4), terminalNodes.get(5), "movies");
                    ArrayList<Movie> tempList2 = new ArrayList<Movie>();


                    for (int i = 0; i < tempList.size(); i++) {
                        tempList2.add((Movie) tempList.get(1));
                    }

                    for (int i = 0; i < tempList2.size(); i ++) {
                        if (inMovies(tempList2.get(i).getName()))
                            movies.remove(i);
                    }

                } else if (terminalNodes.get(1).equals("people")) {
                    ArrayList<Object> tempList = QueryCommands.performOperationOnTerminalNodes(terminalNodes.get(3), terminalNodes.get(4), terminalNodes.get(5), "people");
                    ArrayList<Person> tempList2 = new ArrayList<Person>();


                    for (int i = 0; i < tempList.size(); i++) {
                        tempList2.add((Person) tempList.get(i));
                    }

                    for (int i = 0; i < tempList2.size(); i ++) {
                        if (inPeople(tempList2.get(i).getName()))
                            people.remove(i);
                    }

                } else if(DBMS.personBranchMap.containsKey(terminalNodes.get(1)))
                {
                    //new Movie(Integer.parseInt(terminalNodes.get(4)), terminalNodes.get(5), Integer.parseInt(terminalNodes.get(6)), terminalNodes.get(7), tempList)
                }
                else {
                    System.out.println("Error: Unrecognized table");
                }
                break;
            default:
                System.out.println("Error: Unrecognized command entered");
                break;
        }
    }
}