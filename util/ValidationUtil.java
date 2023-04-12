package Belajar.java.now.util;

import Belajar.java.now.data.LoginRequest;
import Belajar.java.now.eror.ValidationExeption;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationExeption{
        if (loginRequest.username() == null){
            throw new ValidationExeption("Username is null");
        } else if (loginRequest.username().isBlank()) {
            throw new ValidationExeption("Username is blank");
        }else if (loginRequest.password() == null) {
            throw new ValidationExeption("Password is null");
        }else if (loginRequest.password().isBlank()) {
            throw new ValidationExeption("Password is blank");
        }
    }
}
