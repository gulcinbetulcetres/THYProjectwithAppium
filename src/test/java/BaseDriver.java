import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseDriver {
    protected static AndroidDriver<MobileElement> driver;
    protected static WebDriverWait wait;


    @BeforeScenario
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "Pixel 4 API 27");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "8.1");
        caps.setCapability("appPackage", "com.turkishairlines.mobile");
        caps.setCapability("appActivity", "com.turkishairlines.mobile.ui.main.MainActivity");
        caps.setCapability("noReset", "false");
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

    }


    @AfterScenario
    public void teardown() {
        if(driver != null) {
            driver.quit();
        }
    }

}
