package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/demo.html");
        driver.findElement(By.tagName("a")).click();
        
        driver.quit();

	}

}
