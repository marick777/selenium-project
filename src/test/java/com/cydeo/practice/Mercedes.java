package com.cydeo.practice;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Mercedes extends TestBase {

    @Test
    public void test(){

        driver.get("https://www.mercedes-benz.co.uk/passengercars.html?group=all&subgroup=all.saloon&view=BODYTYPE");

        WebElement shadowHost1 = driver.findElement(By.xpath("//cmm-cookie-banner[@settings-id='fph8XBqir']"));


        SearchContext shadowRoot1 = shadowHost1.getShadowRoot();

        shadowRoot1.findElement(By.cssSelector("div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > cmm-buttons-wrapper:nth-child(3) > div:nth-child(1) > div:nth-child(1) > button:nth-child(2)")).click();


        WebElement shadowHost2 = driver.findElement(By.xpath("//owc-stage[@class='webcomponent aem-GridColumn aem-GridColumn--default--12 owc-image-stage-host']"));

        SearchContext shadowRoot2 = shadowHost2.getShadowRoot();

        shadowRoot2.findElement(By.cssSelector(".owc-stage-cta-buttons__button.wb-button.wb-button--medium.wb-button--theme-dark.wb-button--large.wb-button--primary.owc-stage-cta-buttons__button--primary")).click();
    }

}
