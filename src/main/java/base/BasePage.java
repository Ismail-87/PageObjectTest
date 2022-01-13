package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public static WebDriver driver;
		
	@SuppressWarnings("static-access")
	public BasePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//customAction= new CustomeAction();
		
	}
	

}
