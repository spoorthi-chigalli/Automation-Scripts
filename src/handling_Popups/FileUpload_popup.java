package handling_Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_popup {

	public static void main(String[] args) {                       //NOT EXECUTED BECZ IT NEEDS LOGIN
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.naukri.com");
		driver.findElement(By.className("upload-input")).sendKeys("‪C://Users//Spoorthi//Desktop//Spoorti Resume.pdf");

	}

}
