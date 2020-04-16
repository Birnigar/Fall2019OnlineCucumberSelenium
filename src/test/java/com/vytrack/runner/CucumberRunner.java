package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "C:\\Users\\Admin\\IdeaProjects\\Fall2019OnlineCucumberSelenium\\src\\test\\resources\\features",
        dryRun = false,
        strict = true
)
public class CucumberRunner {


}
