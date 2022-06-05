package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeLoanEligibilityCheck {
	
	WebDriver ldriver;
	public HomeLoanEligibilityCheck(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}	
	@FindBy(xpath="//a[contains(text(),'Home Loan Eligibility Check')]")
	WebElement button;
	
	public void button()
	{
		button.click();
	}

}
