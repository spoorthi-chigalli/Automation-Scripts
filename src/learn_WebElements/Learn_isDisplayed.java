package learn_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		
		//isDisplayed - this mtd will not scroll by it self we have to mouse over on ele which resides the required ele(my profile - login)
		boolean res = driver.findElement(By.xpath("//div[text()='My Profile']")).isDisplayed();
		
		if(res == true)
		{
			System.out.println("Profile is displayed");
		} else {
			System.out.println("Profile is not displayed");
		}
		
		driver.quit();

	}

}
