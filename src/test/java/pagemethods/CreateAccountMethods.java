package pagemethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.CreateAccountObjects;

public class CreateAccountMethods extends CreateAccountObjects{
	
	WebDriver driver;
	
	public CreateAccountMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void populateEmail() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(email).sendKeys(emailValue);

	}
	
	public void clickCreateAccount() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(createAccount).click();

	}
	
	public void populateCustomerFirstName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(customerFirstName).sendKeys(firstNameValue);
	}
	
	public void populateCustomerLastName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(customerLastName).sendKeys(lastNameValue);
	}
	
	public void populatePassword() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(password).sendKeys(passwordValue);
	}
	
	public void populateFirstName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(firstName).sendKeys(firstNameValue);
	}

	public void populateLastName() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(lastName).sendKeys(lastNameValue);
	}
	
	public void populateAddress1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(address1).sendKeys(address1Value);
	}
	
	public void populateCity() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(city).sendKeys(cityValue);
	}
	
	public void selectState() throws InterruptedException {
		Thread.sleep(2000);
		Select dropState = new Select(driver.findElement(state));
		dropState.selectByVisibleText(stateValue);
	}
		
	public void populatePostcode() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(postCode).sendKeys(postCodeValue);
	}
	
	public void selectCountry() throws InterruptedException {
		Thread.sleep(2000);
		Select dropCountry = new Select(driver.findElement(country));
		dropCountry.selectByVisibleText(countryValue);
	}
	
	public void populateMobilePhone() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(mobilePhone).sendKeys(mobilePhoneValue);
	}
	
	public void populateAlias() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(alias).sendKeys(mailAliasValue);
	}
	
	public void clickRegisterAccount( ) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(registerAccount).click();
	}
	
	
}
