package com.cydeo.practice;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_iframe extends TestBase {

    //TC 1: As a User I should be able to see ‘Your content goes here.’ And ‘An iFrame containing the TinyMCE WYSIWYG Editor’
    //1- Open a Chrome browser
    //2- Go to https://the-internet.herokuapp.com/




    @Test
    public void t1_test(){

        driver.get("https://the-internet.herokuapp.com/");
        //3- Click iFrame
        WebElement frames = driver.findElement(By.linkText("Frames"));
        frames.click();
        WebElement iframes = driver.findElement(By.linkText("iFrame"));
        iframes.click();

        //4- Verify the ‘Your content goes here.’ label

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        //driver.switchTo().frame("mce_0_ifr");

        WebElement textLabel = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(textLabel.getText().equals("Your content goes here."));

        //5- Verify the header ‘An iFrame containing the TinyMCE WYSIWYG Editor’

        driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent();
        WebElement header = driver.findElement(By.tagName("h3"));
        //An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue((header.getText().equals("An iFrame containing the TinyMCE WYSIWYG Editor")));



    }

}
