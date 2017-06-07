package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reservations {

	
	WebElement element = null;
	String message = null;

	public WebElement txt_username(WebDriver d) throws Exception {

		try {
			element = d.findElement(By.id("user_email"));
			System.out.println("Valid Email id Found");
		} catch (Exception e) {
			System.out.println("Not found valid email id");
			throw e;
		}
		return element;

	}

	public WebElement txt_password1(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.id("user_password"));
			System.out.println("Password text field found");

		}

		catch (Exception e) {
			System.out.println("Password text field not found");
			throw e;
		}
		return element;

	}

     public WebElement clicks_reser(WebDriver d)throws Exception
     {
    	 try
    	 {
    		
    		 element=d.findElement(By.xpath("//a[contains(.,'Reservations')]"));
//    		 element=d.findElement(By.xpath((".//ul[@class='page-sidebar-menu']//li[@class='menu-sub active dropdown']//span[@class='title']")));
    		 System.out.println("Reservations Found");
    	 }
    	 
    	 catch(Exception e)
    	 {
    		 throw e;
    	 }
		return element;
    	 
     }
     
     public WebElement clicks_maindb(WebDriver d)throws Exception
     {
    	 try
    	 {
             element = d.findElement(By.xpath("//a[contains(.,'Main Database')]"));
    		 //element=d.findElement(By.xpath(".//ui[@class='sub-menu']//li[@class='start active simple-navigation-active-leaf']//span[@class='Main Database'])"));
    		 System.out.println("Main Database Found");
    		 
    	 }
    	 
    	 catch(Exception e)
    	 {
    		 throw e;
    	 }
		return element;
    	 
     }
     
     public WebElement txt_name(WebDriver d)throws Exception
     {
    	 try
    	 {
    		 element=d.findElement(By.id("name"));
    		 System.out.println("Enterd valid name");
    	 }
    	 catch(Exception e)
    	 {
    		 throw e;
    	 }
		return element;
    	 
     }


  public WebElement txt_email(WebDriver d)throws Exception
  {
	 try
	 {
		 element=d.findElement(By.id("email"));
		 System.out.println("Enterd valid email id");
	 }
	 catch(Exception e)
	 {
		 throw e;
	 }
	return element;
	 
}
  
  
  public Select drp_provider(WebDriver driver)throws Exception
  {
	  Select select;
	  
	  try
	  {
		  select= new Select(driver.findElement(By.id("provider_name")));
	      System.out.println("Provider Found");
      }

	  catch(Exception e)
	  {
		  throw e;
	  }
	return select;
}
  
  public WebElement btn_search(WebDriver d)throws Exception
  {
	  try
	  {
		  element= d.findElement(By.xpath("//input[contains(@class,'btn green lazy-submit')]"));
	      System.out.println("Search button found");
	  }
	  
	  catch(Exception e)
	  {
		  throw e;
	  }
	return element;
	  
  }
  
	public String success_message_text(WebDriver driver) throws Exception {
		try 
		{
			message = driver.findElement(By.xpath("//h4[contains(.,'No records found!')]")).getText();
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
