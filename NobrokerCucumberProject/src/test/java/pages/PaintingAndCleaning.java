package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaintingAndCleaning {
	WebDriver ldriver;
	public PaintingAndCleaning(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}	
	
	@FindBy(xpath="//div[@id='main-menu']")
	WebElement menu;
	@FindBy(xpath="//a[contains(text(),'Painting & Cleaning')]")
	WebElement pAc;
	@FindBy(xpath="//div[contains(text(),'Bangalore')]")
	WebElement bnglr;
	
	@FindBy(xpath="//*[@id='citySelectorClose']")
	WebElement close;
	public void Painting() throws InterruptedException
	{
		menu.click();
		Thread.sleep(2000);
		pAc.click();
		Thread.sleep(1000);
		//bnglr.click();
		close.click();
	}


}
