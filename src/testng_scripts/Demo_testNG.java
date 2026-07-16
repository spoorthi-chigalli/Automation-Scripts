package testng_scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo_testNG {
         
	@Test
	public void demoA()
	{
		Reporter.log("Hello World", true);    //It will print in both report and console
	}
	
	@Test
	public void demoB()
	{
		Reporter.log("Hii World", false);
		Reporter.log("Hiiiiiiiiiii World");            //It will print only in the report
	}
	
	@Test
	public void demoC()
	{
		System.out.println("Bye World");            //It will print only in the console
	}


}
