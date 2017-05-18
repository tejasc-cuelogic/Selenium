package AutomationFramework;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import drivers.driverinitialization;
import pageObject.LoginForm;

public class Usernamepwd {
 	
	LoginForm login = new LoginForm();
	Appdriver intdriver = new Appdriver();
    WebDriver d=intdriver.init();
    
//    @Given (^"I should have the phalanx home page url")   
    
    public String get_url()
    {
    	String url;
    	try
    	{
    		url="https://admin-stg.travelpass.com/users/sign_in";
    		System.out.println("phalanx url is"  +url);
    	}
    	
    	catch (Exception e)
    	{
    		System.out.println("Test Case to get phalanx url failed");
	    	throw e;
    	}
		return url;
    	
    }

//    @When("I navigate to home page of phalanx application")
     public void validate_url()
     {
    	 try
    	 {
    	    d.get(get_url());
    	    System.out.println("Navigating to phalanx home page url ");
    	 }
    	 catch(Exception e)
    	 {
    		 System.out.println("Falied to navigate phalanx home page url");
    	 }
     }
     
    
	   public void Invalidusernamepwd()throws Exception
	   {
		  
	   	   login.txt_username(d).sendKeys("sandra.john123@cuelogic.co.in");
		   login.txt_password(d).sendKeys("cuelogic12");
		   d.findElement(By.name("commit")).click();
		   
		  d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		   
		  if(login.err_message_text(d).contains("Invalid email or password"))
		  {
			  
			  System.out.println("Unsucessful Login");
		  }
		  else
		  {
			  System.out.println("Successful Login");
		  }
		 
	 }
	
	   public void blankusernamepwd()throws Exception
	   {
	   
		   login.txt_username(d).sendKeys("");
           login.txt_password(d).sendKeys(""); 	
           d.findElement(By.name("commit")).click();
	   
          d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
            
           
          if(login.blank_message_txt(d).contains("Invalid email or password"))
        	  
           {
        	  System.out.println("Unsuccessful Login");
        	
           }
          else
          {
        	  System.out.println("Successful Login");
          }
	   }
	   
//	@Then (^"I should land on You are here screen")   
	public void Usernamepwd() throws Exception
	{
		
		login.txt_username(d).sendKeys("sandra.john@cuelogic.co.in");
		login.txt_password(d).sendKeys("cuelogic!");
		d.findElement(By.name("commit")).click();
		d.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
		if(login.success_message_text(d).contains("Home"))
		{
			System.out.println("valid_username_password");
		}
		
		else
		{
			System.out.println("Invalid Username and password");
		}
		
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if (d.findElement(By.xpath("/html/body/div[3]/div/div")).getText().contains("Invalid email or password"))
//		{
//			System.out.println("Testcase is passed");
//			
//		}
//		else
//		{
//			System.out.println("Testcase is failed");
//		}
//		
//		
	}

	
	

	   


