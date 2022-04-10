package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void initializeBrowser() {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
	}

	@Test
	public void login() {
		driver.findElement(By.partialLinkText("My Account")).click();
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "My Account – Alchemy LMS";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		driver.findElement(By.xpath("//a[@href='#login']")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");

		driver.findElement(By.className("login-submit")).click();

		String ProfileName = driver.findElement(By.xpath("//li[@class='menupop with-avatar']/a/span")).getText();
		Assert.assertEquals(ProfileName, "root");
		System.out.println(ProfileName);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}