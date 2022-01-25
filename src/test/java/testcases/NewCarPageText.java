package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import base.BaseTest;
import pages.HomePage;
import pages.NewCarPage;

public class NewCarPageText extends BaseTest {
	
	@Test
	public void gotoNwCarPage() throws IOException {
		initialSetUp();
		HomePage homepage= new HomePage(driver);
		homepage.gotoNewCarTab();
		//NewCarPage newcarpage= new NewCarPage(driver);
		
		
		
	}

}
