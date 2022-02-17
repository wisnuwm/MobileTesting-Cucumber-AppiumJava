package StepDef;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
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
        String result = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")).getText();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility Node Provider\"]")).isDisplayed();
        Assert.assertEquals("Accessibility Node Provider",result);
        System.out.println(result);
        System.out.println("Passed, "+result+" is displayed");
        closeApps();
    }
}
