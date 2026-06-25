package handling_Popups;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoapps.qspiders.com/");
        driver.findElement(By.xpath("//*[text()='UI Testing Concepts']")).click(); Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Popups']")).click(); Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Browser Windows']")).click(); Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Multiple Tabs']")).click(); Thread.sleep(500);
        driver.findElement(By.xpath("//*[text()='Shop Now']")).click(); Thread.sleep(2000);

        Set<String> allwin = driver.getWindowHandles();

        for (String wid : allwin) {
            driver.switchTo().window(wid);
            String title = driver.getTitle();
        
            if (title.contains(productName)) {
            	String price = driver.findElement(By.xpath("//p[contains(@class,'text-gray-800')]")).getText();
                System.out.println(productName + price);
                break;                                   // Transfer control to required window
            } else {
                driver.close();                          // Close other windows
            }
        }

        sc.close();
    }
}
