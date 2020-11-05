package pageobjects;

import org.openqa.selenium.By;

public class CreateOrderObjects {
	
	public static By listView = By.xpath("//*[@id=\"list\"]/a");
	
	public static By moreButton1 = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div/div[3]/div/div[2]/a[2]");
	
	public static By quantity = By.id("quantity_wanted");
	public static String quantityValue = "3";
	
	public static By size = By.id("group_1");
	public static String sizeValue = "M";
	
	public static By color = By.id("color_14");
	
	public static By addToCart = By.id("add_to_cart");
	
	
	
	public static By proceedToCheckout1 = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
	public static By proceedToCheckout2 = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]");
	public static By proceedToCheckout3 = By.xpath("//*[@id=\"center_column\"]/form/p/button/span");
	public static By proceedToCheckout4 = By.xpath("//*[@id=\"form\"]/p/button");
	public static By confirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button");
	
	public static By termsOfService = By.id("cgv");
	
	public static By byBankWire = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a");
	public static By byCheck = By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
	
	

}
