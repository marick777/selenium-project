package com.cydeo.tests.day02_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {
    public static void main(String[] args) throws InterruptedException {


        //TC #4: Library verifications
        // 1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://library2.cybertekschool.com/login.html

        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        //PS: Locate username input box using “className” locator

        WebElement username = driver.findElement(By.className("form-control"));
        username.sendKeys("incorrect@email.com");

        //4. Enter password: “incorrect password”
        // Locate password input box using “id” locator

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        //Locate Sign in button using “tagName” locator
        WebElement signIn = driver.findElement(By.tagName("button"));
        signIn.click();

        Thread.sleep(2000);
        driver.close();


        //5. Verify: visually “Sorry, Wrong Email or Password" displayed



    }
}
