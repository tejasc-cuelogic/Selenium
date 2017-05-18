package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginForm {

	WebElement element = null;
	String message = null;

	public WebElement txt_username(WebDriver d) throws Exception {

		try 
		{
			element = d.findElement(By.id("user_email"));
			// System.out.println("Valid Email id Found");
		}
		catch (Exception e)
		{
			System.out.println("Not found valid email id");
			throw e;
		}
		return element;

	}

	public WebElement txt_password(WebDriver d) throws Exception {
		try 
		{
			element = d.findElement(By.id("user_password"));
			// System.out.println("Password text field found");

		}

		catch (Exception e) 
		{
			System.out.println("Password text field not found");
			throw e;
		}
		return element;

	}

	public WebElement btn_Sign(WebDriver d) throws Exception {
		try 
		{
			element = d.findElement(By.id("commit"));

		}

		catch (Exception e) 
		{
			System.out.println("");
			throw e;
		}
		return element;

	}

  public String err_message_text(WebDriver driver) throws Exception{
		
		try
		{
			message = driver.findElement(By.xpath("/html/body/div[3]/div/div")).getText();
//			driver.findElement(By.xpath("//div[@class='col-md-10 col-md-offset-1 text-center alert alert-danger fade in alert-dismissable']"))
			System.out.println(message);
			System.out.println("error message found");
		}
		
		catch(Exception e)
		{
			System.out.println("error message not found");
			throw e;
		}
		 return message;
	}


   public String blank_message_txt(WebDriver driver) throws Exception
   
   {
	   try
	   {
		   message=driver.findElement(By.xpath("/html/body/div[3]/div/div")).getText();
	  
		   System.out.println("message");
		   System.out.println("error message found");
	   }
	   
	   catch(Exception e)
	   {
		   System.out.println("error message not found");
		   throw e;
	   }
	   return message;
   }


	public String success_message_text(WebDriver driver) throws Exception {
		try 
		{
			message = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]")).getText();
			System.out.println(message);
			System.out.println("message found");
		} 
		
		catch (Exception e)
		{
			System.out.println("message not found");
			throw e;
		}
		return message;
	}

}


