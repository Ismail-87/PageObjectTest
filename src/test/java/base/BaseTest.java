package base;

import org.testng.annotations.AfterMethod;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public  WebDriver driver;
	//public  Properties OR;
	private static  Properties Login;
	public  FileInputStream fis1, fis2;
	private  Logger log = Logger.getLogger(BaseTest.class);
	private String browser;
	public String screenshotpath;

	public void initialSetUp() throws IOException {
		PropertyConfigurator.configure(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\log4j.properties");
		//OR = new Properties();
		Login = new Properties();
		//fis1 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\OR.properties");
		//OR.load(fis1);
		//System.out.println(OR.getProperty("gmailLink_Xpath"));
		fis2 = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Login.properties");
		Login.load(fis2);

		// web driver set up
		//driver = WebDriverClass.returnDriver(Login.getProperty("Browser"));
		/*** if (!System.getenv("Browser").equals(null) && !System.getenv("Browser").equals("Empty")  )
			browser = System.getenv("Browser");
		else {
			browser= Login.getProperty("Browser");
		}***/
		
		browser= Login.getProperty("Browser");
		screenshotpath = Login.getProperty("ScreenshotPath");
		
		if (browser.equals("Chrome")){
			//chrome options to block notifiction
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_setting_values.notifications", 2);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
		}
		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().browserVersion("95.0.2").setup();
			driver = new FirefoxDriver();
		}
		else if (browser.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		log.info("initializing Browser: " + browser);
		driver.get(Login.getProperty("URL"));
		log.info("Opening  URL:" + Login.getProperty("URL"));

	}

	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.quit();
		log.info("Test Completed");
	}

}
