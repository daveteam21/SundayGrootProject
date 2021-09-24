@regression
Feature: Ebay Pushcart Icon Functionality

  Scenario: Checkout
    Given Go to cart ebay homepage
    When Click on Go to checkout
    When  Continue as guest
    Then Confirm and pay
