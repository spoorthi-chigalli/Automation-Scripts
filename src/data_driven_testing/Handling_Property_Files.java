package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Property_Files {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\commandata.properties");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String email = p.getProperty("un");
		String pwd = p.getProperty("pwd");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get(url);
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		
		System.out.println(url);
		System.out.println(email);
		System.out.println(pwd);
		
		Thread.sleep(2000);
		driver.quit();

	}

}
