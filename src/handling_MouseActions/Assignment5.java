package handling_MouseActions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		WebElement menSection = driver.findElement(By.xpath("(//a[text()='Men'])[1]")); 
		Actions a = new Actions(driver);
	    a.moveToElement(menSection).perform();
		
		driver.findElement(By.xpath("//*[text()='Sneakers']")).click();
		driver.findElement(By.xpath("//input[@value='Puma']/..//div")).click();
		
		Thread.sleep(2000);
		WebElement sliderBtn = driver.findElement(By.xpath("(//div[@class='slider-thumbDot'])[2]"));
        a.clickAndHold(sliderBtn).moveByOffset(-50, 0).release().perform();
        
        driver.findElement(By.xpath("(//img[@title='Puma Smashic Comfort Casual Sneakers'])[1]")).click();
        
        Set<String> allWin = driver.getWindowHandles();
        for (String win : allWin) {
			driver.switchTo().window(win);
		}
        
        WebElement price = driver.findElement(By.xpath("//span[@class='pdp-price']"));
        System.out.println("Product price: " +price.getText());
        
        driver.quit();
        
	}

}
