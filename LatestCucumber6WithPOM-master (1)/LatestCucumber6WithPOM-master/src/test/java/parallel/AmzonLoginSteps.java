package parallel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmzonLoginSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		DriverFactory.getDriver()
		.get("https://www.amazon.in/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page1() {
	    // Write code here that turns the phrase above into concrete actions
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user clicks on {string} dropdown")
	public void user_clicks_on_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.clickOnLoginLogo();
	}

	@Then("user redirected to the Sign in page")
	public void user_redirected_to_the_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@When("user enters username {string}")
	public void user_enters_username(String  username) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterUserName(username);
	}

	@When("user clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.clickOnContinue1();
	}

	@Then("user enters password {string}")
	public void user_enters_password(String  password) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterPassword(password);
	}

	@Then("user clicks on Signin button")
	public void user_clicks_on_signin_button() {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.clickOnSubmit();
	}

	 

	@Then("user enters worng password {string}")
	public void user_enters_worng_password(String wrongPassword) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterWrongPassword(wrongPassword);
	}

	@Then("user gets the error message1 {string}")
	public void user_gets_the_error_message1(String errorPasswordMesssage) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.verifyWrongPassword(errorPasswordMesssage);
	}
	@Then("user gets the error message2 {string}")
	public void user_gets_the_error_message2(String errorMesssage) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.verifyErrorMessage2(errorMesssage);
	}
	@Then("user gets the error message3 {string}")
	public void user_gets_the_error_message3(String errorMesssage) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.verifyErrorMessage3(errorMesssage);
	}
	@Then("user gets the error message4 {string}")
	public void user_gets_the_error_message4(String errorMesssage) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.verifyErrorMessage4(errorMesssage);
	}

	@Then("error message should be verified correct")
	public void error_message_should_be_verified_correct() {
	    // Write code here that turns the phrase above into concrete actions
		 
	}@When("user enters username worng email {string}")
	public void user_enters_username_wrong_email(String wrongEmail) {
	    // Write code here that turns the phrase above into concrete actions
		loginPage.enterUserName(wrongEmail);
	}

	@When("user does not enters username")
	public void user_does_not_enters_username() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@When("user enters dose not enter username")
	public void user_enters_dose_not_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	     
	}

	@Then("user does not enters  password")
	public void user_does_not_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
