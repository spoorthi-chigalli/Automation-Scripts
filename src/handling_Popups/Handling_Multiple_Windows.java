package handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click(); Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Popups']")).click(); Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Browser Windows']")).click(); Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Multiple Windows']")).click(); Thread.sleep(500);
		driver.findElement(By.xpath("//*[text()='Shop Now']")).click(); Thread.sleep(500);
		
		Set<String> allwin = driver.getWindowHandles();
		//String pwid = driver.getWindowHandle();
		
//		for(String wid : allwin)
//		{
//			driver.switchTo().window(wid);
//			if(!wid.equals(pwid))
//			{
//				driver.close();
//			}
//		}                                       This will close all the window but not parent window
		
		Thread.sleep(2000);
		for (String wid : allwin) {
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			if(title.contains("Mobile"))
			{
				//driver.close;                ----> When we need to close specific browser
				break;                       //---->When we need to transfer control to specific browser
			}
			driver.close();
		}                                        //This will close all the window leaving the window which satisfy the condition
		
		//	driver.quit();

	}

}
