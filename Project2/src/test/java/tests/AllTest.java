package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import helperClass.HelperClass;
import pages.Base;
import pages.BuySearch;
import pages.HomeLoan;
import pages.LoginPage;
import pages.PGPage;
import pages.PaintingAndCleaning;
import pages.PayWithCreditCardPage;
import pages.PostAdd;
import pages.ReferAndEarn;
import pages.RentPage;
import pages.SalesAgreement;
import pages.SellersPlansPage;

public class AllTest extends Base {
	
	
	@Test(priority=1)
	public void  Buy() throws InterruptedException
	{
		BuySearch bs=new BuySearch(driver);
		 driver.get(URL);
		 log.info("BuySearch execution is started");
		logger =report.createTest("Buy");
		
		 Thread.sleep(2000);
		 bs.Search();
		logger.info("search completed");
		 logger.pass("successfully navigated to searched result");
		 log.info("navigated to Buy page");
		 String title=driver.getTitle();
		System.out.println("page title is :"+title); 
		HelperClass.captureScreenshots(driver);
	}
	/*@Test(priority=2)
	//public void test2() throws InterruptedException
	{
		driver.get(URL);
		logger =report.createTest("Signup Page");
		LoginPage lp=new LoginPage(driver);
		//lp.login(ContactNum, UserName, Email);
		logger.info("Enter contact num");
		logger.info("Enter Username");
		logger.info("Enter Email");
		
		log.info("Enterd credentials");
	
		logger.pass("Successfully signup");
		
	}*/
	@Test(priority=3)
	public void Painting_And_Cleaning() throws InterruptedException
	{
		PaintingAndCleaning pc=new PaintingAndCleaning(driver);
		driver.get(URL);
		logger =report.createTest("PaintingAndCleaningPage");
		logger.pass("Navigated to painting and cleaning page");
		log.info("click on Menu option");
		logger.info("clicked on Menu option");
		log.info("Successfully navigated to page");
		HelperClass.captureScreenshots(driver);
		
		pc.Painting();
	}
	@Test(priority=4)
	public void PG() throws InterruptedException
	{
		PGPage pg=new PGPage(driver);
		logger =report.createTest("Searching For PGs");
		driver.get(URL);
		log.info("Searching Pg");
		pg.pg();
		//logger.pass("Succeessfully navigated to pgs");
		Thread.sleep(2000);
	
		
		logger.pass("Getting results for PGs");
		String Title=driver.getTitle();
		HelperClass.captureScreenshots(driver);
		System.out.println(Title);
	
	}
	@Test(priority=5)
	public void PostAdd() throws InterruptedException
	{
		PostAdd  pa=new PostAdd(driver);
	          driver.get(URL);
	      	logger =report.createTest("Post Adds");
	          pa.post(Email, PassWord, ContactNum, UserName);
	          logger.info("Enterd Credentials");
	          logger.pass("Successfully addedd property ");
	          HelperClass.captureScreenshots(driver);
	}
	@Test(priority=6)
	public void Rent() throws InterruptedException
	{
		RentPage rp=new RentPage(driver);
		driver.get(URL);
		rp.Rent();
		logger =report.createTest("Rent Page");
		logger.pass("Rent Page is Successfully navigated");
		log.info("Search for rent");
		
		
		String title=driver.getTitle();
		  HelperClass.captureScreenshots(driver);
		System.out.println(title);
	}
	@Test(priority=7)
	public void Sellers_Plans() throws InterruptedException
	{ 
		SellersPlansPage	sp=new SellersPlansPage(driver);
		driver.get(URL);
		logger =report.createTest("Sellers Plans");
		sp.menu();
		logger.pass("Seller plans are available");
		//log.info("");
		Thread.sleep(2000);
		  HelperClass.captureScreenshots(driver);
		
	}
	@Test (priority=8)
	public void Sales_Agreement() throws InterruptedException
	{
		logger =report.createTest("SalesAgreement");
		SalesAgreement sa=new SalesAgreement(driver);
		driver.get(URL);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0],scrollIntoView();",flag);
		Thread.sleep(3000);
	sa.Sales();
		String Title=driver.getTitle();
		System.out.println(Title);
		 HelperClass.captureScreenshots(driver);
			logger.pass("successfully navigated to SalesAgreement");
	}

	@Test (priority=9)
public void Refer_Earn() throws InterruptedException
{
	ReferAndEarn  ra=new ReferAndEarn (driver);
	logger =report.createTest("Refer And Earn ");
	driver.get(URL);
	ra.refer();
	logger.pass("successfully navigated to earn page");
	 HelperClass.captureScreenshots(driver);
}
@Test (priority=10)
public void Home_loan() throws InterruptedException
{
	HomeLoan hl=new HomeLoan(driver);
	 driver.get(URL);
	 logger =report.createTest("Home Loan");
	 //JavascriptExecutor js = (JavascriptExecutor) driver;
     //js.executeScript("window.scrollBy(0,900)");
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
     Thread.sleep(10000);
	 hl.hl();
	 logger.pass("Success");
	 HelperClass.captureScreenshots(driver);
	 
}
	@Test
public void Pay_with_creditCard() throws InterruptedException
{
	driver.get(URL);
	PayWithCreditCardPage py=new PayWithCreditCardPage(driver);
	py.pay();
	}

	
}
