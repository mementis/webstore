package pageobjects;

import org.openqa.selenium.By;

public class SignInObjects {

	public static By email = By.id("email");
	public static String emailValue = "mena_tra@yahoo.com";
	public static By password = By.xpath("//*[@id=\"passwd\"]");
	public static String passwordValue = "kokoska";
	public static By signIn = By.id("SubmitLogin");

}
