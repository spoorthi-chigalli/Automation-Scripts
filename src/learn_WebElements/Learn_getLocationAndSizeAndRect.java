package learn_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn_getLocationAndSizeAndRect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com/");
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.xpath("//label[text()='First name']/preceding-sibling::input"));		
		WebElement secondName = driver.findElement(By.xpath("//label[text()='Surname']/../input"));
		
		//getSize()
		Dimension size1 = firstName.getSize();
		int h1 = size1.getHeight();
		int w1 = size1.getWidth();
		
		Dimension size2 = secondName.getSize();
		int h2 = size2.getHeight();
		int w2 = size2.getWidth();
		
		//getLocation()
		Point loc1 = firstName.getLocation();
		int x1 = loc1.getX();
		int y1 = loc1.getY();
		
		Point loc2 = secondName.getLocation();
		int x2 = loc2.getX();
		int y2 = loc2.getY();
		
		//print
		System.out.println("Dimention : "+size1);
		System.out.println("Heigth :" +h1);
		System.out.println("Width :" +w1);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Dimention : "+size2);
		System.out.println("Heigth :" +h2);
		System.out.println("Width :" +w2);
		
		System.out.println("  ");
		
		System.out.println("Point : "+loc1);
		System.out.println("X axis :" +x1);
		System.out.println("Y axis :" +y1);
		
		System.out.println("---------------------------------------");
		
		System.out.println("Point : "+loc2);
		System.out.println("X axis :" +x2);
		System.out.println("Y axis :" +y2);
		
		System.out.println("---------------------------------------");
		
        if(w1 == w2 && h1 == h2)
        {
        	System.out.println("Both text boxes are same size");
        }else {
        	System.out.println("Both text boxes are not of same size");
        }
       
        System.out.println("  ");
        
        if(y1 == y2)
        {
        	System.out.println("Textbox are aligned properly");
        }else {
        	System.out.println("Textbox are not aligned properly");
        }
        
        //getRect()
        
//		WebElement firstName = driver.findElement(By.xpath("//label[text()='First name']/preceding-sibling::input"));	
//     	WebElement secondName = driver.findElement(By.xpath("//label[text()='Surname']/../input"));
//     	
//     	Rectangle fn = firstName.getRect();
//     	Dimension size1 = fn.getDimension();
//     	int h1 = fn.getHeight();
//     	int w1 = fn.getWidth();
//     	Point loc1 = fn.getPoint();
//     	int x1 = fn.getX();
//     	int y1 = fn.getY();
//     	
//     	Rectangle sn = secondName.getRect();
//     	Dimension size2 = sn.getDimension();
//     	int h2 = sn.getHeight();
//     	int w2 = sn.getWidth();
//     	Point loc2 = sn.getPoint();
//     	int x2 = sn.getX();
//     	int y2 = sn.getY();
//     	
//     	if(w1 == w2 && h1 == h2)
//        {
//        	System.out.println("Both text boxes are same size");
//        }else {
//        	System.out.println("Both text boxes are not of same size");
//        }
//       
//        System.out.println("  ");
//        
//        if(y1 == y2)
//        {
//        	System.out.println("Textbox are aligned properly");
//        }else {
//        	System.out.println("Textbox are not aligned properly");
//        }
     
        driver.quit();
	}

}
