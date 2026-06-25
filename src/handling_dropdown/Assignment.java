package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		
//--------------------------------------Assignment---------------------------------------------------------------------
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		WebElement country_code = driver.findElement(By.id("country_code"));
		Thread.sleep(2000);
		Select cc = new Select(country_code);
		Thread.sleep(2000);
		cc.selectByVisibleText("+91");
		
		WebElement country = driver.findElement(By.id("select3"));
		Select c = new Select(country);
		c.selectByValue("India");
		
		WebElement state = driver.findElement(By.id("select5"));
		Select s = new Select(state);
		Thread.sleep(2000);
		s.selectByVisibleText("Karnataka");  
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.xpath("//option[text()='Select City']"));
		Select ci = new Select(city);
		Thread.sleep(2000);
		ci.selectByVisibleText("Dharwad");
		Thread.sleep(2000);
		
		WebElement quantity = driver.findElement(By.id("select7"));
		Thread.sleep(2000);
		Select q = new Select(quantity);
		Thread.sleep(2000);
		q.selectByIndex(2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='enter your number']")).sendKeys("9686194124");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		
		driver.quit();
		
		
		
//-----------------------------------------------Assignment 1--------------------------------------------------------
//1.write a script to select and deselect all the options in a multiselect dd(asscending and desending)

	}

}
