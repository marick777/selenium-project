package com.cydeo.tests.day07_webTable_Utilities_javaFaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_CRM_Login_Task {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #4: Login scenario
        //1. Create new test and make setups
        //2. Goto:https://login1.nextbasecrm.com/
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


    @Test
    public void test1_crm_login(){
        //3. Enter valid username
        //USERNAME helpdesk1@cydeo.com helpdesk2@cydeo.com

        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        //username.sendKeys("helpdesk1@cydeo.com");
        username.sendKeys("helpdesk2@cydeo.com");
        //4. Enter valid password
        //PASSWORD UserUser UserUser

        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        password.sendKeys("UserUser");

        //5. Click to`LogIn`button

        driver.findElement(By.xpath("//input[@class='loginAsDriver-btn']")).click();


        //6. Verify title is as expected:
        // Expected: Portal
        BrowserUtils.verifyTitleContains(driver,"Portal");


    }

    @Test
    public void test2_crm_login(){
        //3. Enter valid username
        //USERNAME helpdesk1@cydeo.com helpdesk2@cydeo.com

        CRM_Utilities.login_crm(driver);


        //6. Verify title is as expected:
        // Expected: Portal
        BrowserUtils.verifyTitleContains(driver,"Portal");


    }

    @Test
    public void test3_crm_login(){
        //3. Enter valid username
        //USERNAME helpdesk1@cydeo.com helpdesk2@cydeo.com

        CRM_Utilities.login_crm(driver, "helpdesk1@cydeo.com", "UserUser");


        //6. Verify title is as expected:
        // Expected: Portal
        BrowserUtils.verifyTitleContains(driver,"Portal");


    }

}








