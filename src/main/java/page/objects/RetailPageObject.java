package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RetailPageObject extends Base {
	
	/**
	 * This is a construction
	 * We use construction for instantiation of an object
	 * We use initElement in our pageFactory class we can initialize the webElement located by @FindBy annotation
	 */
	
	public RetailPageObject() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmentText;
	
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath = "//ul//a[text()='Login']")
	private WebElement login;
	
	@FindBy(id = "input-email")
	private WebElement emailAdress;
	
	@FindBy(id = "input-password")
	private WebElement passwordField;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginBuutton;
	
	@FindBy(xpath = "//h2[text()='My Account']")
	private WebElement myAccountDashboard;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']" )
	private WebElement myAffiliateAccount;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement registerForAffiliatAccount;
	
	@FindBy(id = "input-company")
	private WebElement companyName;
	
	@FindBy(id = "input-website")
	private WebElement websiteField;
	
	@FindBy(id = "input-tax")
	private WebElement taxIDField;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement paymentMethodField;
	
	@FindBy(id = "input-cheque")
	private WebElement chequePayeeNameField;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	
	private WebElement successMessage;
	
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement editYourAffiliateInfoLink;
	
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(id = "input-bank-name")
	private WebElement bankNameField;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement abaNumberField;
	
	@FindBy(id = "input-bank-swift-code")
	private WebElement swiftCodeField;
	
	@FindBy(id = "input-bank-account-name")
	private WebElement accountNameField;
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumberField;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessage;
	
	@FindBy(xpath = "//a[normalize-space()='Edit your account information']")
	private WebElement editAccountInformationLink;
	
	@FindBy(id = "input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id = "input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id = "input-email")
	private WebElement emailField;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneField;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueBttn;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageAlert;
	
	
	public String getEnvironmentText() {
		String text = testEnvironmentText.getText();
				return text;
	}
	
	public  void  clickMyAccount() {
		myAccount.click();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	public void enterEmail(String email) {
		emailAdress.sendKeys(email);
	}
	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		login.click();
	}
	public void clickOnLoginButton() {
		loginBuutton.click();
	}
	/**
	 * This is the method I created in in Utils and I use it here 
	 */
	public void getMyAccountDash() {
		Utils.getTextFromUI(myAccountDashboard);
		
//		scenario # 2********************
	}
	/**
	 * I can use either .click() method or I can use JSExcuter to click
	 */
	public void clickOnAffiliateLink() {
//		myAffiliateAccount.click();
		Utils.clickWithJSE(myAffiliateAccount);
	}
	public void clickOnRegisterForAffiliatAccount() {
		registerForAffiliatAccount.click();
	}
	public void enterCompanyName(String companyNameEnter) {
		companyName.sendKeys(companyNameEnter);
		
	}
	/**
	 * I can use either .sendKeys() method or I can use JSExcuter to sendKeys
	 */
	
	public void websiteName(String website) {
//		websiteField.sendKeys(website);
		Utils.sendKeysWithJSE(websiteField, website);
	}
	public void taxIdField(String taxID) {
		taxIDField.sendKeys(taxID);
	}
	public void paymentMethods(String paymentMethod) {
		paymentMethodField.sendKeys(paymentMethod);
		
	}
	public void chequePayeeField(String ChequePayeeName) {
		chequePayeeNameField.sendKeys(ChequePayeeName);
	}
	/**
	 * This method called from Utils and it click on checkbox
	 */
	
	public void aboutUs() {
		Utils.clickOnCheckBoxButton(checkBox);
	}
	public void clickOnEditAffiliateInformation() {
		editYourAffiliateInfoLink.click();
		
	}
	public String getSuccessText(String successText) {
		String text = successMessage.getText();
		return text;
	}
	//scenario#3
	public void clickonEditedAccountInfo() {
		editAccountInformationLink.click();
	}
	public void clickOnBankTransfer() {
		bankTransfer.click();
	}
	public void getBankName(String bankName) {
		bankNameField.sendKeys(bankName);
	}
	public void getAbaNumbers(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);
		
	}
	public void getSwiftCode(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}
	public void getAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
	}
	public void getAccountNumber(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
	}
	public void clickOnContinueButton() {
		ContinueButton.click();
	}
	public String getSuccessMessage() {
		String text = SuccessMessage.getText();
		return text;
	}
//	scenario # 4
	public void clickOnEditAccoutInfo() {
		editAccountInformationLink.click();
	}
	/**
	 * I use .clear ()method to clear the field first in UI then sends the keys.
	 * @param firstname
	 */
	public void getFirstName(String firstname) {
		firstNameField.clear();
		  firstNameField.sendKeys(firstname);
	}
	public void getLastName(String lastName) {
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
	}
	public void getEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	}
	public void getTelephoneNumber(String telephone) {
		telephoneField.clear();
		telephoneField.sendKeys(telephone);
	}
	public void clickContinue() {
		continueBttn.click();
	}
	public String seeSuccessMessage() {
		String text = successMessageAlert.getText();
		return text;
	}
	  
}
