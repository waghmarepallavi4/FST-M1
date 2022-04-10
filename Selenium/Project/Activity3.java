package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {

	WebDriver driver;

	@BeforeMethod
	public void initializeBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
	}

	@Test
	public void work() {

		WebElement info = driver.findElement(By.tagName("h3"));
		System.out.println("Text is " + info.getText());
		Assert.assertEquals(info.getText(), "Actionable Training");
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
