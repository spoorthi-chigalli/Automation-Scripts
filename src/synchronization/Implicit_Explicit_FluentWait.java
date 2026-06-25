package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Implicit_Explicit_FluentWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));                                 //implicitWait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));                          //explicitWait - Obj creation
		Wait<WebDriver> wait = new FluentWait<>(driver)                           
				.withTimeout(Duration.ofSeconds(5))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);                                                  //fluentWait
		
        driver.get("https://demowebshop.tricentis.com/");
        driver.findElement(By.xpath("//a[text()='Log in']")).click();
        
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin1234@gmail.com");
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345678"+Keys.ENTER);
        //Thread.sleep(2000) - Waste of Time                                                              //Thread.sleep() - waste of time
        driver.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
        wait.until(ExpectedConditions.titleContains("Books"));                                            //condition for explicitWait
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("//a[text()='Log out']")).click();

        driver.quit();
	}

}
