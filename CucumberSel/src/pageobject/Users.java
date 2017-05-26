package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Users {

	WebElement element =null;
	String message= null;
	
	
	public WebElement txt_username(WebDriver d) throws Exception {

		try 
		{
			element = d.findElement(By.id("user_email"));
			 System.out.println("Valid Email id Found");
		}
		catch (Exception e)
		{
			System.out.println("Not found valid email id");
			throw e;
		}
		return element;

	}

	public WebElement txt_password1(WebDriver d) throws Exception {
		try 
		{
			element = d.findElement(By.id("user_password"));
			 System.out.println("Password text field found");

		}

		catch (Exception e) 
		{
			System.out.println("Password text field not found");
			throw e;
		}
		return element;

	}

		
	public WebElement txt_first_name(WebDriver d)throws Exception
	{
		try
		{
		element=d.findElement(By.id("user_first_name"));
		System.out.println("Entered First Name");
		}
		
		catch(Exception e)
		{
			System.out.println("Not found First Name");
		}
		return element;
	}
	

  
  public WebElement txt_last_name(WebDriver d)throws Exception
  {
  	try
  	{
  		element=d.findElement(By.id("user_last_name"));
  		System.out.println("Entered Last Name");
  	}
  	
  	catch(Exception e)
  	{
  		System.out.println("Not found last name");
  	}
  	return element;
  }
  
  public WebElement txt_email(WebDriver d)throws Exception
  {
  	try
  	{
  		element=d.findElement(By.id("user_email"));
  		System.out.println("Enter valid email id");
  	}
  	
  	 catch(Exception e)

        {
  		System.out.println("Invalid Email id found");
  		
        }
  	return element;
  	
  }
  
  public WebElement txt_password(WebDriver d)throws Exception
  {
  	try
  	{
  		element=d.findElement(By.id("user_password"));
  		System.out.println("Entered valid password");
  	}
  	catch(Exception e)
  	{
  		System.out.println("Invalid password found");
  	}
  	return element;
  	
  }
  public WebElement txt_confirm_password(WebDriver d)throws Exception
  {
  	try
  	{
  		element=d.findElement(By.id("user_password_confirmation"));
  		System.out.println("Entered valid password");
  	}
  	catch(Exception e)
  	{
  		System.out.println("Invalid password found");
  	}
  	return element;
  	
  }
  
  public Select drpdwn_Org(WebDriver driver) throws Exception
	 {
		 Select select;
		try
		 {
			 select = new Select(driver.findElement(By.id("user_organization_id")));
			 System.out.println("Organization value found");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Organization value not found");
			 throw e;
		 }
		 return select;
	 }
  
  public Select drpdwn_loc(WebDriver driver) throws Exception
	 {
		 Select select;
		try
		 {
			 select = new Select(driver.findElement(By.id("user_location_id")));
			 System.out.println("location value found");
		 }
		 catch(Exception e)
		 {
			 System.out.println("location value not found");
			 throw e;
		 }
		 return select;
	 }
   
  public Select drpdwn_grp(WebDriver driver) throws Exception
	 {
		 Select select;
		try
		 {
			 select = new Select(driver.findElement(By.id("user_group_id")));
			 System.out.println("Group value found");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Group value not found");
			 throw e;
		 }
		 return select;
	 }
  
  
  public Select drpdwn_assigned(WebDriver driver) throws Exception
	 {
		 Select select;
		try
		 {
			 select = new Select(driver.findElement(By.id("user_user_id")));
			 System.out.println("Assigned To value found");
		 }
		 catch(Exception e)
		 {
			 System.out.println("Assigned To value not found");
			 throw e;
		 }
		 return select;
	 }
  

  public WebElement btn_create(WebDriver d)throws Exception
  {
  	try
  	{
     	element=d.findElement(By.name("commit"));
        System.out.println("Clicked on Create button");
  	}
  
  	 catch(Exception e)
  	{
  		 throw e;
  	}
		return element;
  
  }
  
  
  public WebElement search_user(WebDriver d)throws Exception
  {
	  try
	  {
		  element=d.findElement(By.id("first_name"));
		  System.out.println("Result found");
	  }
	  
	  
	  catch(Exception e)
	  {
		  throw e;
	  }
	return element;
	  
  }
  
  public String search_msg(WebDriver driver)throws Exception
  {
	  try
	  {
		  message = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[4]/div/div/div[2]")).getText();
	  }
	  catch(Exception e)
	  {
		  throw e;
	  }
	  return message;
  }
  
  
  public WebElement success_msg(WebDriver driver)throws Exception
  {
  	try
  	{

  		element =driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]"));
  		System.out.println(message);
  		System.out.println("message found");
  	}
  	catch(Exception e)
  	{
  		System.out.println("message not found");
  		throw e;
  	}
  	return element;
  }
  
  
  public WebElement menu_Users(WebDriver driver)throws Exception
  {
  	try
  	{

  		element = driver.findElement(By.linkText("Users"));
  		System.out.println("Users menu option found");
  		
  	}
  	catch(Exception e)
  	{
  		System.out.println("message not found");
  		throw e;
  	}
  	return element;
  }

} 
  
  

