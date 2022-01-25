package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class UsedCarPage extends BasePage {
	//public WebDriver driver;
	
	public UsedCarPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//li[@title='By Budget']")
	private WebElement tabByBudget;
	
	public String getTextByBudgetTab() {
		return tabByBudget.getText().toString();
	}
	
	
	
	

}
