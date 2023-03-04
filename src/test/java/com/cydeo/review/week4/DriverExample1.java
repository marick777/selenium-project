package com.cydeo.review.week4;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DriverExample1 {

    @Test
    public void test1(){
/*
        // First creating browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

 */
        // Second creating browser

        //WebDriverFactory.getDriver("chrome");
        //WebDriverFactory.getDriver("chrome");

        // Driver with singleton design pattern

        //Driver.getDriver();
        //Driver.getDriver();
    }

    @Test
    public void test2(){

        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("User1");
        WebElement userPassword = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        userPassword.sendKeys("UserUser123"+ Keys.ENTER);

        Driver.closeDriver();

    }

    @Test
    public void test3(){

        Driver.getDriver().get("https://qa3.vytrack.com/user/login");
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput']"));
        userName.sendKeys("User1");
        WebElement userPassword = Driver.getDriver().findElement(By.xpath("//input[@id='prependedInput2']"));
        userPassword.sendKeys("UserUser123"+ Keys.ENTER);

        Driver.closeDriver();


    }
}
