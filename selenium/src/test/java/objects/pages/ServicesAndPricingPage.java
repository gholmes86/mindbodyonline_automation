package objects.pages;
import helpers.Log;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;


public class ServicesAndPricingPage extends BasePage {


    public ServicesAndPricingPage(WebDriver driver) {
        super(driver, 35);
    }




    public void classesLinkDisplayed() throws InterruptedException {
        Log.info("Verifying Classes link is displayed");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='active']//*[contains(@href,'/servicesandpricing/classes')]")));


    }

    public void clickClassScheduleLink(int cls) throws InterruptedException {
        Log.info("Verifying Classes link is displayed");
        driver.findElements(By.xpath("//*[@title='Add a Class Schedule']")).get(cls).click();

    }


    }






