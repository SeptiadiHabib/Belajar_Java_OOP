package Belajar.java.now.application;

public class EqualsApp {
    public static void main(String[] args) {

        String first = "Septiadi";
        first = first + " " + "Habib";

        System.out.println(first);

        String second = "Septiadi Habib";
        System.out.println(second);

        System.out.println(first == second);
        System.out.println(first.equals(second));


    }
}
