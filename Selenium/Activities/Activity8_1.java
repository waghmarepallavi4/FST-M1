import java.util.List;

import org.apache.commons.compress.compressors.lz77support.LZ77Compressor.LiteralBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        
        //Open browser
        driver.get("https://training-support.net/selenium/tables");

       System.out.println("Total no. of rows : "+driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr")).size());
       System.out.println("total no of columns: "+driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td")).size());
       
       List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
       for(WebElement a : thirdRow) {
    	   System.out.println(a.getText());
       }
       
       WebElement cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
       System.out.println("Second row, second column value: " + cellValue2_2.getText());
       
        //Close browser
        driver.close();

    }
}