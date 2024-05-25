package com.euroTech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/euroTech/step_definitions",
        dryRun = false,
        tags = "@regression"
)

public class CukesRunner {
}
