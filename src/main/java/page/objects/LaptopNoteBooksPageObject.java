package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base{
	
	public LaptopNoteBooksPageObject() {
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement clickeOnTestEnvironment;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement clickOnlaptopNotebooksTab;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
		
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement clickeOnMacBookitem;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addingToCart;
	
	
	@FindBy(xpath = "//*[text()='Success: You have added ']")
	private WebElement theSuccessMassage;
	
	@FindBy(id = "input-quantity")
	private WebElement quantity;
	
	@FindBy(xpath = "//*[text()=' 1 item(s) - $602.00']")
	private WebElement SeeOneItemInItemsOption;
	
//	@FindBy(xpath = "//strong[text()=' View Cart']")
	@FindBy(xpath = "//span[text()=' 1 item(s) - $602.00']")
	private WebElement ClickOnCartOption;
	
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement remove;
	
	@FindBy(id = "cart-total")
	private WebElement totalCart;
	
	//scenari#2
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[2]")
	private WebElement compareMacbook;
	
	@FindBy(xpath = "(//i[@class='fa fa-exchange'])[3]")
	private WebElement toMacbookAir;
	
	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible']")
	WebElement successMessage;
	
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement productsCaprison;
	
	@FindBy(xpath = "/html/body/div[2]")
	private WebElement viewChart;
	// scenario 3

	@FindBy(xpath = "/html/body/div[2]")
	private WebElement productCompareItem;

	@FindBy(xpath = "//div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement clickOnwishbutton;

	@FindBy(xpath = "//*[text()=' You must ']")
	private WebElement youMustLogin;
	
	//scenario4*************
	
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	
	@FindBy(xpath = "(//h2)[2]")
	private WebElement priceTag;
	
	
	public void clickeOnTestEnvironment() {
		clickeOnTestEnvironment.click();
	}

	public void clickOnlaptopNotebooksTab() {
		clickOnlaptopNotebooksTab.click();
	}

	public void clickOnshowAllLaptopsNoteBooks() {
		showAllLaptopsAndNotebooks.click();

	}
	
	public void clickeOnMacBookitem() {
		clickeOnMacBookitem.click();
		
	}
   public void itemAddToCart() {
	   quantity.clear();
	   quantity.sendKeys("1");
   }
   
   public void clickAddToCart() {
	   
	   addingToCart.click();
	  
   }
   public boolean theSuccessMassage() {
		if (theSuccessMassage.isDisplayed())
			return true;
		else
			return false;
	}
	public void SeeOneItemInItemsOption() {
		SeeOneItemInItemsOption.isDisplayed();
	}

	public void ClickOnCartOption() {
		ClickOnCartOption.click();
	}

   public void clickOnXButton() {
	   remove.click();
   }
   public void  getTotalCart() {
//	  String text =  totalCart.getText();
//	  return text;
	   
	   Utils.getTextFromUI(totalCart);
	   //scenario************
   }
   public void clickOnMacbookCamprison() {
	   compareMacbook.click();
	  Utils.hardWait();
   }
   
   public void clickOnMacbookAirCamperison() {
	   toMacbookAir.click();
	   Utils.hardWait();
   }
   public void getSuccessMessageComparison() {
	   Utils.getTextFromUI(successMessage);
	   Utils.hardWait();
   }
   public void clickOnProductsComparisonLink() {
	   
	   productsCaprison.click();
	   Utils.hardWait();
   }
   public void getChartComparison() {
	   viewChart.isDisplayed();
	   
   }
   //scenario3
   
	public void productCompareItem() {
		productCompareItem.isDisplayed();
	}

	public void clickOnwishbutton() {
		clickOnwishbutton.click();
	}

	public void youMustLogin() {
		youMustLogin.isDisplayed();
	}
   //scenario 4**************
   public void clickOnMacbookProLink() {
	   macBookPro.click();
   }
   public void getPriceTagOfMacbookPro() {
	   priceTag.isDisplayed();
	   
   }
   public void clickAsScreenshot() {
	   Utils.takeScreenshotsForSteps();
   }
}
