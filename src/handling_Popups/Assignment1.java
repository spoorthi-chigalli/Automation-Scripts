package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text() = 'Alert with OK & Cancel ']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click(); Thread.sleep(2000);
		Alert b = driver.switchTo().alert(); Thread.sleep(2000);
		System.out.println(b.getText()); Thread.sleep(2000);
		b.dismiss(); Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'You Pressed')]"));
        System.out.println(text.getText());
        
        driver.quit();
	}

}
