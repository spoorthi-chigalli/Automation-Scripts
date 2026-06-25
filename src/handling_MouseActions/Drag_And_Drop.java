package handling_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement interactions = driver.findElement(By.xpath("//a[text()='Interactions ']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(interactions).pause(2000).perform();
		
		WebElement dragAndDrop = driver.findElement(By.xpath("//a[text()='Drag and Drop ']"));
		a.moveToElement(dragAndDrop).pause(2000).perform();


	}

}
