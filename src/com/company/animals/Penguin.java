package com.company.animals;

public class Penguin extends Animal {

    private String type;
    private String wingSpan;
    private String featherType;

    public Penguin(String name, String location, char gender, double weight, String type, String wingSpan, String featherType) {
        super(name, location, gender, weight);
        this.type = type;
        this.wingSpan = wingSpan;
        this.featherType = featherType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWingSpan() {
        return wingSpan;
    }


    public String getFeatherType() {
        return featherType;
    }

    public void setFeatherType(String featherType) {
        this.featherType = featherType;
    }
}
