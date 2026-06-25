package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOf_id_name_className {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/demo.html");
        
        //tagName
        driver.findElement(By.tagName("a")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        
        //id
        
        

	}

}
