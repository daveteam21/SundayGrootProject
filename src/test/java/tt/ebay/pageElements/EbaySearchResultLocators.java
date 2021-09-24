package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

//tag[contains(text().'text')]
//span[contains(text(),'shoes')]
public class EbaySearchResultLocators {
	
	// Search Fashion Filter Locators
	@FindBy(xpath = "//span[contains(text(),'Fashion')]")
	public WebElement txtFashionFilter;

	// Search Result Validation Locators
	@FindBy(xpath = "//span[contains(text(),'shoes')]")
	public WebElement txtShoes;
	
	// Search Result Validation Locators
	@FindBy(xpath = " //span[contains(text(),'men shirts')]")
	public WebElement txtMenShirts;
	
	// Selecting Shirt
	@FindBy(xpath = "//span[contains(text(),'Big & Tall Cotton Tee.')]")
	public WebElement lnkShirtItem;


	@FindBy(xpath = " //span[contains(text(),'masks')]")
	public WebElement txtMasks;
	

	// Search Category Without Page Factory Locator Need a method
	public String txtCategory(String Category) {
		WebElement txtCategory = SetupDrivers.driver.findElement(By.xpath("//span[contains(text(),'" + Category + "')]"));
		return txtCategory.getText();
	}

	public String clickBrands(String Brands) {
		WebElement clickBrands = SetupDrivers.driver.findElement(By.xpath("//h3[contains(text(),'" + Brands + "')]"));
		return clickBrands.getText();
	}
	//@FindBy(xpath=  "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-1']/a[1]")
//	public WebElement btnDailyDeals;
}

/*

 * //Search Category
 * 
 * @FindBy(xpath="//span[contains(text(),"+txtCategory+")]") public WebElement
 * txtCategory;
 * 
 * 
 * 
 * //
 * 
 * 
 * }
 */
