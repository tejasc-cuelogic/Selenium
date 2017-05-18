package AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Main {

  public static void main(String args[]) throws Exception{
	  
	  Usernamepwd log = new Usernamepwd();
	 
	  log.validate_url();
	  log.Invalidusernamepwd();
	  log.blankusernamepwd();
	  log.Usernamepwd();
	 
  }


}
