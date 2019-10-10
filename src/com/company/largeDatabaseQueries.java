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
            if(!p.equals(actor)) {
                int occur = Collections.frequency(tempList, p);
                if (occur == constellation) {
                    if (retList.contains(p))
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



}
