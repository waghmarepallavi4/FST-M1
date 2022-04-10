package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
	}

	@Test
	public void work() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
		System.out.println(title);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
