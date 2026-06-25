package mtds_of_Webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class B {

	public static void main(String[] args) {
		
	  WebDriver driver = new ChromeDriver();
	  A.demo(driver);

	  WebDriver driver2 = new EdgeDriver();
	  A.demo(driver2);
	  
	  WebDriver driver3 = new FirefoxDriver();
	  A.demo(driver3);
	  
	}

}
