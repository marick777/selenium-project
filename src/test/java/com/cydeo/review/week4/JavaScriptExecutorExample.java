package com.cydeo.review.week4;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutorExample {


    //scroll down

    @Test
    public void testScrollDown() {
/*
        Driver.getDriver().get("https://demoqa.com/text-box");
        Actions actions = new Actions(Driver.getDriver());

        for (int i = 0; i < 10; i++) {
            actions.scrollByAmount(0,25).perform();
            BrowserUtils.sleep(1);
        }

 */

        Driver.getDriver().get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 15)");
            BrowserUtils.sleep(1);

        }
        Driver.closeDriver();
    }


    //scroll up
    @Test
    public void testScrollUp() {
/*
        Driver.getDriver().get("https://demoqa.com/text-box");
        Actions actions = new Actions(Driver.getDriver());

        for (int i = 0; i < 10; i++) {
            actions.scrollByAmount(0,25).perform();
            BrowserUtils.sleep(1);
        }

 */

        Driver.getDriver().get("https://demoqa.com/text-box");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, 15)");
            BrowserUtils.sleep(1);
        }

        for (int i = 0; i < 10; i++) {
            js.executeScript("window.scrollBy(0, -15)");
            BrowserUtils.sleep(1);
        }
        Driver.closeDriver();
    }


    //scroll to element

    @Test
    public void testScrollToElement() {
/*
        Driver.getDriver().get("https://demoqa.com/text-box");
        Actions actions = new Actions(Driver.getDriver());

        for (int i = 0; i < 10; i++) {
            actions.scrollByAmount(0,25).perform();
            BrowserUtils.sleep(1);
        }

 */

        Driver.getDriver().get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement element = Driver.getDriver().findElement(By.xpath("//body/div[@id='fixedban']/div/div[1]"));
        BrowserUtils.sleep(1);

        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }


        //scroll to top

    @Test
    public void testScrollToTop(){
        Driver.getDriver().get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        WebElement element = Driver.getDriver().findElement(By.xpath("//body/div[@id='fixedban']/div/div[1]"));
        BrowserUtils.sleep(1);

        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.sleep(1);
        Driver.closeDriver();

    }


        //scroll to bottom


        //click with JavaScript

    }


