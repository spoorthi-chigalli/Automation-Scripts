package handling_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
		WebElement btn = driver.findElement(By.id("btm-a"));
		
		Actions a = new Actions(driver);
		a.contextClick(btn).pause(2000).perform();
		
		WebElement yes = driver.findElement(By.xpath("//*[text()='yes']"));
		a.click(yes).pause(2000).perform();

	}

}
