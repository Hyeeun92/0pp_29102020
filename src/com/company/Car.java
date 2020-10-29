package com.company;

public class Car {

    private String manufacturer;

    //Constructor - gets called or invoke when you create instance of the class
    //always has the same name as the class
    public Car(String _manufacturer){
        manufacturer = _manufacturer;
        System.out.println("Car is created");
    }

    public String getManufacturer(){
        return manufacturer;
    }
    @Override
    public String toString(){
        return String.format("manufacturer" + manufacturer);
    }
}
