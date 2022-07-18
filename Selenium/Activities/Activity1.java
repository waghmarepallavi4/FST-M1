import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\002KRX744\\eclipse-workspace\\FST_Selenium_Project\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		driver.close();
		
	}

}
