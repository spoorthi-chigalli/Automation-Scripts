package batch_execution;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WishListModule extends BaseClass {

	@Test
	public void addToWishList()
	{
		Assert.fail();
		Reporter.log("addToWishList",true);
	}
	
	@Test
	public void removeFromWishList()
	{
		Reporter.log("removeFromWishList",true);
	}
	
	@Test
	public void moveToCart()
	{
		Reporter.log("moveToCart",true);
	}
}
