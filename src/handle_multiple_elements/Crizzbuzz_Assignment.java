package handle_multiple_elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crizzbuzz_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.cricbuzz.com/live-cricket-scores/149618/rcb-vs-srh-1st-match-indian-premier-league-2026");
		driver.findElement(By.xpath("//a[text()='Scorecard']")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'RCB')])[1]")).click();
		
		List<WebElement> names = driver.findElements(By.xpath("(//div[text()='Batter'])[2]/../../..//a[@class='text-cbTextLink hover:underline text-sm tb:text-xs wb:text-sm']"));
        List<WebElement> scores =driver.findElements(By.xpath("(//div[text()='Batter'])[2]/../../..//div[@class='flex justify-center items-center font-bold text-sm  wb:text-sm']"));
		
        int count = names.size();
        System.out.println(count);
        
        for(int i=0; i<count; i++)
        {
        	String name = names.get(i).getText();
        	String score = scores.get(i).getText();
        	System.out.println("Name: "+name+"==> Score: "+score);
        }
        
        driver.quit();
	}

}
