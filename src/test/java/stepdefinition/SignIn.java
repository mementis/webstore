package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import environment.EnvironmentVariables;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagemethods.SignInMethods;
import pagemethods.HomePageMethods;
import pagemethods.SignInMethods;

public class SignIn extends EnvironmentVariables {

	WebDriver driver = setChromeDriver();

	@Given("User lands on homepage")
	public void user_lands_on_homepage() {
		String url = BASE_URL;
		Assert.assertTrue(driver.getCurrentUrl().contains(url));

	}

	@When("User navigates to SignIn Page")
	public void user_navigates_to_sign_in_page() throws InterruptedException {
		HomePageMethods homePage = new HomePageMethods(driver);
		homePage.navigateToSignIn();

		Assert.assertEquals(driver.getCurrentUrl(), AUTH_URL);

	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException {
		SignInMethods loginPage = new SignInMethods(driver);
		loginPage.populateUsername();
		loginPage.populatePassword();
		loginPage.clickSignIn();
	}

	@Then("User gets access to user's account")
	public void user_gets_access_to_user_s_account() {

		Assert.assertEquals(driver.getCurrentUrl(), MYACC_URL);

	}

	@Then("User clicks on SignOut button")
	public void user_clicks_on_sign_out_button() throws InterruptedException {
		HomePageMethods homePage = new HomePageMethods(driver);
		homePage.navigateToSignOut();
	}

	@Then("User is no longer logged in")
	public void user_is_no_longer_logged_in() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals("Sign in", driver.findElement(By.className("login")).getText());
		driver.close();
	}

}
