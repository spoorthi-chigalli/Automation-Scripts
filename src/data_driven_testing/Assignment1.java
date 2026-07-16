package data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\commandata.properties");
		FileInputStream fis1 = new FileInputStream("C:\\Users\\Spoorthi\\eclipse-workspace\\AutomationQSP\\data\\Test_Scenarios.xlsx");
		Properties p = new Properties();
		p.load(fis);
		String url =  p.getProperty("url");
		System.out.println(url);
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get(url);
		
		Workbook wb = WorkbookFactory.create(fis1);
		int rowNo = wb.getSheet("Sheet3").getLastRowNum();
     	for(int i=0; i<=rowNo; i++)
		{
			String un = wb.getSheet("Sheet3").getRow(i).getCell(0).getStringCellValue();
			driver.findElement(By.id("user-name")).sendKeys(un);
			String pwd = wb.getSheet("Sheet3").getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.id("password")).sendKeys(pwd);
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(2000);
			String currURL = driver.getCurrentUrl();
			System.out.println(currURL);
			if(currURL.equals("https://www.saucedemo.com/"))
			{
				driver.navigate().refresh();
			}
			else
			{
				driver.navigate().back();
			Thread.sleep(2000);
			}
     	}
	
		driver.quit();
		

	}

}
