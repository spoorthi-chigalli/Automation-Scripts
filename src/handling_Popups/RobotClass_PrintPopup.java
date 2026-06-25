package handling_Popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass_PrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		Robot r = new Robot(); Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_ENTER);              //o/p :- Rcb
		
		//usage of print popup
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		for(int i=0; i<3; i++)
		{
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(500);
		}
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.quit();
		
		
	}

}
