package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistration {
    public static void validateName(String name) {
        String NamePattern = "^[A-Z]{1}[a-zA-z]{2,}";
        Pattern pattern = Pattern.compile(NamePattern);
        Matcher matcher = pattern.matcher(name);
        if (matcher.find())
            System.out.println(name + " is valid");
        else {
            System.out.println("Name starts with Capital letter and has minimum 3 charachters.");
        }
    }

    //UC3: Checking Email valid or not
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

    //UC4: Checking Mobile Number Valid or not
    public static void validateMobile(String mobileNumber) {
        String mobilePattern = "^[1-9]+[0-9]+[/s\\-]?[1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(mobilePattern);
        Matcher matcher = pattern.matcher(mobileNumber);

        if (matcher.find())
            System.out.println(mobileNumber + " is valid");
        else
            System.out.println(mobileNumber + " is not valid");
    }

    public static void validatePassword(String password) {
        String passwordPattern = "[a-zA-Z0-9@_-#$%^&*]{8,}";
        Pattern pattern = Pattern.compile(passwordPattern);
        Matcher matcher = pattern.matcher(password);

        if (matcher.find()) {
            System.out.println(password + " is valid");
        } else {
            System.out.println(password + " is not valid");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        String email = "";
        String mobileNumber = "";
        String password = "";

        System.out.println("Enter Firstname: ");
        firstName = sc.nextLine();
        validateName(firstName); //validation of firstName

        System.out.println("Enter Lastname: ");
        lastName = sc.nextLine();
        validateName(lastName); //validation of lastName

        System.out.println("Enter email Id: ");
        email = sc.nextLine();
        validateEmail(email); //validation of email

        System.out.println("Enter the Mobile Number");
        mobileNumber = sc.nextLine();
        validateMobile(mobileNumber);//validation of MobileNumber

        System.out.println("Enter the password");
        password = sc.nextLine();
        validatePassword(password);//validation of Password
        sc.close();
    }

}