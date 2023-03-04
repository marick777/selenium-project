package com.cydeo.tests.day11_POM_ExplicitWaits;

import com.cydeo.utilities.Driver;
import org.testng.annotations.Test;

public class Understanding_closeDriver_method {

    @Test
    public void test1(){
        Driver.getDriver().get("https://google.com");
        //verify something
        //Driver.getDriver().close();
        Driver.closeDriver();
    }

    @Test
    public void test2(){
        Driver.getDriver().get("https://google.com");
        //verify something else
        //Driver.getDriver().close();
        Driver.closeDriver();
    }

    @Test
    public void test3(){
        Driver.getDriver().get("https://google.com");
        //verify something completely different
        //Driver.getDriver().close();
        Driver.closeDriver();
    }
}
