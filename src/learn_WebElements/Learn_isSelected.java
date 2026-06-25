package learn_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_isSelected {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		checkbox.click();
		Thread.sleep(2000);
		
		//isSelected()
		boolean res = checkbox.isSelected();
		
		if(res)
		{
			System.out.println("Checkbox is selected");
		} else {
			System.out.println("Checkbox is not selected");
		}
		
		driver.quit();
	}

}
