package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuySearch extends Base {
	WebDriver ldriver;
	public BuySearch(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");
		//logger =report.createTest("Buy");

	}
	@FindBy(xpath="//div[@class='nb__3JaWD']/div[contains(text(),'Buy')]")
	WebElement buy;
	
	@FindBy(xpath="//input[@id='listPageSearchLocality']")
	WebElement search;
	@FindBy(xpath="//div[contains(text(),'Apartment Type')]")
	WebElement aprtmentType;
	@FindBy(xpath="//div[contains(text(),'Property Status')]")
	WebElement property;
	@FindBy(xpath="//button[@class='prop-search-button btn btn-primary btn-lg']")
	WebElement button;
	
	
	public void Search() throws InterruptedException
	{
		buy.click();
		Thread.sleep(2000);
		WebElement Searcc=search;
		//log.info("type for searching");
		Searcc.sendKeys("Rajaji nagar");
		Thread.sleep(2000);
		Searcc.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		Searcc.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		/*WebElement source=aprtmentType;
		source.click();
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER);
		WebElement propert=property;
		propert.click();
		Thread.sleep(2000);
		propert.sendKeys(Keys.ARROW_DOWN);
		propert.sendKeys(Keys.ENTER);*/
		button.click();
		//logger.info("Clicked on submitbutton");
		
		Thread.sleep(2000);
	}
	

}
