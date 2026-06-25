package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOf_TagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/demo.html");
        driver.findElement(By.tagName("a")).click();      //click on first matching element
        
        driver.quit();
	}

}
