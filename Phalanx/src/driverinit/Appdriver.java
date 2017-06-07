package driverinit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

//public class Appdriver {

//	public WebDriver driverInit()
//	{
//		WebDriver driver;
//		DesiredCapabilities caps = new DesiredCapabilities();
//		caps.setJavascriptEnabled(true);
//		caps.setCapability("cssSelectorsEnabled", false);
//		caps.setCapability("applicationCacheEnabled", true);
//		caps.setCapability("acceptSslCerts",true);
////		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\Users\\sandra\\Documents\\Eclipse\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin"); 
//		driver = new PhantomJSDriver(caps);
//		
//		driver.manage().timeouts().implicitlyWait(25000, TimeUnit.SECONDS);
//		driver.manage().getCookies();
//		return driver;
//	}
//}
	
	public class Appdriver {

		public WebDriver driverInit()
		{
			System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//Chromedriver//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			return driver;
		}
		public WebDriver driverChrome()
		{
			WebDriver driver;
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setJavascriptEnabled(true);
			caps.setCapability("cssSelectorsEnabled", false);
			caps.setCapability("applicationCacheEnabled", true);
			caps.setCapability("acceptSslCerts",true);
//			caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY,"C:\\Users\\sandra\\Documents\\Eclipse\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin"); 
			driver = new PhantomJSDriver(caps);
			
			driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
			driver.manage().getCookies();
			return driver;
		}
	}

	
	

