Feature: ShoppingCart Activities
	Background: User creates a new shopping list with items
	Given launch application
		Given the user creates a new "Fruits" shopping list
		When the user adds items to the shopping list
		|Strawberries|
		|Mangoes|
		|Apples|
		|Bananas|

  Scenario: User  add and remove items from shopping list 
    Given the user creates a new "DairyProducts" shopping list
		When the user adds items to the shopping list
		|Milk|
		|Yogurt|
		|Cheese|
		|Honey|
    Then the user should be able to remove "Honey" from "DairyProducts" list
    
    Scenario: Sort items in the shopping list
 		Then sort and verify items in the list