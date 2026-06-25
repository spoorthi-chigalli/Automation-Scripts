package handle_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_CompleteDataOfTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		
		 List<WebElement> tabHea = driver.findElements(By.xpath("//table//th|//table//td"));
		 int count = tabHea.size();
		 System.out.println(count);
		 
		 for (WebElement data : tabHea) {			 
			 System.out.println(data.getText());	
		}
		 
		 Thread.sleep(2000);
		 
		 driver.quit();
		 
	}

}
