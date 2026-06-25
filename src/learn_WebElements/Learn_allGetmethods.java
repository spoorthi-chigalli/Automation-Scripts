package learn_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_allGetmethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bigbasket.com/");
		WebElement ele = driver.findElement(By.xpath("(//input[@placeholder='Search for Products...'])[2]"));
		
		//gettagName()
		String tagName = ele.getTagName();
		System.out.println("Tag Name of an element : " +tagName);
		
		//getText()
	    String text = ele.getText();
	    System.out.println("TagText of an ele: " +text);
	    
	    //getAttribute(String attName)
	    String attValue = ele.getAttribute("type");
	    System.out.println("Attribute value of an ele: " +attValue);
	    
	    //getCssValue(String propName)
	    String fontWeight = ele.getCssValue("font-size");
	    System.out.println("Font-weight of the element: " +fontWeight);
	    
	    driver.quit();

	}

}
