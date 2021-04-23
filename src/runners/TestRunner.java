package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "projectfeatures",
        plugin = {"pretty",
        "json:target/cucumber_json_reports/home-page.json",
//        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:target/cucumber-report.json",
        "html:target/home-page-html"},
        glue = {"stepdefinitions", "src.com.factory.hooks"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
