package testrunners;

 
 
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.junit.runner.RunWith;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import parallel.BaseClass;
import parallel.BaseClassImplement;

 
 
@CucumberOptions(
		features = {"classpath:features"},
		glue = {"stepdefinitions" },
		plugin = {"pretty"}
		
		)
@Test
public class MyTestRunnerForCross  extends AbstractTestNGCucumberTests {
	@BeforeSuite
	   @Parameters("browser")
	    public void setup( String browser) {
		  BaseClass.goToHomepage(browser);

	         
	    }

	    /**
	     * This method runs after every test (including during parallel execution).
	     */
	@AfterClass
	    public void tearDown() {
			BaseClassImplement.closeBrowser();
	    }
}
