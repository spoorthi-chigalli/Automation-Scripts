package handle_multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//input[@value='F']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Spoorthi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("C");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("spoorthi08@email.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Spoo@2003");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("Spoo@2003"+Keys.ENTER);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("spoorthi08@email.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Spoo@2003"+Keys.ENTER);
		//driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		List<WebElement> prName = driver.findElements(By.xpath("//strong[text()='Featured products']/../../div/div/div[1]/a"));		
		List<WebElement> prPrice = driver.findElements(By.xpath("//strong[text()='Featured products']/../../div/div/div[2]//span[@class='price actual-price']"));
		
		for(int i=0; i<prPrice.size(); i++)
		{
			String name = prName.get(i).getText();
			String price = prPrice.get(i).getText();
			System.out.println("Product Name: " +name+ "==> Price: "+price);
		}
	}

}
