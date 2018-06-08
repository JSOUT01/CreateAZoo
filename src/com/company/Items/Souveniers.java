package com.company.Items;

public class Souveniers extends Items{

    private String type;
    private int idNumber;

    public Souveniers(int price, String itemName, int quantity, double dateRecived, String type, int idNumber) {
        super(price, itemName, quantity, dateRecived);
        this.type = type;
        this.idNumber = idNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
