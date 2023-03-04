package com.cydeo.tests.day05_DynamicWebElements_TestNG_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_StaleElementReferenceExecution {
    public static void main(String[] args) {

        //TC #1: StaleElementReferenceException handling
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



        //2. Go to https://practice.cydeo.com/add_remove_elements/

        driver.get("https://practice.cydeo.com/add_remove_elements/");


        // 3. Click to “Add Element” button

        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementBtn.click();


        //4. Verify “Delete” button is displayed after clicking.

        WebElement deleteBtn = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteBtn.isDisplayed(), expecting true = " + deleteBtn.isDisplayed());


        //5. Click to “Delete” button.

        deleteBtn.click();


        //6. Verify “Delete” button is NOT displayed after clicking.

        try {
            System.out.println("deleteBtn.isDisplayed(), expecting false = " + deleteBtn.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("--> StaleElementReferenceException happened due to element being deleted from the page");
            System.out.println("Which concludes our test case --PASSING!!!--");
            System.out.println("deleteBtn.isDisplayed() = false");
        }
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
    }
}
