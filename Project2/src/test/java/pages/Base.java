package pages;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/*import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;*/

import helperClass.HelperClass;
import utilities.Read;

//@SuppressWarnings("deprecation")
public class Base {
	Read rd=new Read();
	public static WebDriver driver;
	public String URL=rd.URl();
	public String Email=rd.Email();
	public String PassWord=rd.password();
	public String ContactNum=rd.ContactNum();
	public String UserName=rd.UserName();
	 public ExtentReports report;
	  // public ExtentSparkReporter spark;
	  public ExtentTest logger;
	 public Logger log;
	  
	
	@BeforeClass
	public void setup() throws IOException
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe" );
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		report=new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports//ur"+HelperClass.getcurrentDateTime()+".html"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Abhi_Extent Report");
		report.attachReporter(spark);
		Reporter.log("setting Done", true);
		//-----------------------------
		//ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports//UR"+HelperClass.getcurrentDateTime()+".html"));
		//report=new ExtentReports();
		//report.attachReporter(extent);
		
		log=Logger.getLogger("Base");
		PropertyConfigurator.configure("log4j.properties");

}
	
	@AfterClass
	public void tear()
	{
		driver.close();
		report.flush();
	}}
