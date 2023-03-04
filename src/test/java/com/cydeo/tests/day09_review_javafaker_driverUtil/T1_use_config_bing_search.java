package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T1_use_config_bing_search {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //TC #1: Bing search
        //1- Open a Chrome browser
        //2- Go to: https://bing.com
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.get(ConfigurationReader.getProperty("bingURL"));
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }


    @Test
    public void bingSearch(){

        //3- Write “apple” in search box

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);


        //4- Verify title:
        //Expected: apple - Search

        //BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver, ConfigurationReader.getProperty("searchValue") +" - Search");
    }
}




//Use `configuration.properties` for the following:
//1. The browser type
//2. The URL
//3. The search keyword
//4. Make title verification dynamic. If search value changes, title
//assertion should not fail.