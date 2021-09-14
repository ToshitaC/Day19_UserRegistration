package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void validateMobile(String mobileNumber) {
        String mobilePattern = "^[1-9]+[0-9]+[/s\\-]?[1-9]{1}[0-9]{9}$";
        Pattern pattern = Pattern.compile(mobilePattern);
        Matcher matcher = pattern.matcher(mobileNumber);

        if (matcher.find())
            System.out.println(mobileNumber + " is valid");
        else
            System.out.println(mobileNumber + " is not valid");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mobileNumber = "";
        System.out.println("Enter the Mobile Number");
        mobileNumber = sc.nextLine();
        validateMobile(mobileNumber);//validation of MobileNumber
        sc.close();
    }

}