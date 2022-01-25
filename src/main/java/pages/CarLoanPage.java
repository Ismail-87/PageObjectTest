package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CarLoanPage extends BasePage {
		//public WebDriver driver;
		
		public CarLoanPage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		@FindBy(xpath="//a[@title= 'New Car']")
		private WebElement linkLoan;
		
		public boolean displayLoanLink() {
			
			boolean txtLoan=  linkLoan.isDisplayed();
			 
			 return txtLoan;
			
		}

		
		

}
