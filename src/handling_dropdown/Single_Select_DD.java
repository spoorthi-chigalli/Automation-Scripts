package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Select_DD {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/DOB.html");
		WebElement month = driver.findElement(By.id("month"));
		WebElement date = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select d = new Select(date);
		d.selectByIndex(7);
		Thread.sleep(2000);
		
		Select m = new Select(month);
		m.selectByValue("6");
		Thread.sleep(2000);
		
		Select y = new Select(year);
		y.selectByVisibleText("2003");
		
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		
		WebElement firstOpt = m.getFirstSelectedOption();                    //it will select the current ele not a first selected option soo we will not use this to single select dd
		System.out.println(firstOpt.getText());
		
		List<WebElement> allOpt = m.getAllSelectedOptions();                 //it will select the current ele not a first selected option soo we will not use this to single select dd
		for (WebElement allOption : allOpt) {
			System.out.println(allOption.getText());
		}
		
		List<WebElement> opt = m.getOptions();
		for (WebElement options : opt) {
			System.out.println(options.getText());
		}
		
		boolean res = m.isMultiple();
		if(res == true)
		{
			System.out.println("It is a multiple select dd");
		}else {
			System.out.println("It is a single select dd");
		}
		

	}

}
