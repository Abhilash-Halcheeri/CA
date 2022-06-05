package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PGPage {

	WebDriver ldriver;
	public PGPage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}
	
	
	@FindBy(xpath="//div[@class='nb__3JaWD']/div[contains(text(),'Rent')]")
	WebElement rent;
	@FindBy(xpath="//input[@id='listPageSearchLocality']")
	WebElement search;
	@FindBy(xpath="	//input[@id='PG']")
	WebElement pg;
	@FindBy(xpath="//button[@class='prop-search-button btn btn-primary btn-lg']")
	WebElement button;
	
	public void pg() throws InterruptedException
	{
		rent.click();
		WebElement search1=search;
		search1.sendKeys("Vijaya");
		Thread.sleep(2000);
		search1.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		search1.sendKeys(Keys.ENTER);
		pg.click();
		Thread.sleep(2000);
		button.click();
	}
}
