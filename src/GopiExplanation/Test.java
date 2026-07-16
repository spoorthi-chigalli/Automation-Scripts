package GopiExplanation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File perm = new File("./test-output/take.png");
		FileHandler.copy(temp, perm);
		driver.quit();
	}

}
