package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import environment.EnvironmentVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemethods.CreateAccountMethods;
import pagemethods.HomePageMethods;

public class CreateAccount extends EnvironmentVariables {

	WebDriver driver = setChromeDriver();

	@Given("User lands on authentication page")
	public void user_lands_on_authentication_page() throws InterruptedException {
		HomePageMethods homePage = new HomePageMethods(driver);
		homePage.navigateToSignIn();
		Assert.assertEquals(driver.getCurrentUrl(), AUTH_URL);

	}

	@When("User submits valid e-mail into e-mail address box")
	public void user_submits_valid_e_mail_into_e_mail_address_box() throws InterruptedException {
		CreateAccountMethods loginPage = new CreateAccountMethods(driver);
		loginPage.populateEmail();
		loginPage.clickCreateAccount();

	}

	@Then("User fills form with valid credentials")
	public void user_fills_form_with_valid_credentials() throws InterruptedException {
		CreateAccountMethods createAccount = new CreateAccountMethods(driver);
		createAccount.populateCustomerFirstName();
		createAccount.populateCustomerLastName();
		createAccount.populatePassword();
		createAccount.populateFirstName();
		createAccount.populateLastName();
		createAccount.populateAddress1();
		createAccount.populateCity();
		createAccount.selectState();
		createAccount.populatePostcode();
		createAccount.selectCountry();
		createAccount.populateMobilePhone();
		createAccount.populateAlias();
		createAccount.clickRegisterAccount();

	}

	@Then("User is redirected to user's account")
	public void user_is_redirected_to_user_s_account() {

		Assert.assertEquals(driver.getCurrentUrl(), MYACC_URL);
		driver.close();
	}

}
