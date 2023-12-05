package tests.apkYukleme;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class apk {

        AndroidDriver<AndroidElement> driver;

        @Test
        public void apkYukleme() throws MalformedURLException {

            DesiredCapabilities capabilities = new DesiredCapabilities();

            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            // capabilities.setCapability("platformName","Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            capabilities.setCapability("app", "C:\\Users\\murat\\IdeaProjects\\Appium_T120\\apps\\all-currency-converter-3-9-0 (1).apk");

            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        }

}
