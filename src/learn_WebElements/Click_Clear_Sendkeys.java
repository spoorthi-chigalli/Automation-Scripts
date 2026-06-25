package learn_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_Clear_Sendkeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com");
		
		//click()
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		
		//sendKeys()
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("Spoorthi@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		
		email = driver.findElement(By.xpath("//input[@id='Email']"));
		
		//clear()
		email.clear();
		Thread.sleep(2000);
		email.sendKeys("admin1234@email.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='New products']")).click();
		
		driver.quit();

	}

}
