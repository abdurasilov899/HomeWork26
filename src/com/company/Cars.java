package com.company;

public class Cars {
    private  String model;
    private int yearmodel;
    private String color;
    private int price;

    public Cars() {
    }

    public Cars(String model, int yearmodel, String color, int price) {
        this.model = model;
        this.yearmodel = yearmodel;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearmodel() {
        return yearmodel;
    }

    public void setYearmodel(int yearmodel) {
        this.yearmodel = yearmodel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "\nmodel:      " + model  +
                "\nyearmodel:  " + yearmodel +
                "\ncolor:      " + color  +
                "\nprice:      " + price;
    }
}
