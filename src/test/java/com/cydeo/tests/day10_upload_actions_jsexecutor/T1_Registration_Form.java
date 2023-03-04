package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form extends TestBase {

    @Test
    public void registration_form_test(){
        //TC#1: Registration form confirmation
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form

        //Driver.getDriver().get(ConfigurationReader.getProperty("env"));

        driver.get(ConfigurationReader.getProperty("env1"));
        Faker faker = new Faker();
        //3. Enter first name

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        //BrowserUtils.sleep(2);
        firstName.sendKeys(faker.name().firstName());

        //4. Enter last name
        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        //BrowserUtils.sleep(2);
        lastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        //BrowserUtils.sleep(2);
        userName.sendKeys("username");

        //6. Enter email address
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        //BrowserUtils.sleep(2);
        email.sendKeys(faker.internet().emailAddress());

        //7. Enter password
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        //BrowserUtils.sleep(2);
        password.sendKeys(faker.internet().password());

        //8. Enter phone number
        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        //BrowserUtils.sleep(2);
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement genderRadioBtn = driver.findElement(By.xpath("//input[@value='male']"));
        //BrowserUtils.sleep(2);
        genderRadioBtn.click();

        //10.Enter date of birth
        WebElement DOB = driver.findElement(By.xpath("//input[@name='birthday']"));
        //BrowserUtils.sleep(2);
        DOB.sendKeys(faker.numerify("01/05/198#"));


        //11.Select Department/Office
        Select select = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        //BrowserUtils.sleep(2);
        select.selectByValue("DE");
        //BrowserUtils.sleep(5);

        //12.Select Job Title
        select = new Select(driver.findElement(By.xpath("//select[@name='job_title']")));
        //BrowserUtils.sleep(2);
        select.selectByVisibleText("SDET");

        //13.Select programming language from checkboxes
        driver.findElement(By.xpath("//input[@value='java']")).click();
        //BrowserUtils.sleep(2);

        //14.Click to sign up button
        driver.findElement(By.xpath("//button[@id='wooden_spoon']")).click();
        //BrowserUtils.sleep(2);

        //15.Verify success message “You’ve successfully completed registration.” is
        //displayed.
        //BrowserUtils.sleep(2);
        WebElement registrationText = driver.findElement(By.xpath("//p"));

        String actualText = registrationText.getText();
        //String expectedText = "You’ve successfully completed registration!";
        String expectedText = "You've successfully completed registration!";

        Assert.assertEquals(actualText, expectedText, "Registration Message NOT matching!!!");






    }




}
