package handling_MouseActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//---Minimize the window size than only the prg runs correctly......u can minimize externally or by using robot class i.e ctrl+-

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		WebElement target = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		Actions a = new Actions(driver);
		a.scrollToElement(target).perform();
		target.click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click(); Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
		List<WebElement> draggable = driver.findElements(By.xpath("//div[@class='draggable']"));
		WebElement mobDrop = driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[1]"));
		WebElement lapDrop = driver.findElement(By.xpath("(//div[contains(@class,'drop-column')])[2]"));

		for (WebElement drag : draggable) {
			String text = drag.getText();
			if(text.contains("Mobile"))
			{
				a.dragAndDrop(drag, mobDrop).perform();
				Thread.sleep(2000);
			}
			else if(text.contains("Laptop"))
			{
				a.dragAndDrop(drag, lapDrop).perform();
				Thread.sleep(2000);
			}
		}
		
	}

}
