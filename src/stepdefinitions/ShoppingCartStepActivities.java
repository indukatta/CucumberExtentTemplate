package stepdefinitions;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.factory.Driver;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
import pageobjects.ShoppingListPage;

public class ShoppingCartStepActivities extends Driver {
	
	@Given("^launch application$")
    public void launchApplication(){
        createDriver();
    }

    @Given("^the user creates a new \"([^\"]*)\" shopping list$")
    public void createShoppinglist(String shoppingListName){
        shoppingListPage = new ShoppingListPage(driver);
        shoppingListPage.createNewListName(shoppingListName);
    }

    @When("^the user adds items to the shopping list$")
    public void addItemsToShoppingList(DataTable itemsList){
    	List<String> items = itemsList.asList(String.class);
    	shoppingListPage.addItems(items);
    }
  
    @Then("^the user should be able to remove \"([^\"]*)\" from \"([^\"]*)\" list$")
    public void removeItemFromList(String item, String listName){
    	shoppingListPage.removeItemFromList(listName, item);
    }
    
    @Then("^sort and verify items in the list$")
    public void sortAndVerifyList() {
    	String[] expected = {"Apples","Bananas","Mangoes","Strawberries"};
    	shoppingListPage.sortAndVerifyItems("Fruits",expected);
    }

}