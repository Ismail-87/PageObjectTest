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

	//@FindBy(xpath="//a[@title='New Car']")
	public WebElement newCarTab;
	
	@FindBy(xpath="//span[text()='Search New Cars']")
	public WebElement searchNewCar;
	@FindBy(xpath= "//a[contains(@title, 'CarDekho')]")
	WebElement pageTitle;
	
	public void gotoNewCarTab() {
		WebElement newCarTab1 = driver.findElement(By.xpath("//a[@title='New Car']"));
		new Actions(driver).moveToElement(newCarTab1).perform();
		searchNewCar.click();
		//return new NewCarPage(driver);
		
	}
	public String getPageTitle() {
		return driver.getTitle().toString();
		 		
	}
	
	
	

}
