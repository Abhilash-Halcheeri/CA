package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AcAndServiceRepairPage {
	
	
	
	WebDriver ldriver;
	public AcAndServiceRepairPage (WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");
	}
	@FindBy(xpath="(//img[@alt='star'])[3]")
	WebElement Ac;
	
	@FindBy(xpath="//*[@id=\'citySelectorClose\']")
	WebElement close;
	@FindBy(xpath="//h1[@Class='heading-0 font-semi-bold po:hidden nb__KgniF']")
	String txt;
	
	public void Repair() throws InterruptedException
	{
		Ac.click();
		Thread.sleep(3000);
		//span[text()='AC Service & Repair']
		close.click();
	}
	
	public void txt()
	{
		String tx=txt;
		System.out.println(tx);
	}
}
