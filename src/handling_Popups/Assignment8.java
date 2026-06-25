package handling_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[text()='New Tab']")).click(); Thread.sleep(2000);
        String add = driver.getWindowHandle();
        System.out.println(driver.switchTo().window(add).getTitle());
        
        driver.findElement(By.xpath("(//button[text()='view more'])[1]")).click();
//        String add1 = driver.getWindowHandle();
//        System.out.println(driver.switchTo().window(add1).getTitle());
//        //driver.findElement(By.xpath("(//button[text()='View More'])[2]")).click();
//        Thread.sleep(2000);
//
//        Set<String> windowIds = driver.getWindowHandles();
//
//        for (String windowId : windowIds) {
//            driver.switchTo().window(windowId);
//            System.out.println(driver.getTitle());
//        }
//
        driver.quit();
		

    }

	}


