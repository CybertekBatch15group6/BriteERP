package com.brite.stepDefinitions;

import com.brite.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){

        System.out.println("Test setup");
        Driver.getDriver().manage().window().maximize();

    }

    @After
    public void tearDown(Scenario scenario){
        //how to check if scenario failed
        if(scenario.isFailed()){

            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            //attach ss to the report if it fails
            scenario.embed(image,"image/png",scenario.getName());
        }
        System.out.println("Test clean up");
        Driver.closeDriver();

    }
}
