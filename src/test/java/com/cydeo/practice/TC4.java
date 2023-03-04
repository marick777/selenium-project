package com.cydeo.practice;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC4 extends TestBase {





    @BeforeMethod
    public void setupMethod(){
        //TC 4: As a User I should be able to see RİGHT label and LEFT label
        // 1- Open a Chrome browser
        // 2- Go to https://the-internet.herokuapp.com/
        driver.get("https://the-internet.herokuapp.com/");
    }

    @Test
    public void test(){
        // 3- Click Nested Frames
        WebElement nestedFrames = driver.findElement(By.xpath("//a[text()='Nested Frames']"));
        nestedFrames.click();
    /*
        //WebElement rightFrame = driver.findElement(By.xpath("//frame[@name='frame-right']"));
        //WebElement rightFrame = driver.findElement(By.xpath("//html//frame[@name='frame-right']"));
        //WebElement rightFrame = driver.findElement(By.xpath("(//frame)[3]"));
        //WebElement rightFrame = driver.findElement(By.name("frame-right"));


     */

        // 4- Verify the RİGHT label

        WebElement topFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
        driver.switchTo().frame(topFrame);

        WebElement rightFrame =driver.findElement(By.xpath("//frame[@name='frame-right']"));
        driver.switchTo().frame(rightFrame);



        WebElement rightFrameLabel = driver.findElement(By.xpath("//body[contains(text(), 'RIGHT')]"));


        Assert.assertTrue(rightFrameLabel.isDisplayed());

        // 5- Verify the LEFT label
        driver.switchTo().parentFrame();

        WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-left']"));

        driver.switchTo().frame(leftFrame);

        WebElement leftFrameLabel = driver.findElement(By.xpath("//body[contains(text(), 'LEFT')]"));

        Assert.assertTrue(leftFrameLabel.isDisplayed());



    }
}
