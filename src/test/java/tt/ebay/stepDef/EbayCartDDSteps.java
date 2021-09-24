package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCartDdPageActions;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayCartDDSteps {

	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	EbayCartDdPageActions EbayCartDdPageActionsObj = new EbayCartDdPageActions();
	
	@Given("^Open Ebay Hompage$")
	public void open_Ebay_Hompage() throws Throwable {
			EbayHomePageActionsObj.loadEbayHomepage();

	}

	@When("^Search for shirt$") 
	public void search_for_shirt() throws Throwable {
		EbayHomePageActionsObj.searchShirts();
		
	}

	@When("^Select first shirt on item list$")
	public void select_first_shirt_on_item_list() throws Throwable {
		EbaySearchResultActionsObj.selectItem();
		
	}

	@When("^Select size$")
	public void select_size() throws Throwable {
		EbayCartDdPageActionsObj.selectSizeFromDd();

	}

	@When("^Select shade$")
	public void select_shade() throws Throwable {
		EbayCartDdPageActionsObj.selectShadeFromDd();

	}

	@Then("^Add to shopping cart$")
	public void add_to_shopping_cart() throws Throwable {
		EbayCartDdPageActionsObj.addToCart();

	}
}