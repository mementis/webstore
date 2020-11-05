package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import environment.EnvironmentVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemethods.CreateOrderMethods;
import pagemethods.HomePageMethods;
import pagemethods.SignInMethods;

public class CreateOrder extends EnvironmentVariables{
	
	WebDriver driver = setChromeDriver();
	
	@Given("user lands on homepage")
	public void user_lands_on_homepage() {
		String url = BASE_URL;
		Assert.assertTrue(driver.getCurrentUrl().contains(url));
	}

	@Given("user selects menu category")
	public void user_selects_menu_category() throws InterruptedException {
		HomePageMethods homePage = new HomePageMethods(driver);
		homePage.navigateToWomenCat();
	    
		Assert.assertEquals(driver.getCurrentUrl(), WOMEN_URL);
	}

	@When("user selects product from selected category Product List Page")
	public void user_selects_product_from_selected_category_product_list_page() throws InterruptedException {
		CreateOrderMethods plpPage = new CreateOrderMethods(driver);
		plpPage.clickListView();
		plpPage.clickMoreButton1();
	    
	}

	@Then("user selects product details on Product Details page and adds to cart")
	public void user_selects_product_details_on_product_details_page_and_adds_to_cart() throws InterruptedException {
		
		CreateOrderMethods pdpPage = new CreateOrderMethods(driver);
		pdpPage.clearQuantity();
		pdpPage.populateQuantity();
		pdpPage.selectSize();
		pdpPage.clickColor();
		pdpPage.clickAddToCart();
		
		    
	}

	
	@Then("user proceeds to checkout")
	public void user_proceeds_to_checkout() throws InterruptedException {
				
		CreateOrderMethods popPage = new CreateOrderMethods(driver);
		popPage.clickProceedToCheckout1();
		
		
	   
	}
   
	

	@When("user validates the items in shopping cart summary")
	public void user_validates_the_items_in_shopping_cart_summary() throws InterruptedException {
		
		CreateOrderMethods cartSummary = new CreateOrderMethods(driver);
		cartSummary.clickProceedToCheckout2();
		
		
	}

	@When("user signs in")
	public void user_signs_in() throws InterruptedException {
		
		SignInMethods loginPage = new SignInMethods(driver);
		loginPage.populateUsername();
		loginPage.populatePassword();
		loginPage.clickSignIn();
	    
	}

	@Then("user selects delivery address")
	public void user_selects_delivery_address() throws InterruptedException {
		
		CreateOrderMethods deliveryAddress = new CreateOrderMethods(driver);
		deliveryAddress.clickProceedToCheckout3();
	    
	}

	@Then("user selects shipping option")
	public void user_selects_shipping_option() throws InterruptedException {
		CreateOrderMethods shippingOption = new CreateOrderMethods(driver);
		shippingOption.clickTermsOfService();
		shippingOption.clickProceedToCheckout4();
	    
	}

	@Then("user proceeds with payment")
	public void user_proceeds_with_payment() throws InterruptedException {
		CreateOrderMethods paymentOption = new CreateOrderMethods(driver);
		paymentOption.clickByBankWire();
		
	    
	}

	@Then("user confirms order")
	public void user_confirms_order() throws InterruptedException {
		
		CreateOrderMethods confirmOrder = new CreateOrderMethods(driver);
		confirmOrder.clickConfirmOrder();
		driver.close();
	    
	}

}
