package parallel;

 

import static org.junit.Assert.assertEquals;
 

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	private String actual = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	private String str;
	
private LoginPage obj1 =new LoginPage(DriverFactory.getDriver());
@Given("user is on login page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
	DriverFactory.getDriver().get("https://www.amazon.in/");
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
    // Write code here that turns the phrase above into concrete actions
     str = obj1.getLoginPageTitle();
     assertEquals(str, actual);
}

@Then("page title should be {string}")
public void page_title_should_be(String string) {
    // Write code here that turns the phrase above into concrete actions
	 assertEquals(str, actual);
}

@Then("forgot your password link should be displayed")
public void forgot_your_password_link_should_be_displayed() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page title ");
}

@When("user enters username {string}")
public void user_enters_username(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page title ");
}

@When("user enters password {string}")
public void user_enters_password(String string) {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page title "); 
}

@When("user clicks on Login button")
public void user_clicks_on_login_button() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page title ");
}

@Then("user gets the title of the Home page")
public void user_gets_the_title_of_the_home_page() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("page title ");
}


}
