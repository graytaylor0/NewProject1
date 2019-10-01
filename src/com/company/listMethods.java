import com.company.Movie;
import com.company.Person;

import java.util.ArrayList;

public class listMethods {

    // for || between lists
    public ArrayList<Object> union(ArrayList<Object> list1, ArrayList<Object> list2) {
        ArrayList<Object> retList = list1;
        for(Object o : list2)
            if(!list1.contains(o))
                retList.add(o);
        return retList;
    }

    //for || with duplicates
    public ArrayList<Object> fullUnion(ArrayList<Object> list1 , ArrayList<Object> list2){
        ArrayList<Object> retList = new ArrayList<Object>();
        retList.addAll(list1);
        retList.addAll(list2);
        return retList;
    }

    public ArrayList<Object> naturalJoin(ArrayList<Movie> list1, ArrayList<Person> list2)
    {
        //add person to movies list
        //add movies to person list
        //"might not have to do this" ~ Paul Taele, 2019
        return new ArrayList<Object>();
    }


    // for && between lists
    public ArrayList<Object> intersect(ArrayList<Object> list1, ArrayList<Object> list2)
    {
        ArrayList<Object> retList = new ArrayList<Object>();
        for(Object o : list1)
            if(list2.contains(o))
                retList.add(o);
        return retList;
    }

    // for - between lists
    public ArrayList<Object> difference(ArrayList<Object> list1, ArrayList<Object> list2)
    {
        ArrayList<Object> retList = new ArrayList<Object>();
        for(Object o : list1)
            if(!list2.contains(o))
                retList.add(o);
        return retList;
    }

    //dont use this, you cant create people at will, takes a little more effort knaw whadda i mean ;)
    public ArrayList<Object> product(ArrayList<Object> list1, ArrayList<Object> list2)
    {
        ArrayList<Object> retList = new ArrayList<Object>();
        retList.addAll(list1);
        retList.addAll(list2);
        return retList;
    }




}
