package com.cydeo.tests.day06_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class T6_T7_T8_Dropdowns {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void dropdown_task6() throws InterruptedException {
        //TC #6: Selecting date on dropdown and verifying
        // 1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

        //3. Select “December 1st, 1933” and verify it is selected.
        //Locate dropdowns and pass them in Select object constructor

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        //Select year using : visible text
        //Thread.sleep(2000);
        yearDropdown.selectByVisibleText("1933");

        // Select month using : value attribute
        //Thread.sleep(2000);
        monthDropdown.selectByValue("11");

        // Select day using : index number
        //Thread.sleep(2000);
        dayDropdown.selectByIndex(0);

        //create expected values
        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        //getting actual values from browser
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        // creating Assertions

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

    }

    @Test
    public void dropdown_task7() throws InterruptedException {
        //TC #7: Selecting state from State dropdown and verifying result
        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        //Locate dropdowns and pass them in Select object constructor

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));




        //Use all Select options. (visible text, value, index)
        //3. Select Illinois
        //Select state using : visible text
        //Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Illinois");


        //4. Select Virginia
        // Select state using : value attribute
        //Thread.sleep(2000);
        stateDropdown.selectByValue("VA");


        //5. Select California
        // Select state using : index number
        //Thread.sleep(2000);
        stateDropdown.selectByIndex(5);


        //6. Verify final selected option is California.
        String expectedOptionText = "California";
        String actualOptionText = stateDropdown.getFirstSelectedOption().getText();


        Assert.assertEquals(actualOptionText, expectedOptionText,"State Dropdown value is not as expected!");

    }

    @Test
    public void dropdown_task8() throws InterruptedException {
        //TC #8: Selecting value from non-select dropdown

        //2. Go to https://practice.cydeo.com/dropdown

        driver.get("https://practice.cydeo.com/dropdown");


        // 3. Click to non-select dropdown

        WebElement websiteDropdown = driver.findElement(By.linkText("Dropdown link"));
        //Thread.sleep(1000);
        websiteDropdown.click();
        //Thread.sleep(1000);
        //4. Select Facebook from dropdown

        WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
        //Thread.sleep(1000);
        facebookLink.click();
        //Thread.sleep(1000);

        //5. Verify title is “Facebook - Log In or Sign Up”
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle, expectedTitle, "Titles are not equal!!!");
    }




    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
