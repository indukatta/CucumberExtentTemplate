package com.factory.hooks;

import com.factory.BaseUtil;
import com.factory.Constants;
import io.cucumber.java.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.File;
import io.cucumber.java.Before;

/**
 * Created by Karthik on 31/01/2019.
 */

public class Hooks {
//
//    @Before
//    public void InitializeTest(Scenario scenario) {
////        base.scenarioDef = base.features.createNode(scenario.getName());
////        WebDriverManager.chromedriver().setup();
////        ChromeOptions chromeOptions = new ChromeOptions();
////        chromeOptions.addArguments("--headless");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("['start-maximized']");
//        File file = new File("C:\\selenium\\chromedriver.exe");
//        ChromeDriverService service = new ChromeDriverService.Builder()
//                .usingDriverExecutable(file)
//                .usingAnyFreePort()
//                .build();
//        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
//        Constants.driver = new ChromeDriver(service, chromeOptions);
//    }


    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic goes here
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : MOCK");
        Constants.driver.quit();
    }

    @BeforeStep
    public void BeforeEveryStep(Scenario scenario) {
        System.out.println("Before every step " + scenario.getId());
    }

    @AfterStep
    public void AfterEveryStep(Scenario scenario) throws NoSuchFieldException, IllegalAccessException {
        //System.out.println("Before every step " + stepTestStep.getId());
    }

}
