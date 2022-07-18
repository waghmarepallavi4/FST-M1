package Project_Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity_01 {
    AndroidDriver<MobileElement> driver;
    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "<FST_Appium");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

// Instantiate Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }
    @Test
    public void googleTask1() throws InterruptedException {
        driver.findElementByAccessibilityId("Create new task").click();
        Thread.sleep(1000);
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        String task1 = driver.findElementByXPath("//android.widget.TextView[@text ='Complete Activity with Google Tasks']").getText();
        //assertion
        Assert.assertEquals("Complete Activity with Google Tasks" , task1);
    }
    @Test
    public void googleTask2() throws InterruptedException {
        driver.findElementByAccessibilityId("Create new task").click();
        Thread.sleep(1000);
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        String task2 = driver.findElementByXPath("//android.widget.TextView[@text ='Complete Activity with Google Keep']").getText();
        //assertion
        Assert.assertEquals("Complete Activity with Google Keep" , task2);
    }
    @Test
    public void googleTask3() throws InterruptedException {
        driver.findElementByAccessibilityId("Create new task").click();
        Thread.sleep(1000);
        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("com.google.android.apps.tasks:id/add_task_done").click();
        String task3 = driver.findElementByXPath("//android.widget.TextView[@text ='Complete the second Activity Google Keep']").getText();
        //assertion
        Assert.assertEquals("Complete the second Activity Google Keep" , task3);
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
