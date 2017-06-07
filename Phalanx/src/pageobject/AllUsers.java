package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AllUsers {

	
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

	public WebElement txt_first_name(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.id("user_first_name"));
			System.out.println("Entered First Name");
		}

		catch (Exception e) {
			System.out.println("Not found First Name");
		}
		return element;
	}

	public WebElement txt_last_name(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.id("user_last_name"));
			System.out.println("Entered Last Name");
		}

		catch (Exception e) {
			System.out.println("Not found last name");
		}
		return element;
	}

	public WebElement txt_email(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.id("user_email"));
			System.out.println("Enter valid email id");
		}

		catch (Exception e)

		{
			System.out.println("Invalid Email id found");

		}
		return element;

	}

	public WebElement txt_password(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.id("user_password"));
			System.out.println("Entered valid password");
		} catch (Exception e) {
			System.out.println("Invalid password found");
		}
		return element;

	}

	public WebElement txt_confirm_password(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.id("user_password_confirmation"));
			System.out.println("Entered valid password");
		} catch (Exception e) {
			System.out.println("Invalid password found");
		}
		return element;

	}

	public Select drpdwn_Org(WebDriver driver) throws Exception {
		Select select;
		try 
		{
			select = new Select(driver.findElement(By.id("user_organization_id")));
			System.out.println("Organization value found");
		} 
		catch (Exception e) {
			System.out.println("Organization value not found");
			throw e;
		}
		return select;
	}

	public Select drpdwn_loc(WebDriver driver) throws Exception {
		Select select;
		try 
		{
			select = new Select(driver.findElement(By.id("user_location_id")));
			System.out.println("location value found");
		} 
		catch (Exception e)
		{
			System.out.println("location value not found");
			throw e;
		}
		return select;
	}

	public Select drpdwn_grp(WebDriver driver) throws Exception {
		Select select;
		try 
		{
			
			select = new Select(driver.findElement(By.id("user_group_id")));
			System.out.println("Group value found");
		} 
		
		catch (Exception e) 
		{
			System.out.println("Group value not found");
			throw e;
		}
		return select;
	}

	public Select drpdwn_assigned(WebDriver driver) throws Exception {
		Select select;
		
		try 
		{
			select = new Select(driver.findElement(By.id("user_user_id")));
			System.out.println("Assigned To value found");
		} 
		
		catch (Exception e)
		{
			System.out.println("Assigned To value not found");
			throw e;
		}
		return select;
	}

	public WebElement btn_create(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.name("commit"));
			System.out.println("Clicked on Create button");
		}

		catch (Exception e) {
			throw e;
		}
		return element;

	}
	
	
	


	public WebElement clicks_user(WebDriver d) throws Exception {
		
		try 
		{
//			element = d.findElement(By.xpath("//a[contains(.,'Users')]"));
			  element=d.findElement(By.xpath("//a[contains(.,'Users')]"));
			System.out.println("Users Found");
			System.out.println("leaving from here");
		}

		catch (Exception e)
		{
			throw e;
		}
		return element;
	}

	public WebElement all_users(WebDriver d) throws Exception {
		try
		{
//			element=d.findElement(By.xpath("//span[contains(.,'All Users')]"));

			element= d.findElement(By.xpath("//a[contains(.,'All Users')]"));	
//			System.out.println(d.getCurrentUrl());
			
			System.out.println("All Users Found");
		}

		catch (Exception e)
		{
			
			throw e;
			
		}
		return element;
	}

	public WebElement search_user(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.id("email"));
			System.out.println("Enterd Email id ");
		}

		catch (Exception e)
		{
			throw e;
			
		}
		return element;

	}
	
	public WebElement SearchButton(WebDriver d) throws Exception {
		try {
			element = d.findElement(By.xpath(".//input[@class='btn green lazy-submit']"));
			System.out.println("clicked on search button ");
		}

		catch (Exception e)
		{
			throw e;
			
		}
		return element;

	}

	
	public WebElement btn_search1(WebDriver d) throws Exception
	{
		try
		{
			WebElement element=d.findElement(By.xpath(".//div[@class='portlet box green']//tr[@class='odd']//td[1]"));
			String one=element.getAttribute("innerHTML");
			System.out.println("text found " +one);
		}
		
		catch(Exception e)
		{
			throw e;
			
		}
		
		return element;
	}	
		
	
		

	public String search_msg(WebDriver driver) throws Exception {
		try 
		{
			message = driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[4]/div/div/div[2]/div/div/h4")).getText();
			System.out.println("No Record Found");
		} 
		catch (Exception e)
		{
			System.out.println("Record Found");
			throw e;
		}
		return message;
	}

	public WebElement success_msg(WebDriver driver) throws Exception {
		try 
		{

			element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]"));
			System.out.println(message);
			System.out.println("message found");
		} 
		
		catch (Exception e)
		{
			System.out.println("message not found");
			throw e;
		}
		return element;
	}
}
	
	
	

