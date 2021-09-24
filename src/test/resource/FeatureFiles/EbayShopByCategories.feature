Feature: Ebay Shop By Categories

  Scenario: User able to shop by categories.

 
    Given Open Ebay Homepages
    When User selects category button
    When User selects Fashion from Tab
    Then Verify Fashion filter
    
  
  

