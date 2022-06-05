package tests;

import org.testng.annotations.Test;

import pages.Base;
import pages.LoginPage;

public class LoginTest extends Base {
	LoginPage lp;
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get(URL);
		lp=new LoginPage(driver);
		lp.login(ContactNum, UserName, Email);
		
	}
	

}
