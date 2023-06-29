package stepdefinitions;

 
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import com.pages.AccountsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import parallel.BaseClass;
import parallel.BaseClassImplement;

public class AccountsPageSteps {
	
	//private LoginPage obj1 = new LoginPage(DriverFactory.getDriver());
	private LoginPage obj2 =new LoginPage(BaseClassImplement.getDriver());
	private AccountsPage accountpage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application( DataTable dataTable) {
	     
		List<Map<String, String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
  
		//DriverFactory.getDriver().get("http://automationpractice.com/index.php");
		BaseClassImplement.getDriver().get("http://automationpractice.com/index.php");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		accountpage = obj2.doLogin(userName, password);
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
		System.out.println("Account page");
	 
	}

	@Then("user gets accounts section")
	public void user_gets_accounts_section( DataTable dataTable) {
		System.out.println("Account page");
	}

	@Then("accounts section count should be {int}")
	public void accounts_section_count_should_be(Integer int1) {
		System.out.println("Account page");
	}

}
