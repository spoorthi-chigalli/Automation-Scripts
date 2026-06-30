package handling_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rghClk = driver.findElement(By.xpath("//span[text()='right click me']")); 
		Actions a = new Actions(driver);
		a.contextClick(rghClk).perform(); Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click(); Thread.sleep(2000);
        driver.switchTo().alert().accept();
        
        WebElement dblClk = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
        a.doubleClick(dblClk).perform(); Thread.sleep(2000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        
        driver.quit();
	}

}
