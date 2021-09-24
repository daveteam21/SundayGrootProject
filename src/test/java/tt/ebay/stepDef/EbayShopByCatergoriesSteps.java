package tt.ebay.stepDef;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbayShopByCatergoriesSteps {
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	  
	@When("^User selects category button$")
	public void user_selects_category_button() throws Throwable {
		EbayHomePageActionsObj.selectCategoryButton();
	}
	  
	@When("^User selects Fashion from Tab$")
	public void user_selects_Fashion_from_Tab() throws Throwable {
		EbayHomePageActionsObj.selectFashionButton();
	}

	@Then("^Verify Fashion filter$")
	public void verify_Fashion_filter() throws Throwable {
		 EbaySearchResultActionsObj.verifyFashionFilter();
	}

}