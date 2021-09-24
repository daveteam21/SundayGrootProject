
package tt.ebay.pageAction;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomePageActions {
	// First time doing... we need the constructor Need Action and Locator Need
	// to bring locator into action class
	//
	EbayHomePageLocators EbayHomePageLocatorsObj;
	WebDriverWait Wait = new WebDriverWait(SetupDrivers.driver,30);

	public EbayHomePageActions() {
		EbayHomePageLocatorsObj = new EbayHomePageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
	}

	public void loadEbayHomepage() {
		SetupDrivers.driver.get("https://www.ebay.com/");
		
	}
	
	public void selectCategoryButton() throws InterruptedException {
		EbayHomePageLocatorsObj.btnCategory.click();
		Thread.sleep(3000);

	}
	
	public void selectFashionButton() throws InterruptedException {
		EbayHomePageLocatorsObj.btnFashion.click();
		Thread.sleep(3000);
	}

	public void searchShoes() {
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomePageLocatorsObj.btnSearch.click();

	}

	public void searchProducts(String Products) {
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys(Products);
		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void searchShirts() {
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Big & Tall Cotton Tee");
		EbayHomePageLocatorsObj.btnSearch.click();
	}
	public void searchMenShirts() {
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Men Shirts ");
		EbayHomePageLocatorsObj.btnSearch.click();
	}

	public void searchMasks() {
		EbayHomePageLocatorsObj.txtbxSearch.clear();
		EbayHomePageLocatorsObj.txtbxSearch.sendKeys("Masks");
		EbayHomePageLocatorsObj.btnSearch.click();
		
		
	}
		public void mouseHoverMyebay() throws InterruptedException{
			//Click on summary by mouse hoving myEbay
			Actions actions = new Actions(SetupDrivers.driver);
			actions.moveToElement(EbayHomePageLocatorsObj.myEbay);
			actions.perform();
			Thread.sleep(5000);
	}

	public void clickSummary() throws InterruptedException {
		EbayHomePageLocatorsObj.btnSummary.click();
		Thread.sleep(5000);
		
	}
//	public void clickButton() {
	//	EbayHomePageLocatorsObj.btnSearch.click();
		

	}


// public void clickDailyDeals() {
// EbayDailyDealsPageLocatorsObj.

/*
 * }
 * 
 * 
 * 
 * }
 */
