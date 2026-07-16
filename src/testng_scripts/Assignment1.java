package testng_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assignment1 {

	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.automationtesting.in/Register.html");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, "Register");
		boolean checkBox = driver.findElement(By.id("checkbox1")).isSelected();
		SoftAssert a = new SoftAssert();
		a.assertTrue(checkBox, "Checkbox is selected");
		driver.quit();
		a.assertAll();
	}
}
