package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void Screenshot(WebDriver driver,String name) throws IOException 
	{
	TakesScreenshot tc=(TakesScreenshot)driver;
	File src=tc.getScreenshotAs(OutputType.FILE);
FileHandler.copy(src, new File("./screenshots/nobroker"+name+".png"));
}
}


