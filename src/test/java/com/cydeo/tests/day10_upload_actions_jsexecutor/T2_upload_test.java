package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_upload_test extends TestBase {

    @Test
    public void upload_test(){
        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        driver.get(ConfigurationReader.getProperty("uploadURL"));

        //2. Find some small file from your computer, and get the path of it.

        // 3. Upload the file.
        WebElement uploadBtn = driver.findElement(By.xpath("//input[@name='file']"));
        //BrowserUtils.sleep(3);
        uploadBtn.sendKeys("/Users/marickpro/Desktop/Selenium Cydeo/Day 10 - UPLOAD - ACTIONS - JSEXECUTOR/upload_file.txt");

        driver.findElement(By.xpath("//input[@id='file-submit']")).click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement uploadResultText = driver.findElement(By.xpath("//h3"));

        String actualResult = uploadResultText.getText();
        String expectedResult = "File Uploaded!";

        Assert.assertEquals(actualResult, expectedResult, "Result Text NOT match!!!");

    }
}
