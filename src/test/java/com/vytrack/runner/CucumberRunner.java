package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com\\vytrack\\step_definitions",
        features = "src\\test\\resources\\features",
        dryRun = false,
        strict = false,
        tags = "@sales_manager",
        plugin = {
                "html:target/default-report",
                // this line will generate jason report
                "json:target/cucumber1.json",
                //generate failed test again run
                "rerun:target/rerun.txt"
        }
)
public class CucumberRunner {


}

