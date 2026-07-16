package handling_JSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.zomato.com/bangalore/restaurants");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	
		js.executeScript("window.scrollTo(0,2000);"); Thread.sleep(2000);
	
		js.executeScript("window.scrollTo(0,3000);"); Thread.sleep(2000);
	
		js.executeScript("window.scrollTo(0,-1000);"); Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,-2000);"); Thread.sleep(2000);
	
		driver.quit();

	}

}
