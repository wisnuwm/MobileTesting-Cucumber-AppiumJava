package StepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import Global.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiDemos extends BaseClass {

    @Given("Open application")
    public void openApplication() throws Exception {
        openApps();
    }

    @When("Click Accessibility")
    public void clickAccessibility() {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }

    @Then("Showing menu Accessibility node provider")
    public void showingMenuAccessibilityNodeProvider() {
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")).isDisplayed();
        System.out.println("Passed, Accessibility node provider is displayed");
        closeApps();
    }
}
