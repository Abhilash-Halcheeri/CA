package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Privacypolicy {
	
	WebDriver ldriver;
	public Privacypolicy(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Login page");

	}
	@FindBy(xpath="//a[contains(text(),'Privacy Policy')]")
	WebElement pp;
	 public void hl()
	 {
		 ///Actions act=new Actions(ldriver);
		//act.moveToElement(ldriver.findElement(By.xpath("//a[text()='Home Loan']"))).click().build().perform();
		 pp.click();
	 }
	


}
