package step.definition;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base{
	
	
	DesktopPageObject desktopobj = new DesktopPageObject();
	
	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopobj.clickOnDesktopTab();
		logger.info("user clicked Desktop Tab successfully");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopobj.clickOnShowAllDesktop();
		logger.info("user clicked on show all desktop successfully");
		
	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktopobj.desktopItems();
		Utils.takeScreenshotsForSteps();
		logger.info("user was able to see the items are present in desktop ");

	}
	
	@When("User click ADD TO CART option on HP LP3065 item")
	public void user_click_add_to_cart_option_on_hp_lp3065_item() {
		desktopobj.clickOnAddToCartOption();
		logger.info("LPHP3065 was added to the cart successfully");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopobj.addOneItemToCart();
		logger.info("Item successfully added to the cart");
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopobj.clickOnAddToCartButton();
		logger.info("user clicked on add to cart button");
	}
	//scenario 3********
	
	@When("User click ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopobj.clickAddingCameraToCart();
		logger.info("user clicked camera Eos");
	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopobj.clickOnSelectOption();
		desktopobj.clickOnRedValue();
		logger.info("user select red color camera successfully");
		Utils.takeScreenshotsForSteps();
	}
	//scenario 4**********
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopobj.clickOnCanonCameraLink();
		logger.info("user clicked on canon amera successfully");
	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopobj.clickOnReviewLink();
		logger.info("user clicked on Reeview link successfully");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {

		List<Map<String, String>> reviewInformation = dataTable.asMaps(String.class, String.class);
		desktopobj.nameField(reviewInformation.get(0).get("yourname"));
		desktopobj.canonReviewField(reviewInformation.get(0).get("yourReview"));
		desktopobj.selectRating(reviewInformation.get(0).get("Rating"));	
	      logger.info("user write a review successfully");
	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopobj.clickOnContinueButton();
		logger.info("user clicked on continue button successfully");
	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		desktopobj.getSuccessReviewMessage();
		logger.info("user verified success message of reviewing successfully");

	}
}
