package stepdefinitions;

import com.factory.Driver;
import common.library.CommonLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import pageobjects.ShoppingListPage;

import java.net.MalformedURLException;
import java.net.URL;

public class SetupWithProspectAuthCredentials extends Driver {




    @Given("^the user opens the shopping cart application$")
    public void user_clicks_createApplication(){
        createDriver();
        shoppingListPage = new ShoppingListPage(driver);

        System.out.println("Step 1: User clicks create application");
    }

    @When("^the user creates a new shopping list with items$")
    public void user_enters_username_passcode(){


        System.out.println("Step 2: User enters username and password");

        shoppingListPage = new ShoppingListPage(driver);

        String newListName = "Fruits";
        shoppingListPage.createNewListName(newListName);

    }

    @Then("^the user should be able to proceed to business details section$")
    public void user_clicks_submit(){
        System.out.println("Step 3: User clicks submit");
    }

}