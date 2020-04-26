package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "src\\test\\resources\\features\\activities",
        dryRun = false,
        strict = false,
        tags = "@view_calender_events",
        plugin = {
                "html:target/default-report",
                // this line will generate jason report
                "json:target/cucumber2.json"
        }
)
public class ActivitiesTestRunner {
}
