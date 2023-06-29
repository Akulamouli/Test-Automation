package parallel;

import java.time.Duration;
import java.util.Properties;

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ThreadGuard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//protected static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	 
    //public String baseUrl= "https://www.amazon.in/";

    public static   Boolean goToHomepage(String browser) {
        try {
        	BaseClassImplement obj1  = new  BaseClassImplement();
        	obj1.openBrowser(browser);
             
            
        } catch (Exception e) {
            System.out.println("Unable to navigate to the homepage");
            e.printStackTrace();
            return false;
        }
        return true;
    }

   /* public static WebDriver getDriver() {
        return driver.get();
    }
    private  void  openBrowser(String browser) {

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                
                driver.set(ThreadGuard.protect(new ChromeDriver()));
                break;

            case "edge":
            	WebDriverManager.edgedriver().setup();
                driver.set(ThreadGuard.protect(new EdgeDriver()));
                break;

            
        }

        //assert getDriver() != null;
        getDriver().manage().window().maximize();
    }
    public void closeBrowser() {
    	getDriver().close();
        getDriver().quit();
        driver.remove();
    }*/

     
}
