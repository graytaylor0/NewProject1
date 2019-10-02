package com.company;

import java.util.ArrayList;

public class Table {
    public String name;
    public ArrayList<String> attrNames;
    public ArrayList<String> attrTypes;
    public ArrayList<Integer> attrSizes;
    public ArrayList<String> primaryKeys;


    //use for create table
    public Table()
    {
        name = ""; attrTypes = new ArrayList<String>();
            attrNames = new ArrayList<String>();
            primaryKeys = new ArrayList<String>();
            attrSizes = new ArrayList<Integer>();
    }

    public Table(String n, ArrayList<String> aN, ArrayList<String> aT, ArrayList<Integer> aS, ArrayList<String> pK)
    {
        name = n; attrTypes = aT; attrNames = aN; attrSizes = aS; primaryKeys = pK;
    }


    //use for show
    public String toString()
    {
        return "TABLE INFO FOR: " + name + "\nattribute names: " + attrNames.toString() + "\nattribute types: " + attrTypes.toString() + "\nattribute sizes: " + attrSizes.toString() + "\nprimary keys: " + primaryKeys.toString() + "\n";
    }

    public Table createTable(ArrayList<String> list)
    {
        int nameIndex = 1;
        int lastIndex = -1;
        String myName = list.get(nameIndex);
        Table retVal = new Table();
        for(int i = nameIndex; i < list.size(); i ++)
        {
            if(list.get(i).equals("(") || list.get(i).equals(")"))
            {
                list.remove(i);
            }
        }
        for(int i = nameIndex; i < list.size() - 1; i ++)
        {
            if(list.get(i).equals("PRIMARY KEY"))
                lastIndex = i;

        }
        for(int i = nameIndex + 1; i < lastIndex; i += 3)
        {
            System.out.println(list);
            this.attrNames.add(list.get(i));
            this.attrTypes.add(list.get(i+1));
            if(!list.get(i+1).equals("INTEGER"))
                this.attrSizes.add(Integer.parseInt(list.get(i+2)));
        }
        for(int i = lastIndex+1; i < list.size(); i ++)
        {
            this.primaryKeys.add(list.get(i));
        }
        //System.out.println(this);
        return this;

    }








}
