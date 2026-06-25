package learn_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_Sendkey_Submit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://demoapps.qspiders.com/");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABD@email.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ABDeVilliers");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL+"A");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL+"C");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Keys.CONTROL+"V");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Register']")).submit();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//section[text()='Button']")).submit();
        
        driver.quit();
	}

}
