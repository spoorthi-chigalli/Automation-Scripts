package handling_MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.bigbasket.com/");
		
		WebElement nandini = driver.findElement(By.xpath("(//span[text()='Nandini'])[2]"));
		Actions a = new Actions(driver);
		a.contextClick(nandini).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		String pWin = driver.getWindowHandle();
		Set<String> allWin = driver.getWindowHandles();
		
		for (String win : allWin) {
			if(!win.equals(pWin))
			{
				driver.switchTo().window(win);
				break;
			}
		}
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
