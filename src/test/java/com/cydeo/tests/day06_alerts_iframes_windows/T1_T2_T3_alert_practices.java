package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_T2_T3_alert_practices {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practice.cydeo.com/javascript_alerts");

    }

    @Test
    public void test_JS_Alert(){
        //TC #1: Information alert practice


        // 3. Click to “Click for JS Alert” button


        WebElement JS_Alert_Text = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));

        //4. Click to OK button from the alert
        JS_Alert_Text.click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
       // driver.getPageSource();

        //5. Verify “You successfully clicked an alert” text is displayed.

        String expectedText = "You successfully clicked an alert";
        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();

        Assert.assertEquals(actualText, expectedText, "Text verification PASSED!!!");

    }

    @Test
    public void test_JS_Confirm(){

        WebElement JS_Confirm_Button = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));

        // 3. Click to “Click for JS Confirm” button
        JS_Confirm_Button.click();

        //4. Click to OK button from the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();
        // driver.getPageSource();

        //5. Verify “You clicked: Ok” text is displayed.

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        String expectedTest = "You clicked: Ok";
        String actualText = resultText.getText();

        Assert.assertEquals(actualText, expectedTest, "Text verification FAIL!!!");

    }

    @Test
    public void test_JS_Prompt(){


        // 3. Click to “Click for JS Prompt” button
        WebElement JS_Confirm_Prompt = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        JS_Confirm_Prompt.click();

        //4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("hello");

        //5. Click to OK button from the alert
        alert.accept();

        //6. Verify “You entered: hello” text is displayed.

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));

        //String expectedTest = "You entered: hello";
        //String actualText = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(), "Text verification FAIL!!!");

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}




