package Belajar.java.now.application;

import static Belajar.java.now.data.Application.PROCESSOR;
import static Belajar.java.now.data.Constant.*;
import Belajar.java.now.data.Country;
import Belajar.java.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1, 1, 1, 1, 1));
        Country.City city = new Country.City();
        city.setName("Subang");
        System.out.println(city.getName());

        System.out.println(PROCESSOR);
    }

}



