package objects.pages;

import helpers.Log;
import org.fluttercode.datafactory.impl.DataFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.testng.AssertJUnit.assertTrue;

public class LoginPage extends BasePage {

    public static String uname;
    public static String pword;

    private final By username = By.id("requiredtxtUserName");
	private final By password= By.id("requiredtxtPassword");
	private final By submit= By.id("btnLogin");

	public LoginPage(WebDriver driver){
		super(driver,55);
	}

	public HomePage login() throws InterruptedException {
			Log.info("Logging in with Mindbody User");
			uname = "gabe.holmes";
			pword = "Test1234!!";
			clickElement(driver, username, 40);
			driver.findElement(username).sendKeys(uname);
			clickElement(driver, password, 40);
			driver.findElement(password).sendKeys(pword);
			clickElement(driver, submit, 40);
			Thread.sleep(2000);
			if (elementExists(By.xpath("//*[@id='LoginFailureSpan']"))) {
				Assert.fail("USER DID NOT LOGIN: PASSWORD IS NOT RECOGNIZED");
			} else {
					Log.info("USER SUCCESSFULLY LOGGED IN");
			}
		return new HomePage(driver);
	}


	public void enterUsername(String text)
	{	Log.info("Enter username");
		waitForPageToLoad();
		enterText(username,text);

	}

	public void enterPassword(String text)
	{	Log.info("Enter password");
		enterText(password,text);

	}




	}











	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
