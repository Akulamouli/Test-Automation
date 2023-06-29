package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ThreadGuard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassImplement {
	protected static final ThreadLocal<WebDriver> tdriver = new ThreadLocal<>();
	 
	 public String baseUrl= "https://www.amazon.in/";
public static WebDriver getDriver() {
    return tdriver.get();
}
public WebDriver  openBrowser(String browser) {

    switch (browser) {
        case "chrome":
            WebDriverManager.chromedriver().setup();
            
            tdriver.set(ThreadGuard.protect(new ChromeDriver()));
            break;

        case "edge":
        	WebDriverManager.edgedriver().setup();
            tdriver.set(ThreadGuard.protect(new EdgeDriver()));
            break;
             
        
    }
    getDriver();
     
    //assert getDriver() != null;
    getDriver().manage().window().maximize();
    return getDriver();

}
 
public static void closeBrowser() {
	getDriver().close();
    getDriver().quit();
    tdriver.remove();
}
}