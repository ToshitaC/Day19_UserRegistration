package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void validateEmail(String Email) {
        String emailPattern = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"; // Pattern for Email
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher match = pattern.matcher(Email);
        if (match.find()) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email is invalid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = "";
        System.out.println("Enter email Id: ");
        email = sc.nextLine();
        validateEmail(email); //email method
        sc.close();
    }

}