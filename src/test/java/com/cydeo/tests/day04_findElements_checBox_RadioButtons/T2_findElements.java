package com.cydeo.tests.day04_findElements_checBox_RadioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class T2_findElements {
    public static void main(String[] args) {

        //TC #2: FindElements Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- Go to: https://practice.cydeo.com/abtest

        driver.get("https://practice.cydeo.com/abtest");


        //3- Locate all the links in the page.

        List<WebElement> allWebElements = driver.findElements(By.tagName("a"));
        //System.out.println("allWebElements = " + allWebElements);


        //4- Print out the number of the links on the page.

        System.out.println("allWebElements.size() = " + allWebElements.size());


        // 5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : allWebElements) {
            System.out.println("Text of links: "+each.getText());
            System.out.println("HREF attribute's value: " + each.getAttribute("href"));
        }







        driver.close();

    }
}
