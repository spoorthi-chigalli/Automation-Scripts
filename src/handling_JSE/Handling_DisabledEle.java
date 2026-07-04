package handling_JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_DisabledEle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/disabledEle.html");
		driver.findElement(By.id("un")).sendKeys("Spoorthi");
		RemoteWebDriver dr = (RemoteWebDriver)driver;
		dr.executeScript("document.getElementById('pwd').value='Anushka'");
		
		driver.quit();

	}

}
