Feature: Login page
  As a new onboarding customer
  I want to enter the prospect auth credentials
  So that I can proceed to business details section of the journey

  Scenario: The user should be able to continue the onboarding journey with prospect auth credentials
    Given the user opens the shopping cart application
    When the user creates a new shopping list with items
    Then the user should be able to proceed to business details section