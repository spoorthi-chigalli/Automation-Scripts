package testng_scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Instagram_AnotationAttributes {

    @Test(priority=0)	
	public void login()
	{
		//Assert.fail();
    	Reporter.log("User has logged in", true);
	}
    
    @Test(priority=1, invocationCount=3, dependsOnMethods="login")
    public void upload()
    {
    	Reporter.log("User has uploaded a post", true);
    }
    
    @Test(priority=2, dependsOnMethods={"login","upload"}, enabled=true, timeOut=5000)
    public void like()
    {
    	Reporter.log("User has liked the post",true);
    }
}
