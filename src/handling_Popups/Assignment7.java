package handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[text()='view more'])[1]")).click();
        driver.findElement(By.xpath("(//button[text()='View more'])[2]")).click();
        Thread.sleep(2000);

        Set<String> windowIds = driver.getWindowHandles();

        for (String windowId : windowIds) {
            driver.switchTo().window(windowId);
            System.out.println(driver.getTitle());
        }

        driver.quit();
    }
}
