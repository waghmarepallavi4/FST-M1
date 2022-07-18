package FST_Appium;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Act_02 {
    //WebDriverWait wait;
    AndroidDriver<MobileElement> driver ;
    @BeforeClass
     public void setup() throws MalformedURLException {
    // Set the Desired Capabilities
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("deviceName", "FST_Appium");
    caps.setCapability("platformName", "android");
    caps.setCapability("automationName", "UiAutomator2");
    caps.setCapability("appPackage", "com.android.chrome");
    caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");


    // Instantiate Appium Driver

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
    // wait = new WebDriverWait(driver, 10);
}
    @Test
    public void testSearchAppium() throws InterruptedException {
        String pageTitle = driver.findElementByClassName("android.widget.TextView").getText();
        System.out.println("Title on chromePage: " + pageTitle);
        MobileElement Accept = driver.findElementById("terms_accept");
        Accept.click();
        Thread.sleep(1000);
        MobileElement noThanks = driver.findElementById("com.android.chrome:id/negative_button");
        noThanks.click();


        // Open page in browser
        driver.get("https://www.training-support.net/");
        Thread.sleep(1000);

        // Wait for page to load
       // wait.until(ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("About Us")));

        // Get heading on page and print it
        String pageTitle1 = driver.findElementByXPath("//android.view.View[@text='Training Support']").getText();
        System.out.println("Title on Homepage: " + pageTitle1);
        Thread.sleep(1000);

        // Find About Us button and click it
        MobileElement aboutButton = driver.findElementByAccessibilityId("About Us");
        aboutButton.click();
        Thread.sleep(1000);


        // Wait for new page to load
        //wait.until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='About Us']")));

        // Get heading on About Us page and print it
        String newPageTitle = driver.findElementByXPath("//android.view.View[@text='About Us']").getText();
        System.out.println("Title on new page: " + newPageTitle);

        // Assertions
        Assert.assertEquals(pageTitle1, "Training Support");
        Assert.assertEquals(newPageTitle, "About Us");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
