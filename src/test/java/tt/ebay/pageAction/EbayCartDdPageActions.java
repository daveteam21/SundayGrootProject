package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import tt.ebay.pageElements.EbayCartDdLocators;
import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.SetupDrivers;

public class EbayCartDdPageActions {
	
	EbayCartDdLocators EbayCartDdLocatorsObj;
	WebDriverWait Wait = new WebDriverWait(SetupDrivers.driver, 30);
	

		public EbayCartDdPageActions() {
			EbayCartDdLocatorsObj = new EbayCartDdLocators();
			PageFactory.initElements(SetupDrivers.driver, EbayCartDdLocatorsObj);
		}

		//Selenium Dropdown
		public void selectSizeFromDd() throws Exception{
			
			Select myDD = new Select(EbayCartDdLocatorsObj.ddSize);
			myDD.selectByVisibleText("4XLT");
			Thread.sleep(2000);
		}
		public void selectShadeFromDd() throws Exception{
		Select myDD = new Select(EbayCartDdLocatorsObj.ddShade);
		myDD.selectByVisibleText("White");
		Thread.sleep(2000);
		}

		public void addToCart() throws Exception {	
			EbayCartDdLocatorsObj.btnAddCart.click();
			Thread.sleep(4000);
			
			
		}
}