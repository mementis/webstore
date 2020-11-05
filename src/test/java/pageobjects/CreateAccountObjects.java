package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;

public class CreateAccountObjects {
	
	public static By email = By.id("email_create");
	public static String emailValue = "trol1244@email.com";
	public static By createAccount = By.id("SubmitCreate");
	
	public static By customerFirstName = By.id("customer_firstname");
	public static String firstNameValue = "Mara";
	public static By customerLastName = By.id("customer_lastname");
	public static String lastNameValue = "Popara";
	public static By password = By.id("passwd");
	public static String passwordValue = "kokoska";
	
	public static By firstName = By.id("firstname");
	public static By lastName = By.id("lastname");
	public static By address1 = By.id("address1");
	public static String address1Value = "3003 Kerbey Ln";
	public static By city = By.id("city");
	public static String cityValue = "Austin";
	public static By state = By.id("id_state");
	public static String stateValue = "Texas";
		
	public static By postCode = By.id("postcode");
	public static String postCodeValue = "78702";
	
	public static By country = By.id("id_country");
	public static String countryValue = "United States";
	
	public static By mobilePhone = By.id("phone_mobile");
	public static String mobilePhoneValue = "2025550130";
	
	public static By alias = By.id("alias");
	public static String mailAliasValue = "workmail";
	
	public static By registerAccount = By.id("submitAccount");
	
	

}
