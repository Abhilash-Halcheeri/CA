package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.Base;
import pages.HomeLoan;

public class HomeLoanTest extends Base {
	
	
	HomeLoan hl;
	@Test
	public void test() throws InterruptedException
	
	{
		
		 hl=new HomeLoan(driver);
		 driver.get(URL);
		 //JavascriptExecutor js = (JavascriptExecutor) driver;
	     //js.executeScript("window.scrollBy(0,900)");
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	     Thread.sleep(10000);
		 hl.hl();
	}
	

}
