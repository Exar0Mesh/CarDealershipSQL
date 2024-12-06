package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    ArrayList<Vehicle> inventory;
    //add values until you call vehicles to do it
    private String name, address, phone;

    //Constructor
    public Dealership(String name, String address, String phone) {
        inventory = new ArrayList<>();
        this.name = name;
        this.address = address;
        this.phone = phone;
        //How to deal with ArrayLists, particularly how to get info out of it
        //Dealership must be displayed through the first line
    }
}
