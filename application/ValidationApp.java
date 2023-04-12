package Belajar.java.now.application;

import Belajar.java.now.data.LoginRequest;
import Belajar.java.now.eror.ValidationExeption;
import Belajar.java.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {

        LoginRequest loginRequest = new LoginRequest("Habib","Hello");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid");
        } catch (ValidationExeption exeption){
            System.out.println("Data Tidak Valid : " + exeption.getMessage());
        }
    }
}
