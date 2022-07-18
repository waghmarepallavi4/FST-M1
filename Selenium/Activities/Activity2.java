import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("title of the page : "+driver.getTitle());
		driver.findElement(By.id("about-link")).isDisplayed();
		driver.findElement(By.className("inverted")).isDisplayed();
		driver.findElement(By.linkText("About Us"));
		driver.findElement(By.cssSelector("a#about-link"));
		System.out.println(driver.findElement(By.xpath("//a[text()='About Us']")).getText());
		driver.close();
		
	}

}
