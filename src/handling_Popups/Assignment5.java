package handling_Popups;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        Robot r = new Robot();
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_P);
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);

        for (int i = 0; i < 6; i++) {
            r.keyPress(KeyEvent.VK_TAB);
            r.keyRelease(KeyEvent.VK_TAB);
            Thread.sleep(500);
        }
        Thread.sleep(2000);
        
        for (int i = 0; i <= 3; i++) {
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
        }
        Thread.sleep(2000);

        r.keyPress(KeyEvent.VK_1);
        r.keyRelease(KeyEvent.VK_1);
        r.keyPress(KeyEvent.VK_MINUS);
        r.keyRelease(KeyEvent.VK_MINUS);
        r.keyPress(KeyEvent.VK_2);
        r.keyRelease(KeyEvent.VK_2);

        Thread.sleep(2000);

        for(int i=0; i<4; i++)
        {
        r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        }
        Thread.sleep(2000);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);

        driver.quit();
    }
}
