package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SellersPlansPage {
	WebDriver ldriver;
	public SellersPlansPage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		

	}	
	
	@FindBy(xpath="//div[@id='main-menu']")
	WebElement menu;
	@FindBy(xpath="//a[contains(text(),'Seller Plans')]")
	WebElement SP;
	
	public void menu() throws InterruptedException
	{
		menu.click();
		Thread.sleep(2000);
		SP.click();
	}
	

}
