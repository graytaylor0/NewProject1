package com.company;

public class CastMember extends Person{
    private String role;

    public CastMember(){
        super();
        this.role = "";
    }

    public CastMember(int id, String name, int age, String role){
        super(id, name, age);
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + ", Age: " + age + ", Role: " + role;
    }
}
