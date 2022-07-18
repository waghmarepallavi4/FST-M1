package FST_Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Act_04 {
    AndroidDriver<MobileElement> driver ;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "FST_28_Appium");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.contacts");
        caps.setCapability("appActivity", ".activities.PeopleActivity");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);
    }

    @Test
    public void addContact() throws InterruptedException {
        driver.findElementById("com.android.contacts:id/floating_action_button").click();
        Thread.sleep(1000);

        MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");
        MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Last name']");
        MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");

        // Enter the text in the fields
        firstName.sendKeys("Mona");
        lastName.sendKeys("Golani");
        phoneNumber.sendKeys("9991284782");
        //click save
        driver.findElementById("com.android.contacts:id/editor_menu_save_button").click();

        //assertion
        MobileElement mobileCard = driver.findElementById("com.android.contacts:id/toolbar_parent");
        Assert.assertTrue(mobileCard.isDisplayed());
        String contactName = driver.findElementById("com.android.contacts:id/large_title").getText();
        System.out.println("Name :" + contactName);
        Assert.assertEquals(contactName, "Mona Golani");
        String contactNumber = driver.findElementById("com.android.contacts:id/header").getText();
        System.out.println("number :" + contactNumber);
        Assert.assertEquals(contactNumber,"(999) 128-4782");


    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
