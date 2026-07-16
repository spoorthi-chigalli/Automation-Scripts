package batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddressModule extends BaseClass {

	@Test
	public void addNewAddress()
	{
		Reporter.log("addNewAddress",true);
	}
	
	@Test
	public void editAddress()
	{
		Reporter.log("editAddress",true);
	}
	
	@Test
	public void deleteAddress()
	{
		Reporter.log("deleteAddress",true);
	}
}
