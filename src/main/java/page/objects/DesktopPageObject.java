package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;



public class DesktopPageObject extends Base{
	
	public DesktopPageObject() {
		
		PageFactory.initElements(driver, this);
		// background and scenario 1
	}
	
	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktoTab;
	
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;
	
	@FindBy(tagName = "img")
	private List<WebElement> items;
	
	// scenario 2**********
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartOption;
	
	@FindBy(id = "input-quantity")
	private WebElement quantity;
	
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	//scenario 3*********
	
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addCameraToCart;
	
	@FindBy(id = "input-option226")
	private WebElement selectOption;
	
	@FindBy(xpath = "//option[@value='15']")
	private WebElement redColor;
	
	// scenario 4*********
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonCamrea;
	
	@FindBy(xpath = "//a[text()='Reviews (0)']")
	private WebElement  review;
	
	@FindBy(id = "input-name")
	private WebElement name;
	
	@FindBy(id = "input-review")
	private WebElement canonReview;
	
	@FindBy(xpath = "//input[@type='radio']")
	private List <WebElement> rating;
	//@FindBy(xpath = "(//input[@name='rating'])[2]")
	//private WebElement rating;
	
	
	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement reviewSuccessMessage;
	
	
	// methods 
	// backgriund and scenario 1
	public void clickOnDesktopTab() {
		desktoTab.click();
	}
	
	public void clickOnShowAllDesktop() {
		showAllDesktop.click();
	}
	
	public List<WebElement> desktopItems(){
		List<WebElement> itemDesk = items;
		return itemDesk;
	}
	
	public void clickOnAddToCartOption() {
		
		addToCartOption.click();
	}
	public void addOneItemToCart() {
		quantity.clear();
		Utils.hardWait();
		quantity.sendKeys("1");
		
	}
	
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	
	public void clickAddingCameraToCart() {
		addCameraToCart.click();
	}
	public void clickOnSelectOption() {
		selectOption.click();
	}
	
	public void clickOnRedValue() {
		redColor.click();
	}
	public void clickOnCanonCameraLink() {
		canonCamrea.click();
	}
	
	public void clickOnReviewLink() {
		review.click();
	}
	public void nameField(String yourname) {
		name.sendKeys(yourname);
	}
	public void canonReviewField(String yourReview) {
		canonReview.sendKeys(yourReview);
	}
//	public void addRatingForCanon() {
//		rating.click();
//	}
//	 public List<WebElement> ratingSelection(){
//	 List<WebElement>ratingList = rating;
//	 return ratingList;
//	 }
	 public void selectRating(String ratingValue) {
		 List<WebElement> ratingElements = rating;
		 for(WebElement element:ratingElements) {
			if(element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			} 
		 }
	 }
	
	
	public void clickOnContinueButton() {
		continueButton.click();
	}
	public String getSuccessReviewMessage() {
		String text = reviewSuccessMessage.getText();
		return text;
	}
}
