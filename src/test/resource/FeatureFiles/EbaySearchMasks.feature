@regression
Feature: Ebay Search Masks Functionality

  Scenario: Search for Masks
    Given Open Ebay Homepage
    When Search for Masks
    Then Item list should have only Masks related products
    
  
