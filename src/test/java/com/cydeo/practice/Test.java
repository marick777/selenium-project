package com.cydeo.practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Test {
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

        driver.findElement(By.xpath("//span[@class='user-name']")).click();
        driver.findElement(By.xpath("//span[.='My Profile']")).click();




/*

    //3- Locate all the links in the page.
        //div[@id='profile-menu-filter']

    //List<WebElement> allWebElements = driver.findElements(By.xpath("//div[@class='menu-popup']"));
    //List<WebElement> allWebElements = driver.findElements(By.xpath("//div[@class='bx-desktop-appearance-tab']"));
    List<WebElement> allWebElements = driver.findElements(By.xpath("//div[@id='profile-menu-filter']"));
    //List<WebElement> allWebElements = driver.findElements(By.xpath("//td[@class='bx-im-fullscreen-popup-td bx-im-fullscreen-popup-td2']"));
        //System.out.println("allWebElements = " + allWebElements);


    //4- Print out the number of the links on the page.

        //System.out.println("allWebElements.size() = " + allWebElements.size());


    // 5- Print out the texts of the links.
    //6- Print out the HREF attribute values of the links
        for (WebElement each : allWebElements) {
        System.out.println("Text of links: "+each.getText());
        //System.out.println("HREF attribute's value: " + each.getAttribute("class"));
    }




 */

        WebElement general = driver.findElement(By.xpath("//a[@class='profile-menu-item profile-menu-item-active']"));
        //WebElement drive = driver.findElement(By.xpath("(//a[@href='/company/personal/user/592/disk/path/'])[5]"));
        WebElement drive = driver.findElement(By.xpath("(//a[contains(.,'Drive')])[7]"));
        //WebElement tasks = driver.findElement(By.xpath("(//a[@href='/company/personal/user/592/tasks/'])[3]"));
        WebElement tasks = driver.findElement(By.xpath("(//a[contains(.,'Tasks')])[4]"));
       // WebElement calendar = driver.findElement(By.xpath("(//a[@href='/company/personal/user/592/calendar/'])[5]"));
        WebElement calendar = driver.findElement(By.xpath("(//a[contains(.,'Calendar')])[6]"));
       // WebElement conversations = driver.findElement(By.xpath("(//a[@href='/company/personal/user/592/calendar/'])[5]"));
        WebElement conversations = driver.findElement(By.xpath("(//a[contains(.,'Conversations')])[2]"));


        System.out.println("general.getText() = " + general.getText());
        System.out.println("drive.getText() = " + drive.getText());
        System.out.println("tasks.getText() = " + tasks.getText());
        System.out.println("calendar.getText() = " + calendar.getText());
        System.out.println("conversations.getText() = " + conversations.getText());

        System.out.println("User Profile Options: "+general.getText()+" "+drive.getText()+" "+tasks.getText()+" "+calendar.getText()+" "+
                conversations.getText());


        //@FindBy(xpath = "//ul[contains(@class,'main-menu')]/li")
        //public List<WebElement> main_menus;

        //List<WebElement> profileMenu = driver.findElements(By.xpath("//div[@class='profile-menu-items']"));
        //List<WebElement> profileMenu = driver.findElements(By.xpath("//div[@id='profile-menu-filter']"));

       // System.out.println("profileMenu.size() = " + profileMenu.size());
       // for (WebElement eachModule : profileMenu) {
       //     System.out.println("Each Module: "+eachModule.getText());
      //  }


        driver.close();

}
}
