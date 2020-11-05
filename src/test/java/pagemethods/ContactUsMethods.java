package pagemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageobjects.ContactUsObjects;

public class ContactUsMethods extends ContactUsObjects{
	
	WebDriver driver;
	
	public ContactUsMethods(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectSubjectHeading() throws InterruptedException {
		Thread.sleep(2000);
		Select dropSubject = new Select(driver.findElement(subjectHeading));
		dropSubject.selectByVisibleText(subjectHeadingValue);
	}
	
	public void populateEmail() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(email).sendKeys(emailValue);
	}
	
	public void populateOrderReference() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(orderReference).sendKeys(orderValue);
	}
	
	public void selectOrderReference() throws InterruptedException {
		Thread.sleep(2000);
		Select dropOrder = new Select(driver.findElement(subjectHeading));
		dropOrder.selectByIndex(0);
	}
	
	public void clickChooseFile() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(chooseFile).click();
	}
	
	public void inputFile() throws InterruptedException  {
		Thread.sleep(1000);
		driver.findElement(file).sendKeys(link);
	}
	
	public void clickAttachFile() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(attachFile).click();
	}
	
	public void populateMessageBox() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(messageBox).sendKeys(messageValue);
	}
	
	public void clickSendForm() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(sendForm).click();
	}

}
