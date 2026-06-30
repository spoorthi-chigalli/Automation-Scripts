package Handling_Iframes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://m.rediff.com/");
		driver.switchTo().frame(1);
		//List<WebElement> stockName = driver.findElements(By.xpath("//div[text()='STOCKS']/../a/div/div//span[1]"));
		List<WebElement> percentage = driver.findElements(By.xpath("//div[text()='STOCKS']/../a/div/div//span[2]"));  
		
		for (WebElement per : percentage) {
			String stockPer = per.getText();
			System.out.println(stockPer);
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[name()='svg' and contains(@class,'lucide-user')]")).click();

		Thread.sleep(2000);
		driver.quit();
	}

}
