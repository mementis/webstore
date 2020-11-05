package pagemethods;

import org.openqa.selenium.WebDriver;

import pageobjects.SignInObjects;

public class SignInMethods extends SignInObjects {

	WebDriver driver;

	public SignInMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void populateUsername() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(email).sendKeys(emailValue);

	}

	public void populatePassword() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(password).sendKeys(passwordValue);
	}

	public void clickSignIn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(signIn).click();

	}

}
