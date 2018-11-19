package objects.pages;
import helpers.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.awt.*;
import static junit.framework.Assert.assertTrue;


public class HomePage extends BasePage {
    private final By dashBoard = By.id("front-desk");

    public HomePage(WebDriver driver) {
        super(driver,35);
    }

    public void HomePageDisplays(){
        Log.info("Homepage displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[contains(@href,'/networkDashboard/index')]")));
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='active home']")));
        }

    public void DashboardSubTabActive(){
        Log.info("Verify Dashboard subtab is selected");
        assertTrue(elementIsDisplayed(By.xpath("//*[@id='front-desk'][@class='subtab active']")));

    }

    public void selectServicesAndPricingSubTab(){
        Log.info("Selecting Services and Pricing subtab");
        clickElement(driver,By.xpath("//*[@href='/servicesandpricing']"),25);
    }









}













