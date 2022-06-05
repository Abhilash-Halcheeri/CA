package tests;



import pages.Base;
import pages.PGPage;
import org.testng.annotations.Test;

public class PGTest extends Base {
	PGPage pg; 
	
@Test
	public void Test() throws InterruptedException
	{
		pg=new PGPage(driver);
		driver.get(URL);
		pg.pg();
		String Title=driver.getTitle();
		System.out.println(Title);
	}

}
