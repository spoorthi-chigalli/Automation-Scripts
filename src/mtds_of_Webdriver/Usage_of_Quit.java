package mtds_of_Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Usage_of_Quit {
	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		Thread.sleep(1000);
		
		driver.navigate().to("https://instagram.com");
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
