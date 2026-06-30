package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.abhibus.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
//---------------------------Scroll() will be performed in 2 ways <4.0 selenium we use action clss and >4.0 selenium we use javaScriptExecuter
//------------------------javaScriptExecuter
		 WebElement loc = driver.findElement(By.xpath("//h2[text()='Popular Bus Routes']"));
		 Point locs = loc.getLocation();

		js.executeScript("window.scrollTo"+locs);		
		Thread.sleep(2000);
		
//--------------Actions 
		 Actions a = new Actions(driver); Thread.sleep(2000);    
	        a.scrollToElement(loc).perform(); Thread.sleep(2000);

		driver.quit();
	}

}
