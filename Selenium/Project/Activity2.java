package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
	}
	@Test
	public void work() {
		WebElement heading = driver.findElement(By.className("uagb-ifb-title"));
		Assert.assertEquals(heading.getText(), "Learn from Industry Experts");
		System.out.println("Text is " + heading.getText());
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
