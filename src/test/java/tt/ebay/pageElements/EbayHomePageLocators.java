package tt.ebay.pageElements;

import org.openqa.selenium.By;
//import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

//import tt.utilities.SetupDrivers;

public class EbayHomePageLocators {





// Ebay Search Button Without Page Factory Locator
WebElement btnSearch2 = SetupDrivers.driver.findElement (By.xpath("//input[@value= 'Search']"));

@FindBy(xpath="//button[@id='gh-shop-a']")
public WebElement btnCategory;

@FindBy(xpath="//tbody/tr[1]/td[2]/h3[1]/a[1]")
public WebElement btnFashion;



//Search Text Box - Page Factory Locators
@FindBy(xpath="//input[@placeholder= 'Search for anything']")
public WebElement txtbxSearch;

//Search Button - Page Factory Locators
@FindBy(xpath="//input[@value='Search']")
public WebElement btnSearch;


//myEbay
@FindBy(xpath="//a[@title='My eBay']")
public WebElement myEbay;

//Summary Button - Page Factory Locators
@FindBy(xpath="//a[contains(text(),'Summary')]")
public WebElement btnSummary;



//FindBy(xpath="//a[contains(text(),'Daily Deals')]")
//public WebElement btnDailyDeals;

}

    