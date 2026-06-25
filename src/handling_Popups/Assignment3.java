package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Spoorthi"); Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("spoorthi@gmail.com"); Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='product']")); Thread.sleep(2000);
		Select s = new Select(dropdown);
		s.selectByVisibleText("Mobile"); Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("IPhone 17 Pro Max"); Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click(); 
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
