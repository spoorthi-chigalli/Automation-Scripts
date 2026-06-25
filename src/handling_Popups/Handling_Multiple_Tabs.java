package handling_Popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Tabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.actitime.com/free-online-trial"); Thread.sleep(2000);
		driver.findElement(By.id("cookie-button--got-it")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Terms and Policies')]")).click();
		
		Set<String> allwin = driver.getWindowHandles();
		
		Iterator<String> i = allwin.iterator();
		String pwin = i.next();
		String cwin = i.next();
		//i.next();     ------------->      No such element exception from java package becz there are only 2 tabs
		
		driver.switchTo().window(cwin);     //Transfering the control to the child tab
		Thread.sleep(2000);
		
		List<WebElement> allHeadings = driver.findElements(By.className("terms-policies__title"));
		for (WebElement ele : allHeadings) {
			System.out.println(ele.getText());
		}
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(pwin).close();          //Transfering control back to the parent tab and closing

	}

}
