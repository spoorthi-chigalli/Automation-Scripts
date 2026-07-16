package testng_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert_and_SoftAssert {

	@Test
	public void demo()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Google";
//		Assert.assertEquals(actualTitle, expectedTitle);
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
//		if(actualTitle.equals(expectedTitle))
//		{
//			Reporter.log("Pass",true);	
//		}
//		else
//		{
//			Reporter.log("Fail",true);
//			Assert.fail();
//		}
		driver.quit();
		s.assertAll();
	}
}
