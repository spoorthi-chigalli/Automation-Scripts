package handle_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAutoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Java");
		Thread.sleep(2000);
		
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allsugg.size();
		System.out.println(count);
		
//		for(int i=count-1; i>=0; i--)  (In order to print options in reverse order)
//		{
//			String ele = allsugg.get(i).getText();
//			System.out.println(ele);
//		}
		
		for (WebElement ele : allsugg) { //In order to print options by using for each 
			System.out.println(ele.getText());
		}
		
		Thread.sleep(2000);
		
		allsugg.get(count-1).click();  //In order to click on the last option
		driver.quit();
	}

}
