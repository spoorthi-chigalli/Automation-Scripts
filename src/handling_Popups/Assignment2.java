package handling_Popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//a[text()='Prompt']")).click(); Thread.sleep(2000);
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<checkbox.size(); i++)
		{
			checkbox.get(i).click();
		}
		
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		driver.switchTo().alert().sendKeys("No need");
		driver.switchTo().alert().accept();
		
		WebElement text = driver.findElement(By.xpath("//tr[text()='No item to display']"));
		System.out.println(text.getText());

		driver.quit();
	}

}
