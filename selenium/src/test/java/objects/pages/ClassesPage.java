package objects.pages;
import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;


public class ClassesPage extends BasePage {


    public ClassesPage(WebDriver driver) {
        super(driver,35);
    }


    public void verifyClassesPageDisplays() {
        Log.info("Verifying classes page displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='active']//*[contains(@href,'/servicesandpricing/classes')]")));
    }


    }
