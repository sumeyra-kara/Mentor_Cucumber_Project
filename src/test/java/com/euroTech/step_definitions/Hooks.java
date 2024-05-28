package com.euroTech.step_definitions;

import com.euroTech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before
    public void setUp() { // her senaryodan önce calisir
       Driver.get().manage().window().maximize();
       Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot=((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png","screenshot");
        }

        Driver.closeDriver();

    }
    @Before (value="@rosa",order = 1)
    public void setUpRosa() { // her senaryodan önce calisir
        //System.out.println("BEFORE METHOD ROSA");
    }

    @After(value = "@rosa",order = 1)
    public void tearDownRosa()  { // her senaryodan sonra calisir
        //System.out.println("AFTER METHOD ROSA");
    }






}
