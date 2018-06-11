package com.company.people;

public class People {


    private int age;
    private String name;
    private String race;
    private char gender;

    public People(int age, String name, String race, char gender) {
        this.age = age;
        this.name = name;
        this.race = race;
        this.gender = gender;
    }

    public People() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }


    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}