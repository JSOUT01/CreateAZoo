package com.company.Items;

public class Items {

    private int price;
    private String itemName;
    private int quantity;
    private double dateRecived;

    public Items(int price, String itemName, int quantity, double dateRecived) {
        this.price = price;
        this.itemName = itemName;
        this.quantity = quantity;
        this.dateRecived = dateRecived;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDateRecived() {
        return dateRecived;
    }

    public void setDateRecived(double dateRecived) {
        this.dateRecived = dateRecived;
    }
}
