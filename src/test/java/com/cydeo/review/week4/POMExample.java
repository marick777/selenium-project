package com.cydeo.review.week4;

import com.cydeo.pages.VytrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class POMExample {

    @Test
    public void driver_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.loginAsDriver();
        Driver.closeDriver();

    }

    @Test
    public void salesmanager_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));

        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.loginAsSalesManager();
        Driver.closeDriver();

    }

    @Test
    public void login_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("vytrack.url"));
        VytrackLoginPage vytrackLoginPage = new VytrackLoginPage();
        vytrackLoginPage.login("User1", "UserUser123");
        Driver.closeDriver();

    }


}
