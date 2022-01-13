package testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.io.IOException;

import base.BaseTest;
import pages.HomePage;
import pages.MarutiHomePage;
import pages.NewCarPage;

public class MarutiHomePageTest extends BaseTest{
	

	@Test
	public void gotoMarutiHomePage() throws IOException {
		initialSetUp();
		HomePage homepage= new HomePage(driver);
		homepage.gotoNewCarTab();
		NewCarPage carPage = new NewCarPage(driver);
		carPage.gotoMarutiPage();
		MarutiHomePage marutiPage = new MarutiHomePage(driver);
		String carName = marutiPage.getCarName();
		Assert.assertEquals(carName, "Maruti Suzuki Cars");
		
	}

}
