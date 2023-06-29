package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	private WebDriver driver;

	// 1. By Locators: OR
	@FindBy(xpath = "//div/span[text()='Hello, sign in']")
	private By emailId;
	@FindBy(xpath = "//input[@id=\"ap_password\"]")
	private By password;
	@FindBy(xpath = "//input[@id=\"continue\"]")
	private By continue1;
	@FindBy(xpath = "//div/span[text()='Hello, sign in']")
	private WebElement loginLogo;
	@FindBy(xpath = "//div/span[text()='Hello, sign in']")
	private WebElement submit;
	@FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
	private WebElement errorWrongPassword;
	@FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
	private WebElement wrongEmail;
	@FindBy(xpath = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span")
	private WebElement error1;
	@FindBy(xpath = "//*[@id=\"auth-email-missing-alert\"]/div/div")
	private WebElement error2;
	@FindBy(xpath = "//*[@id=\"auth-email-missing-alert\"]/div/div")
	private WebElement error3;
	//div/span[text()='Hello, sign in']
	//input[@type="email"]
	//input[@id="continue"]
	//input[@id="ap_password"]
	//*[@id="auth-error-message-box"]/div/div/ul/li/span
	//*[@id="auth-email-missing-alert"]/div/div
	//*[@id="auth-error-message-box"]/div/div/ul/li/span
	//*[@id="auth-email-missing-alert"]/div/div
	//*[@id="auth-password-missing-alert"]/div/div
	// 2. Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	 
	public boolean clickOnLoginLogo(){
		return driver.findElement((By) loginLogo).isDisplayed();
	}

	public void enterUserName(String username) {
		driver.findElement(emailId).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnContinue1() {
		driver.findElement(continue1).click();
	}
	public void clickOnSubmit() {
		driver.findElement((By) submit).click();
	}
	
	public void enterWrongPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void verifyWrongPassword(String errorpws)  {
		driver.findElement((By) errorWrongPassword).getText() ;
	}
	 
	public void verifyErrorMessage2(String errorMesssage)  {
		driver.findElement((By) error1).getText() ; 
		 	 
	}
	
	public void verifyErrorMessage3(String errorMesssage)  {
		driver.findElement((By) error2).getText() ; 
	}
	
	public void verifyErrorMessage4(String errorMesssage)  {
		driver.findElement((By) error3).getText() ; 
	}
	
 
	/*public AccountsPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(emailId).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(continue1).click();
		return new AccountsPage(driver);
	}
*/
}
