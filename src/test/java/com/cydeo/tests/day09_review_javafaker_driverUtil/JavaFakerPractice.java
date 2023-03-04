package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {



    @Test
    public void test1(){

        //create Java Faker object

        Faker faker = new Faker();

        // Print out a random first name using Java faker

        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        // Print out a random last name using Java faker

        System.out.println("faker.name.lastName() = " + faker.name().lastName());

        // Print out a random full name using Java faker

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        //faker city

        System.out.println("faker.address().city() = " + faker.address().city());

        // zip code

        System.out.println("faker.address().zipCode() = " + faker.address().zipCode());

        //faker address

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        // generate RANDOM digits
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("773-###-####"));

        // generate RANDOM letters

        System.out.println("faker.letterify(\"???-???-???\") = " + faker.letterify("???-???-???"));

        System.out.println("faker.bothify(\"#??####??###??#?#?\") = " + faker.bothify("#??####??###??#?#?"));

        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact());
        System.out.println("faker.muhtar().fact() = " + faker.chuckNorris().fact().replaceAll("Chuck Norris", "Muhtar"));


    }
}
