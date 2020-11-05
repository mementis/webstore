package pagemethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.CreateOrderObjects;

public class CreateOrderMethods extends CreateOrderObjects{
	
	WebDriver driver;
	
	public CreateOrderMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickListView() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(listView).click();
	}	
	
	public void clickMoreButton1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(moreButton1).click();
	}
	
	public void clearQuantity() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(quantity).clear();
	}
	
	public void populateQuantity() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(quantity).sendKeys(quantityValue);
	}
	
	public void selectSize() throws InterruptedException {
		Thread.sleep(2000);
		Select dropSize = new Select(driver.findElement(size));
		dropSize.selectByVisibleText(sizeValue);
	}
	
	public void clickColor() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(color).click();
	}
	
	public void clickAddToCart() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(addToCart).click();
	}
	
		
	public void clickProceedToCheckout1() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(proceedToCheckout1).click();
	}
	
	public void clickProceedToCheckout2() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(proceedToCheckout2).click();
	}
			
	public void clickProceedToCheckout3() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(proceedToCheckout3).click();
	}
	
	public void clickTermsOfService() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(termsOfService).click();
	}
	
	public void clickProceedToCheckout4() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(proceedToCheckout4).click();
	}
	
	public void clickByBankWire() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(byBankWire).click();
	}
	
	public void clickByCheck() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(byCheck).click();
	}
	
	public void clickConfirmOrder() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(confirmOrder).click();
	}
}
