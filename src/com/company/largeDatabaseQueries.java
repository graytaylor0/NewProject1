package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class largeDatabaseQueries {


    public ArrayList<Person> constellationOfCoStars(Person actor, int constellation)
    {
        ArrayList<Person> tempList = new ArrayList<Person>();

        for(Movie m : DBMS.movies)
        {
            if(m.getCast_and_crew().contains(actor))
                tempList.addAll(m.getCast_and_crew());
        }
        ArrayList<Person> retList = new ArrayList<Person>();
        for(Person p : tempList) {
            if(p != null && !p.getName().equals(actor.getName())) {
                int occur = Collections.frequency(tempList, p);
                if (occur == constellation) {
                    if (!retList.contains(p) && !p.equals(actor))
                        retList.add(p);
                    //tempList.remove(p);
                }
            }

        }
        return retList;
    }
    public String mostOccurrencesInGenre(Person actor) //QUERY 3
    {
        Map<String,Integer> genreOccurenceMap = new HashMap<String,Integer>();
        for(Movie m : DBMS.movies)
        {
            if(m.getCast_and_crew().contains(actor))
            {
                    genreOccurenceMap.putIfAbsent(m.getGenre(),1);
                    int store = genreOccurenceMap.get(m.getGenre()) + 1;
                    genreOccurenceMap.replace(m.getGenre(),store);
            }
        }
        String genre = "-1";
        int max = -1;
        for(String s : genreOccurenceMap.keySet())
        {
            if(genreOccurenceMap.get(s) > max) {
                max = genreOccurenceMap.get(s);
                genre = s;
            }
        }

        return genre;
    }

    public ArrayList<Movie> bestAndWorst(String name)
    {
        name = "\"" + name + "\"";
        double max = -1;
        Movie bestMovie = new Movie();
        for(Movie m : DBMS.movies)
        {
            for(Person p : m.getCast_and_crew())
            {
                if(p != null && p.getName().equals(name))
                {
                    if(m.getRating() > max) {
                        max = m.getRating();
                        bestMovie = m;
                    }
                }
            }
        }
        Person director = new Person();
        for(Person p : bestMovie.getCast_and_crew())
        {
            if(p != null && p.getJob().equalsIgnoreCase("\"director\""))
            {
                director = p;
            }
        }

        double min = 1000;
        Movie worstMovie = new Movie();
        for(Movie m : DBMS.movies)
        {
            for(Person p : m.getCast_and_crew())
            {
                if(p != null && p.getName().equals(director.getName()))
                {
                    if(m.getRating() < min)
                    {
                        min = m.getRating();
                        worstMovie = m;
                    }
                }
            }
        }

        ArrayList<Movie>retList= new ArrayList<Movie>();
        retList.add(worstMovie);  retList.add(bestMovie);
        return retList;
    }



}
