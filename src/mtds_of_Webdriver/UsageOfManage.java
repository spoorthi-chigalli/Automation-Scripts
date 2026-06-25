package mtds_of_Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());
		
		Dimension d1 = new Dimension(333, 502);
		driver.manage().window().setSize(d1);
		
		Point p1 = new Point(183, 224);
		driver.manage().window().setPosition(p1);
		
		driver.manage().window().minimize();
		driver.quit();

	}

}
