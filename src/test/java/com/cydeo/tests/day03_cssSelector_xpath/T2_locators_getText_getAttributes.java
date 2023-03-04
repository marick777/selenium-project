package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_locators_getText_getAttributes {
    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/

        driver.get("https://login1.nextbasecrm.com/");


        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer



        String expectedRememberMeMessage = "Remember me on this computer";
        String actualRememberMeMessage = driver.findElement(By.className("login-item-checkbox-label")).getText();

        if(actualRememberMeMessage.equals(expectedRememberMeMessage)){
            System.out.println("Remember Me text verification PASSED!!!");
        }else {
            System.err.println("Remember Me text verification FAIL!!!");
        }


        // 4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        String expectedForgotPasswordText = "FORGOT YOUR PASSWORD?";

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));
        String actualForgotPasswordText = forgotPasswordLink.getText();

        if(actualForgotPasswordText.equals(expectedForgotPasswordText)){
            System.out.println("FPT verification PASSED!!!");
        }else{
            System.err.println("FPT verification FAIL!!!");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedInHref = "forgot_password=yes";
        String actualHrefValue = forgotPasswordLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("HREF attribute value is as EXPECTED. PASS!!!");
        }else{
            System.err.println("HREF attribute value is NOT as EXPECTED. FAIL!!!");
        }
        driver.close();
        //PS: Inspect and decide which locator you should be using to locate web elements.
    }
}
