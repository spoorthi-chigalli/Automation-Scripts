package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		wait.until(ExpectedConditions.urlContains("frames/nestedWithMultiple?sublist=3"));
		WebElement frameAdd1 = driver.findElement(By.xpath("//iframe[contains(@class,'w-full')]"));
		driver.switchTo().frame(frameAdd1);
		String email = driver.findElement(By.xpath("(//div[@class='form_container'])[1]//p[2]")).getText();
		String pwd = driver.findElement(By.xpath("(//div[@class='form_container'])[1]//p[4]")).getText();
		String conpwd = driver.findElement(By.xpath("(//div[@class='form_container'])[1]//p[6]")).getText();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys(conpwd);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		driver.quit();

	}

}
