package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {
	WebDriver ldriver;
	public LoginPage(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}	
	
	
	@FindBy(xpath="//header/nav[@id='navHeader']/div[5]/div[2]/div[1]/div[1]")
	WebElement lg;
	@FindBy(xpath="//input[@id='signUp-phoneNumber']")
	WebElement ph;
	@FindBy(xpath="//button[@id='signUpSubmit']")
	WebElement signup;
	@FindBy(xpath="//input[@id='login-signup-form__name-input']")
	WebElement name;
	@FindBy(xpath="//input[@id='login-signup-form__email-input']")
	WebElement mail;
	@FindBy(xpath="//button[@id='signUpSubmit']")
	WebElement Submit;
	@FindBy(xpath="//div[contains(text(),\"World's Largest NoBrokerage Property Site\")]")
	WebElement Ass;
	
	public void login(String ContactNum,String UserName,String Email) throws InterruptedException
	{
		lg.click();
		Thread.sleep(2000);
		ph.sendKeys(ContactNum);
		
		signup.click();
		Thread.sleep(2000);
		name.sendKeys(UserName);
	
		Thread.sleep(2000);
		mail.sendKeys(Email);
	
		Thread.sleep(2000);
		Submit.click();
		String text=Ass.getText();
		System.out.println(text);
		
	}
	
		
	

}
