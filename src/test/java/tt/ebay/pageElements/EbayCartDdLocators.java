package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartDdLocators {
	

	//Shirt Size
	@FindBy(xpath= "//select[@id= 'msku-sel-2']")
	public WebElement ddSize;
	
	//Shirt Shade
	@FindBy(xpath= "//select[@name='Shade']")
	public WebElement ddShade;

	//Add to cart
	@FindBy(xpath= "//a[@id='atcRedesignId_btn']")
	public WebElement btnAddCart;

	

}
