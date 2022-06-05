package tests;

import pages.AcAndServiceRepairPage;
import pages.Base;
import org.testng.annotations.Test;

public class ACRepairTest extends Base {
	
	AcAndServiceRepairPage ac;
	
	@Test
	public void Test() throws InterruptedException
	{
		ac=new AcAndServiceRepairPage(driver);
		driver.get(URL);
		Thread.sleep(2000);
		ac.Repair();
		ac.txt();
	}

}
