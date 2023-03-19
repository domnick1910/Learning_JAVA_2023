package com.RunningApps;

public class Variables {
    //primitive data types
    private int number = 100;
    private String brand = "PUMA";
    private Double dNumber =10.1;

    public Variables() {

    }

    public int getNumber() {
        return this.number;
    }

    public String getBrand() {
        return this.brand;
    }

    public Double getdNumber() {
        return this.dNumber;
    }


    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setdNumber(double newdNumber) {
        this.dNumber = newdNumber;
    }
}
