package handling_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_ScrollBar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.abhibus.com/");
		WebElement target = driver.findElement(By.xpath("//h2[text()='Popular Bus Routes']"));
		 
        Actions a = new Actions(driver); Thread.sleep(2000);
        a.scrollByAmount(100, 0).perform(); Thread.sleep(2000);          //It will scroll horizontally for 100 pixels
        
        a.scrollToElement(target).perform(); Thread.sleep(2000);         //It will scroll untill the visible ele is visible
        
        a.scrollByAmount(0, 3000).perform(); Thread.sleep(2000);         //It will scroll down for given pixels vertically
        
        a.scrollByAmount(0, -3000).perform();                            //It will scroll back for the given pixels
        
        Thread.sleep(2000);
        driver.quit();
	}

}
