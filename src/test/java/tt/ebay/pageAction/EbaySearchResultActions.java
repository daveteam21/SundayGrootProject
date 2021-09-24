package tt.ebay.pageAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultActions {
	EbaySearchResultLocators EbaySearchResultLocatorsObj;

	public EbaySearchResultActions() {
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
	}
	
	public void verifyFashionFilter() {
		EbaySearchResultLocatorsObj.txtFashionFilter.isDisplayed();
	}

	public void verifyShoesItems() {
		// Option1:
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		// Option2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtShoes.getText(), "shoes");
	}

	public void verifyMenShirtsItems() {
		EbaySearchResultLocatorsObj.txtMenShirts.isDisplayed();
		
	}
		public void verifyMasksItems() {
			EbaySearchResultLocatorsObj.txtMasks.isDisplayed();
	}
	public void verifyCategory(String Category) {
		// Option1: not going to work with category
		// EbaySearchResultLocatorsObj.txtCategory.isDisplayed();
		// Option2
		Assert.assertEquals(EbaySearchResultLocatorsObj.txtCategory(Category), Category);
	}

	public void verifyBrands(String Brands) {

		Assert.assertEquals(EbaySearchResultLocatorsObj.clickBrands(Brands), Brands);

	}

	public void selectItem() {
		EbaySearchResultLocatorsObj.lnkShirtItem.click();

	//}
	//public void verifyDailyDeals() {
	//	EbaySearchResultLocatorsObj.btnDailyDeals.click();
	}
 
}
/*
 
 * 
 * 
 * // TODO Auto-generated method stub
 * 
 * }
 * 
 * /* 
 * }
 * 
 * }
 */
