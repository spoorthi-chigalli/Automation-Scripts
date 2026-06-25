package learn_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_isEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);
		
		//isEnabled()
		//boolean res = driver.findElement(By.id("name")).isEnabled();
		boolean res = driver.findElement(By.partialLinkText("Login Now")).isEnabled();
		
		if(res == true)
		{
			System.out.println("Element is enabled");
		} else {
			System.out.println("Element is not enabled");
		}
		
		driver.quit();

	}

}
