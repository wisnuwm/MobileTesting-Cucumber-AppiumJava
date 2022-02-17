package Global;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
    public static AppiumDriver<MobileElement> driver;
    public static DesiredCapabilities initDevice(){
        File filePath = new File(System.getProperty("user.dir"));
        File app = new File(filePath, "/apk/ApiDemos-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("automationName","UiAutomator2");
        cap.setCapability("platformName","Android");
        cap.setCapability("deviceName","emulator-5554");
        cap.setCapability("app",app.getAbsolutePath());
        cap.setCapability("autoGrantPermissions","true");
        cap.setCapability("noReset","true");
        return cap;
    }
    public static void openApps() throws Exception {
        String appiumServerURL = "http://127.0.0.1:4723/wd/hub";
        driver = new AppiumDriver(new URL(appiumServerURL), initDevice());
        System.out.println("Apps started...");
    }
    public static void closeApps(){
        driver.closeApp();
        System.out.println("Apps closed...");
    }
}
