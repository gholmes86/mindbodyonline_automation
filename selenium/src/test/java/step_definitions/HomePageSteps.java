package step_definitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.Log;
import objects.pages.HomePage;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;
public class HomePageSteps extends AbstractStepDef {
    protected WebDriver driver;

    public HomePageSteps()
    {
        driver = Hooks.driver;
    };


    @Then("^the Mindbody Home page should be displayed$")
    public void the_Mindbody_Home_page_should_be_displayed() throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.HomePageDisplays();
    }

    @Then("^the Dashboard subtab should be selected on the Home page$")
    public void the_Dashboard_subtab_should_be_selected_on_the_Home_page() throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.DashboardSubTabActive();

    }

    @When("^the user selects the Services & Pricing subtab in the Home page$")
    public void the_user_selects_the_Services_Pricing_subtab_in_the_Home_page() throws Throwable {
        HomePage homePage= new HomePage(driver);
        homePage.selectServicesAndPricingSubTab();
    }


}