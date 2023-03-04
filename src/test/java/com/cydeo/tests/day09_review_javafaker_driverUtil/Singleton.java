package com.cydeo.tests.day09_review_javafaker_driverUtil;

public class Singleton {

    //1 - create private constructor

    private Singleton(){}

    //2 - create Private static String

    private static String word; // by default word value is null

    //3 - Utility method to return the 'private String' we just created

    public static String getWord(){

        if(word == null){
            System.out.println("First time call. Word object is null.");
            System.out.println("Assigning value to in now");
            word = "something";
        }else{
            System.out.println("Word already has a value.");
        }

        return word;
    }

}
