package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "src\\test\\resources\\features\\activities",
        dryRun = true,
        strict = false,
        tags = "@view_calender_event",
        plugin = {
                "html:target/default-report",
                // this line will generate jason report
                "json:target/cucumber.json"
        }
)
public class ActivitiesTestRunner {
}
