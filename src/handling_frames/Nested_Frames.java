package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Frames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("////////////////////Add html adress///////////////");
		driver.findElement(By.id("email")).sendKeys("spoorthic@gmail.com");
		driver.switchTo().frame("frame1");
		driver.findElement(By.id("fn")).sendKeys("Chigalli");
		driver.switchTo().frame(0);
		driver.findElement(By.id("un")).sendKeys("Spoorthi@c");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("ln")).sendKeys("spoo");
		WebElement frameAdress = driver.findElement(By.id("Frame2"));
		driver.switchTo().frame(frameAdress);
		driver.findElement(By.id("pwd")).sendKeys("Trisha");
		//driver.switchTo().parentFrame();
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("num")).sendKeys("9876543");
		
		driver.quit();

	}

}
