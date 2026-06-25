package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Select_DD {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("file:///C:/Users/Spoorthi/Desktop/htmlAutomation/DOB.html");
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(0);
		s.selectByValue("2");
		s.selectByVisibleText("Mysore");
		s.selectByContainsVisibleText("Mang");
//		s.deselectByIndex(0);
//		s.deselectByValue("2");
//		s.deselectByVisibleText("Mysore");
//		s.deSelectByContainsVisibleText("Man");
//		s.deselectAll();
		
		WebElement firstOpt = s.getFirstSelectedOption();
		System.out.println(firstOpt.getText());
		
		
		List<WebElement> allOpt = s.getAllSelectedOptions();
		for (WebElement allOption : allOpt) {
			System.out.println(allOption.getText());
		}
		
		
		List<WebElement> opt = s.getOptions();
		for (WebElement options : opt) {
			System.out.println(options.getText());
		}
		
		
		boolean res = s.isMultiple();
		if(res == true)
		{
			System.out.println("It is a multiple select dd");
		}else {
			System.out.println("It is a single select dd");
		}
		
		//getWrappedElement() is used to combine all the options in to a single element
		//WebElemnt ele = s.getWrappedElement();
		
		driver.quit();
	}

}

//Assignment-15/6
//
//
//2.write a script to select the last option in the dd
//3.write a script to print all the options in month dd in alphabetical order
