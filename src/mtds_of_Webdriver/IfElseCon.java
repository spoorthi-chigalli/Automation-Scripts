package mtds_of_Webdriver;

//write a script to verify a webpage
//Launch chrome browser
//trigger instagram application
//check wheather the instagram application is displayed or not
//1. verify it by title --> Instagram
//2. verify it by url --> https://www.instagram.com/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IfElseCon {
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://instagram.com/");
	 
	String title = driver.getTitle();
	String str = "Instagram";
	
	String url = driver.getCurrentUrl();
	String exurl = "https://www.instagram.com/";
	
	if(title.equals(str) && url.equals(exurl))
	{
		System.out.println("Title and url matched");
	}
	else
	{
		System.out.println("Title and url not matched");
	}
	
	driver.quit();
	
}
}
