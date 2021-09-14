package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void validateName(String firstName) {
        String NamePattern = "^[A-Z]{1}[a-zA-z]{2,}";
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.find())
            System.out.println(firstName + " is valid");
        else {
            System.out.println("First name starts with Capital letter and has minimum 3 characters.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        String lastName = "";

        System.out.println("Enter Firstname: ");
        firstName = sc.nextLine();
        validateName(firstName); //firstName method

        System.out.println("Enter Lastname: ");
        lastName = sc.nextLine();
        validateName(lastName); //lastName method
        sc.close();
    }

}