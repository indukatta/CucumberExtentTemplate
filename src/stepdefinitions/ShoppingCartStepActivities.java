package stepdefinitions;

import java.util.ArrayList;
import java.util.List;

import com.factory.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ShoppingListPage;

public class ShoppingCartStepActivities extends Driver {
	
	@Given("^launch application$")
    public void launchApplication(){
        createDriver();
    }

    @Given("^the user creates a new shopping list$")
    public void createShoppinglist(){
        shoppingListPage = new ShoppingListPage(driver);
        shoppingListPage.createNewListName("Fruits");
    }

    @When("^the user adds items to the shopping list$")
    public void addItemsToShoppingList(){
    	
    	List<String> items = new ArrayList<String>();
    	items.add("Strawberries");
    	items.add("Mangoes");
    	items.add("Apples");
    	items.add("Bananas");
    	
    	shoppingListPage.addItems(items);
    }

    
    @Given("^the user creates new  shopping list and adds items to the list$")
    public void createAndAddItemsToShoppingList(){
    	shoppingListPage.createNewListName("DairyProducts");
    	List<String> items = new ArrayList<String>();
    	items.add("Milk");
    	items.add("Yogurt");
    	items.add("Cheese");
    	items.add("Honey");
    	shoppingListPage.addItems(items);
    }
    
  
    @Then("^the user should be able to remove unwanted item$")
    public void removeItemFromList(){
    	shoppingListPage.removeItemFromList("DairyProducts", "Honey");
    }
    
    @Then("^sort and verify items in the list$")
    public void sortAndVerifyList() {
    	String[] expected = {"Apples","Bananas","Mangoes","Strawberries"};
    	shoppingListPage.sortAndVerifyItems("Fruits",expected);
    }

}