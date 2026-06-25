package mtds_of_Webdriver;

import org.openqa.selenium.edge.EdgeDriver;

public class Learn_get_gettitle_getCurrentUrl_close {

	public static void main(String[] args) {
		//Launch the browser
		EdgeDriver driver = new EdgeDriver();
		
		//get(String url) is used to trigger the url of an application
		//url should always contain protocol, application name, domain name
		driver.get("https://www.instagram.com/");
		
		//getTitle() is used to fetch the current title of an webpage
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentUrl() is used to fetch the current url of an webpage
        String url = driver.getCurrentUrl();
        System.out.println(url);
        
        //close() is used to close the window
        driver.close();
	}

}
