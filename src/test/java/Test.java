//import java.net.URL;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.MobileElement;
//
//public class Test {
//    public static void main(String[] args) {
//        try{
//            openApps();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//    static AppiumDriver<MobileElement> driver;
//    public static void openApps() throws Exception {
//        DesiredCapabilities cap = new DesiredCapabilities();
//        cap.setCapability("automationName","UiAutomator2");
//        cap.setCapability("platformName","Android");
//        cap.setCapability("deviceName","emulator-5554");
//        cap.setCapability("appPackage","io.appium.android.apis");
//        cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
//        cap.setCapability("autoGrantPermissions","true");
//        cap.setCapability("noReset","true");
//
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");
//        driver = new AppiumDriver<MobileElement> (cap);
//        System.out.println("Apps started...");
//
//        MobileElement accessibility = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
//        accessibility.click();
//        Thread.sleep(1000);
//
//        driver.closeApp();
//        System.out.println("Apps closed...");
//    }
//}
