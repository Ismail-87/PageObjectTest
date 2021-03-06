package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;


public class NewCarPage extends BasePage{
	//public WebDriver driver;
	
	public NewCarPage(WebDriver driver) {
		super(driver);
		
	
	}
	
	@FindBy(linkText= "Maruti")
	private WebElement linkMaruti;
	
	
	@FindBy(linkText= "Hyundai")
	private WebElement linkHyundai;
	
	
	@FindBy(linkText= "Honda")
	private WebElement linkHonda;
	
	
	@FindBy(linkText= "Tata")
	private WebElement linkTata;
	
	public MarutiHomePage gotoMarutiPage()
	{
		linkMaruti.click();
		return new MarutiHomePage(driver);
		
	}
	
	public void gotoHyundaiPage()
	{
		linkHyundai.click();
		
	}
	public void gotoTataPage()
	{
		linkTata.click();
		
	}
	
	public void gotoHondaPage()
	{
		linkHonda.click();
		
	}
}
