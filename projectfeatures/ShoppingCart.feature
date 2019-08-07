Feature: ShoppingCart Activities
	Background: User creates a new shopping list with items
	Given launch application
		Given the user creates a new shopping list
		When the user adds items to the shopping list

  Scenario: User can add and remove items from shopping list
    Given the user creates new  shopping list and adds items to the list
    Then the user should be able to remove unwanted item
    
    Scenario: Sort items in the shopping list
 		Then sort and verify items in the list