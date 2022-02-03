package Global;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseClass {
    public static AppiumDriver<MobileElement> driver;
    public void startApp() throws Exception {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        System.out.println("Apps started...");
    }
    public BaseClass() throws Exception {
        if (driver ==null){
            startApp();

        }
    }
}
