package com.cydeo.tests.day08_properies_config_reader;

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

public class T4_use_config_reader {
    //Use `configuration.properties` for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title assertion should not fail.
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #4: Google search
        //1- Open a chrome browser
        //2- Go to: https://google.com
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.get(ConfigurationReader.getProperty("googleURL"));

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void google_search_test() {


        // 3- Write “apple” in search box
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        // 4- Verify title:
        //Expected: apple - Google Search
/*
        String expectedTitle = "apple - Google Search";
        String actualTitle = driver.getTitle();


        Assert.assertEquals(actualTitle, expectedTitle);


 */

        //BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle(driver, ConfigurationReader.getProperty("searchValue") +" - Google Search");
    }

}


