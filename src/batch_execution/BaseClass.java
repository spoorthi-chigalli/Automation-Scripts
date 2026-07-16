package batch_execution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("Email")).sendKeys("spoorthic.0806@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Spoo@1234");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Login",true);
	}

	@AfterMethod
	public void logout() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Reporter.log("logout",true);
	}

	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("closeBrowser",true);
	}


}
