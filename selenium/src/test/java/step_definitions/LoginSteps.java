package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.LoginPage;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginSteps extends AbstractStepDef {
  private final static Logger log = Logger.getLogger(LoginSteps.class.getName());
	
	protected WebDriver driver;

	public LoginSteps() {
		driver = Hooks.driver;
	}

	@Given("^the Mindbody Login page is loaded$")
	public void the_Mindbody_Login_page_is_loaded() throws Throwable {

		String siteName = "http://dev-arch.mbodev.me/LoginLaunch?studioid=-3505";
		driver.get(siteName);
	}

	@When("^the Mindbody user logins to the mindbody account$")
	public void the_Mindbody_user_logins_to_the_mindbody_account() throws Throwable {
		LoginPage login = new LoginPage(driver);
		login.login();

	}





}