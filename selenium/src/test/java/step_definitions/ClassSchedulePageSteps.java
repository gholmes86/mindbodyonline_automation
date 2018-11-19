package step_definitions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.pages.ClassSchedulePage;
import objects.pages.ClassesPage;
import objects.pages.ServicesAndPricingPage;
import org.openqa.selenium.WebDriver;

public class ClassSchedulePageSteps extends AbstractStepDef {
    protected WebDriver driver;

    public ClassSchedulePageSteps()
    {
        driver = Hooks.driver;
    };


    @Then("^the user should be land on the Class Schedule page$")
    public void the_user_should_be_land_on_the_Class_Schedule_page() throws Throwable {
        ClassSchedulePage classSchedulePage= new ClassSchedulePage(driver);
        classSchedulePage.VerifyClassSchedulePageDisplayed();
    }


}