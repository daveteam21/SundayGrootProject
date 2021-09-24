package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayMenShirtsSteps {
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj= new EbaySearchResultActions();
	
@Given("^Open Ebay Homepages$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomePageActionsObj.loadEbayHomepage();
}
	

@When("^Search for Men Shirts$")
public void search_for_Men_Shirts() throws Throwable {
  EbayHomePageActionsObj.searchMenShirts();
  }

@Then("^Item list should have only Men Shirts related products$")
public void item_list_should_have_only_Men_Shirts_related_products() throws Throwable {
   EbaySearchResultActionsObj.verifyMenShirtsItems();
}

}

