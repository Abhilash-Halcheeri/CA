/*package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import pages.Base;
import pages.FlatsForSale;

public class SalesAgreement1 extends Base {
	
	FlatsForSale ff;
	@Test
	public void test5() throws InterruptedException
	{
		ff=new FlatsForSale(driver);
		driver.get(URL);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0],scrollIntoView();",flag);
		Thread.sleep(3000);
		ff.Flats();
		String Title=driver.getTitle();
		System.out.println(Title);
	}

}*/
