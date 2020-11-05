package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import environment.EnvironmentVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemethods.ContactUsMethods;
import pagemethods.HomePageMethods;
import pagemethods.SignInMethods;

public class ContactUs extends EnvironmentVariables{
	
	WebDriver driver = setChromeDriver();
	
	@Given("User navigates to homepage")
	public void user_navigates_to_homepage() {
		String url = BASE_URL;
		Assert.assertTrue(driver.getCurrentUrl().contains(url));
	    
	}
	
	
	@When("User navigates to ContactUs Page") 
	public void user_navigates_to_contact_us_page() throws InterruptedException {
		HomePageMethods homePage = new HomePageMethods(driver);
		homePage.navigateToContactUs();

		Assert.assertEquals(driver.getCurrentUrl(), CONTACT_URL);
		
	}

	@When("User fills contact form")
	public void user_fills_contact_form() throws InterruptedException {
		ContactUsMethods form = new ContactUsMethods(driver);
		form.selectSubjectHeading();
		form.populateEmail();
		form.populateOrderReference();
//		form.clickChooseFile();
//		form.inputFile();
//		form.clickAttachFile();
		form.populateMessageBox();
	    
	}

	@Then("User submits form")
	public void user_submits_form() throws InterruptedException {
		ContactUsMethods submit = new ContactUsMethods(driver);
		submit.clickSendForm();
	    
	}

}
