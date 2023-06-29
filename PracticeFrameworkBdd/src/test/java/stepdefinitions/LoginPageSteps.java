package stepdefinitions;

 

import static org.junit.Assert.assertEquals;
 

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import parallel.BaseClass;
import parallel.BaseClassImplement;

public class LoginPageSteps {
	private String str = "tittle";
	
private LoginPage obj1 =new LoginPage(BaseClassImplement.getDriver());
//private LoginPage obj2 =new LoginPage(DriverFactory.getDriver());
@Given("user is on login page")
public void user_is_on_login_page() {
    // Write code here that turns the phrase above into concrete actions
	//DriverFactory.getDriver().get("http://automationpractice.com/index.php");
	BaseClassImplement.getDriver().get("http://automationpractice.com/index.php");
}

@When("user gets the title of the page")
public void user_gets_the_title_of_the_page() {
    // Write code here that turns the phrase above into concrete actions
     str = obj1.getLoginPageTitle();
     assertEquals(str, "actual");
}

@Then("page title should be {string}")
public void page_title_should_be(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("page title ");
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
