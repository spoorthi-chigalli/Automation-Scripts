package handle_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_AllMobileName_and_Price {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
//		WebElement search = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		search.sendKeys("Iphone 14 pro max");
//		search.submit();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Iphone 14 pro max" + Keys.ENTER);
		
		 List<WebElement> phone = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
	     List<WebElement> price = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div/div"));
	     
	     int count = price.size();
	     System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String name = phone.get(i).getText();
			String amt = price.get(i).getText();
			System.out.println("Moble name: "+name+ "==> Price: "+amt);
		}
		
		driver.quit();
	}

}
