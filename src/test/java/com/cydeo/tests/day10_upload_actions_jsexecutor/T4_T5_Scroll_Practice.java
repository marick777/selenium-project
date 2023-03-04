package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_T5_Scroll_Practice extends TestBase {

    @Test
    public void scroll_test1(){


        //TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/

        driver.get("https://practice.cydeo.com/");
        //3- Scroll down to “Powered by CYDEO”
        //Locate the "Cydeo" link
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));

        //4- Scroll using Actions class “moveTo(element)” method
        Actions actions = new Actions(driver);
        actions.moveToElement(cydeoLink).perform();






        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        // 2- Scroll back up to “Home” link using PageUP button
        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();
    }



}
