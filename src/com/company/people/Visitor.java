package com.company.people;

public class Visitor extends People {

    private int groupSize;
    private String alleriges;
    private boolean hasMembership;
    private String homeAddress;

    public Visitor(int age, String name, String race, char gender, int groupSize, boolean hasMembership, String homeAddress) {
        super(age, name, race, gender);
        this.groupSize = groupSize;
        this.hasMembership = hasMembership;
        this.homeAddress = homeAddress;
    }

    public int getGroupSize() {
        return groupSize;


    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }

    public String getAlleriges() {
        return alleriges;
    }

    public void setAlleriges(String alleriges) {
        this.alleriges = alleriges;
    }

    public boolean isHasMembership() {
        return hasMembership;
    }

    public void setHasMembership(boolean hasMembership) {
        this.hasMembership = hasMembership;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
}
