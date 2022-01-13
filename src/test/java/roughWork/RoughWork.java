package roughWork;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RoughWork {
	public  static WebDriver driver;
	@FindBy(xpath="//*[@id=\"rf01\"]/header/div[2]/div/div/nav/ul/li[1]/a/span")
	public static WebElement newCarTab;
	
	@FindBy(xpath="//span[text()='Search New Cars']")
	public static WebElement searchNewCar;

	public static void main(String[] args) {
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.get("https://www.cardekho.com/");
		System.out.println(driver.getTitle());
		
		
		/***		
		//@FindBy(xpath="//span[text()='Search New Cars']")
		//public WebElement searchNewCar;
		WebElement element = driver.findElement(By.xpath("//a[@title='New Car']"));
		
		new Actions(driver).moveToElement(element).perform();
		//WebElement searchNewCar = ;
		driver.findElement(By.xpath("//span[text()='Search New Cars']")).click();
		***/
		
		new Actions(driver).moveToElement(newCarTab).perform();
		searchNewCar.click();

	}

}
