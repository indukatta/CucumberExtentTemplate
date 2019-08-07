package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(features= "projectfeatures",
            glue="stepdefinitions")
    public class TestRunner {
    }

