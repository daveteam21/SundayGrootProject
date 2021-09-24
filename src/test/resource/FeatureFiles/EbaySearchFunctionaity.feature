@regression
Feature: Ebay Search Functionality

  Scenario: Search for Shoes
    Given Open Ebay Homepage
    When Search for Shoes
    Then Item list should have only Shoes related products
    
   
 Scenario Outline: Search for different products
		Given Open Ebay Homepage
		When Search for specific "<Products>"
		Then Item list should have only specific "<Category>"


	Examples:
|Products			| Category   |
|Shirt			  | shirt      |
|Sweatpants	  | sweatpants |
|Hats	  		  | hats       |
	    
  
  