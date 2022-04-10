package activities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver;
	WebDriverWait wait;

	@BeforeMethod
	public void initializeBrowser() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		
	}

	@Test
	public void contactUs() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.partialLinkText("Contact")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Pallavi Waghmare");
		driver.findElement(By.id("wpforms-8-field_1")).sendKeys("email@gma.com");
		driver.findElement(By.id("wpforms-8-field_3")).sendKeys("subject");
		driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("Message");

		String Expected = "Thanks for contacting us! We will be in touch with you shortly.";
		//String Actual = driver.findElement(By.xpath("//*[@id=\"wpforms-confirmation-8\"]/p")).getText();
		String Actual = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();
		Assert.assertEquals(Actual, Expected);
		System.out.println(Actual);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}
