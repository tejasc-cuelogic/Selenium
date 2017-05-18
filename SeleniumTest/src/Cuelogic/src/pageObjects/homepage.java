package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	
	WebElement element = null;
	
	public WebElement logo_cuelogic(WebDriver driver) throws Exception
	{
		try
		{
			element = driver.findElement(By.xpath("html/body/header/nav/div/div[1]/a"));
			System.out.println("Cuelogic Logo is found");
		}
		catch(Exception e)
		{
			System.out.println("Cuelogic Logo is not found");
			throw e;
		}
		return element;
	}

}
