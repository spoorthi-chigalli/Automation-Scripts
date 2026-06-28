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

public class Assignment_PurnitaMam {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		driver.switchTo().frame(0);
		
		WebElement youtubeMusic = driver.findElement(By.xpath("//*[text()='YouTube Music']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(youtubeMusic).perform();
		actions.contextClick(youtubeMusic).perform();
		
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		Set<String> win = driver.getWindowHandles();
		for (String window : win) {
			driver.switchTo().window(window);
		}
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search songs')]")).sendKeys("Ninnindale");
		driver.findElement(By.xpath("(//a[@aria-label='Ninnindale'])[1]")).click();
		
		driver.quit();
		

	}

}
