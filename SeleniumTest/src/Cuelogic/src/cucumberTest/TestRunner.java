package cucumberTest;

import java.io.File;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.ExtentCucumberFormatter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature"
		,glue={"step_definition"}
//		, format = {"pretty", "html:target/Destination"}
//		, format = { "pretty", "html:target/site/cucumber-pretty", "json:target/cucumber.json"}
		, tags = { "~@ignore" }
		, plugin = { "html:target/cucumber-html-report",
		        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
		        "usage:target/cucumber-usage.json", "junit:target/cucumber-results.xml" }
	
		)

public class TestRunner {

	public static void main(String[] args) {
		
	}
	
//	@BeforeClass
//	public static void setup()
//	{
//		
//		ExtentCucumberFormatter.initiateExtentCucumberFormatter();
//		ExtentCucumberFormatter.loadConfig(new File("C:\\Users\\sandra\\Documents\\Eclipse\\extentreports-java-3.0.3\\extentreports-java-3.0.3\\extent-config.xml"));
//		
//	}
       
}