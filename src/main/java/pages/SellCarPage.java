package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SellCarPage extends BasePage {
		//public WebDriver driver;
		
		public SellCarPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stu
		}
		@FindBy(xpath="//div[@class='ragisterNumber ']/h1")
		private WebElement usedCarVal;
		
		public String getTextUsedCarVal()
		{
			//String txtUsedCar= ;
			return usedCarVal.getText().toString();
			
		}

}
