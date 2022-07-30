package step.definition;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.Verify;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	
	
	HomePageObject homepageobj = new HomePageObject();
			
		
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageobj.clickOnCurrency();
        logger.info("User clicked on currency!");
//        Utils.takeScreenshotWithFileUtils();
//        Utils.takeScreenshotsForSteps();
        
	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageobj.selectEuro();
		logger.info("user clicked on Euro dropdown");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepageobj.changingCurrencyToEuro();
		logger.info("user change currency to Euro successfully");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepageobj.emptyCart();
		logger.info("user see on empty cart");
	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		homepageobj.clickOnTheCart();
		logger.info("user shopping cart is empty");
//		Utils.takeScreenshotWithFileUtils();
		
	}

}
