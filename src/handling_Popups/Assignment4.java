package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/fileUpload");
		driver.findElement(By.xpath("//input[@id='fullName']")).sendKeys("Spoorthi Chigalli");
		driver.findElement(By.xpath("//input[@id='emailId']")).sendKeys("spoorthi@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Spoo@2003");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("9686194124");
		WebElement sdropdown = driver.findElement(By.xpath("//select[@id='city']"));
		Select s = new Select(sdropdown);
		s.selectByValue("bg");
		driver.findElement(By.xpath("//input[@id='resume']")).sendKeys("C:\\Users\\Spoorthi\\Desktop\\Swarna.pdf");
		WebElement mdropdown = driver.findElement(By.xpath("//select[@multiple]"));
		Select m = new Select(mdropdown);
		m.selectByIndex(0);
		m.selectByIndex(1);
		m.selectByIndex(2);
		m.selectByIndex(3);
		m.selectByIndex(4);
		m.selectByIndex(5);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.quit();
	}

}
