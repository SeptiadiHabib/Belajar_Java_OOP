package Belajar.java.now.application;

import Belajar.java.now.data.City;

public class LocationApp {
    public static void main(String[] args) {
       // var location = new Location(); // ERROR
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
