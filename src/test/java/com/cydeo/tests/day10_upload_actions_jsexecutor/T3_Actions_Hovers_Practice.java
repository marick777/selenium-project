package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hovers_Practice extends TestBase {

    @Test
    public void hovering_test(){

        //TC #3: Hover Test
        //1. Go to https://practice.cydeo.com/hovers
        driver.get("https://practice.cydeo.com/hovers");

        //Locating all the images here

        WebElement image1 = driver.findElement(By.xpath("(//img)[1]"));
        WebElement image2 = driver.findElement(By.xpath("(//img)[2]"));
        WebElement image3 = driver.findElement(By.xpath("(//img)[3]"));

        //Locate all the "user" headers here
        WebElement user1 = driver.findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement user2 = driver.findElement(By.xpath("//h5[text()='name: user2']"));
        WebElement user3 = driver.findElement(By.xpath("//h5[text()='name: user3']"));

        //To be able to hover on image, we need to create Actions class object, and pass "driver" in the constructor
        Actions actions = new Actions(driver);

        // 2. Hover over to first image
        actions.moveToElement(image1).perform();

        //3. Assert:
        //a. “name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());


        // 4. Hover over to second image
        actions.moveToElement(image2).perform();

        //5. Assert:
        //a. “name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());


        // 6. Hover over to third image
        actions.moveToElement(image3).perform();

        //7. Confirm:
        //a. “name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());






    }

}
