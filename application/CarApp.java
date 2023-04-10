package Belajar.java.now.application;

import Belajar.java.now.data.Avanza;
import Belajar.java.now.data.Car;

public class CarApp {
    public static void main(String[] args) {

        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
