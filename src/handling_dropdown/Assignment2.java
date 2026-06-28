package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/DOB.html");
		WebElement month = driver.findElement(By.id("month"));
		
		Select s = new Select(month);
        List<WebElement> opts = s.getOptions();
        
        String lastOpt = opts.get(opts.size()-1).getText();
        s.selectByVisibleText(lastOpt);
        
        driver.quit();
        
	}

}
