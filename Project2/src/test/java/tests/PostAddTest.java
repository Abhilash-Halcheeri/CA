package tests;

import pages.Base;
import pages.PostAdd;
import org.testng.annotations.Test;

public class PostAddTest extends Base{
	PostAdd pa;
	
@Test
	public void Test() throws InterruptedException
	{
	          pa=new PostAdd(driver);
	          driver.get(URL);
	          pa.post(Email, PassWord, ContactNum, UserName);
	}
	

}
