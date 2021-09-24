
Feature: Ebay Search Shirts Functionality

  Scenario: Search for MenShirts
    Given Open Ebay Homepages
    When Search for Men Shirts
    Then Item list should have only Men Shirts related products
    
  
