import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/simple-form");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Hi");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("HelloHi@gmail.com");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("1234567890");
		driver.close();
		}

}
