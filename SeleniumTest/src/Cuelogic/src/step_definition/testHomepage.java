package step_definition;

import org.apache.bcel.verifier.exc.StaticCodeConstraintException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.homepage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driverInitialize.driverInitialize;

public class testHomepage {

	static driverInitialize d = new driverInitialize();
	static WebDriver driver = d.driverInit();
	static homepage home = new homepage();
	
	
	@Given("^I should have the cuelogic home page url$")
	public String get_url() throws Exception {
		String url ;
		try
	    {
	    	url = "http://www.cuelogic.com";
	    	System.out.println("Cuelogic's url is " +url);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Test Case to get Cuelogic's url failed");
	    	throw e;
	    }
	    return url;
	}

	@When("^I navigate to the cuelogic home page url$")
	public void navigate_url() throws Exception {
	    try
	    {
	    	driver.get(get_url());
	    	Thread.sleep(7000);
	    	System.out.println("Attempting to navigate to cuelogic home page url");
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Test Case to navigate to cuelogic home page url failed");
	    	throw e;
	    }
	}

	@Then("^I should land on cuelogic home page$")
	public void validate_homepage() throws Exception {
	    try
	    {
	    	String pageTitle = driver.getTitle();
	    	System.out.println("Cuelogic's Home Page title is " +pageTitle);
	    	if(pageTitle.equals("Outsourced Product Development Services| Software Engineering and Application Re-engineering Services | Startups and Enterprises | Cuelogic Technologies"));
	    	{
	    		System.out.println("Landed on home page");
//	    		System.out.println(driver.getPageSource());
	    	}
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Test case to land on cuelogic's home page has failed");
	    	throw e;
	    }
	}

	@Then("^should be able to view its logo$")
	public void validate_logo() throws Exception {
		try
		{
			if (home.logo_cuelogic(driver).isDisplayed())
			{
				System.out.println("Cuelogic logo found");
			}
		}
		catch(Exception e)
		{
			System.out.println("Test case of finding cuelogic logo failed");
			throw e;
		}
	}
	
	
}
