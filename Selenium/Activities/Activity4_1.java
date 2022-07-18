import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {
		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.training-support.net");
			System.out.println("title of the page : "+driver.getTitle());
			driver.findElement(By.xpath("//a[text()='About Us']")).click();
			System.out.println("title of the page : "+driver.getTitle());
			driver.close();
	}
}
