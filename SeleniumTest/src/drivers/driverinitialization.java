package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverinitialization {

	public static WebDriver driverInit()
	{
		WebDriver d = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumDrivers\\Firefox\\geckodriver.exe");
		return d;
				
	}
}
