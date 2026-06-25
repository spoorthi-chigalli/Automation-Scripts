package mtds_of_Webdriver;

import org.openqa.selenium.WebDriver;

public class A {
	
	public static void demo(WebDriver driver)
	{
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
