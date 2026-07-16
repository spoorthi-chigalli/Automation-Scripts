package batch_execution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CartModule extends BaseClass{

	@Test
	public void addToCart()
	{
		Reporter.log("addToCart",true);
	}
	
	@Test
	public void removeFromCart()
	{
		Reporter.log("removeFromCart",true);
	}
	
	@Test
	public void increaseQuantity()
	{
		Reporter.log("increaseQuantity",true);
	}
}
