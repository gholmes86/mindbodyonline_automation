package step_definitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.ClassSchedulePage;
import objects.pages.ClassesPage;
import objects.pages.ServicesAndPricingPage;
import org.openqa.selenium.WebDriver;

public class ServicesAndPricingPageSteps extends AbstractStepDef {
    protected WebDriver driver;

    public ServicesAndPricingPageSteps()
    {
        driver = Hooks.driver;
    };


    @Then("^the user should land on the Classes link in the Services & Pricing page$")
    public void the_user_should_land_on_the_Classes_link_in_the_Services_Pricing_page() throws Throwable {
        ClassesPage classesPage= new ClassesPage(driver);
        classesPage.verifyClassesPageDisplays();
    }

    @When("^the user clicks the (\\d+)st class schedule displayed in the Services & Pricing page$")
    public void the_user_clicks_the_st_class_schedule_displayed_in_the_Services_Pricing_page(int classes) throws Throwable {
        ServicesAndPricingPage servicesAndPricingPage= new ServicesAndPricingPage(driver);
        servicesAndPricingPage.clickClassScheduleLink(classes);
    }


}