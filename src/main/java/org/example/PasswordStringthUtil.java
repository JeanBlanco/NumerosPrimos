package org.example;

public class PasswordStringthUtil {
    public  enum PaswordStringth {
        WEAK, MEDIUM, STRONG
    }
    public  static PaswordStringth getPaswordStringthUtil(String password){
        if (password.length() < 8 || password.matches("[0-9]+")
                || password.matches("[a-z]+")){
            return PaswordStringth.WEAK;
        }

        if (password.matches("[0-9a-z]+"))
            return PaswordStringth.MEDIUM;

        return PaswordStringth.STRONG;
    }

}
