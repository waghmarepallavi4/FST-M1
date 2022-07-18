import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void firstMethod() {
		
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
	}
	
	@Test
	public void test() {
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Target Practice");
		
			
	}
	@Test
	public void blackButton () {
		WebElement ele =  driver.findElement(By.xpath("//button[text()='Black']"));
		Assert.assertTrue(ele.isDisplayed());
		Assert.assertEquals(ele.getText(), "black");
		
	}
	@Test(enabled = false)
    public void testCase3() {
        //This test will be skipped and not counted
        String subHeading = driver.findElement(By.className("sub")).getText();
        Assert.assertTrue(subHeading.contains("Practice"));
    }
	
	@Test
	public void testCase4() {
        //This test will be skipped and will be be shown as skipped
        throw new SkipException("Skipping test case");      
    }
	
	
	@AfterMethod
	public void closeMethod() {
	driver.close();	
	}
	

}




