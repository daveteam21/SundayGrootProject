@regression
Feature: Ebay Brands Outine

Scenario Outline: Search for product with Brands
Given Open Ebay Homepage
When Search for specific "<Items>"
When Filter by "<Brands>"
Then Item list should be in "<Brands>"

Examples:
|Items  	|		Brands	  |
|Bag			|		Chanel		|
|Laptop		|		Apple		  |
|Shoe			|		Nike		  |