package tests;

import org.testng.annotations.Test;

import pages.Base;
import pages.BuySearch;

public class BuySearchTest extends Base {
	BuySearch bs;
	@Test
	public void Test4() throws InterruptedException
	{
		 bs=new BuySearch(driver);
		 driver.get(URL);
		 log.info("BuySearch execution is started");
			logger =report.createTest("Buy");
		 Thread.sleep(2000);
		 bs.Search();
		 logger.info("search completed");
		 logger.pass("successfully navigated to searched result");
		 log.info("navigated to Buy page");
		 String title=driver.getTitle();
		System.out.println(title); 
	}

}
