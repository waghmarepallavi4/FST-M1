package Project_Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity_02 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<FST_Appium");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }
    @Test
    public void googleKeep() throws InterruptedException {
        driver.findElementByAccessibilityId("New text note").click();
        Thread.sleep(1000);
        driver.findElementByXPath("//android.widget.EditText[@text = 'Title']").sendKeys("Project");
        //((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        driver.findElementByXPath("//android.widget.EditText[@text = 'Note']").sendKeys("Helloo World!");
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        //assertion
        String title1 = driver.findElementByXPath("//android.widget.TextView[@text = 'Project']").getText();
        String description1 = driver.findElementByXPath("//android.widget.TextView[@text = 'Helloo World!']").getText();

        Assert.assertEquals(title1,"Project");
        Assert.assertEquals(description1,"Helloo World!");

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
