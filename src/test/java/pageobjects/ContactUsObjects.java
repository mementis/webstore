package pageobjects;

import org.openqa.selenium.By;

public class ContactUsObjects {
	
	public static By subjectHeading = By.id("id_contact");
	public static String subjectHeadingValue = "Customer service";
	public static By email = By.id("email");
	public static String emailValue = "mena_tra@yahoo.com";
	public static By orderReference = By.xpath("//*[@id=\"id_order\"]");
	public static String orderValue = "Y2KY2K";
	public static By chooseFile = By.xpath("//*[@id=\"uniform-fileUpload\"]");
	public static By file = By.id("fileUpload");
	public static String link = "D:\\PROJECT MENA\\Bibi_proficio";
	public static By attachFile = By.xpath("//*[@id=\"uniform-fileUpload\"]/span[2]");
	public static By messageBox = By.id("message");
	public static String messageValue = "Hello World";
			
	public static By sendForm = By.id("submitMessage");
	

}
