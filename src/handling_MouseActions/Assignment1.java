package handling_MouseActions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Spoorthi");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Spoo@2003");
		
		WebElement eyeOpt = driver.findElement(By.xpath("(//img[@class='ng-star-inserted'])[1]"));
		
		Actions a = new Actions(driver); Thread.sleep(2000);
		a.clickAndHold(eyeOpt).perform();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
