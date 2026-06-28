package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//1.write a script to select and deselect all the options in a multiselect dd(asscending and desending)

public class Assignment1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/DOB.html");
		WebElement loc = driver.findElement(By.id("location"));
		
		Select s = new Select(loc);
		List<WebElement> allOpt = s.getOptions();
		
		for (WebElement opt : allOpt) {
			s.selectByVisibleText(opt.getText());
		}
		
		for(int i=allOpt.size()-1; i>=0; i--)
		{
			s.deselectByIndex(i);
		}

		driver.quit();
	}

}
