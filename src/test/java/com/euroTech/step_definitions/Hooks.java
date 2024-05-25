package com.euroTech.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp() { // her senaryodan önce calisir
        System.out.println("BEFORE Scenario");
    }

    @After
    public void tearDown()  { // her senaryodan sonra calisir
        System.out.println("AFTER Scenario");
    }

    @Before (value="@rosa",order = 1)
    public void setUpRosa() { // her senaryodan önce calisir
        System.out.println("BEFORE METHOD ROSA");
    }

    @After(value = "@rosa",order = 1)
    public void tearDownRosa()  { // her senaryodan sonra calisir
        System.out.println("AFTER METHOD ROSA");
    }




}
