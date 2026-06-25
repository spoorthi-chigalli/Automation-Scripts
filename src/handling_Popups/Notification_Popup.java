package handling_Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
