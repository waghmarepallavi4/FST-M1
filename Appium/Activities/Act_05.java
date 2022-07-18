package FST_Appium;


import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;


public class Act_05 {

    AndroidDriver<MobileElement> driver ;



    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "FST_28_Appium");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.messaging");
        caps.setCapability("appActivity", ".ui.ConversationListActivity");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }
    @Test
    public void sendMessage() throws InterruptedException {
        driver.findElementByAccessibilityId("Start new conversation").click();
        Thread.sleep(1000);
        driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("8109507204");

        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
        Thread.sleep(1000);

        //type message
        driver.findElementById("compose_message_text")
          .sendKeys("Hellooo!!");
        //send the msg
        driver.findElementById("com.google.android.apps.messaging:id/send_message_button_icon").click();
        //assertion
        String messageLocator = driver.findElementById("com.google.android.apps.messaging:id/message_text").getText();
        System.out.println(messageLocator);
        Assert.assertEquals("Hellooo!!" , messageLocator);


    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
