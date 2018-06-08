package com.company.Items;

public class Food extends Items {

    private String catergory;
    private String experationDate;
    private boolean refrigerated;

    public Food(int price, String itemName, int quantity, double dateRecived, String catergory, String experationDate) {
        super(price, itemName, quantity, dateRecived);
        this.catergory = catergory;
        this.experationDate = experationDate;
    }

    public String getCatergory() {
        return catergory;
    }

    public void setCatergory(String catergory) {
        this.catergory = catergory;
    }

    public String getExperationDate() {
        return experationDate;
    }

    public void setExperationDate(String experationDate) {
        this.experationDate = experationDate;
    }

    public boolean isRefrigerated() {
        return refrigerated;
    }

    public void setRefrigerated(boolean refrigerated) {
        this.refrigerated = refrigerated;
    }
}
