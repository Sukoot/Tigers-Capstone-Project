package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject object = new LaptopNoteBooksPageObject();

	@Given("User is on Retail website {string}")
	public void user_is_on_retail_website(String string) {
		object.clickeOnTestEnvironment();
		logger.info("user clicked on Retail website");
	}
// throw
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab(){
		object.clickOnlaptopNotebooksTab();
		logger.info("user clicked on laptop &NoteBook tab");
		
	}
// throw
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		object.clickOnshowAllLaptopsNoteBooks();
		logger.info("user click on show all Laptop &NoteBook option");
	
	}

	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		object.clickeOnMacBookitem();
		logger.info("user clicked on mac book link successfully");
	    
	}
	@When("User click add to Cart button for Mac Book")
	public void user_click_add_to_cart_button_for_mac_book() {
		object.clickAddToCart();
		logger.info("user clicked on add to cart successfully");
	    
	}
//	throw	
	@Then("User should see a messagee {string}")
	public void user_should_see_a_messagee(String string) {
		Assert.assertTrue(object.theSuccessMassage());
		

	}
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) { 
		object.SeeOneItemInItemsOption();
		logger.info("user should see 1 item on the cart.");
	    
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		object.ClickOnCartOption();
		logger.info("user clicked on cart opotion");
	    
	}
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		object.clickOnXButton();
		logger.info("user removed the 1 item from cart.");
	    
	}
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) {
		object.getTotalCart();
		logger.info("cart get empty successfully");
		
		//scenario 2
	    
	}
	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		object.clickOnMacbookCamprison();
		
		object.clickOnMacbookAirCamperison();
		
		logger.info("user clicked on Macbook and Macbook air");
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		object.clickOnProductsComparisonLink();
		logger.info("user clicked on product comparison link");
		
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		object.getChartComparison();
		logger.info("product comparison chart is displaye successfully");
	}
	//scenario 3 
//	throw
	@When("User click on heart icon to add 'Sony VaIO' laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(){
		object.clickOnwishbutton();
		logger.info("user add Sony VaIO to wish list");
		
	}


	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		object.youMustLogin();
		logger.info("user need to login to his account");
		
	}
// throw
	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		object.clickOnwishbutton();
		
	}
	
	// scenario4************
	
	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		object.clickOnMacbookProLink();
		logger.info("user ");
	   
	}
	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		object.getPriceTagOfMacbookPro();
		logger.info("user should see price tag");
	}





}
