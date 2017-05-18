package AutomationFramework;

import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public void intialize() 
	{
//		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Drivers\\Firefox\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("google.com");
	}
}
