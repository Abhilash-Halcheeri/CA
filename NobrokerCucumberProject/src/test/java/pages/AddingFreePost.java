package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingFreePost {
	
	WebDriver ldriver;
	public AddingFreePost(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}	
	@FindBy(xpath="//button[contains(text(),'Post Free property ad')]")
	WebElement post;
	
	//input[@id='userName']
	@FindBy(xpath="//input[@id='userName']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='userEmail']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='userPhone']")
	WebElement contact;
	//div[contains(text(),'Select City')]
	@FindBy(xpath="//div[@class='css-1wy0on6 nb-select__indicators']")
	WebElement city;
	
	@FindBy(xpath="//button[@id='']")
	WebElement button;
	
	
	/*public void post(String Email,String Password,String ContactNum,String UserName) throws InterruptedException
	{
		post.click();
		Thread.sleep(1000);
		uname.sendKeys(UserName);
		Thread.sleep(1000);
		email.sendKeys(Email);
		Thread.sleep(1000);
		contact.sendKeys(ContactNum);
		Thread.sleep(1000);
		city.click();
		Thread.sleep(1000);
		//city.sendKeys(Keys.ARROW_DOWN);
		button.click();
	}*/
	
	
	public void post()
	{
		post.click();
	}
	public void uname(String name)
	{
uname.sendKeys(name);
	}
	public void email()
	{
		email.click();
	}
	public void contactnum()
	{
		contact.click();
	}
	
	public void button()
	{
		button.click();
	}
	

}
