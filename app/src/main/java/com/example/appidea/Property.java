package com.example.appidea;

public class Property {

    private String Rent;
    private String location;

    public Property(String rent, String location) {
        this.Rent = rent;
        this.location = location;
    }

    public String getRent() {
        return Rent;
    }

    public void setRent(String rent) {
        Rent = rent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
