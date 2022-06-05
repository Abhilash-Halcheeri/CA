package tests;

import org.testng.annotations.Test;

import pages.Base;
import pages.RentPage;

public class RentTest extends Base {
	RentPage rp;
	
	@Test
	public void test() throws InterruptedException
	{
		rp=new RentPage(driver);
		driver.get(URL);
		rp.Rent();
		String title=driver.getTitle();
		System.out.println(title);
	}

}
