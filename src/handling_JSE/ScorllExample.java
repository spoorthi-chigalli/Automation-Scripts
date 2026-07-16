package handling_JSE;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScorllExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.abhibus.com/");
		
		//Create JavaSriptExecutor obj
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//Scroll down by 500 pixels
		js.executeScript("window.scrollBy(0,500);"); Thread.sleep(2000);
		
		//scroll down by another 500 pixels. it will scroll to 1000 pixels total
		js.executeScript("window.scrollBy(0,500);"); Thread.sleep(2000);
		
		//scroll back for 500 pixels
		js.executeScript("window.scrollBy(0,-500);"); Thread.sleep(2000);
		
		//scroll exactly to 2000 pixels from initial position
		js.executeScript("window.scrollTo(0,2000);"); Thread.sleep(2000);
		
		//scroll back to the top of the page
		js.executeScript("window.scrollTo(0,0);"); Thread.sleep(2000);
		
		driver.quit();

	}

}
