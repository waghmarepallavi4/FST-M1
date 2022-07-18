import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void firstMethod() {
		
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
	}
	
	@Test
	public void test() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Training Support");
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		Set<String> winHan = driver.getWindowHandles();
		for(String a : winHan) {
			driver.switchTo().window(a);
		}
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "About Training Support");
		
	}
	
	
	@AfterMethod
	public void closeMethod() {
	driver.close();	
	}
	

}




