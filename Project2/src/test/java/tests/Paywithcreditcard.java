package tests;

import java.util.Set;

import org.testng.annotations.Test;

import helperClass.HelperClass;
import pages.Base;
import pages.PayWithCreditCardPage;
import pages.SellersPlansPage;

public class Paywithcreditcard extends Base {
	
	//SellersPlansPage sp;
	@Test
	public void test3() throws InterruptedException
	{ 
		PayWithCreditCardPage py=new PayWithCreditCardPage(driver);
		 log.info("Paying with credit card");
			logger =report.createTest("creditCard");
		driver.get(URL);
		py.pay();
		Thread.sleep(2000);
		String parent=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		int count=allWindows.size();
		System.out.println("window"+count);
		for(String child:allWindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				Thread.sleep(2000);
				
				py.payy(UserName, Email, ContactNum);
				logger.info("enter username");
				logger.info("enter Email");
				logger.info("enter ContactNum");
				//driver.close();
				driver.switchTo().window(parent);
				logger.pass("Successfully payed");
				HelperClass.captureScreenshots(driver);
				//driver.close();
			}
		}
		
	}
}
