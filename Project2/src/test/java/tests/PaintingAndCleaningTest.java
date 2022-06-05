package tests;

import org.testng.annotations.Test;

import pages.Base;
import pages.PaintingAndCleaning;

public class PaintingAndCleaningTest extends Base {
	
	PaintingAndCleaning pc;
	
	@Test
	public void test() throws InterruptedException
	{
		pc=new PaintingAndCleaning(driver);
		driver.get(URL);
		pc.Painting();
	}

}
