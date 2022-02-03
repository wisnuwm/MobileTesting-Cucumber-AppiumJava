package Global;

import Init.InitDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DriverHook {
    @Before
    public void initDriverApps() throws Exception {
        InitDriver.openApps();
    }
    @After
    public void closeDriverApps(){
        InitDriver.closeApps();
    }
}
