package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VytrackLoginPage {

    public VytrackLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement txt_userName;

    @FindBy(css = "#prependedInput2")
    public WebElement txt_userPassword;

    @FindBy(xpath = "//button[@id='_submit']")
    public WebElement btn_login;

    public void loginAsDriver(){
        txt_userName.sendKeys(ConfigurationReader.getProperty("driver_username"));
        txt_userPassword.sendKeys(ConfigurationReader.getProperty("driver_password"));
        btn_login.click();
    }

    public void loginAsSalesManager(){
        txt_userName.sendKeys(ConfigurationReader.getProperty("salesmanager_username"));
        txt_userPassword.sendKeys(ConfigurationReader.getProperty("salesmanager_password"));
        btn_login.click();
    }

    public void loginAsStoreManager(){
        txt_userName.sendKeys(ConfigurationReader.getProperty("storemanager_username"));
        txt_userPassword.sendKeys(ConfigurationReader.getProperty("storemanager_password"));
        btn_login.click();
    }

    public void login(String username, String password){
        txt_userName.sendKeys(username);
        txt_userPassword.sendKeys(password);
        btn_login.click();
    }


}
