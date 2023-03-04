package com.cydeo.review.week4;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class ActionExample {

    @Test
    public void testhover(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.loginAsSalesManager();
        BrowserUtils.sleep(3);

        Actions actions = new Actions(Driver.getDriver());
        DashboardPage dashboardPage = new DashboardPage();

        List<WebElement> mainMenus = dashboardPage.main_menus;
        for (WebElement each_menu : mainMenus) {
            actions.moveToElement(each_menu).perform();
            BrowserUtils.sleep(1);
        }
        Driver.closeDriver();


    }

    @Test
    public void testScrollToElement(){
        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.loginAsSalesManager();
        BrowserUtils.sleep(3);

        Actions actions = new Actions(Driver.getDriver());

        WebElement element = Driver.getDriver().findElement(By.xpath("(//div[@class='widget-config-data'])[3]"));
        BrowserUtils.sleep(1);
        actions.scrollToElement(element).perform();
        BrowserUtils.sleep(1);
        Driver.closeDriver();
    }

    @Test
    public void testScrollByAmount(){

        Driver.getDriver().get("https://demoqa.com/text-box");
        Actions actions = new Actions(Driver.getDriver());

        for (int i = 0; i < 10; i++) {
            actions.scrollByAmount(0,25).perform();
            BrowserUtils.sleep(1);
        }

        for (int i = 0; i < 10; i++) {
            actions.scrollByAmount(0,-25).perform();
            BrowserUtils.sleep(1);
        }

        Driver.closeDriver();




    }
}
