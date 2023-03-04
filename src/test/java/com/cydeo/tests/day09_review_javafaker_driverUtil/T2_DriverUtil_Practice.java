package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class T2_DriverUtil_Practice {

/*
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //TC #1: Bing search
        //1- Open a Chrome browser
        //2- Go to: https://bing.com
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));

    }


 */








    @Test
    public void bingSearch() {
        //Driver.getDriver() ---> will return me the "driver"
        //instead of writing "driver" from now on, we will write Driver.getDriver()
        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));
        //3- Write “apple” in search box

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);


        //4- Verify title:
        //Expected: apple - Search

        //BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(Driver.getDriver(), ConfigurationReader.getProperty("searchValue") + " - Search");
    }

    @Test
    public void bingSearch2() {
        //Driver.getDriver() ---> will return me the "driver"
        //instead of writing "driver" from now on, we will write Driver.getDriver()
        Driver.getDriver().get(ConfigurationReader.getProperty("bingURL"));
        //3- Write “apple” in search box

        WebElement searchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);


        //4- Verify title:
        //Expected: apple - Search

        //BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(Driver.getDriver(), ConfigurationReader.getProperty("searchValue") + " - Search");
    }

    @AfterMethod
    public void tearDownMethod(){
        //We won't be using selenium's quit method directly anymore.

        //Driver.getDriver().quit(); --> no more using this method

        // We will use Driver.closeDriver() method

        Driver.closeDriver();
    }
}
