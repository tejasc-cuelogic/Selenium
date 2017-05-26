

package step_definition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverinit.Appdriver;
import pageobject.Users;
//import driverinitialise.Appdriver;
import step_definition.InputDetails;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class InputDetails {

	String url="https://admin-stg.travelpass.com";
	Users creates=new Users(); 
	
	Appdriver intdriver = new Appdriver();
    WebDriver d = intdriver.driverInit();
//    Actions act = new Actions(d);
  
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
    	if(d.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div")).getText().contains("Home"))
    	{
    		System.out.println("Logged In Successfully");
    	}
    	else
    	{
    		System.out.println("Unsccessful Login");
    	}

    }
     
    @When("^Click on Users and then click on add users$")
    public void user()throws Exception
    {

    	d.get(url+"/registrations/new");
    	Thread.sleep(10000);
    	if(d.getCurrentUrl().contains("registrations"))
    	{
    		System.out.println("User has landed on All Users page");
    	}
    }	
    
    
    @When("^Enter valid details in all fields$")
    public void create_user() throws Exception
    {
    	creates.txt_first_name(d).sendKeys("travelprashant");
    	creates.txt_last_name(d).sendKeys("travelprashants");
    	creates.txt_email(d).sendKeys("chaudharitejas986@yahoo.com");
    	creates.txt_password(d).sendKeys("tejas789@");
    	creates.txt_confirm_password(d).sendKeys("tejas789@");
    	creates.drpdwn_Org(d).selectByVisibleText("Allied Globals");
    	Thread.sleep(2000);
    	creates.drpdwn_loc(d).selectByVisibleText("Belize City, Belize");
    	Thread.sleep(2000);
    	creates.drpdwn_grp(d).selectByVisibleText("Manager One");
    	Thread.sleep(2000);
 	
    	creates.drpdwn_assigned(d).selectByVisibleText("Super Man");	
    	creates.btn_create(d).click();
    	Thread.sleep(4000);
    }	
    	
    public void invalid_input()throws Exception
    {
    	creates.txt_first_name(d).sendKeys("tejas@123");
    	creates.btn_create(d).click();
    }
    
    
    
    
    @Then("^Successful message should be displayed$")
    public void success_message() throws Exception
    {
    	try
    	{
    	    if(creates.success_msg(d).getText().contains("User was successfully created.")) 
    	      {
    	    	   System.out.println("User created");
    	       }
    	    else
    	       {
    	    	   System.out.println("User not created");
    	    	   System.out.println(creates.success_msg(d).getText());
    	       }
    	}
    	
    	 catch(Exception e) 
    	 {
    		 System.out.println("success_message method failed");
    		 throw e;
    	 }
    	     	    
}
    	
   
     
    @Given("^User is on All Users page$")
    public void all_users() throws Exception
    {
       try
       {
    	   
       }
    	
       catch(Exception e)
       {
    	   System.out.println("all_users method failed");
    	   throw e;
       }
    }

//    @Given("^I click on \"([^\"]*)\" button$")
//    public void i_click_on_button(String arg1) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("^I should see searched user name in the list$")
//    public void i_should_see_searched_user_name_in_the_list() throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();


}
