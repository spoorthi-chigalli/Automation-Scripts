package synchronization;

import java.util.NoSuchElementException;                              //Some doubt - program is not executing

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicitWait
		//explicitWait
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//wait.until(Expectedconditions.visibilityOfElementLocated
		//(By.name("username"))).sendKeys("Admin");
		//Thread.sleep(2000)
		
		//CustomWait
		for(int i=0; i<100; i++)                                                              //In order to continue the execution until condition is satisfied
		{
			try {                                                                             //In order to handle the exception           
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.className("orangehrm-login-button")).click();
				break;                                                                        //In order to stop the loop after the condition is satisfied
			}catch (NoSuchElementException e) {
				System.out.println(i);
			}
		}

		driver.quit();
	}

}
