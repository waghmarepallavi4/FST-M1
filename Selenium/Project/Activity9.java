package activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void initializeBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();

	}

	@Test
	public void courses() {
		driver.findElement(By.partialLinkText("My Account")).click();
		driver.findElement(By.xpath("//a[@href='#login']")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.className("login-submit")).click();

		driver.findElement(By.partialLinkText("All Courses")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id='post-69']/div[2]/p[2]/a")).click();
		driver.findElement(By.partialLinkText("Developing")).click();
		String ExpectedTitle = "Developing Strategy – Alchemy LMS";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println(ActualTitle);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
