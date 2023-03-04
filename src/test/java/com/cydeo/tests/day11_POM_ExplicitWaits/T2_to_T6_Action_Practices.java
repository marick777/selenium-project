package com.cydeo.tests.day11_POM_ExplicitWaits;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class T2_to_T6_Action_Practices extends TestBase {

    @BeforeMethod
    public void setupMethod(){

        //1. Go to https://practice.cydeo.com/drag_and_drop_circles
        driver.get("https://practice.cydeo.com/drag_and_drop_circles ");


    }

    @Test
    public void test2(){
        //TC2 #: Drag and drop default value verification


        //2. Verify big circle default text is as below.
        WebElement bigCircle = driver.findElement(By.xpath("//div[@id='droptarget']"));

        //3. Assert:
        //-Text in big circle changed to: “Drag the small circle here.”
        String expectedCircleDefaultText = "Drag the small circle here.";
        String actualCircleDefaultText = bigCircle.getText();

        //assertEquals(actualCircleDefaultText, expectedCircleDefaultText);
        assertTrue(actualCircleDefaultText.equals(expectedCircleDefaultText));


    }

    @Test
    public void test3(){
        //TC3 #: Drag and drop into the big circle

        //Locating the circle web elements
        WebElement bigCircle = driver.findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = driver.findElement(By.xpath("//div[@id='draggable']"));

        //Creating the Actions object to do uor actions
        Actions actions = new Actions(driver);

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .release()
                .perform();


        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String expectedCircleText = "You did great!";
        String actualCircleText = bigCircle.getText();

        //assertEquals(actualCircleDefaultText, expectedCircleDefaultText);
        assertTrue(actualCircleText.equals(expectedCircleText));

    }

    @Test
    public void test4(){
        //TC4 #: Click and hold

        //Locating the circle web elements
        WebElement bigCircle = driver.findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = driver.findElement(By.xpath("//div[@id='draggable']"));

        //Creating the Actions object to do uor actions
        Actions actions = new Actions(driver);

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));
        //2. Click and hold the small circle.
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(cydeoLink)
                .pause(1000)
                .perform();
        //3. Assert:
        //-Text in big circle changed to: “Drop here.”
        String expectedCircleText = "Drop here.";
        String actualCircleText = bigCircle.getText();

        //assertEquals(actualCircleDefaultText, expectedCircleDefaultText);
        assertTrue(actualCircleText.equals(expectedCircleText));


    }

    @Test
    public void test5(){
        //TC5 #: Drag and drop outside of the big circle

        //Locating the circle web elements
        WebElement bigCircle = driver.findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = driver.findElement(By.xpath("//div[@id='draggable']"));

        //Creating the Actions object to do uor actions
        Actions actions = new Actions(driver);

        //2. Drag and drop the small circle to bigger circle.
        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        //2. Drag and drop the small circle to bigger circle.
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(cydeoLink)
                .pause(1000)
                .release()
                .perform();
        //3. Assert:
        //-Text in big circle changed to: “Try again!”
        String expectedCircleText = "Try again!";
        String actualCircleText = bigCircle.getText();

        //assertEquals(actualCircleDefaultText, expectedCircleDefaultText);
        assertTrue(actualCircleText.equals(expectedCircleText));


    }

    @Test
    public void test6(){

        //TC6 #: Drag and hover

        //Locating the circle web elements
        WebElement bigCircle = driver.findElement(By.xpath("//div[@id='droptarget']"));
        WebElement smallCircle = driver.findElement(By.xpath("//div[@id='draggable']"));

        //Creating the Actions object to do uor actions
        Actions actions = new Actions(driver);


        //actions.dragAndDrop(smallCircle, bigCircle).perform();
        //2. Drag the small circle on top of the big circle, hold it, and verify.
        WebElement cydeoLink = driver.findElement(By.linkText("CYDEO"));
        actions.clickAndHold(smallCircle)
                .pause(1000)
                .moveToElement(bigCircle)
                .pause(1000)
                .perform();
        //3. Assert:
        //-Text in big circle changed to: “Now drop...”
        String expectedCircleText = "Now drop...";
        String actualCircleText = bigCircle.getText();

        //assertEquals(actualCircleDefaultText, expectedCircleDefaultText);
        assertTrue(actualCircleText.equals(expectedCircleText));







    }



}









