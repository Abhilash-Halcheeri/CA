package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferAndEarn {
	WebDriver ldriver;
	public ReferAndEarn (WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}	
	@FindBy(xpath="//div[@id='main-menu']")
	WebElement menu;
	@FindBy(xpath="//a[contains(text(),'Refer & Earn')]")
	WebElement RA;
	public void refer() throws InterruptedException
	{
		menu.click();
		Thread.sleep(2000);
		RA.click();
	}
	

}
