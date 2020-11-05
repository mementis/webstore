package pagemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import environment.EnvironmentVariables;
import pageobjects.HomePageObjects;

public class HomePageMethods extends HomePageObjects {

	WebDriver driver;

	public HomePageMethods(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateToSignIn() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(navigateToSignIn).click();

	}
	
	public void navigateToSignOut() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(navigateToSignOut).click();
	}

	public void navigateToContactUs() throws InterruptedException {

		Thread.sleep(2000);
		driver.findElement(navigateToContactUs).click();
	}
	
	public void navigateToWomenCat() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(navigateToWomenCat).click();
	}
	
public void navigateToAuthentication() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(navigateToAuthentication).click();
	}
	
	

}
