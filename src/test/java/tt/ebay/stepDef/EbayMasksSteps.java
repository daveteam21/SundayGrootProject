package tt.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayMasksSteps {

	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@When("^Search for Masks$")
	public void search_for_Masks() throws Throwable {
		EbayHomePageActionsObj.searchMasks();
	}

	@Then("^Item list should have only Masks related products$")
	public void item_list_should_have_only_Masks_related_products() throws Throwable {
		EbaySearchResultActionsObj.verifyMasksItems();
	}
}