package com.bridgelabz;

import java.util.regex.Pattern;
/**
 * 
 * Java provides an anotation @FunctionalInterface,
 * which is used to declare an interface as functional interface.
 */
@FunctionalInterface //It is optional
interface DataValidator{
    boolean validator(String pattern, String message);
}
/**
 * Creating a UserRegistrationLambda class & define Pattern
 * main method() validate the given string is true or false
 */
public class UserRegistrationLambda {
    private static final String FIRST_NAME = "^[A-Z][a-z]{3,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{3,}$";
    private static final String EMAIL = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})$";
    private static final String PHONE_NUMBER = "^[0-9]{2}[ ][0-9]{10}";
    private static final String PASSWORD ="^^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}$";

    public static void main(String[] args) {
        DataValidator validate = (String pattern, String message) -> Pattern.matches(pattern, message);
        System.out.println("FirstName is "+ validate.validator(FIRST_NAME, "Rushikesh"));
        System.out.println("LastName is " + validate.validator(LAST_NAME, "Bhandare"));
        System.out.println("EmailId is " + validate.validator(EMAIL, "rushikesh123@gmail.com"));
        System.out.println("PhoneNumber is " + validate.validator(PHONE_NUMBER, "91 7743928819"));
        System.out.println("password is " + validate.validator(PASSWORD, "rushikesh@1234"));
    }
}
