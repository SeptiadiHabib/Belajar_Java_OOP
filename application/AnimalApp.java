package Belajar.java.now.application;

import Belajar.java.now.data.Animal;
import Belajar.java.now.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
    }
}
