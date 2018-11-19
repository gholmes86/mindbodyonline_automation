package objects.pages;
import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;


public class ClassSchedulePage extends BasePage {


    public ClassSchedulePage(WebDriver driver) {
        super(driver,90);
    }


    public void VerifyClassSchedulePageDisplayed() {
        Log.info("Verifying Class Schedule Displayed");
        assertTrue(elementIsDisplayed(By.id("ClassScheduling")));
    }



    }
