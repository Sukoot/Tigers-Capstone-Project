package step.definition;

import java.util.List;
import java.util.Map;
import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base{
	
	/**
	 * I created an object of retailPageObject to get access to the methods and glue it to that class.
	 */
	
	RetailPageObject retailpageobj = new RetailPageObject();
	
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		retailpageobj.getEnvironmentText();
        //logger is used to logged the result of each steps		
		logger.info("User is on Retail web page");
		
	}

	@And("User click on MyAccount")
	public void user_click_on_my_account() {
		retailpageobj.clickMyAccount(); 
		logger.info("user clicked on my account successfully");
	}
// throw throws InterruptedException
	@When("User click on Login")
	public void user_click_on_login() { 
		retailpageobj.clickOnLogin();
	   
	}
	// Every time I run the test, I should register with new email in order to execute the test
	@When("User enter username {string} and password 'password’")
	public void user_enter_username_and_password_password(String string) {
		retailpageobj.enterEmail("massouda9@gmail.com");
		retailpageobj.enterPassword("12345");
        logger.info("Uuser should enter user name and password");
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobj.clickOnLoginButton();
		
	    
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailpageobj.getMyAccountDash();
	}
	/**
	 * We should not use Thread.sleep() in our automation testing
	 * there are other waits like implicit, explicit wait which calls smart wait and i have them in Base class.
	 * but in here in order to click on link, I should use Thread.sleep() with throws InterruptedExceptins to click on it.

	 */
//  throws InterruptedException
	@When("User click onn {string} link")
	public void user_click_onn_link(String string)  {
		retailpageobj.clickOnRegisterForAffiliatAccount();
		logger.info("user clicked on register for an Affiliate Account");
	
		
	}
/// throws InterruptedException 

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		/**
		 *  I used list cause the return type of data table is list of map
		 * I use cucumber data table to add multiple parameters in tabular format instead of putting 
		 * all parameter in the ghirkin statement.
		 *  this is way easier to read ,and multiple rows of data can be passed in same steps.
		 *  
		 */
		
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterCompanyName(data.get(0).get("company"));
		retailpageobj.websiteName(data.get(0).get("website"));
		retailpageobj.taxIdField(data.get(0).get("taxID"));
		retailpageobj.paymentMethods(data.get(0).get("paymentMethod"));
		retailpageobj.chequePayeeField(data.get(0).get("ChequePayeeName"));
	
	}
// throw
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobj.aboutUs(); 
		
	}

	@When("User click on Continue button")
	public void user_click_on_Continue_button() {
		retailpageobj.clickOnContinueButton();
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailpageobj.getSuccessText("successText");
	}
//	throw
	 @When("User click on {string} link")
	    public void user_click_on_link(String string){
	        retailpageobj.clickOnEditAffiliateInformation();
	       
	 }
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobj.clickOnBankTransfer();
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		/**
		 *  I used list cause the return type of data table is list of map
		 * I use cucumber data table to add multiple parameters in tabular format instead of putting 
		 * all parameter in the ghirkin statement.
		 *  this is way easier to read ,and multiple rows of data can be passed in same steps.
		 *  
		 */
		retailpageobj.getBankName(data.get(0).get("bankName"));
		retailpageobj.getAbaNumbers(data.get(0).get("abaNumber"));
		retailpageobj.getSwiftCode(data.get(0).get("swiftCode"));
		retailpageobj.getAccountName(data.get(0).get("accountName"));
		retailpageobj.getAbaNumbers(data.get(0).get("accountNumber"));
		
	}
// throw
	@When("User click on {string} linkk")
	public void user_click_on_linkk(String string) {
		retailpageobj.clickonEditedAccountInfo();
		logger.info("user clicked on edit account info" );
		
	}
	
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.getFirstName(data.get(0).get("firstname"));
		retailpageobj.getLastName(data.get(0).get("lastName"));
		retailpageobj.getEmail(data.get(0).get("email"));
		retailpageobj.getTelephoneNumber(data.get(0).get("telephone"));
		
	}
	
	@When("User click on continue button1")
	public void user_click_on_continue_button1() {
		retailpageobj.clickContinue();
	}
	    
	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		retailpageobj.seeSuccessMessage();
		
	}


}
