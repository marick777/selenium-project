package com.cydeo.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class CRM_List {
    public static void main(String[] args) {

        //TC #2: FindElements Task
        //1- Open a Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- Go to: https://practice.cydeo.com/abtest

        driver.get("https://qa.ctissolutions.com/stream/");

        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk1@cybertekschool.com");
        driver.findElement(By.xpath("//input[@name='USER_PASSWORD']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[@class='login-btn']")).click();
        //driver.findElement(By.xpath("//span[@id='user-name']")).click();
        driver.findElement(By.xpath("//span[contains(., 'Chat and Calls')]")).click();
/*
        String mainHandle = driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        for (String eachWindow : driver.getWindowHandles()) {

            String newWindow = String.valueOf(driver.switchTo().window(eachWindow));
            System.out.println("Current title while switching windows: "+newWindow);
            driver.switchTo().window(newWindow);
        }



 */
        //WebElement newWindow = driver.findElement(By.xpath("//td[@class='bx-im-fullscreen-popup-td bx-im-fullscreen-popup-td2']"));

        //String newHandle = driver.getWindowHandle();
        //driver.switchTo().window(newHandle);
        //driver.switchTo().window("newWindow");

        WebElement message = driver.findElement(By.xpath("//div[@title='Message(s) ']"));
        WebElement notif = driver.findElement(By.xpath("//div[@title='Notifications']"));
        WebElement settings = driver.findElement(By.xpath("//div[@title='Settings']"));
        WebElement activity = driver.findElement(By.xpath("//div[@title='Activity Stream ']"));

        System.out.println("message.getText() = " + message.getAttribute("title"));
        System.out.println("notif.getText() = " + notif.getAttribute("title"));
        System.out.println("settings.getText() = " + settings.getAttribute("title"));
        System.out.println("activity.getText() = " + activity.getAttribute("title"));




/*

        //3- Locate all the links in the page.

        //List<WebElement> allWebElements = driver.findElements(By.xpath("//div[@class='menu-popup']"));
        //List<WebElement> allWebElements = driver.findElements(By.xpath("//div[@class='bx-desktop-appearance-tab']"));
        List<WebElement> allWebElements = driver.findElements(By.xpath("//div[@id='profile-menu-filter']"));
        //List<WebElement> allWebElements = driver.findElements(By.xpath("//td[@class='bx-im-fullscreen-popup-td bx-im-fullscreen-popup-td2']"));
        System.out.println("allWebElements = " + allWebElements);


        //4- Print out the number of the links on the page.

        System.out.println("allWebElements.size() = " + allWebElements.size());


        // 5- Print out the texts of the links.
        //6- Print out the HREF attribute values of the links
        for (WebElement each : allWebElements) {
            System.out.println("Text of links: \n"+each);
            System.out.println("HREF attribute's value: " + each.getAttribute("class"));
        }



 */









        driver.close();

    }
}
