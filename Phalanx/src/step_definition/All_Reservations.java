package step_definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinit.Appdriver;
import pageobject.Reservations;

public class All_Reservations {

String url= "https://admin-stg.travelpass.com";

    Reservations Res=new Reservations(); 
	Appdriver intdriver = new Appdriver();
    WebDriver driver = intdriver.driverInit();	
	
    @Given("^I am on Phalanx's login page$")
    public void get_phx_url()throws Exception
    {
    	try
    	{
    	  driver.get(url);
    	  if(driver.getCurrentUrl().contains("admin"))
    	  {
    		  System.out.println("Phx login url entered");
    	  }
    	  else
    	  {
    		  System.out.println("Phx url not entered");
    	  }
    	} 
    	
    	catch(Exception e)
    	  {
    		  throw e;
    	  }
   }
    
    @Given("^Enter valid username and password$")
   public void enter_Usernamepwd()throws Exception
   {
	   
	   Res.txt_username(driver).sendKeys("sandra.john@cuelogic.co.in");
	   Res.txt_password1(driver).sendKeys("cuelogic!");
	   driver.findElement(By.name("commit")).click();
	   Thread.sleep(20000);
	   
	   if(driver.findElement(By.xpath("//div[contains(.,'Home')]")).getText().contains("Home"))
			   
         {
	        System.out.println("User is on home page");
	   
         }
	   else
	   {
		   System.out.println("User is not on home page");
	   }
   }    
	
   
    @When("^Click on Main database submenu$")
   public void click_reservations()throws Exception
   {
    	driver.manage().window().maximize();
	   
    	Res.clicks_reser(driver).click();
    	Thread.sleep(10000);
    	System.out.println(driver.getCurrentUrl());
       
        Res.clicks_maindb(driver).sendKeys(Keys.ENTER);
        Thread.sleep(10000);
        System.out.println(driver.getCurrentUrl());
   }
   

    @When("^Enter input and click on search$")
    public void search_reser()throws Exception
    {
    	Res.txt_name(driver).sendKeys("Test");
    	
    	Res.txt_email(driver).sendKeys("gopalk@iprogrammer.com");
    	
    	Res.drp_provider(driver).selectByVisibleText("Bdc");
    	
    	Res.btn_search(driver).click();
    	
    	Thread.sleep(6000);
    	System.out.println("Clicked on search");
    	
    }
    
    @Then("^Application should display success message$")
    public void record_msg()throws Exception
    {
    	try
    	{
    		if(Res.success_message_text(driver).contains("No records found!"))
    		{
    			System.out.println("No Record Found");
    		}
    		else
    		{
    			System.out.println("Record Found");
    		}
    		
    	}
    	
    	catch(Exception e)
    	{
    		throw e;
    	}
    	
    }


}

