package extentlisteners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;


public class CustomeAction {

	
	//public static WebDriver driver;
	// WebDriverClass.returnDriver(PropamdLog4J.Login.getProperty("Browser"));
	//public  WebDriver driver = new BaseTest().driver;
	public static Logger log = Logger.getLogger(CustomeAction.class.getName());

	
	  
    // Function to Take screenshot
    public static void takeScreenshot(String ScreenshotPath, String fileName)
        throws IOException
    {
        // Creating instance of File
        File file = ((TakesScreenshot)BasePage.driver)
                        .getScreenshotAs(OutputType.FILE);
  
        try {
			FileUtils.copyFile(file,
			                   new File(ScreenshotPath + fileName + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
  
    // Function to Make border
    public static void MakeBorder(WebElement element)
    {
  
        JavascriptExecutor js = (JavascriptExecutor)BasePage.driver;
        js.executeScript(
            "arguments[0].style.border = '3px solid red'",
            element);
    }
	
}
