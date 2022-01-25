package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {
	//public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[@title='New Car']")
	private WebElement newCarTab;
	
	@FindBy(xpath="//span[text()='USED CAR ']")
	private WebElement usedCarTab;
	@FindBy(xpath="//span[text()='Sell Car ']")
	private WebElement sellCarTab;	
	
	@FindBy(xpath="//span[text()='MORE ']")
	private WebElement moreTab;	
		
	@FindBy(xpath="//span[text()='Search New Cars']")
	private WebElement searchNewCar;
	
	@FindBy(xpath="//span[text()='Cardekho Used Cars']")
	private WebElement ddnUsedCarLink;
	@FindBy(xpath="//span[text()='Used Car Valuation']")
	private WebElement usedCarValuationLink;
	@FindBy(xpath="//span[text()='Car Loan']")
	private WebElement carLoanLink;
	
	@FindBy(xpath= "//a[contains(@title, 'CarDekho')]")
	WebElement pageTitle;
	
	public NewCarPage gotoNewCarTab() {
		WebElement newCarTab1 = driver.findElement(By.xpath("//a[@title='New Car']"));
		new Actions(driver).moveToElement(newCarTab1).perform();
		searchNewCar.click();
		return new NewCarPage(driver);
		
	}
	
	public UsedCarPage gotoUsedCarTab() {
		WebElement usedCarTab1 = driver.findElement(By.xpath("//span[text()='USED CAR ']"));
		new Actions(driver).moveToElement(usedCarTab1).perform();
		ddnUsedCarLink.click();
		return new UsedCarPage(driver);
	}
	
	public SellCarPage gotoSellCarTab() {
		WebElement sellCarTab1 = driver.findElement(By.xpath("//span[text()='Sell Car ']"));
		new Actions(driver).moveToElement(sellCarTab1).perform();
		usedCarValuationLink.click();
		return new SellCarPage(driver);
	}
	
	public CarLoanPage gotoMoreTab() {
		WebElement moreTab1 = driver.findElement(By.xpath("//span[text()='MORE ']"));
		new Actions(driver).moveToElement(moreTab1).perform();
		carLoanLink.click();
		return new CarLoanPage(driver);
	}
		
	public String getPageTitle() {
		return driver.getTitle().toString();
		 		
	}
	
	
	

}
