package StepDef;

import org.openqa.selenium.By;

import Init.InitDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.Given;

public class OpenAccessibility extends InitDriver {
    public OpenAccessibility() {
        super();
    }
    @Given("Click element Accessibility")
    public void clickElementAccessibility() throws InterruptedException {
        MobileElement accessibility = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
        accessibility.click();
        Thread.sleep(1000);
    }
}
