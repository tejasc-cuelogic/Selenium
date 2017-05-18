package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Appdriver {

	public WebDriver init(){
		   System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDrivers\\Chrome driver\\chromedriver.exe");
		   WebDriver d= new ChromeDriver();
		   return d;
	}
	
}
