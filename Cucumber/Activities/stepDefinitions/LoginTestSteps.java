package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Logon page$")
    public void loginPage() {
        //Setup instances
        driver = new FirefoxDriver();
        wait =   new WebDriverWait(driver, Duration.ofSeconds(10));        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
	/*
	 * @When("^User enters username and password$") public void enterCredentials() {
	 * //Enter username driver.findElement(By.id("username")).sendKeys("admin");
	 * //Enter password driver.findElement(By.id("password")).sendKeys("password");
	 * //Click Login
	 * driver.findElement(By.xpath("//button[@type='submit']")).click(); }
	 */
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_and(String username, String password) throws Throwable {
        //Enter username from Feature file
        driver.findElement(By.id("username")).sendKeys(username);
        //Enter password from Feature file
        driver.findElement(By.id("password")).sendKeys(password);
        //Click Login
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    
    @Then("^Read page title and confirmation message$")
    public void readTitleAndHeading() {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("action-confirmation")));
        
        //Read the page title and heading
        String pageTitle = driver.getTitle();
        String confirmMessage = driver.findElement(By.id("action-confirmation")).getText();
        
        //Print the page title and heading
        System.out.println("Page title is: " + pageTitle);
        System.out.println("Login message is: " + confirmMessage);

        //Assertion
        Assert.assertEquals(confirmMessage, "Welcome Back, admin");
    }
    
    @And("^Close the Browsers$")
    public void closeBrowser() {
        //Close browser
        driver.close();
    }

}