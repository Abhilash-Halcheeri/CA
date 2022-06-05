package stepdefinations;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.AddingFreePost;
import pages.BuySearch;
import pages.CommercialPage;
import pages.HomeLoan;
import pages.HomeLoanEligibilityCheck;
import pages.PaintingAndCleaning;
import pages.PayRent;
import pages.PayWithCreditCardPage;
import pages.Privacypolicy;
import pages.Rent;
import pages.SalesAgreement;
import pages.Sellersplans;

import utilities.Screenshots;

public class Stepdefinitions {
	WebDriver driver;

	@Given("^User launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
		driver=new ChromeDriver();

		System.out.println("Chrome browser started successfully ");
	}

	@When("^user opens URL \"([^\"]*)\"$")
	public void user_opens_url_something(String strArg1) throws Throwable {
		driver.get(strArg1);
		driver.manage().window().maximize();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	}

	// @And("^click on Buy Option and search property$")
	public void click_on_buy_option_and_search_property() throws Throwable {
		BuySearch bs=new BuySearch(driver);
		bs.Search();
		//Screenshots.Screenshot(driver, "Buy");
	}

	//---------------------homeloan----------------------
	@When("^user opens URL NOb \"([^\"]*)\"$")
	public void user_opens_url_nob_something(String strArg1) throws Throwable {
		driver.get(strArg1);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
	}
	@And("^click HomeLoan1 Option$")
	public void click_homeloan1_option() throws Throwable {
		HomeLoan hl=new HomeLoan(driver);
		hl.hl();
		Screenshots.captureScreenshots(driver);
	}
	
	//______________________homeloanagreement-------------
	
	@And("^click HomeLoancheck Option$")
    public void click_homeloancheck_option() throws Throwable {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		HomeLoanEligibilityCheck hm=new HomeLoanEligibilityCheck(driver);
		hm.button();
		Screenshots.captureScreenshots(driver);
    }
	//-------------------------painting and cleaning-------
	@And("^click on painting and cleaning Option$")
	public void click_on_painting_and_cleaning_option() throws Throwable {
		PaintingAndCleaning pc=new  PaintingAndCleaning(driver);
		Screenshots.captureScreenshots(driver);
	}
	//---------------------------oSales Agreement-------------

	@When("^user opens URL nobroker \"([^\"]*)\"$")
	public void user_opens_url_nobroker_something(String strArg1) throws Throwable {
		driver.get(strArg1);
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(5000);

	}

	@And("^click Sales Agreement Option$")
	public void click_osales_agreement_option() throws Throwable {
		SalesAgreement sa=new SalesAgreement(driver);
		sa.Sales();
		Screenshots.captureScreenshots(driver);
	}
	//-------------------------------------------------------------
	/*@And("^click on post option$")
	    public void click_on_post_option() throws Throwable {
	AddingFreePost add=new AddingFreePost(driver);
	add.post();
	    }

	    @And("^click on username option and add \"([^\"]*)\"$")
	    public void click_on_username_option_and_add_something(String strArg1) throws Throwable {
	    	AddingFreePost add=new AddingFreePost(driver);
	    	add.uname(strArg1);
	    }

	    @And("^click on Email option \"([^\"]*)\"$")
	    public void click_on_email_option_something(String strArg1) throws Throwable {

	    }

	    @And("^click on contact option \"([^\"]*)\"$")
	    public void click_on_contact_option_something(String strArg1) throws Throwable {

	    }

	    @And("^click on button$")
	    public void click_on_button() throws Throwable {

	    }*/

	//-------------------------------------sllrsplns--------
	@And("^menu and click on sellersplans option$")
	public void menu_and_click_on_sellersplans_option() throws Throwable {
		Sellersplans sp=new Sellersplans(driver);
		sp.menu();
		Screenshots.captureScreenshots(driver);
	}

	//---------------------------------rent------------------
	@And("^click on rent Option and search property$")
	public void click_on_rent_option_and_search_property() throws Throwable {
		Rent rt=new Rent(driver);
		rt.Rent();
		Screenshots.captureScreenshots(driver);
	}

	//-----------------------commercial----------------
	@And("^click on commercial Option and search property$")
	public void click_on_commercial_option_and_search_property() throws Throwable {
		CommercialPage cp=new CommercialPage(driver);
		cp.method();
		Thread.sleep(3000);
		Screenshots.captureScreenshots(driver);
	}



	//-------------------------------rentpay-------------------------
	@And("^click payrent option$")
	public void click_payrent_option() throws Throwable {
		PayRent pr=new PayRent(driver);
		pr.payrent();
		Screenshots.captureScreenshots(driver);
	}
	//------------------------------credit--------------
	@And("^click pay rent with credit card $")
	public void click_pay_rent_with_credit_card() throws Throwable {
		PayWithCreditCardPage py=new PayWithCreditCardPage(driver);
		py.pay();
		Screenshots.captureScreenshots(driver);
	}
	//--------------------------pp-------------------
	@And("^click privacyPolicy option$")
	public void click_privacypolicy_option() throws Throwable {
		Privacypolicy pp=new Privacypolicy(driver);
		pp.hl();
		Screenshots.captureScreenshots(driver);
	}
	//-----------------------buy----------
	 @And("^ search property2$")
	    public void search_property2() throws Throwable {
	     
	   

		BuySearch bs=new BuySearch(driver);
		bs.Search();
		Screenshots.captureScreenshots(driver);

	}

}
