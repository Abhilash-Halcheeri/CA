package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommercialPage {
	WebDriver ldriver;
	public CommercialPage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");
		//logger =report.createTest("Buy");

	}
	
	@FindBy(xpath="//div[@class='nb__3JaWD']/div[contains(text(),'Commercial')]")
	WebElement commercial;
	
	@FindBy(xpath="//input[@id='listPageSearchLocality']")
	WebElement search;
	
	
	@FindBy(xpath="//button[@class='prop-search-button btn btn-primary btn-lg']")
	WebElement button;
	
	
	public void method() throws InterruptedException {
	commercial.click();
	Thread.sleep(2000);
	WebElement Searcc=search;
	//log.info("type for searching");
	Searcc.sendKeys("Electro");
	Thread.sleep(2000);
	Searcc.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	Searcc.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
	button.click();

}}
