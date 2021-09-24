/*package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayBrandSteps {

	private static final String Brands = null;
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		EbayHomePageActionsObj.loadEbayHomepage();
	}

	@When("^Search for specific \"([^\"]*)\"$")
	public void search_for_specific(String Items) throws Throwable {
		EbayHomePageActionsObj.clickBrands(Items);
	}

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String Brands) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		EbayHomePageActionsObj.clickBrands(Brands);

	}

	
	@Then("^Item list should be in \"([^\"]*)\"$")
	public void item_list_should_be_in(String Brands) throws Throwable {
		EbaySearchResultActionsObj.verifyBrands(Brands);

	}
}
*/