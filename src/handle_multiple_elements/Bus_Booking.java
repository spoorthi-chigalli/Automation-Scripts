package handle_multiple_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bus_Booking {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.abhibus.com/");
		driver.findElement(By.xpath("//div[text()='Leaving From']")).click();
		driver.findElement(By.xpath("//input[@id='from-city-input']")).sendKeys("Bengalore");
		driver.findElement(By.xpath("//input[@id='to-city-input']")).sendKeys("Mysore");
		driver.findElement(By.xpath("//div[@id='date-21']")).click();
		driver.findElement(By.xpath("//a[text()='Search Buses']")).click();
		
		

	}

}
