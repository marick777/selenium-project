package com.cydeo.tests.day04_findElements_checBox_RadioButtons;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_Practice {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        //a."Home" link
        //cssSelector 2 different locators

        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[href='/']"));

        //xpath locator 2 different locators
        WebElement homeLink3 = driver.findElement(By.xpath("//a[@href='/']"));
        WebElement homeLink4 = driver.findElement(By.xpath("//a[@class='nav-link']"));

        //b. "Forgot password" header
        //cssSelector 1  locator
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));
        //xpath locator 1  locator
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));





        //c. "E-mail" text
        //cssSelector 2 different locators
        WebElement emailText1 = driver.findElement(By.cssSelector("label[for='email']"));
        //xpath locator 2 different locators
        WebElement emailText2 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailText3 = driver.findElement(By.xpath("//label[.='E-mail']"));



        //d. E-mail input box
        //cssSelector 2 different locators
        WebElement emailInputBox1 = driver.findElement(By.cssSelector("input[name='email']"));
        WebElement emailInputBox2 = driver.findElement(By.cssSelector("input[type='text']"));
        //xpath locator 2 different locators
        WebElement emailInputBox3 = driver.findElement(By.xpath("//input[@name='email']"));
        //tagName[contains(@attribute, 'value')]
        WebElement emailInputBox4 = driver.findElement(By.xpath("//input[contains(@pattern, '[a-z0-9._%+-]+@')]"));



        //e. "Retrieve password" button
        //cssSelector 2 different locators
        WebElement retrievePassword1 = driver.findElement(By.cssSelector("button[id='form_submit']"));
        WebElement retrievePassword2 = driver.findElement(By.cssSelector("button[class='radius']"));
        //xpath locator 2 different locators
        WebElement retrievePassword3 = driver.findElement(By.xpath("//button[@id='form_submit']"));
        WebElement retrievePassword4 = driver.findElement(By.xpath("//button[@class='radius']"));



        //f. "Powered by Cydeo" text
        //cssSelector 1 locator
        WebElement PoweredByCydeoTest1 = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        //xpath locator 1 locator
        WebElement PoweredByCydeoTest2 = driver.findElement(By.xpath("//div[@style='text-align: center;']"));


        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("emailText1.isDisplayed() = " + emailText1.isDisplayed());
        System.out.println("emailInputBox1.isDisplayed() = " + emailInputBox1.isDisplayed());
        System.out.println("retrievePassword1.isDisplayed() = " + retrievePassword1.isDisplayed());
        System.out.println("PoweredByCydeoTest1.isDisplayed() = " + PoweredByCydeoTest1.isDisplayed());


        //cssSelector 2 different locators
        //xpath locator 2 different locators
        driver.close();
    }
}
