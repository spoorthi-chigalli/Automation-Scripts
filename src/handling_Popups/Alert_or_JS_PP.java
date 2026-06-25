package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_or_JS_PP {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//------------Alert popup-------------------------------------
		driver.findElement(By.className("btn-danger")).click(); Thread.sleep(2000);
		Alert a = driver.switchTo().alert(); Thread.sleep(2000);
		System.out.println(a.getText()); Thread.sleep(2000);
		a.accept();  Thread.sleep(2000);               //To click on ok in alert popup we use accept mtd
			
		//------------Confirmation popup-------------------------------
		driver.findElement(By.xpath("//a[text() = 'Alert with OK & Cancel ']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'confirm box')]")).click(); Thread.sleep(2000);
		Alert b = driver.switchTo().alert(); Thread.sleep(2000);
		System.out.println(b.getText()); Thread.sleep(2000);
		b.accept(); Thread.sleep(2000);
		//a.dismiss();                //To click on cancel button in alert popup we use dismiss mtd
		
		//-------------Prompt popup-------------------------------------
		driver.findElement(By.xpath("//a[text() = 'Alert with Textbox ']")).click(); Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'prompt box')]")).click(); Thread.sleep(2000);
		Alert c = driver.switchTo().alert();Thread.sleep(2000);
		c.sendKeys("Automation Test users"); Thread.sleep(2000);        //sendkeys is used to enter the text in the textbox in prompt popup
		c.accept(); Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//p[@id='demo1']")).getText(); Thread.sleep(2000);
		System.out.println(text); Thread.sleep(2000);
		
        driver.quit();
	}

}

