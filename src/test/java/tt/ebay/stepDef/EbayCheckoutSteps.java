/*package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayCheckoutPageActions;
import tt.ebay.pageAction.EbayCheckoutResultActions;

public class EbayCheckoutSteps {
	
	
	EbayCheckoutPageActions EbayCheckoutPageActionsObj = new EbayCheckoutPageActions() ;
	EbayCheckoutResultActions EbayCheckoutResultActionsObj = new EbayCheckoutResultActions();


	
	@Given("^Click on the Pushcart Icon$")
	public void click_on_the_Pushcart_Icon() throws Throwable {
		EbayCheckoutPageActionsObj.loadEbayCheckoutpage();
	}
	   

	@When("^Click on Go to checkout$")
	public void click_on_Go_to_checkout() throws Throwable {
		EbayCheckoutPageActionsObj.clickCheckoutPage();
		
	   
	}

	@Then("^confirm and pay$")
	public void confirm_and_pay() throws Throwable {
		EbayCheckoutResultActions.verifyCheckoutPage();
	   
}

}	*/