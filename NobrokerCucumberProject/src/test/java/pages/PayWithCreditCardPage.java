package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayWithCreditCardPage {
	WebDriver ldriver;
	public PayWithCreditCardPage (WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	

	}
	@FindBy(xpath="//strong[contains(text(),'with Credit Card!')]")
	WebElement creditcard;
	@FindBy(xpath="//div[contains(text(),'School/ College Fees')]")
	WebElement school;
	@FindBy(xpath="//input[@id='tenant_name']")
	WebElement name;
	@FindBy(xpath="//input[@id='tenant_email']")
	WebElement Email;
	@FindBy(xpath="//input[@id='']")
	WebElement tick;
	@FindBy(xpath="//button[@id='']")
	WebElement button;
	
	public void pay() throws InterruptedException
	{
		creditcard.click();
		Thread.sleep(2000);
	}
		public void payy(String uname,String mail) throws InterruptedException
		{
			school.click();
			Thread.sleep(2000);
			name.sendKeys( uname);
			Email.sendKeys( mail);
			tick.click();
			Thread.sleep(2000);
			button.click();
			Thread.sleep(3000);
		}
		/*school.click();
		Thread.sleep(2000);
		name.sendKeys( uname);
		Email.sendKeys( mail);
		tick.click();
		Thread.sleep(2000);
		button.click();*/
		
	}
	


