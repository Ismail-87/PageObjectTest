package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class MarutiHomePage extends BasePage {

	//public WebDriver driver;
	public MarutiHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//h1[contains(text(),'Cars')]")
	WebElement carName;
	
	public String getCarName()
	{
		String carname = carName.getText();
		return carname;
		
	}
	

}
