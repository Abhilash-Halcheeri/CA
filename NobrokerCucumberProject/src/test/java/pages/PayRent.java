package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayRent {
	
	WebDriver ldriver;
	public PayRent(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
	

	}

	@FindBy(xpath="//div[@class='nb__3BKJW']")
	WebElement payrent;
	@FindBy(xpath="//div[contains(text(),'House Rent')]")
	WebElement House;
	
	public void payrent()
	{
		payrent.click();
		House.click();
	}
}
