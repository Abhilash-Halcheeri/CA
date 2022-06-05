package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesAgreement extends Base  {
	WebDriver ldriver;
	public SalesAgreement(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}	
	
	@FindBy(xpath="//a[contains(text(),'Sale Agreement')]")
	WebElement sale;
	
	@FindBy(xpath="//h1[@id='section24']")
	WebElement title;
	//h1[@id='section24']
	
	public void Sales() throws InterruptedException
	{
		
		//Thread.sleep(5000);
		sale.click();
		String title= driver.getTitle();
		System.out.println(title);
	}
	

}
