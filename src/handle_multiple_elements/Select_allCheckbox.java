package handle_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_allCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(2000);
		
		 List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		  int count = checkbox.size();
		 
		 for(int i=0; i<count;i++)
		 {
			 WebElement ele = checkbox.get(i);
			 ele.click();
		 }
		Thread.sleep(2000);
		
		driver.quit();

	}

}
