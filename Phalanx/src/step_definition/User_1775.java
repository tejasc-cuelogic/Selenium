package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinit.Appdriver;
import pageobject.AllUsers;

public class User_1775 {

	String url="https://admin-stg.travelpass.com";
	AllUsers creates=new AllUsers(); 
	
	
	Appdriver intdriver = new Appdriver();
    WebDriver d = intdriver.driverInit();
    
    Actions act = new Actions(d);
  
    @Given("^I am on Phalanx's login page$")
    public void get_phx_url() throws Exception
    {
    	try
    	{
    		d.get(url);
    		if(d.getCurrentUrl().contains("admin-stg"))
    		{
    			System.out.println("Phx url entered");
    		}
    		else
    		{
    			System.out.println("Phx url not entered");
    		}
    	}
    	catch(Exception e)
    	{
    		System.out.println("get_phx_url failed");
    		throw e;
    	}
    }
          
    @Given("^Enter valid username and password$")
    public void enter_Usernamepwd() throws Exception 
    {
   
    	creates.txt_username(d).sendKeys("sandra.john@cuelogic.co.in");
    	creates.txt_password(d).sendKeys("cuelogic!");
    	d.findElement(By.name("commit")).click();
    	Thread.sleep(10000);
    	if(d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/div/div[1]")).getText().contains("Home"))
    	{
    		System.out.println("Logged In Successfully");
    	}
    	else
    	{
    		System.out.println("Unsccessful Login");
    	}

    }
     
    @Given("^User is on All Users page$")
    public void all_users() throws Exception
    {
//    	d.get(url+"/registrations");
//    	Thread.sleep(10000);
//    	if(d.getCurrentUrl().contains("registrations"))
//    	{
//    		System.out.println("User has landed on All Users page");
//    	}
    	
//    	System.out.println(creates.clicks_user(d).getText());
    	
       creates.clicks_user(d).sendKeys(Keys.ENTER);  	
        Thread.sleep(9000);

        System.out.println(d.getCurrentUrl());
        System.out.println("It has come hereeeeee");
        
		  creates.all_users(d).click();
		  System.out.println("It has reached here");
   	 	
    } 
    
//    @When("^Enter valid details in all fields$")
//    public void create_user() throws Exception
//    {
//    	creates.txt_first_name(d).sendKeys("travelprashant");
//    	creates.txt_last_name(d).sendKeys("travelprashants");
//    	creates.txt_email(d).sendKeys("chaudharitejas986@yahoo.com");
//    	creates.txt_password(d).sendKeys("tejas789@");
//    	creates.txt_confirm_password(d).sendKeys("tejas789@");
//    	creates.drpdwn_Org(d).selectByVisibleText("Allied Globals");
//    	Thread.sleep(2000);
//    	creates.drpdwn_loc(d).selectByVisibleText("Belize City, Belize");
//    	Thread.sleep(2000);
//    	creates.drpdwn_grp(d).selectByVisibleText("Manager One");
//    	Thread.sleep(2000);
// 	
//    	creates.drpdwn_assigned(d).selectByVisibleText("Super Man");	
//    	creates.btn_create(d).click();
//    	Thread.sleep(4000);
//    }	
//    	
//    public void invalid_input()throws Exception
//    {
//    	creates.txt_first_name(d).sendKeys("tejas@123");
//    	creates.btn_create(d).click();
//    }
    
    @When("^I click on Search button$")
    public void search_users() throws Exception
    {
     
      creates.search_user(d).sendKeys("Tejas.chaudhari88@yahoo.com");	
      creates.SearchButton(d).click();
      Thread.sleep(5000);
      creates.btn_search1(d).click();	
     }
    
    
//    @Then("^Successful message should be displayed$")
//    public void success_message() throws Exception
//    {
//    	try
//    	{
//    	    if(creates.success_msg(d).getText().contains("User was successfully created.")) 
//    	      {
//    	    	   System.out.println("User created");
//    	       }
//    	    else
//    	       {
//    	    	   System.out.println("User not created");
//    	    	   System.out.println(creates.success_msg(d).getText());
//    	       }
//    	}
//    	
//    	 catch(Exception e) 
//    	 {
//    		 System.out.println("success_message method failed");
//    		 throw e;
//    	 }
//    	     	    
//}
    
	@Then("^I should see appropriate result for invalid input$")
    public void no_record__mesg()throws Exception
    {
    	try
    	{
    		if(creates.search_msg(d).contains("No records found"))
    		{
    			System.out.println("User Not Exist");
    		}
    		
    		else
    		{
    			System.out.println("User Exist");
    		}
    	}
    		catch(Exception e)
    		{
    			throw e;
    		}
    }
    
	
	@Then("^I should see valid result for given input$")
	public void search_success_mesg()throws Exception
    {
    	try
    	{
    		if(creates.btn_search1(d).getText().contains("tejas chaudhari"))
    		{
    				
    			System.out.println("User Found");
    		}
    		
    		else
    		{
    	      System.out.println("User Not Found");
    	
    		}
    	}
    	
    	catch(Exception e)
    	{
    		throw e;
    	}
    	
    	
    }
	
	
	
	
	
	
}
