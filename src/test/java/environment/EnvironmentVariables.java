package environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentVariables {
	
		
	public static WebDriver driver;
	public static final String BASE_URL = "http://automationpractice.com/index.php";
	public static final String AUTH_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	public static final String MYACC_URL = "http://automationpractice.com/index.php?controller=my-account";
	public static final String CREATEACC_URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";
	public static final String WOMEN_URL = "http://automationpractice.com/index.php?id_category=3&controller=category";
	public static final String SCSUMM_URL = "http://automationpractice.com/index.php?controller=order";
	
	public static int DRIVER_WAIT_SECONDS = 10;
	
	public static WebDriver setChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mena\\eclipse-workspace\\meniki\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BASE_URL);
		driver.manage().window().maximize();
		return driver;
	}
	
	

}
