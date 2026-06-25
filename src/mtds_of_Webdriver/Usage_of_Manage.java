package mtds_of_Webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Usage_of_Manage {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        Thread.sleep(1000);
        
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        driver.get("https://www.linkedin.com/");
        Thread.sleep(1000);
        
        driver.manage().window().fullscreen();
        Thread.sleep(1000);
        
        driver.manage().deleteAllCookies();
        
        Dimension d1 = new Dimension(333, 502);
        driver.manage().window().setSize(d1);
        Thread.sleep(1000);
        
        Point p1 = new Point(183, 264);
        driver.manage().window().setPosition(p1);
        Thread.sleep(1000);
        
        driver.manage().window().minimize();
        
        driver.quit();

	}

}
